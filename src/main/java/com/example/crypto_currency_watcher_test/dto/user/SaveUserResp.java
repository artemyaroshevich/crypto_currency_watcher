package com.example.crypto_currency_watcher_test.dto.user;

import com.example.crypto_currency_watcher_test.entity.User;
import com.example.crypto_currency_watcher_test.repository.UserRepository;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SaveUserResp {
    private Long id;
    private String username;



    public static SaveUserResp from(User user) {
        return SaveUserResp.builder().username(user.getUsername())
                .id(user.getId())
                .build();
    }
}
