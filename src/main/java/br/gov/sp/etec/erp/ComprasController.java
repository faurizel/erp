package br.gov.sp.etec.erp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ComprasController {
	
	@RequestMapping(value="/pageCompras", method = RequestMethod.GET)
	String cadastroCompras() {		
		return ("/compras/IndexCompras");		
	}	

}
