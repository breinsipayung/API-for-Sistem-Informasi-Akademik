package com.example.sia.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@Table(name = "teachers")
public class TeacherEntity {
    @Id
    @SequenceGenerator(
            name = "teacher_sequence",
            sequenceName = "teacher_id_seq",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "teacher_id_seq"
    )

    private long id;
    private String teacherName;
}
