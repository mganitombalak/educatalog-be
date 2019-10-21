package com.application.lecture.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Lecture {

    @Id
    private String _id;
    private String instructor;
    private String subject;
    private String prerequisites;
    private String description;
    private String capacity;
    private String location;
    private String outcomes;
    private String outline;

    public Lecture(String instructor, String subject, String prerequisites, String description, String capacity, String location, String outcomes, String outline) {
        this.instructor = instructor;
        this.subject = subject;
        this.prerequisites = prerequisites;
        this.description = description;
        this.capacity = capacity;
        this.location = location;
        this.outcomes = outcomes;
        this.outline = outline;
    }
    public String getId() {
        return _id;
    }

    public void setId(String id) {
        this._id = id;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getOutcomes() {
        return outcomes;
    }

    public void setOutcomes(String outcomes) {
        this.outcomes = outcomes;
    }

    public String getOutline() {
        return outline;
    }

    public void setOutline(String outline) {
        this.outline = outline;
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "instructor='" + instructor + '\'' +
                ", subject='" + subject + '\'' +
                ", prerequisites='" + prerequisites + '\'' +
                ", description='" + description + '\'' +
                ", capacity='" + capacity + '\'' +
                ", location='" + location + '\'' +
                ", outcomes='" + outcomes + '\'' +
                ", outline='" + outline + '\'' +
                '}';
    }
}
