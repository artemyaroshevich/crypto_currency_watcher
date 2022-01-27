package com.example.crypto_currency_watcher_test.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "CRYPTOCURRENCY")
public class CryptoCurrency {

    @Id
    @GeneratedValue
    private long id;
    private String symbol;
    private double cost;

}
