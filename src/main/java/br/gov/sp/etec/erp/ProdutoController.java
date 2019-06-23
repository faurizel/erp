package br.gov.sp.etec.erp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.gov.sp.etec.erp.entity.Produto;
import br.gov.sp.etec.erp.repository.ProdutoRepository;

@Controller
public class ProdutoController {
	
	@Autowired
	ProdutoRepository repository;
	
	@RequestMapping(value = "/cadastroProduto" , method = RequestMethod.GET)
	public ModelAndView cadastroNotaFiscal() {			
		ModelAndView view = new ModelAndView("/estoque/produto");
		return view;
	}	
	
	
	@RequestMapping(value = "/adicionarProduto" , method = RequestMethod.GET)
	public ModelAndView adicionarProduto(Produto produto) {			
		 repository.save(produto); 
		ModelAndView view = new ModelAndView("/estoque/produto");
		return view;
	}	
	
}
