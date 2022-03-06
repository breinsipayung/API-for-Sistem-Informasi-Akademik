package com.example.sia.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@Table(name = "grades")
public class GradeEntity {
    @Id
    @SequenceGenerator(
            name = "grade_sequence",
            sequenceName = "grade_id_seq",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "grade_id_seq"
    )
    private long id;
    private String number;
    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "subject_id" , referencedColumnName = "id")
    private SubjectEntity subject;
}
