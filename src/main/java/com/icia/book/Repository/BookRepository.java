package com.icia.book.Repository;

import com.icia.book.DTO.BookDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookRepository {
    @Autowired
    private SqlSessionTemplate sql;

public int save(BookDTO bookDTO){
   return sql.insert("book.bookSave",bookDTO);



}

    public BookDTO findBook() {
        return sql.selectOne("book.findBook");
    }

    public List<BookDTO> findAll() {
    return sql.selectList("book.findAll");
    }
}
