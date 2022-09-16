package com.student.app.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.student.app.entity.Student;

@RestController
public class StudentServiceController {
 private static Map<String, List<Student>> schoolDB = new HashMap<String, List<Student>>();
 
 static {
	 schoolDB = new HashMap<String, List<Student>>();
	 
	 List<Student> lst = new ArrayList<Student>();
	 Student std = new Student("nishant", "class12");
	 lst.add(std);
	
	
	
	 List<Student> lst1 = new ArrayList<Student>();
	 Student std1 = new Student("peter", "class11");
	 lst1.add(std1);
	 Student std2 = new Student("phillip", "class10");
	 lst1.add(std2);
	/*
	 * std = new Student("Vinay", "class11"); lst.add(std);
	 */
	
	schoolDB.put("school11", lst);
	schoolDB.put("school2", lst1);
 }
 
 
 @RequestMapping(value = "/getstudentDetailsForSchool/{schoolname}", method = RequestMethod.GET)
 public List<Student> getStudent(@PathVariable String schoolname){
	 System.out.println("Getting student details for "+ schoolname);
	 List<Student> studentList = schoolDB.get(schoolname);
	 if(studentList == null) {
		 studentList = new ArrayList<Student>();
		 Student std = new Student("Not found 404", "N/A");
		 studentList.add(std);
	 }
	return studentList;
 }
}
