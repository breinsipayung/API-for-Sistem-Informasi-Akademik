package com.example.sia.service;

import com.example.sia.data.StudentDto;
import com.example.sia.entity.StudentEntity;
import com.example.sia.entity.TeacherEntity;
import com.example.sia.repository.StudentRepository;
import com.example.sia.repository.TeacherRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;
    private final TeacherRepository teacherRepository;

    public StudentEntity addStudent(StudentDto studentDto){
        TeacherEntity teacherEntity = teacherRepository.getOne(studentDto.getTeacherId());
        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setNameStudent(studentDto.getName());
        studentEntity.setTeacher(teacherEntity);
        return studentRepository.save(studentEntity);
    }

    public StudentEntity updateStudent(StudentDto studentDto, Long id){
        StudentEntity studentEntity = studentRepository.getOne(id);
        TeacherEntity teacherEntity = teacherRepository.getOne(studentDto.getTeacherId());
        studentEntity.setNameStudent(studentDto.getName());
        studentEntity.setTeacher(teacherEntity);
        return studentRepository.save(studentEntity);
    }

    public void deleteStudent(Long id){
        StudentEntity studentEntity = studentRepository.getOne(id);
        studentRepository.delete(studentEntity);
    }

    public List<StudentEntity> findAll(){
        return this.studentRepository.findAll();
    }
}
