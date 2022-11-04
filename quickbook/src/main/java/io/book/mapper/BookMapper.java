package io.book.mapper;

import io.book.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;


@Mapper
public interface BookMapper {
    @Select("select * from archer.book")
    List<Book> findAll();
}
