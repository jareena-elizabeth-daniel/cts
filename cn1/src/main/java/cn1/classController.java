package cn1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
   @RequestMapping("/welcome")
   public class classController{

   @RequestMapping("/add")
    public ModelAndView hello3(){    	
    	return new ModelAndView("welcomeadd");
    }
}