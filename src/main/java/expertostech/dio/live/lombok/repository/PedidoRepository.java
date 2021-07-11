package expertostech.dio.live.lombok.repository;

import expertostech.dio.live.lombok.model.PedidoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<PedidoModel, String> {


}
