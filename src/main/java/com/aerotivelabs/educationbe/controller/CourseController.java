package com.aerotivelabs.educationbe.controller;

import com.aerotivelabs.educationbe.entity.Course;
import com.aerotivelabs.educationbe.service.CourseService;
import lombok.var;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/course")
public class CourseController {

    private CourseService service;
    public CourseController(CourseService instance) {
        this.service=instance;
    }

    @GetMapping
    //@RequestMapping(method= RequestMethod.GET)
    public Iterable<Course> get(){
        return this.service.findAll();
    }

    @GetMapping("{id}")
    public ResponseEntity<Object> getById(@PathVariable String id){
        var result =this.service.findById(id);
        return result.isPresent()?
                ResponseEntity.ok(result.get()):
                ResponseEntity.badRequest().body("Internal");
    }


    @PostMapping
    public ResponseEntity post(@RequestBody Course entity){
        return ResponseEntity.ok(this.service.save(entity));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> delete(@PathVariable String id){
        this.service.delete(id);
        return ResponseEntity.ok("");
    }

}
