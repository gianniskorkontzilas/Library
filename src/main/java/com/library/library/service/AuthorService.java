package com.library.library.service;

import com.library.library.dto.AuthorDTO;
import com.library.library.dto.AuthorSaveDTO;
import com.library.library.dto.AuthorUpdateDTO;

import java.util.List;

public interface AuthorService {

    String addAuthor(AuthorSaveDTO authorSaveDTO);

    List<AuthorDTO> getAllAuthor();

    String updateAuthor(AuthorUpdateDTO authorUpdateDTO);

    String deleteAuthor(int id);
}
