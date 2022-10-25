package com.icia.book.service;

import com.icia.book.DTO.BookDTO;
import com.icia.book.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public boolean save(BookDTO bookDTO){
    int result =  bookRepository.save(bookDTO);
    if(result>0){
        return true;
    }
    else{
        return false;
    }
    }

    public BookDTO findBook() {
       return   bookRepository.findBook();
    }

    public List<BookDTO> findAll() {
       return bookRepository.findAll();
    }
}
