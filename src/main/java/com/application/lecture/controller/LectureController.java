package com.application.lecture.controller;

import com.application.lecture.model.Lecture;
import com.application.lecture.service.LectureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LectureController {

    @Autowired
    private LectureService lectureService;

    @RequestMapping("/create")
    public String create(@RequestParam String instructor,@RequestParam String subject,
                         @RequestParam String prerequisites,
                         @RequestParam String description, @RequestParam String capacity,
                         @RequestParam String location, @RequestParam String outcomes,
                         @RequestParam String outline){
        Lecture lec = lectureService.create(instructor,subject,prerequisites,description,capacity
                ,location,outcomes,outline);
            return lec.toString();
    }
    @RequestMapping("/get")
    public Lecture getLecture(@RequestParam String subject){
        return lectureService.getBySubject(subject);
    }
    @RequestMapping("/getAll")
    public List<Lecture> getAll(){
        return lectureService.getAll();
    }
    @RequestMapping("/update")
    public String update(@RequestParam String instructor,@RequestParam String subject,
                         @RequestParam String prerequisites,
                         @RequestParam String description, @RequestParam String capacity,
                         @RequestParam String location, @RequestParam String outcomes,
                         @RequestParam String outline){
        Lecture lec = lectureService.update(instructor,subject,prerequisites,description,capacity
                ,location,outcomes,outline);
        return lec.toString();
    }
    public String delete(@RequestParam String subject){
        lectureService.delete(subject);
        return "Deleted" + subject;
    }
    @RequestMapping("/deleteAll")
    public String deleteAll(){
        lectureService.deleteAll();
        return "All lectures deleted.";
    }




}
