package rs.codeeco.jlink_jdeps.data_loader;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import rs.codeeco.jlink_jdeps.entity.PersonEntity;
import rs.codeeco.jlink_jdeps.service.PersonService;

@RequiredArgsConstructor
@Component
public class PersonDataLoader implements CommandLineRunner {

    private final PersonService service;

    @Override
    public void run(String... args) {
        service.saveOrUpdate(PersonEntity.builder()
                .firstName("Jane")
                .lastName("Doe")
                .age(25)
                .build());
    }
}
