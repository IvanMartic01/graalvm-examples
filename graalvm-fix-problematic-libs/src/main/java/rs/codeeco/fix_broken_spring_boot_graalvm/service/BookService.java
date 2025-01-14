package rs.codeeco.fix_broken_spring_boot_graalvm.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import rs.codeeco.fix_broken_spring_boot_graalvm.entity.Book;
import rs.codeeco.fix_broken_spring_boot_graalvm.repository.BookRepository;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BookService {

    private final BookRepository bookRepository;

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
}

