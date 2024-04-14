package com.example.demo.Model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Course")
@Data


public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private long id;
	@Column
	private String coursename;
	@Column
	private int price;
	@ManyToMany(cascade = CascadeType.ALL,mappedBy = "courses")
	private List<Student >students;
	public Course(long id, String coursename, int price) {
		super();
		this.id = id;
		this.coursename = coursename;
		this.price = price;
	}
	public Course() {
		super();
	}
	
	
	

}
