package com.example.springbootwithdb.repository;

import com.example.springbootwithdb.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
