package com.example.webservice.dao;


import com.example.webservice.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;

@RepositoryRestResource(path = "user")
public interface IUserRepo extends JpaRepository<User,Integer> {

    Optional<User> findByEmail(String email);

}
