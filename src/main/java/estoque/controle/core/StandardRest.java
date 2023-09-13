//package estoque.controle.core;
//
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//
//public abstract class StandardRest<T> {
//
//    private T repository;
//
//    @GetMapping
//    public ResponseEntity<?> findAll(){
//        return ResponseEntity.ok(repository.findAll());
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<?> findById(@PathVariable Long id){
//        return ResponseEntity.ok(repository.findById(id));
//    }
//
//    @PostMapping
//    public ResponseEntity<Void> create(@RequestBody Object )
//}
