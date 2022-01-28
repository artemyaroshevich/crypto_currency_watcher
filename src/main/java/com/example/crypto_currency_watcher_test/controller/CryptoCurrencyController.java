package com.example.crypto_currency_watcher_test.controller;

import com.example.crypto_currency_watcher_test.entity.CryptoCurrency;
import com.example.crypto_currency_watcher_test.entity.User;
import com.example.crypto_currency_watcher_test.service.CoinLoreService;
import com.example.crypto_currency_watcher_test.service.CryptoCurrencyService;
import com.example.crypto_currency_watcher_test.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CryptoCurrencyController {

    private Logger logger = LogManager.getLogger();

    @Autowired
    private CryptoCurrencyService cryptoCurrencyService;
    @Autowired
    private CoinLoreService coinLoreService;
    @Autowired
    ModelMapper mapper;
    @Autowired
    UserService userService;

    @RequestMapping("/notify")
    public ResponseEntity<?> notify(@RequestBody User username, @PathVariable CryptoCurrency symbol) {
        try {
            userService.save(mapper.map(username,User.class), username);
            return new ResponseEntity<>(HttpStatus.OK);
            cryptoCurrencyService.saveCryprto(mapper.map(symbol,CryptoCurrency.class),symbol);
            return new ResponseEntity<>(HttpStatus.OK)

        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }



    }

}
