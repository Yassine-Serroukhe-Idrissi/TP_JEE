package ma.emsi.tp3_jee.repositories;

import ma.emsi.tp3_jee.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Integer> {
}
