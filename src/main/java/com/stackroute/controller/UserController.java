package com.stackroute.controller;


import com.stackroute.com.stackroute.exceptions.UserAlreadyExistsException;
import com.stackroute.domain.User.User;
import com.stackroute.service.UserService;
import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //@controller+response body annotation. returns data as json
@RequestMapping(value="api/v1")
public class UserController {

    UserService userService;

    public UserController(UserService userService){
        this.userService=userService;
    }

    @PostMapping("user")
    public ResponseEntity<?> saveUser(@RequestBody User user){
        ResponseEntity responseEntity;
        try {
            userService.saveUser(user);
            responseEntity=new ResponseEntity<String>("Successfully created", HttpStatus.CREATED);
        }catch (UserAlreadyExistsException ex){
            responseEntity=new ResponseEntity<String>(ex.getMessage(), HttpStatus.CONFLICT);
            ex.printStackTrace();
        }
        return  responseEntity; // status codes+http+response body
    }

    @GetMapping("user")
    public  ResponseEntity<?> getAllUsers(){
        return  new ResponseEntity<List<User>>(userService.getAllUsers(),HttpStatus.OK);
    }


}
