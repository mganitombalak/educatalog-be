package com.application.lecture.service;

import com.application.lecture.model.Lecture;
import com.application.lecture.repository.LectureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LectureService {
    @Autowired
    private LectureRepository lectureRepository;

    public Lecture create(String instructor, String subject, String prerequisites,
                          String description, String capacity, String location,
                          String outcomes, String outline){
        return lectureRepository.save(new Lecture(instructor,subject,prerequisites,
                description,capacity,location,outcomes,outline));
    }
    public List<Lecture> getAll(){
        return lectureRepository.findAll();
    }
    public Lecture getByInstructor(String instructor){
        return lectureRepository.findByInstructor(instructor);
    }
    public Lecture getBySubject(String subject){
        return lectureRepository.findBySubject(subject);
    }
    public Lecture getByPrerequisites(String prerequisites){
        return lectureRepository.findByPrerequisites(prerequisites);
    }
    public Lecture getByDescription(String description){
        return lectureRepository.findByDescription(description);
    }
    public Lecture getByCapacity(String capacity){
        return lectureRepository.findByCapacity(capacity);
    }
    public Lecture getByLocation(String location){
        return lectureRepository.findByLocation(location);
    }
    public Lecture getByOutcome(String outcomes){
        return lectureRepository.findByOutcomes(outcomes);
    }
    public Lecture getByOutline(String outline){
        return lectureRepository.findByOutline(outline);
    }

    public Lecture update(String instructor, String subject, String prerequisites,
                          String description, String capacity, String location,
                          String outcomes, String outline){
        Lecture lec = lectureRepository.findBySubject(subject);
        lec.setCapacity(capacity);
        lec.setDescription(description);
        lec.setInstructor(instructor);
        lec.setLocation(location);
        lec.setOutcomes(outcomes);
        lec.setPrerequisites(prerequisites);
        lec.setOutline(outline);
        return lectureRepository.save(lec);
    }
    public void deleteAll(){
        lectureRepository.deleteAll();
    }
    public void delete(String subject){
        Lecture lec = lectureRepository.findBySubject(subject);
        lectureRepository.delete(lec);

    }

}
