package com.example.sklepwarzywny.user;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;

@Service
public class CryptService {
    private BCryptPasswordEncoder encoder;

    public CryptService() {
        this.encoder = new BCryptPasswordEncoder(10,new SecureRandom());


    }

    public String encrypt(String input) {
//        return this.encoder.encode(input);
        return input;
    }

}
