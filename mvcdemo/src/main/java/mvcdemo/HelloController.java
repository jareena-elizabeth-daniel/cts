package mvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {	
	   @RequestMapping("/hello")
	   ModelAndView hello(){	   
		   return new ModelAndView("hello", "msg", "Hello Spring MVC ..");
	   }
	   
	   
	   @RequestMapping("/home")
	    public ModelAndView hello1(){ 
			return new ModelAndView("home", "msg","Home");
	    }
	   
	   
	   
	}