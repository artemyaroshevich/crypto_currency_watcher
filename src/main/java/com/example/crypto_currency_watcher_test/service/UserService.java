package com.example.crypto_currency_watcher_test.service;

import com.example.crypto_currency_watcher_test.entity.User;
import com.example.crypto_currency_watcher_test.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepository userStorage;

    public User save(User map, User user) {
       userStorage.findByUsername(user.getUsername()).isPresent();
       return userStorage.save(user);
       }


}
