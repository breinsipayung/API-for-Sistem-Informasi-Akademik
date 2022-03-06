package com.example.sia.service;

import com.example.sia.data.GradeDto;
import com.example.sia.entity.GradeEntity;
import com.example.sia.entity.SubjectEntity;
import com.example.sia.repository.GradeRepository;
import com.example.sia.repository.SubjectRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class GradeService {
    private final GradeRepository gradeRepository;
    private final SubjectRepository subjectRepository;

    public GradeEntity addGrade(GradeDto gradeDto){
        SubjectEntity subjectEntity = subjectRepository.getOne(gradeDto.getSubjectId());
        GradeEntity gradeEntity = new GradeEntity();
        gradeEntity.setNumber(gradeDto.getNumber());
        gradeEntity.setSubject(subjectEntity);
        return gradeRepository.save(gradeEntity);
    }

    public GradeEntity updateGrade(GradeDto gradeDto, Long id){
        GradeEntity gradeEntity = gradeRepository.getOne(id);
        SubjectEntity SubjectEntity = subjectRepository.getOne(gradeDto.getSubjectId());
        gradeEntity.setNumber(gradeDto.getNumber());
        gradeEntity.setSubject(SubjectEntity);
        return gradeRepository.save(gradeEntity);
    }

    public void deleteGrade(Long id){
        GradeEntity gradeEntity = gradeRepository.getOne(id);
        gradeRepository.delete(gradeEntity);
    }

    public List<GradeEntity> findAll(){
        return this.gradeRepository.findAll();
    }
}
