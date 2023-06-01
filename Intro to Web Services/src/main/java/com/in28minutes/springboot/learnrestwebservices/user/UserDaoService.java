package com.in28minutes.springboot.learnrestwebservices.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserDaoService {

    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User(1, "Adam", LocalDate.now().minusYears(30)));
        users.add(new User(1, "Eve", LocalDate.now().minusYears(28).minusMonths(2)));
        users.add(new User(1, "Mariam", LocalDate.now().minusYears(60).plusMonths(5)));
        users.add(new User(1, "Ibrahim", LocalDate.now().minusYears(70).minusMonths(3)));
    }
//
//    public List<User> findAll() {
//
//    }
//
//    public User save(User user) {
//
//    }
//
//    public User findOne(int id) {
//
//    }
}
