package estoque.controle.repository;

import estoque.controle.entities.Bebida;
import estoque.controle.entities.Fornecedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoteRepository extends JpaRepository<Fornecedor, Long> {
}
