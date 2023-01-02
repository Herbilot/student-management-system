package tech.herbidev.subjectgroup.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.herbidev.subjectgroup.models.Students;

public interface StudentRepo extends JpaRepository<Students, Long> {

	void deleteStudentById(Long id);

	Optional<Students> findStudentById(Long id);

	
}
