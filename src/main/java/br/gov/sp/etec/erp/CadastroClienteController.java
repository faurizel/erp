package br.gov.sp.etec.erp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.gov.sp.etec.erp.repository.FornecedorRepository;

@Controller
public class CadastroClienteController {
	
	@Autowired
	FornecedorRepository er;
	
	@RequestMapping(value="/cadastrarCliente", method = RequestMethod.GET)	
	String cadastroFornecedor() {		
		return ("/cliente/formCadastroCliente");		
	}	
	
}
