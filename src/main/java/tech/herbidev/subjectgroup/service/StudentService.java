package tech.herbidev.subjectgroup.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.herbidev.subjectgroup.errorHandler.StudentNotFoundException;
import tech.herbidev.subjectgroup.models.Students;
import tech.herbidev.subjectgroup.repo.StudentRepo;

@Service
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
	
	public Students showStudentById(int id) {
		return studentRepo.showStudentById(id)
				.orElseThrow(() -> new StudentNotFoundException(
						"L'étudiant avec l'id " + id + " n'a pas été trouvé"));
	}
	
	public void deleteStudentById(int id) {
		studentRepo.deleteStudentById(id);
	}

}
