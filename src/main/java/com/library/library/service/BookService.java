package com.library.library.service;

import com.library.library.dto.BookDTO;
import com.library.library.dto.BookSaveDTO;
import com.library.library.dto.BookUpdateDTO;

import java.util.List;

public interface BookService {
    String addBook(BookSaveDTO bookSaveDTO);

    List<BookDTO> getAllBook();

    String updateBook(BookUpdateDTO bookUpdateDTO);

    String deleteBook(int id);
}