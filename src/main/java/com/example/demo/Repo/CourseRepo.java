package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Course;

public interface CourseRepo extends JpaRepository<Course, Long>{

}
