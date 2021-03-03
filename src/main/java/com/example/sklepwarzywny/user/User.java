package com.example.sklepwarzywny.user;

import com.example.sklepwarzywny.cart.CartService;
import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Setter
@Getter
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
public class User  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;


//    @Column(name = "username")
    private String username;

//    @Column(name = "password")
    private String password;


//    @Column(name = "passwordConfirm")
    private String passwordConfirm;

}