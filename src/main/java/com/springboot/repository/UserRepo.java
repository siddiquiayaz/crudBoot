package com.springboot.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.springboot.entities.Users;
@RepositoryRestResource(collectionResourceRel = "/users")
public interface  UserRepo extends JpaRepositoryImplementation<Users, Integer> {
    
}
