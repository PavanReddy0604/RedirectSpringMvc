package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirctController {
	
	
	//RedirectPrefix
	/*@RequestMapping("/one")
	public String one()
	{
		System.out.println("in one handler");
		return"redirect:/two";
	}
	@RequestMapping("/two")
	public String two()
	{
		System.out.println("in second handler");
		return "home";
	}
	*/
	//RedirectView
	@RequestMapping("/one")
	public RedirectView one()
	{
		System.out.println("in one handler");
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("home");
		return redirectView;
	}
	@RequestMapping("/two")
	public String two()
	{
		System.out.println("in second handler");
		return "home";
	}

}
