package expertostech.dio.live.lombok.repository;

import expertostech.dio.live.lombok.model.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<ClienteModel, Integer> {
}
