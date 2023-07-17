package com.javatutor.springsecurity.service;

import com.javatutor.springsecurity.dto.UserDto;
import com.javatutor.springsecurity.model.UserModel;
import com.javatutor.springsecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    private BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserModel userModel = userRepository.findByUsername(username);
        if(userModel == null) {
            throw new UsernameNotFoundException("INVALID USERNAME AND PASSWORD!");
        }
        UserDetails userDetails = org.springframework.security.core.userdetails.User.withUsername(userModel.getUsername())
                .password(userModel.getPassword()).authorities("USER").build();
        return userDetails;
    }

    public UserModel saveUser(UserDto userDto) {
        UserModel userModel = new UserModel();
        userModel.setUsername(userDto.getUsername());
        userModel.setPassword(bCryptPasswordEncoder.encode(userDto.getPassword()));
        return userRepository.save(userModel);
    }
}
