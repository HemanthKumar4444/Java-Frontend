package com.example.day11.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.day11.model.User;
import com.example.day11.repository.UserRepository;

@Service
public class UserService {
    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User authenticate(String email, String password) {
        User user = repository.findByEmail(email);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }

    public List<User> getAllUsers() {
        return repository.findAll();
    }

    public Optional<User> getUserById(int id) {
        return repository.findById(id);
    }

    public User createUser(String email, String password) {
        User user = new User(email, password);
        return repository.save(user);
    }

    public void deleteUser(int id) {
        repository.deleteById(id);
    }

    public User updateUser(int id, User user) {
        user.setId(id);
        return repository.save(user);
    }
    public int countUsers(){
        return repository.countUsers();
    }

    public List<String>findAllEmails(int page,int size){
        Pageable pageable=PageRequest.of(page,size);
        return repository.findAllEmails(pageable);
    }
}
