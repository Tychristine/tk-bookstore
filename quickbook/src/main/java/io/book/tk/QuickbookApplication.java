package io.book;

import io.book.entity.Book;
import io.book.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@SpringBootApplication
public class QuickbookApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuickbookApplication.class, args);

    }

    @Autowired
    private BookMapper bookMapper;
    @GetMapping("/")
    public List<Book> index(){
        return bookMapper.findAll();
    }

}
