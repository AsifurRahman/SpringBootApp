package com.asif.springbootapp.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRest{
    private String userId;
    private String firstName;
    private String lastName;
    private String email;
}
