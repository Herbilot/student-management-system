package tech.herbidev.subjectgroup.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import tech.herbidev.subjectgroup.models.Subjects;
import tech.herbidev.subjectgroup.repo.SubjectRepo;

@Service
@Transactional
public class SubjectService {
	
	private final SubjectRepo subjectRepo;
	
	@Autowired
	public SubjectService (SubjectRepo subjectRepo) {
		this.subjectRepo = subjectRepo;
	}
	
	/*CRUD methods*/
	public Subjects addSubject(Subjects subject) {
		return subjectRepo.save(subject);
	}
	
	public List<Subjects> showSubjects(){
		return subjectRepo.findAll();
		
	}
	
	public Subjects updateSubject(Subjects subject) {
		return subjectRepo.save(subject);
	}
	
	public void deleteSubjectById(Long id) {
		subjectRepo.deleteSubjecttById(id);
	}

}
