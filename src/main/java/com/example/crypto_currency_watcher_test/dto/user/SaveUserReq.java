package com.example.crypto_currency_watcher_test.dto.user;

import com.example.crypto_currency_watcher_test.entity.User;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SaveUserReq {

    private String username;
    private String password;


    public User toUser() {
        return User.builder().username(username)
                .password(password)
                .build();

    }
}
