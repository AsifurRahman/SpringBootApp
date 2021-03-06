package com.asif.springbootapp.User;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping
    public UserRest createUser(@RequestBody UserDetailsRequestModel userDetails){
        UserRest returnValue=new UserRest();
        UserDto userDto=new UserDto();
        BeanUtils.copyProperties(userDetails,userDto);
        UserDto createdUser=  userService.createUser(userDto);
        BeanUtils.copyProperties(createdUser,returnValue);

        return returnValue;
    }
    @PutMapping
    public String updateUser(){
        return "update user method";
    }
    @DeleteMapping
    public String deleteUser(){
        return "delete User method";
    }
}
