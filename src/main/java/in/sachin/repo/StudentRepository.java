package in.sachin.repo;



import org.springframework.data.jpa.repository.JpaRepository;

import in.sachin.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}

