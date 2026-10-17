package com.Example.CrudeStudentException.Repository;

import com.Example.CrudeStudentException.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Student, Long> {
}
