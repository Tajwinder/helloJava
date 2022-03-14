package com.example;

import com.example.courses.entity.Course;
import com.example.courses.entity.CourseService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import java.util.List;

@Controller
public class HelloContainer {
    private final CourseService courseService;

    public HelloContainer(CourseService courseService) {
        this.courseService = courseService;
    }

    @Get("/courses")
    public List<Course> getCourses(){
return courseService.getCourses();
    }
}
