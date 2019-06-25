package br.gov.sp.etec.erp;	

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import br.gov.sp.etec.erp.entity.Cliente;
import br.gov.sp.etec.erp.repository.ClienteRepository;

@RestController
public class ClienteController {
	private static Map<String, Cliente> clienteRepo = new HashMap<>();

	
	 @Autowired private ClienteRepository repository;
	 
	
	
	@RequestMapping(value = "/cadastroCliente" , method = RequestMethod.GET)
	public ModelAndView cadastroCliente() {			
		ModelAndView view = new ModelAndView("/vendas/cliente");
		return view;
	}
	
	@RequestMapping(value = "/adicionar", method = RequestMethod.POST) 
	public String  adicionarCliente(Cliente cliente) {
		 repository.save(cliente); 
		 return ("redirect:/vendas/cliente");
	 }


}
