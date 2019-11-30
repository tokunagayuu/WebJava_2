package jp.co.systena.tigerscave.Work1.application.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jp.co.systena.tigerscave.Work1.application.model.Brave;
import jp.co.systena.tigerscave.Work1.application.model.Charaform;
import jp.co.systena.tigerscave.Work1.application.model.Warrior;
import jp.co.systena.tigerscave.Work1.application.model.Wizard;
import jp.co.systena.tigerscave.Work1.application.model.Work;

@Controller
public class RpgController {

	@Autowired
	HttpSession session;

	@RequestMapping(value = "/Select", method = RequestMethod.GET) // URLとのマッピング
	public ModelAndView sel(ModelAndView mav) {

		mav.setViewName("Selectchara");
		mav.addObject("ohage",new Charaform());

		return mav;
	}
	@RequestMapping(value = "/Cmd", method = RequestMethod.POST) // URLとのマッピング
	public ModelAndView cmd(ModelAndView mav,@ModelAttribute Charaform form) {

		Work work = (Work) session.getAttribute("okabe");

		if(form.getWork().equals("戦士")) {

			work = new Brave();


		}else if(form.getWork().equals("魔法使い")){
			work = new Wizard();
		}else if(form.getWork().equals("武闘家")){
			work = new Warrior();
		}
		work.setName(form.getName());
		session.setAttribute("okabe", work);

		mav.setViewName("Cmd");
		mav.addObject("cmdform",form);

		return mav;
	}
	@RequestMapping(value = "/Result", params = "fight",method = RequestMethod.POST) // URLとのマッピング
	public ModelAndView resfight(ModelAndView mav) {

		Work work = (Work) session.getAttribute("okabe");
		work.fight();
		mav.addObject("okabe",work);
		mav.setViewName("Result");
		mav.addObject("flg","fight");

		return mav;
	}
	@RequestMapping(value = "/Result", params = "recovery",method = RequestMethod.POST) // URLとのマッピング
	public ModelAndView resrecovery(ModelAndView mav) {

		Work work = (Work) session.getAttribute("okabe");
		work.recovery();
		mav.addObject("okabe",work);
		mav.setViewName("Result");
		mav.addObject("flg","recovery");

		return mav;
	}
}

