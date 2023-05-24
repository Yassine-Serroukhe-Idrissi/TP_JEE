package ma.emsi.tp3_jee.repositories;

import ma.emsi.tp3_jee.entities.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Integer> {
}
