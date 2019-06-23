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
 * import br.gov.sp.etec.erp.entity.Item; import
 * br.gov.sp.etec.erp.repository.ItemRepository;
 * 
 * @RestController public class ItemController {
 * 
 * private static Map<String, Item> itemRepo = new HashMap<>();
 * 
 * @Autowired private ItemRepository repository;
 * 
 * // Lista todos os items
 * 
 * @RequestMapping(value = "/listaItems") public ResponseEntity<Object>
 * getItems(
 * 
 * @RequestParam(value = "name", required = false, defaultValue = "honey")
 * String name) {
 * 
 * List<Item> items = repository.findAll(); Integer contador = 0; for (Item item
 * : items) { itemRepo.put(contador.toString(), item); contador++; }
 * 
 * return new ResponseEntity<>(itemRepo.values(), HttpStatus.OK); }
 * 
 * // adiciona um item
 * 
 * @RequestMapping(value = "/adicionar") public Item adicionarItem(@RequestBody
 * Item item) { return repository.save(item); }
 * 
 * @GetMapping("/item/{id}") public Item itemGetId(@PathVariable long id) throws
 * Exception { Optional<Item> item = repository.findById(id);
 * 
 * if (!item.isPresent()) throw new Exception("id-" + id);
 * 
 * return item.get(); }
 * 
 * @PutMapping("/item/{id}") public ResponseEntity<Object>
 * updateItem(@RequestBody Item item, @PathVariable long id) {
 * 
 * Optional<Item> itemOptional = repository.findById(id);
 * 
 * if (!itemOptional.isPresent()) return ResponseEntity.notFound().build();
 * 
 * item.setId(id);
 * 
 * repository.save(item);
 * 
 * return ResponseEntity.noContent().build(); }
 * 
 * @DeleteMapping("/item/{id}") public void deleteItem(@PathVariable long id) {
 * repository.deleteById(id); }
 * 
 * }
 */