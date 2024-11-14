package com.library.library.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BookSaveDTO {

    private String title;
    private int author_id;
    private  int publisher_id;
}
