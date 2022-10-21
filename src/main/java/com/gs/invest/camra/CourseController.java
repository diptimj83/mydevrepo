package com.gs.invest.camra;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @GetMapping("/courses")
    public List<Course> retrieveAllCourses()
    {
        return Arrays.asList(new Course(1,"Learn AWS","Camra"),
                new Course(2,"Learn DevOps","camra"),
                new Course(3,"Learn Azure","camra"),
                new Course(4,"Learn GCP","camra"));

    }


}
