package com.example.crypto_currency_watcher_test.service;

import com.example.crypto_currency_watcher_test.dto.user.SaveUserReq;
import com.example.crypto_currency_watcher_test.dto.user.SaveUserResp;
import com.example.crypto_currency_watcher_test.entity.User;
import com.example.crypto_currency_watcher_test.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {


    private final UserRepository userRepository;

    public SaveUserResp save (SaveUserReq userDto) {
        User user = userDto.toUser();
        userRepository.save(user);
        return SaveUserResp.from(user);
    }
}
