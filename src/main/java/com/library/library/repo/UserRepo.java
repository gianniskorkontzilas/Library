package com.library.library.repo;

import com.library.library.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;

public interface UserRepo extends JpaRepository<User, Integer> {
}
