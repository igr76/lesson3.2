package org.example.service;

import java.util.HashMap;

import org.example.model.Student;
import org.example.repository.StudentRepository;

public class StudentService {
   private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    public Student addStudent(Student student) {
                return studentRepository.save(student);
    }

    public Student findStudent(long id) {
        return studentRepository.findById(id).get();
    }

    public Student editStudent( Student student) {

        return studentRepository.save(student);
    }

    public void deleteStudent(long id) {
         studentRepository.deleteById(id);
    }
}
