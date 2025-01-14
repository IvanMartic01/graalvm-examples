package rs.codeeco.fix_broken_spring_boot_graalvm.data;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import rs.codeeco.fix_broken_spring_boot_graalvm.entity.Book;
import rs.codeeco.fix_broken_spring_boot_graalvm.repository.BookRepository;

import java.util.List;

@RequiredArgsConstructor
@Component
public class DataInitializer implements ApplicationRunner {

    private final BookRepository bookRepository;

    @Override
    public void run(ApplicationArguments args) {
        // Check if there are any rows in the 'books' table
        if (bookRepository.count() == 0) {
            // Insert 4 books using the Builder pattern if no data is present
            List<Book> books = List.of(
                    Book.builder()
                            .title("Clean Code")
                            .author("Robert C. Martin")
                            .pages(464)
                            .isbn("9780132350884")
                            .build(),

                    Book.builder()
                            .title("Effective Java")
                            .author("Joshua Bloch")
                            .pages(416)
                            .isbn("9780134685991")
                            .build(),

                    Book.builder()
                            .title("Spring in Action")
                            .author("Craig Walls")
                            .pages(520)
                            .isbn("9781617294945")
                            .build(),

                    Book.builder()
                            .title("Hibernate in Action")
                            .author("Christian Bauer")
                            .pages(450)
                            .isbn("9781932394153")
                            .build()
            );

            bookRepository.saveAll(books);
            System.out.println("4 books have been inserted into the database using the Builder pattern.");
        } else {
            System.out.println("Books table already contains data.");
        }
    }
}


