package estoque.controle.rest;

import estoque.controle.entities.Bebida;
import estoque.controle.repository.BebidaRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bebida")
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
public class BebidaRest {

    private final BebidaRepository repository;

    @GetMapping
    public ResponseEntity<List<Bebida>> findAll(){
        return ResponseEntity.ok(repository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Bebida> findById(@PathVariable Long id){
        return ResponseEntity.ok(repository.findById(id).orElseThrow(() -> new RuntimeException("Bebida não Encontrada")));
    }

    @PostMapping
    public ResponseEntity<Void> create(@RequestBody Bebida entity){
        repository.save(entity);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@PathVariable Long id, @RequestBody Bebida bebida){
        repository.save(bebida);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        repository.deleteById(id);
        return ResponseEntity.ok().build();
    }


}
