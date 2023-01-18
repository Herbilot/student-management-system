package tech.herbidev.subjectgroup;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tech.herbidev.subjectgroup.models.Groups;
import tech.herbidev.subjectgroup.service.GroupService;
import tech.herbidev.subjectgroup.service.StudentService;

@RestController
@RequestMapping("/groups")
public class GroupsController {
	
	private final GroupService groupService;

	public GroupsController(GroupService groupService) {
		this.groupService = groupService;
	}
	@GetMapping
	public ResponseEntity<List<Groups>> showGroups(){
		List<Groups> groups = groupService.showGroup();
		return new ResponseEntity<>(groups, HttpStatus.OK);
	}
	
	
	
	

}
