package com.csc.studentServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import jakarta.transaction.Transactional;

@Service
@Transactional

public class StudentService {
	@Autowired
	private StudentRepository repo;
	//Inserting the records to the table in database
	public void insertRecord(Student stud)
	{
		repo.save(stud);
	}
	
	//Show all the records from the table in database
	public List<Student> getAllRecords()
	{
		return repo.findAll();
	}
	
	//Show specific record from the table in database
	public Student getStudentById(Integer id)
	{
		return repo.findById(id).orElse(null);
	}
	
	//Deleting the specific record from the table in database
	public void deleteStudent(Integer id)
	{
		repo.deleteById(id);
	}
	
	//updating the existing record
	public void updateStudent(Integer id,Student updateStudent)
	{
		Student existingStudent=repo.findById(id).orElse(null);
		if(existingStudent!=null)
		{
			existingStudent.setSid(updateStudent.getSid());
			existingStudent.setSname(updateStudent.getSname());
			existingStudent.setCity(updateStudent.getCity());
			existingStudent.setCourse(updateStudent.getCourse());
			repo.save(existingStudent);
		}
	}
	
	
	
	

}
