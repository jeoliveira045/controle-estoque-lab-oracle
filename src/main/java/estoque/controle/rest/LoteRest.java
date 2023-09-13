package estoque.controle.rest;

import estoque.controle.entities.Fornecedor;
import estoque.controle.repository.LoteRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/lote")
@AllArgsConstructor
public class LoteRest {

    private final LoteRepository repository;

    @GetMapping
    public ResponseEntity<List<Fornecedor>> findAll(){
        return ResponseEntity.ok(repository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Fornecedor> findById(@PathVariable Long id){
        return ResponseEntity.ok(repository.findById(id).orElseThrow(() -> new RuntimeException("Lote não Encontrada")));
    }

    @PostMapping
    public ResponseEntity<Void> create(@RequestBody Fornecedor entity){
        repository.save(entity);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@PathVariable Long id, @RequestBody Fornecedor lote){
        repository.save(lote);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        repository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
