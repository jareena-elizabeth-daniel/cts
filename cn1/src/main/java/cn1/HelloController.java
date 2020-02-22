package cn1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class HelloController {
	
	
   @RequestMapping("hello")
   ModelAndView hello(){	   
	   return new ModelAndView("hello", "msg", "Hello... object");
   }
   
  
   /*@RequestMapping("home")
   ModelAndView hello1(){	   
	   return new ModelAndView("home", "msg", "Hello... home");
   }
   */
   @RequestMapping("/hello/home")
	public String hello2() {
	   
		return "home";
	}
   
   @RequestMapping(value="/rqparam", method=RequestMethod.GET)
	public String rqParam1(Model model,
						   @RequestParam String username,
						   @RequestParam("password") String pw) {
		model.addAttribute("uname", username);
		model.addAttribute("pw", pw);
		return "rq_param";
	}
   
   @RequestMapping(value="/path_variable/{empname}/{empage}")
	public String rqPathVariable(Model model, 
								 @PathVariable String empname, 
								 @PathVariable int empage) {
		model.addAttribute("empname", empname);
		model.addAttribute("empage", empage);
		return "path_variable";
	}
   
   @RequestMapping(value="/page1", method=RequestMethod.GET)
	public String page1(Model model) {
		model.addAttribute("pag1msg", "The model is automaticly populated at request ...");
		return "page1";
	}
   
   @RequestMapping(value="/page2", method=RequestMethod.GET)
	public void page2(Model model) {
		model.addAttribute("modelMsg", "The view automaticly loaded...(page2.jsp)");
	}
	
   
   
   
}