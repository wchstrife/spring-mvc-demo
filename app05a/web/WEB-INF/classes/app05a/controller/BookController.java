package app05a.controller;

import app05a.domain.Book;
import app05a.domain.Category;
import app05a.service.BookService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by wangchenghao on 2017/7/23.
 */

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    private static final Log logger = LogFactory.getLog(BookController.class);

    @RequestMapping("/book_input")
    public String inputBook(Model model){
        List<Category> categories = bookService.getAllCategories();
        model.addAttribute("categories", categories);
        model.addAttribute("book", new Book());

        return "BookAddForm";
    }

    @RequestMapping("/book_edit/{id}")
    public String editBook(Model model, @PathVariable long id){
        List<Category> categories = bookService.getAllCategories();
        model.addAttribute("categpories", categories);
        Book book = bookService.get(id);
        model.addAttribute("book", book);

        return "BookEditForm";
    }

    @RequestMapping("/book_save")
    public String saveBook(@ModelAttribute Book book){
        Category category = bookService.getCategory(book.getCategory().getId());
        book.setCategory(category);
        bookService.save(book);

        return "redirect:/book_list";
    }

    @RequestMapping("/book_list")
    public String listBooks(Model model){
        logger.info("book_list");
        List<Book> books = bookService.getAllBooks();
        model.addAttribute("books", books);

        return "BookList";
    }
}
