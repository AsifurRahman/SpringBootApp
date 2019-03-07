package com.asif.springbootapp.User;

import com.asif.springbootapp.User.UserDto;
import com.asif.springbootapp.User.UserEntity;
import com.asif.springbootapp.Repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public UserDto createUser(UserDto userDto){
        UserEntity userEntity=new UserEntity();
        BeanUtils.copyProperties(userDto,userEntity);
        userEntity.setEncryptedPassword("werwetdcd");
        userEntity.setUserId("IT-13034");
        UserEntity savedEntity= userRepository.save(userEntity);
        UserDto returnDto=new UserDto();
        BeanUtils.copyProperties(savedEntity,returnDto);
        return returnDto;
    }
}
