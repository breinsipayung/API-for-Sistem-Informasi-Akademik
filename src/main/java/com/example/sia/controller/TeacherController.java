package com.example.sia.controller;

import com.example.sia.data.TeacherDto;
import com.example.sia.entity.TeacherEntity;
import com.example.sia.service.TeacherService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/")
@AllArgsConstructor
public class TeacherController {

    private final TeacherService teacherService;

    @PostMapping(value = "addTeacher")
    public TeacherEntity addTeacher(@RequestBody TeacherDto teacherDto) { return this.teacherService.addTeacher(teacherDto); }

    @GetMapping(value = "showTeacher")
    public List<TeacherEntity>showTeacher(){return this.teacherService.findAll();}

    @DeleteMapping(value = "deleteTeacher/{id}")
    public void deleteTeacher(@PathVariable Long id) {this.teacherService.deleteTeacher(id);}

    @PutMapping(value = "updateTeacher/{id}")
    public TeacherEntity updateTeacher(@RequestBody TeacherDto teacherDto , @PathVariable Long id) {return this.teacherService.updateTeacher(teacherDto,id);}

}
