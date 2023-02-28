package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.util.User;



@Controller
public class HomeController {
	
	
	@RequestMapping("/home")
	public String getHome()
	{
		System.out.println("home url");
		return "home";
	}
	
	@RequestMapping(path="/processform",method=RequestMethod.POST)
	public String success(@ModelAttribute User u,Model model)
	{
		model.addAttribute("us",u);
		if(u.getName().equals("pavan"))
			{
			return "redirect:one";
			}


		return "redirect:one";
	}

}
