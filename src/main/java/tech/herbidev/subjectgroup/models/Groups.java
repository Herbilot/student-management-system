package tech.herbidev.subjectgroup.models;

import java.util.List;

public class Groups {
	private int number;
	private String name = "Groupe";
	private List<Students> member;
	
	public Groups( ) {}

	public Groups(int number, String name, List<Students> member) {
		this.number = number;
		name = this.name;
		this.member = member;
	}


	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Students> getMember() {
		return member;
	}

	public void setMember(List<Students> member) {
		this.member = member;
	}
	
}
