package com.example.sia.repository;

import com.example.sia.entity.SubjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepository extends JpaRepository <SubjectEntity , Long> , JpaSpecificationExecutor<SubjectEntity> {
}
