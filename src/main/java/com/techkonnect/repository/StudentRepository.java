package com.techkonnect.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techkonnect.entity.Student;


public interface StudentRepository extends JpaRepository<Student, Long> {
    // Additional custom queries can be defined here if needed
}
