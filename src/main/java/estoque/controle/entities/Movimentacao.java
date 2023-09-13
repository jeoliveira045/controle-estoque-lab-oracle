//package estoque.controle.entities;
//
//import jakarta.persistence.*;
//import lombok.Data;
//
//import java.time.LocalDate;
//
//@Entity
//@Data
//@Table(name = "MOVIMENTACAO")
//public class Movimentacao {
//    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_MOVIMENTACAO")
//    @SequenceGenerator(initialValue = 1, allocationSize = 1, name = "SEQ_MOVIMENTACAO")
//    private Long id;
//
//    @Column(name = "MOV_TIPO_ENTRADA")
//    private String entrada;
//
//    @Column(name = "MOV_TIPO_SAIDA")
//    private String saida;
//
//    @Column(name = "MOV_DATA")
//    private LocalDate movData;
//
//    @Column(name = "MOV_ITEM")
//    private String movItem;
//}
