package edu.wctc;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Article {
    private String title;
    private String author;
    private int year;
}
