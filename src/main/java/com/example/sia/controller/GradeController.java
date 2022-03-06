package com.example.sia.controller;

import com.example.sia.data.GradeDto;
import com.example.sia.entity.GradeEntity;
import com.example.sia.service.GradeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/")
@AllArgsConstructor
public class GradeController {

    private final GradeService gradeService;

    @PostMapping(value = "addGrade")
    public GradeEntity addGrade (@RequestBody GradeDto GradeDto){return this.gradeService.addGrade(GradeDto);}

    @GetMapping(value = "showGrade")
    public List<GradeEntity> showGrade(){return this.gradeService.findAll();}

    @PutMapping(value = "updateGrade/{id}")
    public GradeEntity updateGrade(@RequestBody GradeDto GradeDto , @PathVariable Long id){return this.gradeService.updateGrade(GradeDto, id);}

    @DeleteMapping(value = "deleteGrade/{id}")
    public void deleteGrade(@PathVariable Long id){this.gradeService.deleteGrade(id);}
    
}
