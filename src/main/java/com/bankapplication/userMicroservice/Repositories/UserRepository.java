package com.bankapplication.userMicroservice.Repositories;

import com.bankapplication.userMicroservice.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface UserRepository extends JpaRepository<User,Serializable> {



}
