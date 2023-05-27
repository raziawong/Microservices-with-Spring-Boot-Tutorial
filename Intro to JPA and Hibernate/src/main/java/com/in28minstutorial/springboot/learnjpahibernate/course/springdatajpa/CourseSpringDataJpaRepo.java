package com.in28minstutorial.springboot.learnjpahibernate.course.springdatajpa;

import com.in28minstutorial.springboot.learnjpahibernate.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringDataJpaRepo extends JpaRepository<Course, Long> {
}
