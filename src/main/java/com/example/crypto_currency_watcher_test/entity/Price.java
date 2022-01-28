package com.example.crypto_currency_watcher_test.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Price {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private long idCurrency;

    @Column
    private double price;
}
