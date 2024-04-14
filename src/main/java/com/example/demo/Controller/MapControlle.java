package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Student;
import com.example.demo.Repo.CourseRepo;
import com.example.demo.Repo.StudentRepo;

@RestController
@RequestMapping("/mapp")
public class MapControlle {
	@Autowired
	StudentRepo studentRepo;
	@Autowired
	CourseRepo courseRepo;
	
	@PostMapping("/add")
	public Student save(@RequestBody Student student) {
		return studentRepo.save(student);
	}

}
