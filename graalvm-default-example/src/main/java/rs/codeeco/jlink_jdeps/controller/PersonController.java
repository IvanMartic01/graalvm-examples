package rs.codeeco.jlink_jdeps.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import rs.codeeco.jlink_jdeps.entity.PersonEntity;
import rs.codeeco.jlink_jdeps.service.PersonService;

import java.util.Set;
import java.util.UUID;

@Validated
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/person")
public class PersonController {

    private final PersonService personService;

    @GetMapping("/all")
    public Set<PersonEntity> getAll() {
        return personService.findAll();
    }

    @GetMapping
    public PersonEntity getById(@RequestParam("id") UUID id) {
        return personService.findById(id);
    }

    @PutMapping
    public PersonEntity saveOrUpdate(@Valid @RequestBody PersonEntity person) {
        return personService.saveOrUpdate(person);
    }

    @DeleteMapping
    public void deleteById(@RequestParam("id") UUID id) {
        personService.deleteById(id);
    }
}
