package com.naveen.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="crudopeartions_on_comments")
public class Comments {
	
	@Id
	private int id;
	private String matter;
	
	public Comments()
	{}

	public Comments(int id, String matter) {
		super();
		this.id = id;
		this.matter = matter;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMatter() {
		return matter;
	}

	public void setMatter(String matter) {
		this.matter = matter;
	}
}
