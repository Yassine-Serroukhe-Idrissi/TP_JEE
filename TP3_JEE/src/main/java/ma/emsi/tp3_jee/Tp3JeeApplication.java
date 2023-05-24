package ma.emsi.tp3_jee;

import ma.emsi.tp3_jee.entities.Student;
import ma.emsi.tp3_jee.repositories.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class Tp3JeeApplication {

    public static void main(String[] args) {
        SpringApplication.run(Tp3JeeApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            studentRepository.save(new Student(null,"Yassine",new Date(),true,new Date()));
        };
    }

}
