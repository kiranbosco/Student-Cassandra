package com.io.spring;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Client {

	@Autowired
	private StudentRepository studentRepository;
	
	public List<Student>postAll=Arrays.asList(
			new Student(100, "Nandhini", "Namu", 8),
			new Student(101, "Charan", "Purini", 7),
			new Student(102, "Varshini", "Namu", 6),
			new Student(103, "Heemaja", "Purini",4),
			new Student(104, "Srilakshmi", "Namu", 4));
	
	@RequestMapping(value="/postData",method=RequestMethod.POST)
	public List<Student>all(){
		return postAll;
		
	}
			
}
