package rs.codeeco.fix_broken_spring_boot_graalvm.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rs.codeeco.fix_broken_spring_boot_graalvm.entity.Book;
import rs.codeeco.fix_broken_spring_boot_graalvm.service.BookService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }
}

