package com.example.crypto_currency_watcher_test.repository;

import com.example.crypto_currency_watcher_test.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, Long> {
}
