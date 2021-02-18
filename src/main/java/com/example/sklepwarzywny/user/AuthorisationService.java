package com.example.sklepwarzywny.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Optional;

@Service
public class AuthorisationService implements AuthenticationProvider {
    private UserRepository userRepository;
    private CryptService cryptService;

    @Autowired
    public AuthorisationService(UserRepository userRepository, CryptService cryptService) {
        this.userRepository = userRepository;
        this.cryptService = cryptService;
    }

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String user = authentication.getName();
        String password = this.cryptService.encrypt(authentication.getCredentials().toString());
        Optional<User> dbUser=this.userRepository.findByUsername(user);
        if(dbUser.isEmpty()) {
            throw new BadCredentialsException("User Not Found");
        }
        if(!dbUser.get().getPassword().equals(password)) {
            throw  new BadCredentialsException("Invalid Password");
        }
        return new UsernamePasswordAuthenticationToken(user,password, Collections.emptyList());
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return true;
    }
}
