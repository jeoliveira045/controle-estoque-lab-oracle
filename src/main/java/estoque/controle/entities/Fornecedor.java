package estoque.controle.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "FORNECEDOR")
public class Fornecedor {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_LOTE")
    @SequenceGenerator(initialValue = 1, allocationSize = 1, name = "SEQ_LOTE")
    private Long id;

    @Column(name = "NOME_DA_EMPRESA")
    String nomeDaEmpresa;

    @Column(name = "ENDERECO")
    String endereco;
}
