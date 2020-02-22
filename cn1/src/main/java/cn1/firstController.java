package cn1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/first")
public class firstController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String firstReq() {
		return "first";
	}
	
	@RequestMapping(value="page1", method = RequestMethod.GET)
	public String firstReqVal1(Model model) {
		model.addAttribute("pag1msg", "You are in page 1");
		return "page1";
	}
	
	@RequestMapping(value="page2", method = RequestMethod.GET)
	public String firstReqVal2(Model model) {
		model.addAttribute("page2Msg", "You are in page 1");
		return "page2";
	}
}
