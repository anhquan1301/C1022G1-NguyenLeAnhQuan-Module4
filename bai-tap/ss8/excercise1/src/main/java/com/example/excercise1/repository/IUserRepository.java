package com.example.excercise1.repository;

import com.example.excercise1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface IUserRepository extends JpaRepository<User,Integer> {
}
