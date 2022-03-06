package com.example.sia.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@Table(name = "subjects")
public class SubjectEntity {
    @Id
    @SequenceGenerator(
            name = "subject_sequence",
            sequenceName = "subject_id_seq",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "subject_id_seq"
    )
    private long id;
    private String subjectName;
    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "students_id" , referencedColumnName = "id")
    private StudentEntity student;
}
