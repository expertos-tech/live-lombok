package expertostech.dio.live.lombok.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity(name = "PedidoItem")
@Data
public class PedidoItemModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne(cascade = CascadeType.ALL)
    private ProdutoModel produto;
    private BigDecimal valor;

}
