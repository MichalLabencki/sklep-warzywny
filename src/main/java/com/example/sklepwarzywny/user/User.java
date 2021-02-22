package com.example.sklepwarzywny.user;

import com.example.sklepwarzywny.cart.CartService;
import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
public class User  {

    @Id
    @Getter
    @GeneratedValue(strategy = GenerationType.AUTO)
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

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "cartservice_id", referencedColumnName = "id")
//    private CartService cartService;

}