package com.practice.studentlogin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController 
{
  @GetMapping("/homecontroller")
  public void home()
  {
	  
  }
}
