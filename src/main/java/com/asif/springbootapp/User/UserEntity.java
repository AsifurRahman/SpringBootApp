package com.asif.springbootapp.User;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserEntity {
    private static final long serialVersionUID=1999754955980725968L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(nullable = false,unique = true)
    private String userId;
    @Column(nullable = false,length = 20)
    private String firstName;
    @Column(nullable = false,length=20)
    private String lastName;
    @Column(nullable = false,unique =true)
    private String email;
    @Column(nullable = false)
    private String password;
    private String encryptedPassword;
    private String emailVerificationToken;
    private String emailVerificationStatus;
}
