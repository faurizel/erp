package br.gov.sp.etec.erp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.gov.sp.etec.erp.entity.EntradaNF;
import br.gov.sp.etec.erp.repository.EntradaNfRepository;

@Controller
public class EntradaNFController {
	
	@Autowired
	EntradaNfRepository repository;
	
	@RequestMapping(value = "/cadastroNotaFiscal" , method = RequestMethod.GET)
	public ModelAndView cadastroNotaFiscal() {			
		ModelAndView view = new ModelAndView("/vendas/GeracaoNF");
		return view;
	}
	
	@RequestMapping(value = "/adicionarNotaFiscal", method = RequestMethod.POST) 
	public ModelAndView  adicionarNotaFiscal(EntradaNF entradaNF) {
		 repository.save(entradaNF); 
			ModelAndView view = new ModelAndView("/vendas/GeracaoNF");
			return view;
	 }
}
