package tech.herbidev.subjectgroup;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tech.herbidev.subjectgroup.models.Students;
import tech.herbidev.subjectgroup.models.Subjects;
import tech.herbidev.subjectgroup.service.SubjectService;

@RestController
@RequestMapping("/subjects")
public class SubjectController {
	
	private SubjectService subjectService;
	
	public SubjectController(SubjectService subjectService) {
		this.subjectService = subjectService;
	}
	
	@GetMapping
	public ResponseEntity<List<Subjects>> showSubjects (){
		List<Subjects> subjects = subjectService.showSubjects();
		return new ResponseEntity<>(subjects, HttpStatus.OK); 
	}
	
	@PostMapping("/add")
	public ResponseEntity<Subjects> addSubject(@RequestBody Subjects subject){
		Subjects newSubject = subjectService.addSubject(subject);
		return new ResponseEntity<>(newSubject, HttpStatus.CREATED);		
	}
	
	@PutMapping("/update")
	public ResponseEntity<Subjects> updateSubject(@RequestBody Subjects subject){
		Subjects updatedSubject = subjectService.updateSubject(subject);
		return new ResponseEntity<>(updatedSubject, HttpStatus.CREATED);
	}
	
	@DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteSubject(@PathVariable("id") Long id) {
        subjectService.deleteSubjectById(id);
        return new ResponseEntity<>(HttpStatus.OK); 
	}
	

}
