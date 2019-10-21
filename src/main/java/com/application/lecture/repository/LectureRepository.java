package com.application.lecture.repository;

import com.application.lecture.model.Lecture;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LectureRepository extends MongoRepository<Lecture, String> {
    public Lecture findByInstructor(String instructor);
    public Lecture findBySubject(String subject);
    public Lecture findByPrerequisites(String prerequisites);
    public Lecture findByDescription(String description);
    public Lecture findByCapacity(String capacity);
    public Lecture findByLocation(String location);
    public Lecture findByOutcomes(String outcomes);
    public Lecture findByOutline(String outline);

}
