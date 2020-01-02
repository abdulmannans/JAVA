package com.LoginRegistration.Services;

import com.LoginRegistration.Model.User;
import com.LoginRegistration.Repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class userService {

    private final UserRepository userRepository;

    public userService(UserRepository userRepository) {
        this.userRepository=userRepository;

    }

    public void saveUser(User user){
        userRepository.save(user);
    }
}

