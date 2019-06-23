package br.gov.sp.etec.erp;	

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
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

	/*
	 * //Lista todos os cliente
	 * 
	 * @RequestMapping(value = "/listaCliente") public ResponseEntity<Object>
	 * getCliente(
	 * 
	 * @RequestParam(value = "name", required = false, defaultValue = "honey")
	 * String name) {
	 * 
	 * List<Cliente> cliente = repository.findAll(); Integer contador = 0; for
	 * (@SuppressWarnings("unused") Cliente cliente1 : cliente) {
	 * clienteRepo.put(contador.toString(), (Cliente) cliente); contador++; }
	 * 
	 * return new ResponseEntity<>(clienteRepo.values(), HttpStatus.OK); }
	 * 
	 * 
	 * //adiciona um cliente
	 * 
	 * @RequestMapping(value = "/adicionar") public Cliente
	 * adicionarCliente(@RequestBody Cliente cliente) { return
	 * repository.save(cliente); }
	 * 
	 * 
	 * @GetMapping("/cliente/{id}") public Cliente clienteGetId(@PathVariable long
	 * id) throws Exception {
	 * 
	 * Optional<Cliente> cliente = repository.findById(id);
	 * 
	 * if (!cliente.isPresent()) throw new Exception("id-" + id);
	 * 
	 * return cliente.get(); }
	 * 
	 * @PutMapping("/cliente/{id}") public ResponseEntity<Object>
	 * updateCliente(@RequestBody Cliente cliente, @PathVariable long id) {
	 * 
	 * Optional<Cliente> ClienteOptional = repository.findById(id);
	 * 
	 * if (!ClienteOptional.isPresent()) return ResponseEntity.notFound().build();
	 * 
	 * cliente.setIdcliente(id);
	 * 
	 * repository.save(cliente);
	 * 
	 * return ResponseEntity.noContent().build(); }
	 * 
	 * @DeleteMapping("/cliente/{id}") public void deleteCliente(@PathVariable long
	 * id) { repository.deleteById(id); }
	 */
}
