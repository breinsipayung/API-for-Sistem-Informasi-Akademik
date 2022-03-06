package com.example.sia.service;

import com.example.sia.data.TeacherDto;
import com.example.sia.entity.TeacherEntity;
import com.example.sia.repository.TeacherRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TeacherService {
    private final TeacherRepository teacherRepository;

    public TeacherEntity addTeacher(TeacherDto teacherDto){
        TeacherEntity teacherEntity = new TeacherEntity();
        teacherEntity.setTeacherName(teacherDto.getName());
        return teacherRepository.save(teacherEntity);
    }

    public TeacherEntity updateTeacher(TeacherDto teacherDto, Long id){
        TeacherEntity teacherEntity = teacherRepository.getOne(id);
        teacherEntity.setTeacherName(teacherDto.getName());
        return teacherRepository.save(teacherEntity);
    }

    public void deleteTeacher(Long id){
        TeacherEntity teacherEntity = teacherRepository.getOne(id);
        teacherRepository.delete(teacherEntity);
    }

    public List<TeacherEntity> findAll(){
        return teacherRepository.findAll();
    }
}
