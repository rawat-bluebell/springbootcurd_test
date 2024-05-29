package com.dev.springbootcurd.Service;

import com.dev.springbootcurd.Entity.Student;
import com.dev.springbootcurd.Repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studRepo;
    public void saveorUpdate(Student students) {
        studRepo.save(students);
    }

    public Iterable<Student> listAll() {
        return this.studRepo.findAll();
    }

    public void deleteStudent(String id) {
        studRepo.deleteById(id);
    }

    public Student getStudentById(String studentId) {
        return studRepo.findById(studentId).get();
    }
}
