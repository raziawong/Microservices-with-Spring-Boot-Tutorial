package com.in28minstutorial.springboot.learnjpahibernate.course.jdbc;

import com.in28minstutorial.springboot.learnjpahibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepo repo;

    @Override
    public void run(String... args) throws Exception {
        repo.insert(new Course(1, "Learn AWS", "in28minutes"));
        repo.insert(new Course(2, "Learn Azure", "in28minutes"));
        repo.insert(new Course(3, "Learn DevOps", "in28minutes"));

        repo.deleteById(2);

        System.out.println(repo.findById(1));
        System.out.println(repo.findById(3));
    }
}
