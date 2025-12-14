package com.vivekyadav.springboot.learn_jpa_and_hibernate.course.jdbc;

import com.vivekyadav.springboot.learn_jpa_and_hibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "Learn AWS Now", "in28minutes"));
        repository.insert(new Course(2, "Learn Azure", "in28minutes"));
        repository.insert(new Course(3, "Learn Full Stack", "in28minutes"));
        repository.delete(3);

        System.out.println(repository.selectById(1));
        System.out.println(repository.selectById(2));
    }
}
