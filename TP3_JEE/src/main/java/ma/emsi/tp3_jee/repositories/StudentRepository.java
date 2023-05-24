package ma.emsi.tp3_jee.repositories;

import ma.emsi.tp3_jee.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
