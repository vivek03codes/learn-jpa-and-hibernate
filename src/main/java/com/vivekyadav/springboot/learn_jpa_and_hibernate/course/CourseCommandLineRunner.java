package com.vivekyadav.springboot.learn_jpa_and_hibernate.course;
import com.vivekyadav.springboot.learn_jpa_and_hibernate.course.jdbc.CourseJdbcRepository;
import com.vivekyadav.springboot.learn_jpa_and_hibernate.course.jpa.CourseJpaRepository;
import com.vivekyadav.springboot.learn_jpa_and_hibernate.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    private CourseJdbcRepository repository;

//    @Autowired
//    private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1, "Learn AWS Now", "in28minutes"));
        repository.save(new Course(2, "Learn Azure", "in28minutes"));
        repository.save(new Course(3, "Learn Full Stack", "in28minutes"));
        repository.deleteById(3L);

        System.out.println(repository.findById(1L));
        System.out.println(repository.findById(2L));
        System.out.println(repository.findByAuthor("in28minutes"));
        System.out.println(repository.findByName("Learn Azure"));
    }
}
