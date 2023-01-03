package tech.herbidev.subjectgroup;

import java.util.Collection;
import java.util.Collections;
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
import tech.herbidev.subjectgroup.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
	private final StudentService studentService;
	
	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}
	
	//methods to show all students present in the db
	//use of GetMapping decorator as the method return an http response
	@GetMapping
	public ResponseEntity<List<Students>> showStudents (){
		List<Students> students = studentService.showStudent();
		return new ResponseEntity<>(students, HttpStatus.OK); 
	}
	
	@GetMapping("/student/{id}")
	public ResponseEntity<Students> ShowStudentById(@PathVariable("id") Long id){
		Students student = studentService.showStudentById(id);
		return new ResponseEntity<>(student, HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<Students> addStudent(@RequestBody Students student){
		Students newStudent = studentService.addStudent(student);
		return new ResponseEntity<>(newStudent, HttpStatus.CREATED);		
	}
	
	@PutMapping("/update")
	public ResponseEntity<Students> updateStudent(@RequestBody Students student){
		Students updatedStudent = studentService.updateStudent(student);
		return new ResponseEntity<>(updatedStudent, HttpStatus.CREATED);
	}
	
	@DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable("id") Long id) {
        studentService.deleteStudentById(id);
        return new ResponseEntity<>(HttpStatus.OK); 
	}
	
	/*@GetMapping("/groups")
	public ResponseEntity<List<Students>> groupStudent() {
		List<Students> list = studentService.showStudent();
		List<Students> groupe;
		System.out.println(list);
		Collections.shuffle(list);
		System.out.println("randon : " + list);
		
		
		return new ResponseEntity<>(list, HttpStatus.OK); 
		
	}*/
}
