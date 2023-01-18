package tech.herbidev.subjectgroup.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import tech.herbidev.subjectgroup.models.Groups;
import tech.herbidev.subjectgroup.repo.GroupRepo;

@Service
@Transactional
public class GroupService {
private final GroupRepo groupRepo;
	
	@Autowired
	public GroupService(GroupRepo groupRepo) {
		this.groupRepo = groupRepo;
	}
	
	
	public List<Groups> showGroup(){
		return groupRepo.findAll();
	}
	

}
