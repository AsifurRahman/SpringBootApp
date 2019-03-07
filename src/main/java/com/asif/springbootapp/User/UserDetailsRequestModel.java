package com.asif.springbootapp.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDetailsRequestModel {

    private String firstName;
    private String lastName;
    private String email;
    private String password;

}
