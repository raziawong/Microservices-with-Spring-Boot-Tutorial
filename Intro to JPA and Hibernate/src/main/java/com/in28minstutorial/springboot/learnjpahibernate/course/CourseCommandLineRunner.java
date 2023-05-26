package com.in28minstutorial.springboot.learnjpahibernate.course;

import com.in28minstutorial.springboot.learnjpahibernate.course.jdbc.CourseJdbcRepo;
import com.in28minstutorial.springboot.learnjpahibernate.course.jpa.CourseJpaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepo jdbcRepo;

    @Autowired
    private CourseJpaRepo jpaRepo;

    @Override
    public void run(String... args) throws Exception {
//        jdbcRepo.insert(new Course(1, "Learn AWS", "in28minutes"));
//        jdbcRepo.insert(new Course(2, "Learn Azure", "in28minutes"));
//        jdbcRepo.insert(new Course(3, "Learn DevOps", "in28minutes"));
//
//        jdbcRepo.deleteById(2);
//
//        System.out.println(jdbcRepo.findById(1));
//        System.out.println(jdbcRepo.findById(3));

        jpaRepo.insert(new Course(1, "Learn AWS", "in28minutes"));
        jpaRepo.insert(new Course(2, "Learn Azure", "in28minutes"));
        jpaRepo.insert(new Course(3, "Learn DevOps", "in28minutes"));

        jpaRepo.deleteById(2);

        System.out.println(jpaRepo.findById(1));
        System.out.println(jpaRepo.findById(3));
    }
}
