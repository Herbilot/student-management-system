package tech.herbidev.subjectgroup;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tech.herbidev.subjectgroup.models.Students;
import tech.herbidev.subjectgroup.models.Subjects;
import tech.herbidev.subjectgroup.service.StudentService;
import tech.herbidev.subjectgroup.service.SubjectService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentServiceImplTest {

	@Autowired
	private StudentService service;
	private SubjectService subjectService;


	
	 @Test
	 public void successfulSaveStudent () {
		 Students expectedstudent = new Students("Herbilot","Mavoungou");
		 
		 Students saveStudent = service.addStudent(expectedstudent);
		 
		 assertNotNull(saveStudent.getId());
		 assertEquals(expectedstudent.getFirstName(),saveStudent.getFirstName());
		 assertEquals(expectedstudent.getLastName(), saveStudent.getLastName());
	 }
	
	 
	
	 
	 

	
}
