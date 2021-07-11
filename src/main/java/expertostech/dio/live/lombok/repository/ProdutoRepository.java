package expertostech.dio.live.lombok.repository;

import expertostech.dio.live.lombok.model.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<ProdutoModel, Integer> {
}
