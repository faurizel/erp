package etec.sp.gov.br.erp.erp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import etec.sp.gov.br.erp.entity.Fornecedor;
import etec.sp.gov.br.erp.repository.FornecedorRepository;

/*@SpringBootApplication*/
@RestController
public class FornecedorController {

	private static Map<String, Fornecedor> fornecedorRepo = new HashMap<>();

	@Autowired
	private FornecedorRepository repository;

	/*
	 * FornecedorController(FornecedorRepository fornecedorRepository) {
	 * this.repository = fornecedorRepository; }
	 */

	@RequestMapping(value = "/listaFornecedor")
	public ResponseEntity<Object> getFornecedores(
			@RequestParam(value = "name", required = false, defaultValue = "honey") String name) {

		List<Fornecedor> fornecedores = repository.findAll();
		Integer contador = 0;
		for (Fornecedor fornecedor : fornecedores) {
			fornecedorRepo.put(contador.toString(), fornecedor);
			contador++;
		}
		

		return new ResponseEntity<>(fornecedorRepo.values(), HttpStatus.OK);

	}

	@RequestMapping(value = "/adicionar")
	public Fornecedor adicionarFornecedor() {

		Fornecedor fornecedor = new Fornecedor();
		fornecedor.setRazaoSocial("Paulo  LTDA");
		fornecedor.setEmail("paulo@teste.com");

		return repository.save(fornecedor);
	}

	/*
	 * @PutMapping(value="/{id}") public ResponseEntity update(@PathVariable("id")
	 * long id, @RequestBody Fornecedor fornecedor) {
	 * 
	 * return repository.findById(id).map((Function<? super
	 * etec.sp.gov.br.erp.entity.Fornecedor, ? extends U>) record -> {
	 * record.setRazaoSocial(fornecedor.getRazaoSocial());});
	 * 
	 * return repository.findById(id).map(record -> {
	 * record.setName(fornecedor.getName()); record.setEmail(contact.getEmail());
	 * record.setPhone(contact.getPhone()); Contact updated =
	 * repository.save(record); return ResponseEntity.ok().body(updated);
	 * }).orElse(ResponseEntity.notFound().build());
	 * 
	 * }
	 */
}
