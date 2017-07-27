package app05a.service;

import app05a.domain.Book;
import app05a.domain.Category;

import java.util.List;

/**
 * Created by wangchenghao on 2017/7/23.
 */
public interface BookService {

    List<Category> getAllCategories();
    Category getCategory(int id);
    List<Book> getAllBooks();
    Book save(Book book);
    Book update(Book book);
    Book get(long id);
    long getNextId();
}
