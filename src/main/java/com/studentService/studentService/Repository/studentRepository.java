package com.studentService.studentService.Repository;

import com.studentService.studentService.Entity.Student;
import org.springframework.stereotype.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface studentRepository extends JpaRepository<Student, Integer>{

}
