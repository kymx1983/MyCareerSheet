package com.example.mycareersheet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.mycareersheet.model.User;


public interface UserRepository extends JpaRepository<User, Long> {
}
