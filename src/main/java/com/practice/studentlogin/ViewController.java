package com.practice.studentlogin;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ViewController
{
	StudentService ss;
	ViewController(StudentService ss)
	{
		this.ss=ss;
	}

	@GetMapping("/home")
	public String home()
	{
		return "home";
	}
	
	@PostMapping("/addStudent")
	public String add(@ModelAttribute StudentDetails sd,Model model)
	{
		model.addAttribute("id",sd.getId());
		model.addAttribute("name",sd.getSname());
		if(ss.insertionCheck(sd))
		{	
		 ss.addStudent(sd);
		 return "LoginSucess";
		}
		return "DuplicateId";
	}
	
	@PostMapping("/deleteStudent")
	public String deleteStudent(@RequestParam int id,Model model)
	{
		model.addAttribute("id",id);
		if(ss.deleteCheck(id))
		{
		return "deleteSucess";
		}
		else
		{
		return "deleteError";
		}
	}
	
	@GetMapping("/delete")
	public String delete()
	{
		return "delete";
	}
	
	@GetMapping("/update")
	public String update()
	{
		return "UpdateStudent";
	}
	
	@PostMapping("/updateStudent")
	public String updateStudent(@ModelAttribute StudentDetails sd,Model model)
	{
		model.addAttribute("id",sd.getId());
		ss.updateStudent(sd);
		return "updationSucess";
	}
	
	@GetMapping("/get")
	public String get()
	{
		return "allStudents";
	}
	
	@PostMapping("/getStudent")
	public String getStudent(@RequestParam int id,Model model)
	{
		StudentDetails sd=ss.retrieveData(id);
		if(sd==null)
		{
			model.addAttribute("id",id);
			return "deleteError";
		}
		model.addAttribute("student",sd);
		return "retrieveData";
	}
	
	@GetMapping("/allStudentDetails")
	public String allStudentDetails(Model model)
	{
		List<StudentDetails> sl=ss.data();
		model.addAttribute("student",sl);
		return "retrieveData";
	}
}
