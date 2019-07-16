package com.skt.example.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    
    public List<UserVO> getUsers() {
        return userRepository.findAllWithServices();
    }
}
