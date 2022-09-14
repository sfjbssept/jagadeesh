package com.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.entity.Student;
import com.crud.repo.IStudentRepository;


@RestController
public class StudentController {
	
	@Autowired
	private IStudentRepository studentRepository;
	
	@PostMapping("/addstudent")
	public ResponseEntity<?> addStudent(@RequestBody Student student){
		Student save = this.studentRepository.save(student);
		
		return ResponseEntity.ok(save);
	}

	
	@GetMapping("/getstudent")
	public ResponseEntity<?> getStudent(){
		return ResponseEntity.ok(this.studentRepository.findAll());
		
	}
	
	
	/*
	 * @PutMapping("/update/{id}") public ResponseEntity<?>
	 * updateProduct(@PathVariable("id") Integer Id, @RequestBody Student student){
	 * return null;
	 * 
	 * 
	 * 
	 * }
	 */
	
	
	
}
