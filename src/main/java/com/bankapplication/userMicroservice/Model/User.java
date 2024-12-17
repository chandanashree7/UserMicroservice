package com.bankapplication.userMicroservice.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;

    private String username;
    private String email;
    private String password;
    private String phoneNumber;
    private String kyc_status;
    private Boolean two_factor_enabled;

    // Many-to-One relationship with User
    /*@ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;*/


}
