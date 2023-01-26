package com.exemplospringboot.userdept.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exemplospringboot.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
