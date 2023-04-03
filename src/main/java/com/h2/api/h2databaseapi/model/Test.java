package com.h2.api.h2databaseapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Test")
public class Test {

	@Column(name = "ID")
	private int id;

	@Column(name = "NAME")
	private String name;

	public Test() {

	}

	public Test(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Name [id=" + id + ", name=" + name + "]";
	}

}
