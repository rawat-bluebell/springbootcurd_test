package com.dev.springbootcurd.Controller;

import com.dev.springbootcurd.Entity.Student;
import com.dev.springbootcurd.Service.StudentService;
import com.mongodb.internal.operation.EstimatedDocumentCountOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping(value = "/save")
    private String saveStudent(@RequestBody Student students)
    {
        studentService.saveorUpdate(students);
        return students.get_id() ;
    }
    @GetMapping(value ="/getAll")
    private Iterable<Student> getStudents()
    {
        return studentService.listAll() ;
    }

    @PutMapping(value = "/edit/{id}")
    private Student update(@RequestBody Student student, @PathVariable(name="id")String _id)
    {
        student.set_id(_id);

        studentService.saveorUpdate(student);
        return student;
    }

    @DeleteMapping(value = "/delete/{id}")
    private void update(@PathVariable("id")String _id)
    {
        studentService.deleteStudent(_id);

    }

    @RequestMapping("/search/{id}")
    private Student getStudent(@PathVariable(name="id")String studentId)
        {
            return studentService.getStudentById(studentId);
        }

}

