package com.example.sia.repository;

import com.example.sia.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository <StudentEntity , Long> , JpaSpecificationExecutor<StudentEntity> {
}
