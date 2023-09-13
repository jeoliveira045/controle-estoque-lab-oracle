//package estoque.controle.rest;
//
//import estoque.controle.entities.Movimentacao;
//import estoque.controle.repository.MovimentacaoRepository;
//import lombok.AllArgsConstructor;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;

//import java.util.List;
//
//@RestController
//@RequestMapping("/api/movimentacao")
//@AllArgsConstructor
//public class MovimentacaoRest {
//
//    private final MovimentacaoRepository repository;
//
//    @GetMapping
//    public ResponseEntity<List<Movimentacao>> findAll(){
//        return ResponseEntity.ok(repository.findAll());
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<Movimentacao> findById(@PathVariable Long id){
//        return ResponseEntity.ok(repository.findById(id).orElseThrow(() -> new RuntimeException("Movimentacao não Encontrada")));
//    }
//
//    @PostMapping
//    public ResponseEntity<Void> create(@RequestBody Movimentacao entity){
//        repository.save(entity);
//        return ResponseEntity.ok().build();
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<Void> update(@PathVariable Long id, @RequestBody Movimentacao movimentacao){
//        repository.save(movimentacao);
//        return ResponseEntity.ok().build();
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<?> delete(@PathVariable Long id){
//        repository.deleteById(id);
//        return ResponseEntity.ok().build();
//    }
//}
