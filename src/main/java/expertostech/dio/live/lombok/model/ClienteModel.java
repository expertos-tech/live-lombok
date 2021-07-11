package expertostech.dio.live.lombok.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity(name = "cliente")
@Data
public class ClienteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 100, nullable = false)
    private String nome;
    private String endereco;
    @ManyToOne(cascade = CascadeType.ALL)
    private PedidoModel pedido;

}
