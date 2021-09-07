package ns;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class mc {
    
	@RequestMapping("welcome")
	public ModelAndView sayWelcome() {
		ModelAndView mv= new ModelAndView();
		mv.setViewName("Welcome");
		return mv;
	}
    
}
