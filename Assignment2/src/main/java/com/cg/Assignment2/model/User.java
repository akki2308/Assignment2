package com.cg.Assignment2.model;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String city;
    private String country;
}

