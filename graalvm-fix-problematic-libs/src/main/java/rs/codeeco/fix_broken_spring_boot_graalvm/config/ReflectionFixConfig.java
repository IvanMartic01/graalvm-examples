package rs.codeeco.fix_broken_spring_boot_graalvm.config;

import org.springframework.aot.hint.annotation.RegisterReflectionForBinding;
import org.springframework.context.annotation.Configuration;
import rs.codeeco.fix_broken_spring_boot_graalvm.entity.Book;

@RegisterReflectionForBinding({
        Book.class
})
@Configuration
public class ReflectionFixConfig {
}
