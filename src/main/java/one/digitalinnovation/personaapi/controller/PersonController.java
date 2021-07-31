package one.digitalinnovation.personaapi.controller;

import one.digitalinnovation.personaapi.dto.MessageResponseDTO;
import one.digitalinnovation.personaapi.entity.Personi;
import one.digitalinnovation.personaapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    private PersonRepository personRepository;

    @Autowired
    public PersonController(PersonRepository personRepository) {

        this.personRepository = personRepository;
    }

    @PostMapping
    public MessageResponseDTO createPerson(@RequestBody Personi personi){
        Personi savePersoni = personRepository.save(personi);
        return MessageResponseDTO
                .builder()
                .message("Create person with ID " + savePersoni.getId())
                .build();
    }
}
