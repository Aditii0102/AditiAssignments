package com.assignment.assignment.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Books {
	@Id
	private String id;

	public Books(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}

	private String name;
	private String description;

	public Books() {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
