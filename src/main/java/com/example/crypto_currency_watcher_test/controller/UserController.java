package com.example.crypto_currency_watcher_test.controller;

import com.example.crypto_currency_watcher_test.dto.user.SaveUserReq;
import com.example.crypto_currency_watcher_test.dto.user.SaveUserResp;
import com.example.crypto_currency_watcher_test.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private UserService userService;
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/notify")
    public SaveUserResp notify(@RequestBody SaveUserReq user) {
        return userService.save(user);
    }
}
