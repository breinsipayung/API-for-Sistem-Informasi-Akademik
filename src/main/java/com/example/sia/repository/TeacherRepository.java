package com.example.sia.repository;

import com.example.sia.entity.TeacherEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository <TeacherEntity , Long> , JpaSpecificationExecutor<TeacherEntity> {
}
