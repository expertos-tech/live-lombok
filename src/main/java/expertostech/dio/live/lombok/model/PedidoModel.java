package expertostech.dio.live.lombok.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity(name = "pedido")
@Data
public class PedidoModel {

    @Id
    private String id;
    @ManyToOne(cascade = CascadeType.ALL)
    private ClienteModel cliente;
    @OneToMany(cascade = CascadeType.ALL)
    private List<PedidoItemModel> itens;

}
