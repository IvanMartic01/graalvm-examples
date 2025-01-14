package rs.codeeco.fix_broken_spring_boot_graalvm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rs.codeeco.fix_broken_spring_boot_graalvm.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
