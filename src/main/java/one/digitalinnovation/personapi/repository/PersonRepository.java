package one.digitalinnovation.personapi.repository;


import one.digitalinnovation.personapi.entity.Personi;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PersonRepository extends JpaRepository<Personi, Long> {

}
