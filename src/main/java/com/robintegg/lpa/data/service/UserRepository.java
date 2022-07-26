package com.robintegg.lpa.data.service;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

import com.robintegg.lpa.data.entity.User;

public interface UserRepository extends JpaRepository<User, UUID> {

    User findByUsername(String username);
}