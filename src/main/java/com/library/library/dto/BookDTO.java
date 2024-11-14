package com.library.library.dto;

import com.library.library.entity.Author;
import com.library.library.entity.Publisher;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BookDTO {

    private int bookid;
    private String title;
    private Author author;
    private Publisher publisher;
}
