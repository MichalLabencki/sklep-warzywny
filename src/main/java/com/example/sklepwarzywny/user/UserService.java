package com.example.sklepwarzywny.user;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository userRepository;
    private CryptService cryptService;

    @Autowired
    public UserService(UserRepository userRepository, CryptService cryptService) {
        this.userRepository = userRepository;
        this.cryptService = cryptService;
    }

    public void createUser(String login, String password) {
        User u = new User();
        u.setUsername(login);
        u.setPassword(this.cryptService.encrypt(password));
        userRepository.save(u);


    }
}