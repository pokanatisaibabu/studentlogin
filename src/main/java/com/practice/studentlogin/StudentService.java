package com.practice.studentlogin;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService 
{
	private  StudentRepository sr;
	

    StudentService(StudentRepository s)
    {
    	this.sr=s;
    }
    
    
    
    public  void addStudent(StudentDetails sd)
    {
    	sr.save(sd);
    }
    
    public boolean insertionCheck(StudentDetails sc)
    {
    	StudentDetails s=sr.findById(sc.getId()).orElse(null);
    	if(s==null)
    	{
    		return true;
    	}
    	return false;
    }
    
    
    public boolean deleteCheck(int id)
    {
    	StudentDetails s=sr.findById(id).orElse(null);
    	if(s==null)
    	{
    		return false;
    	}
    	Integer id1=id;
    	sr.deleteById(id1);
		return true;
    }
    
    
    public void updateStudent(StudentDetails sd)
    {
    	sr.save(sd);
    }
    
    public StudentDetails retrieveData(int id)
    {
    	StudentDetails s=sr.findById(id).orElse(null);
    	return s;
    }
    
    public List<StudentDetails> data()
    {
    	return sr.findAll();
    }
}
