package tech.herbidev.subjectgroup.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.herbidev.subjectgroup.models.Subjects;

public interface SubjectRepo extends JpaRepository<Subjects, Long> {

}
