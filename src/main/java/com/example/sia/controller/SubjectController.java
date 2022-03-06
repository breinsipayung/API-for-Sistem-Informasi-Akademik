package com.example.sia.controller;


import com.example.sia.data.StudentDto;
import com.example.sia.data.SubjectDto;
import com.example.sia.entity.StudentEntity;
import com.example.sia.entity.SubjectEntity;
import com.example.sia.service.SubjectService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/")
@AllArgsConstructor
public class SubjectController {

    private final SubjectService subjectService;

    @PostMapping(value = "addSubject")
    public SubjectEntity addSubject(@RequestBody SubjectDto subjectDto){return this.subjectService.addSubject(subjectDto);}

    @GetMapping(value = "showSubject")
    public List<SubjectEntity> showSubject(){return this.subjectService.findAll();}

    @PutMapping(value = "updateSubject/{id}")
    public SubjectEntity updateSubject(@RequestBody SubjectDto subjectDto , @PathVariable Long id){return this.subjectService.updateSubject(subjectDto, id);}

    @DeleteMapping(value = "deleteSubject/{id}")
    public void deleteSubject(@PathVariable Long id){this.subjectService.deleteSubject(id);}

}
