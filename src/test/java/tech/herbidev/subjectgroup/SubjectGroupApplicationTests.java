package tech.herbidev.subjectgroup;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import tech.herbidev.subjectgroup.models.Subjects;
import tech.herbidev.subjectgroup.service.SubjectService;

@SpringBootTest
class SubjectGroupApplicationTests {
	private SubjectService service;

	 @Test
	 public void successfulSaveSubject () {
		 Subjects expectedSubject = new Subjects("Expose maven");
		 Subjects saveSubject = service.addSubject(expectedSubject);
		 
		 assertNotNull(saveSubject.getId());
		 assertEquals(expectedSubject.getDescription(),saveSubject.getDescription());
		 
	 }

}
