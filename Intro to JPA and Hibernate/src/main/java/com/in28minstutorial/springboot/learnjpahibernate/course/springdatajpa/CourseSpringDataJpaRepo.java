package com.in28minstutorial.springboot.learnjpahibernate.course.springdatajpa;

import com.in28minstutorial.springboot.learnjpahibernate.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseSpringDataJpaRepo extends JpaRepository<Course, Long> {

    List<Course> findByAuthor(String author);

    List<Course> findByName(String name);
}
