package ma.emsi.tp3_jee.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ma.emsi.tp3_jee.entities.Session;


public interface SessionRepository extends JpaRepository<Session, Integer> {
}
