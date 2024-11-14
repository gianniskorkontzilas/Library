package com.library.library.dto;

import com.library.library.entity.Book;
import com.library.library.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class BorrowDTO {

    private int id;
    private Book book;
    private User user;
    private LocalDate borrowDate;
    private LocalDate returnDate;


}
