package com.library.library.service;

import com.library.library.dto.BorrowDTO;
import com.library.library.dto.BorrowSaveDTO;
import com.library.library.dto.BorrowUpdateDTO;

import java.util.List;

public interface BorrowService {
    String addBorrow(BorrowSaveDTO borrowSaveDTO);

    List<BorrowDTO> getAllBorrow();

    String updateBorrow(BorrowUpdateDTO borrowUpdateDTO);
}
