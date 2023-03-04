package com.BikkadIT.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.BikkadIT.Model.Student;

@Controller
public class StudentController {
	@GetMapping("/studentinformation")
	public ModelAndView getDatat() {
		Student stu=new Student();
		stu.setStudent_id(11);
		stu.setStudent_FName("kabir");
		stu.setStudent_LName("madale");
		stu.setStudent_Address("takli");
		
		Student stu1=new Student();
		stu1.setStudent_id(12);
		stu1.setStudent_FName("Akshay");
		stu1.setStudent_LName("hanmante");
		stu1.setStudent_Address("barabada");
		
		Student stu2=new Student();
		stu2.setStudent_id(13);
		stu2.setStudent_FName("rahul");
		stu2.setStudent_LName("sonkamble");
		stu2.setStudent_Address("kalali");
		
		Student stu3=new Student();
		stu3.setStudent_id(14);
		stu3.setStudent_FName("kiran");
		stu3.setStudent_LName("somaware");
		stu3.setStudent_Address("karna");
		
		List<Student> student= new ArrayList<Student>();
		student.add(stu);
		student.add(stu1);
		student.add(stu2);
		student.add(stu3);
		ModelAndView mav=new ModelAndView();
		mav.addObject("studentdata",student);
		mav.setViewName("studentinformation");
		return mav;
		
	}

}
