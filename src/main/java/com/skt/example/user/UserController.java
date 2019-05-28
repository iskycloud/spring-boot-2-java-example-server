package com.skt.example.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // = @Controller + @ResponseBody
public class UserController {
    @Autowired
    private UserService userService;
    
    // http://localhost:8080/users/test
    @RequestMapping("/users/{id}") // = @GetMapping("/users/{id}") = @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getAllUser(@PathVariable String id) {
        UserVO result = null;
        
        try {
            result = userService.getUserById(id);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
