package com.example.courses.entity;

import java.util.ArrayList;
import java.util.List;

public class CourseService {
    List<Course> list;
    public CourseService(){
        list =new ArrayList<>();
        list.add(new Course(1,"Java","This course covers the basics of Java"));
        list.add(new Course(2, "Python", "This course covers the basics of Python language"));

    }

    public List<Course> getCourses(){
        return list;
    }
}
