package com.asif.springbootapp.Model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Student {
    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String department;
    private Integer age;
}
