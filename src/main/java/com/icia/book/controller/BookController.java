package com.icia.book.controller;
import com.icia.book.DTO.BookDTO;
import com.icia.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/save")
    public String show(){
        return "bookSave";
    }
    @PostMapping("/saveResult")
    public String saveResult(@ModelAttribute BookDTO bookDTO ) {

    boolean result = bookService.save(bookDTO);
if(result) {
    return "index";
}
else{
    return "false";
}
    }

    @GetMapping("/findBook")
    public String findBook(Model model){
        BookDTO findResult =bookService.findBook();
        model.addAttribute("book",findResult);
        return "findBook";
    }
    @GetMapping("/books")
    public String  findAll(Model model){
        List<BookDTO> bookList = bookService.findAll();
        model.addAttribute("bookList",bookList);
        return "bookList";
    }
}
