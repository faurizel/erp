package br.gov.sp.etec.erp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.gov.sp.etec.erp.entity.Fornecedor;
import br.gov.sp.etec.erp.entity.Login;

@Controller
public class IndexController {
	
	@RequestMapping("/")
	String index() {				
		return ("login");
		
	}		

	
	@RequestMapping(value="/logar", method = RequestMethod.GET )
	ModelAndView index(Login login) {
		ModelAndView view;
		if(login.getLogin().equals("admin")   && login.getSenha().equals("admin")) {
			view = new ModelAndView("index-drop");
			view.addObject("usuario", login.getLogin());			
		}else {
			view = new ModelAndView("login");			
		}
		return view;	
		
	}	

}
