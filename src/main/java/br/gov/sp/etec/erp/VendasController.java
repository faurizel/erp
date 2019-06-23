package br.gov.sp.etec.erp;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class VendasController {	
	
	@RequestMapping(value = "/cadastroVendas" , method = RequestMethod.GET)
	public ModelAndView cadastroVendas() {			
		ModelAndView view = new ModelAndView("/vendas/cadastroVendas");
		return view;
	}
}
