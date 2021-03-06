package camt.cbsd.lab05.repository;

import camt.cbsd.lab05.entity.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student, Long> {
    Student findById(Long id);

    Student findByUserUsername(String username);

    List<Student> findByName(String name);

    List<Student> findByNameIgnoreCaseContainingOrderByName(String name);

    List<Student> findBySurnameIgnoreCaseContaining(String surname);

    List<Student> findByNameIgnoreCaseContainingOrSurnameIgnoreCaseContaining(String name, String surname);

}
