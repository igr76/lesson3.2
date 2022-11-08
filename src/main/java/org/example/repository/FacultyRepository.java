package org.example.repository;

import org.example.model.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface FacultyRepository extends JpaRepository<Faculty, Long> {
    Collection<Faculty> findAllByColor(String color);
  //  Collection<Faculty> findByColorIgnoreCase(String color);
   // Collection<Faculty> findByNameIgnoreCase(String name);

}
