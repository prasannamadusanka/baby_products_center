package com.prasanna.employee_management_system.service;

import com.prasanna.employee_management_system.model.Student;
import  java.util.List;
public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();

}
