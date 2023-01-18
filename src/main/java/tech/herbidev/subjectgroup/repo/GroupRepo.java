package tech.herbidev.subjectgroup.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.herbidev.subjectgroup.models.Groups;

public interface GroupRepo extends JpaRepository<Groups, Long> {

	
}
