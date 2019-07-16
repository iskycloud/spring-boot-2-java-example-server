package com.skt.example.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // = @Controller + @ResponseBody
public class UserController {
    @Autowired
    private UserService userService;
    
    // http://localhost:8080/users/test
    @GetMapping("/users")
    public ResponseEntity<?> getUsers() {
        List<UserVO> result = null;
        
        try {
            result = userService.getUsers();
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
