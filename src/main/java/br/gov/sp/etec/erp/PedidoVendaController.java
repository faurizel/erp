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
 * import br.gov.sp.etec.erp.entity.PedidoVenda; import
 * br.gov.sp.etec.erp.repository.PedidoVendaRepository;
 * 
 * @RestController public class PedidoVendaController {
 * 
 * private static Map<String, PedidoVenda> pedidoVendaRepo = new HashMap<>();
 * 
 * @Autowired private PedidoVendaRepository repository;
 * 
 * //Lista todos os PedidoVenda
 * 
 * @RequestMapping(value = "/listaPedidoVenda") public ResponseEntity<Object>
 * getPedidoVenda(
 * 
 * @RequestParam(value = "name", required = false, defaultValue = "honey")
 * String name) {
 * 
 * List<PedidoVenda> pedidoVenda = repository.findAll(); Integer contador = 0;
 * for (PedidoVenda pedidoVenda1 : pedidoVenda) {
 * pedidoVendaRepo.put(contador.toString(), pedidoVenda1); contador++; }
 * 
 * return new ResponseEntity<>(pedidoVendaRepo.values(), HttpStatus.OK); }
 * 
 * 
 * //adiciona um pedido de venda
 * 
 * @RequestMapping(value = "/adicionar") public PedidoVenda
 * adicionarpedidoVenda(@RequestBody PedidoVenda pedidoVenda) { return
 * repository.save(pedidoVenda); }
 * 
 * 
 * @GetMapping("/PedidoVenda/{id}") public PedidoVenda
 * pedidoVendaGetId(@PathVariable long id) throws Exception {
 * Optional<PedidoVenda> pedidoVenda = repository.findById(id);
 * 
 * if (!pedidoVenda.isPresent()) throw new Exception("id-" + id);
 * 
 * return pedidoVenda.get(); }
 * 
 * @PutMapping("/pedidoVenda/{id}") public ResponseEntity<Object>
 * updatePedidoVenda(@RequestBody PedidoVenda pedidoVenda, @PathVariable long
 * id) {
 * 
 * Optional<PedidoVenda> pedidoVendaOptional = repository.findById(id);
 * 
 * if (!pedidoVendaOptional.isPresent()) return
 * ResponseEntity.notFound().build();
 * 
 * pedidoVenda.setId(id);
 * 
 * repository.save(pedidoVenda);
 * 
 * return ResponseEntity.noContent().build(); }
 * 
 * @DeleteMapping("/pedidoVenda/{id}") public void
 * deletePedidoVenda(@PathVariable long id) { repository.deleteById(id); }
 * 
 * }
 */