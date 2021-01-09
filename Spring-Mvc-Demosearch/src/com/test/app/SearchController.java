package com.test.app;

import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SearchController
{
	@RequestMapping("/search")
ModelAndView searchStudent(@RequestParam String rollNo)
{
		Map<String,String> tempdata=new HashMap<String,String>();
		tempdata.put("1", "Ram");
		tempdata.put("2", "Sham");
		tempdata.put("3", "Bharat");
		tempdata.put("4", "Kshitij");
		tempdata.put("5", "Dharm");
		
		ModelAndView mv=new ModelAndView("data.jsp");
		String student="";
		if(tempdata.containsKey(rollNo))
		{
			student=tempdata.get(rollNo);
			mv.addObject("std",student);
		}
	return mv;
}
}
