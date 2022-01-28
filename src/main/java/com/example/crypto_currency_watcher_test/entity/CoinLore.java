package com.example.crypto_currency_watcher_test.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Builder
public class CoinLore {

    @Id
    @JsonProperty("id")
    private long id;

    @JsonProperty("price_usd")
    private double priceUsd;
}
