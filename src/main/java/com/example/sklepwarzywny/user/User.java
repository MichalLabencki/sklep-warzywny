package com.example.sklepwarzywny.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
public class User  {

    @Id
    @Getter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Getter
    @Setter
//    @Column(name = "username")
    private String username;

    @Getter
    @Setter
//    @Column(name = "password")
    private String password;

    @Getter
    @Setter
//    @Column(name = "passwordConfirm")
    private String passwordConfirm;

}