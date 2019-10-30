package com.aerotivelabs.educationbe.service;

import com.aerotivelabs.educationbe.entity.Course;
import com.aerotivelabs.educationbe.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {
    private CourseRepository repository;

    @Autowired
    public CourseService(CourseRepository repo) {
        this.repository = repo;
    }

    public Iterable<Course> findAll() {
        return repository.findAll();
    }

    public Optional<Course> findById(String id){
        return repository.findById(id);
    }

    public Course save(Course entity){
        return this.repository.save(entity);
    }

    public void delete(String id){
        this.repository.deleteById(id);
    }
}
