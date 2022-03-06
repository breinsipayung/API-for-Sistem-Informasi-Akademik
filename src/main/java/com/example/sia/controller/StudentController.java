package com.example.sia.controller;


import com.example.sia.data.StudentDto;
import com.example.sia.entity.StudentEntity;
import com.example.sia.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/")
@AllArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @PostMapping(value = "addStudent")
    public StudentEntity addStudent (@RequestBody StudentDto studentDto){return this.studentService.addStudent(studentDto);}

    @GetMapping(value = "showStudent")
    public List<StudentEntity> showStudent(){return this.studentService.findAll();}

    @PutMapping(value = "updateStudent/{id}")
    public StudentEntity updateStudent(@RequestBody StudentDto studentDto , @PathVariable Long id){return this.studentService.updateStudent(studentDto, id);}

    @DeleteMapping(value = "deleteStudent/{id}")
    public void deleteStudent(@PathVariable Long id){this.studentService.deleteStudent(id);}
}
