/*
 * package br.gov.sp.etec.erp;
 * 
 * import java.util.HashMap; import java.util.List; import java.util.Map; import
 * java.util.Optional;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.http.HttpStatus; import
 * org.springframework.http.ResponseEntity; import
 * org.springframework.web.bind.annotation.DeleteMapping; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.PathVariable; import
 * org.springframework.web.bind.annotation.PutMapping; import
 * org.springframework.web.bind.annotation.RequestBody; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RequestParam; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 * import br.gov.sp.etec.erp.entity.Geracao; import
 * br.gov.sp.etec.erp.repository.GeracaoRepository;
 * 
 * @RestController public class GeracaoController {
 * 
 * private static Map<String, Geracao> geracaoRepo = new HashMap<>();
 * 
 * @Autowired private GeracaoRepository repository;
 * 
 * // Lista todos as gerações
 * 
 * @RequestMapping(value = "/listaGeracao") public ResponseEntity<Object>
 * getGeracao(
 * 
 * @RequestParam(value = "name", required = false, defaultValue = "honey")
 * String name) {
 * 
 * List<Geracao> geracao = repository.findAll(); Integer contador = 0; for
 * (Geracao geracao1 : geracao) { geracaoRepo.put(contador.toString(), (Geracao)
 * geracao1); contador++; }
 * 
 * return new ResponseEntity<>(geracaoRepo.values(), HttpStatus.OK); }
 * 
 * // adiciona uma geração
 * 
 * @RequestMapping(value = "/adicionar") public Geracao
 * adicionarGeracao(@RequestBody Geracao geracao) { return
 * repository.save(geracao); }
 * 
 * @GetMapping("/geracao/{id}") public Geracao
 * geracaoGetIdnotafiscal(@PathVariable long id) throws Exception {
 * Optional<Geracao> geracao = repository.findByIdnotafiscal(id);
 * 
 * if (!geracao.isPresent()) throw new Exception("id-" + id);
 * 
 * return geracao.get(); }
 * 
 * @PutMapping("/geracao/{id}") public ResponseEntity<Object>
 * updateGeracao(@RequestBody Geracao geracao, @PathVariable long id) {
 * 
 * Optional<Geracao> geracaoOptional = repository.findById(id);
 * 
 * if (!geracaoOptional.isPresent()) return ResponseEntity.notFound().build();
 * 
 * geracao.setId(id);
 * 
 * repository.save(geracao);
 * 
 * return ResponseEntity.noContent().build(); }
 * 
 * @DeleteMapping("/geracao/{id}") public void deleteGeracao(@PathVariable long
 * id) { repository.deleteById(id); }
 * 
 * }
 */