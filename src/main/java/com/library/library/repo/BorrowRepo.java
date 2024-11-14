package com.library.library.repo;

import com.library.library.entity.Borrow;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BorrowRepo extends JpaRepository<Borrow,Integer > {
}
