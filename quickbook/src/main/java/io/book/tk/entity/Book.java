package io.book.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data   //set/get method
@NoArgsConstructor   //Constructor without parameter
@AllArgsConstructor     //Constructor with parameter
public class Book {
    private Integer id;
    private String bookname;
    private String author;
    private String country;
}
