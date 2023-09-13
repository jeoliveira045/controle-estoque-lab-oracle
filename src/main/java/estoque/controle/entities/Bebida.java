package estoque.controle.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Table(name = "BEBIDA")
public class Bebida {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_BEBIDA")
    @SequenceGenerator(initialValue = 1, allocationSize = 1, name = "SEQ_BEBIDA")
    private Long id;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "TIPO")
    private String tipo;

    @Column(name = "VOLUME")
    private String volume;

    @Column(name = "PRECO_DA_COMPRA")
    private Double precoDaCompra;

    @Column(name = "PRECO_DA_VENDA")
    private Double precoDaVenda;

    @Column(name = "FORNECEDOR")
    private String fornecedor;

    @ManyToMany
    @JoinTable(
            name="bebida_lote",
            joinColumns = @JoinColumn(name = "bebida_id"),
            inverseJoinColumns = @JoinColumn(name = "lote_id")
    )
    private Set<Fornecedor> lote = new HashSet<>();





}
