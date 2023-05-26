package com.in28minstutorial.springboot.learnjpahibernate.course.jdbc;

import com.in28minstutorial.springboot.learnjpahibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepo {
    @Autowired
    private JdbcTemplate springJdbcTemplate;

    private static String INSERT_QUERY =
        """
        INSERT INTO course (id, name, author)
        VALUES (?, ?, ?); 
        """;

    private static String DELETE_QUERY =
        """
        DELETE FROM course 
        WHERE id=?;
        """;

    private static String SEL_QUERY =
        """
        SELECT * FROM course
        WHERE id=?;
        """;

    public void insert(Course course) {
        springJdbcTemplate.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor());
    }

    public void deleteById(long id) {
        springJdbcTemplate.update(DELETE_QUERY, id);
    }

    public Course findById(long id) {
        // ResultSet -> Bean => Row Mapper
        return springJdbcTemplate.queryForObject(SEL_QUERY, new BeanPropertyRowMapper<>(Course.class), id);
    }
}
