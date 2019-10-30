package com.aerotivelabs.educationbe.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document
public class Course {
    @Id
    private String _id;
    private String title;
    private String instructor_id;
    private List<String> prerequisites;
    private String description;
    private int capacity;
    private String location;
    private List<String> outcomes;
    private List<Outline> outline;
}
