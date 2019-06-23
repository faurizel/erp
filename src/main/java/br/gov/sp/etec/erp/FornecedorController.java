package br.gov.sp.etec.erp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.gov.sp.etec.erp.entity.Fornecedor;
import br.gov.sp.etec.erp.repository.FornecedorRepository;

@Controller
public class FornecedorController {
	
	@Autowired
	FornecedorRepository er;
	@RequestMapping(value="/cadastrarfornecedor", method = RequestMethod.GET)
	String cadastroFornecedor() {		
		return ("/compras/formCadastrarFornecedor");		
	}	
	
	@RequestMapping(value="/cadastrarfornecedor", method = RequestMethod.POST)
	String cadastroFornecedor(Fornecedor fornecedor) {
		er.save(fornecedor);
		return ("redirect:/cadastrarfornecedor");		
	}
	
	@RequestMapping(value="/buscarfornecedor")
	String buscarFornecedor() {		
		return ("/fornecedor/formBuscarFornecedor");		
	}
	
	@RequestMapping(value="/fornecedores", method = RequestMethod.GET )
	ModelAndView listaFornecedor(Fornecedor fornecedor) {	
		ModelAndView view = new ModelAndView("/fornecedor/formBuscarFornecedor");
		List<Fornecedor> fornecedores = getFornecedores(fornecedor);
		view.addObject("fornecedores", fornecedores);
		return view;		
	}
	
	@RequestMapping(value="/boasvindas", method = RequestMethod.GET )
	String boasVindas() {
		return "/fornecedor/boasvindas";
	}
	
	private List<Fornecedor> getFornecedores(Fornecedor fornecedor){
		List<Fornecedor> fornecedores = new ArrayList<Fornecedor>();
		if(fornecedor.getCnpj()!="") {			
			fornecedor = er.findByCnpj(fornecedor.getCnpj());
			fornecedores.add(fornecedor);
		}else if(fornecedor.getRazaoSocial()!="") {
			fornecedor = er.findByRazaoSocial(fornecedor.getRazaoSocial());
			fornecedores.add(fornecedor);
		}else {
			fornecedores = er.findAll();
		}		
		return fornecedores;
		
	}
}
