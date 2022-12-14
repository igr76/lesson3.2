package org.example.repository;

import org.example.model.Faculty;
import org.example.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Collection<Student> findAllByName(String name);



}
