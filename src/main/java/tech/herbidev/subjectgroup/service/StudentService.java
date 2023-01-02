package tech.herbidev.subjectgroup.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import tech.herbidev.subjectgroup.errorHandler.StudentNotFoundException;
import tech.herbidev.subjectgroup.models.Students;
import tech.herbidev.subjectgroup.repo.StudentRepo;

@Service
@Transactional
public class StudentService {
	private final StudentRepo studentRepo;
	
	@Autowired
	public StudentService(StudentRepo studentRepo) {
		this.studentRepo = studentRepo;
	}
	
	/*CRUD methods*/
	public Students addStudent(Students student) {
		return studentRepo.save(student);
	}
	
	public List<Students> showStudent(){
		return studentRepo.findAll();
	}
	public Students updateStudent(Students student) {
		return studentRepo.save(student);
	}
	
	public Students showStudentById(Long id) {
		return studentRepo.findStudentById(id)
				.orElseThrow(() -> new StudentNotFoundException(
						"L'étudiant avec l'id " + id + " n'a pas été trouvé"));
	}
	
	public void deleteStudentById(Long id) {
		studentRepo.deleteStudentById(id);
	}

}
