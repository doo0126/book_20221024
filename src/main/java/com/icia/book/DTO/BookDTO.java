package com.icia.book.DTO;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class BookDTO {
    private long id;
    private String bookName = "";
    private String bookAuthor = "";
    private String bookPrice = "";
    private String bookPublisher = "";

}
