package com.example.crypto_currency_watcher_test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public interface CryptoCurrencyRepository extends JpaRepository<CryptoCurrencyRepository, Long> {

}
