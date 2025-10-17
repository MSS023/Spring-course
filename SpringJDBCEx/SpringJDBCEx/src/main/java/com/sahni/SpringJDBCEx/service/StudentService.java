package com.sahni.SpringJDBCEx.service;

import com.sahni.SpringJDBCEx.model.Student;
import com.sahni.SpringJDBCEx.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService{
    private StudentRepo repo;

    @Autowired
    public void setRepo(StudentRepo repo) {
        this.repo = repo;
    }

    public StudentRepo getRepo() {
        return repo;
    }

    public void addStudent(Student s) {
        repo.persist(s);
    }

    public List<Student> getStudents() {
        return repo.findAll();
    }
}
