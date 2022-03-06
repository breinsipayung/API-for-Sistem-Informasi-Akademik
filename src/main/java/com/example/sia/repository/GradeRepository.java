package com.example.sia.repository;

import com.example.sia.entity.GradeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface GradeRepository extends JpaRepository <GradeEntity , Long> , JpaSpecificationExecutor <GradeEntity> {
}
