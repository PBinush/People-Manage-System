package edu.e_g.repository;

import edu.e_g.entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonRepository extends JpaRepository<PersonEntity,String>{
//   List<PersonEntity> findPersonByName(String name);

}
