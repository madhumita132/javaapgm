package training.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import training.bean.LoginBean;
@Controller
public class LoginController {
@RequestMapping(value="/validate.html",method=RequestMethod.POST)
public ModelAndView validate(@RequestParam("name") String username,
		@RequestParam("pwd") String password) {
	ModelAndView modelAndView=new ModelAndView();
	LoginBean loginBean=new LoginBean();
    loginBean.setUsername(username);
	loginBean.setPassword(password);
	String result;
	System.out.println("data/model access related operation");
	String name=loginBean.getUsername();
	String pwd=loginBean.getPassword();
	///buisnessLogic/service
	if(name.equals("madhu") && pwd.equals("admin")) {
		result ="success";
	}
	else {
		 result="failure";
	}
	//generate response/ui
	if(result.equals("success")) {
		 modelAndView.setViewName("success.jsp");//response page
		 modelAndView.addObject("message",""+name);//key nd model
	}
	else {
		modelAndView.setViewName("failure.jsp");//response page
		 modelAndView.addObject("errormessage","login again invalid input");//key nd model
	}
	return modelAndView;
	
}
}
