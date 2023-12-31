package com.yume.UserController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.yume.Dao.HomeDao;

@Controller
public class HomeController {
	@Autowired
	HomeDao homeDao;
	
	@RequestMapping(value = "/user/")
	public ModelAndView Index() {
		ModelAndView mv = new ModelAndView("user/index");
		mv.addObject("slides", homeDao.GetDataSlide());
		return mv;
	}

	@RequestMapping(value = "/user/product")
	public ModelAndView Product() {
		ModelAndView mv = new ModelAndView("user/product");
		return mv;
	}
}
