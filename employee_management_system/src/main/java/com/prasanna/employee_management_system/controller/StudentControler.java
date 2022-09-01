package com.prasanna.employee_management_system.controller;


import com.prasanna.employee_management_system.model.Student;
import com.prasanna.employee_management_system.service.StudentService;
//import com.prasanna.employee_management_system.service.StudentServiviceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/student")
public class StudentControler {
    @Autowired
    private StudentService studentService;
    @PostMapping("/add")
    public  String add(@RequestBody Student student){
        studentService.saveStudent(student);
        return  "New student is added";
    }

    @GetMapping("/getAll")
    public  List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

}
