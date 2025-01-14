package rs.codeeco.jlink_jdeps.service;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import rs.codeeco.jlink_jdeps.entity.PersonEntity;
import rs.codeeco.jlink_jdeps.repository.PersonRepository;

import java.util.Set;
import java.util.UUID;

@RequiredArgsConstructor
@Service
public class PersonService {

    private final PersonRepository repository;

    public PersonEntity findById(UUID id) {
        return repository.findById(id)
                .orElseThrow(EntityNotFoundException::new);
    }

    public Set<PersonEntity> findAll() {
        return Set.copyOf(repository.findAll());
    }

    public PersonEntity saveOrUpdate(PersonEntity person) {
        return repository.save(person);
    }

    public void deleteById(UUID id) {
        repository.deleteById(id);
    }
}
