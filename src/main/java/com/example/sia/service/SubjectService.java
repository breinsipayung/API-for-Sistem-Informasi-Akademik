package com.example.sia.service;

import com.example.sia.data.StudentDto;
import com.example.sia.data.SubjectDto;
import com.example.sia.entity.StudentEntity;
import com.example.sia.entity.SubjectEntity;
import com.example.sia.entity.TeacherEntity;
import com.example.sia.repository.StudentRepository;
import com.example.sia.repository.SubjectRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SubjectService {

    private final SubjectRepository subjectRepository;
    private final StudentRepository studentRepository;

    public SubjectEntity addSubject(SubjectDto subjectDto){
        StudentEntity studentEntity = studentRepository.getOne(subjectDto.getStudentId());
        SubjectEntity subjectEntity = new SubjectEntity();
        subjectEntity.setSubjectName(subjectDto.getName());
        subjectEntity.setStudent(studentEntity);
        return subjectRepository.save(subjectEntity);
    }

    public SubjectEntity updateSubject(SubjectDto subjectDto, Long id){
        SubjectEntity subjectEntity = subjectRepository.getOne(id);
        StudentEntity studentEntity = studentRepository.getOne(subjectDto.getStudentId());
        subjectEntity.setSubjectName(subjectDto.getName());
        subjectEntity.setStudent(studentEntity);
        return subjectRepository.save(subjectEntity);
    }

    public void deleteSubject(Long id){
        SubjectEntity subjectEntity = subjectRepository.getOne(id);
        subjectRepository.delete(subjectEntity);
    }

    public List<SubjectEntity> findAll(){
        return this.subjectRepository.findAll();
    }
}
