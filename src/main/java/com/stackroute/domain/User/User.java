package com.stackroute.domain.User;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class User {
    @Id //to indicate the value is primry key of db

    int id;
    String firstName;
    String lastName;
    int age;

}