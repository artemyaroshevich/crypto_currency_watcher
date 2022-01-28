package com.example.crypto_currency_watcher_test.service;

import com.example.crypto_currency_watcher_test.entity.CoinLore;
import com.example.crypto_currency_watcher_test.entity.CryptoCurrency;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class CoinLoreService {

    private static final String COIN_LORE_API_LINK = "https://api.coinlore.net/api/ticker/?id=";

    public CryptoCurrency getCryptoCurrencyById(long id) {
        return getCryptoCurrencyById(id);
    }

    public List<CryptoCurrency> getCryptoCurrencyByAll(List<CryptoCurrency> cryptoCurrencyList) {
        List<CryptoCurrency>  cryptoCurrencies = new ArrayList<>();
       for (CryptoCurrency cryptoCurrency : cryptoCurrencyList) {
           CryptoCurrency coinLore = getCryptoCurrencyById(cryptoCurrency.getId());
           cryptoCurrencies.add(coinLore);
       }
       return cryptoCurrencies;
    }

    private CoinLore getCoinLoreById(long id) {
        RestTemplate restTemplate = new RestTemplate();
        CoinLore[] coinLores = restTemplate.getForObject(COIN_LORE_API_LINK + id,CoinLore[].class);
        return coinLores[0];
    }





}
