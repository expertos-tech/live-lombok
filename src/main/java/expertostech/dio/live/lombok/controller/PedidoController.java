package expertostech.dio.live.lombok.controller;

import expertostech.dio.live.lombok.model.PedidoModel;
import expertostech.dio.live.lombok.repository.PedidoRepository;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.hibernate.id.GUIDGenerator;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/pedido")
@AllArgsConstructor
public class PedidoController {

    private final PedidoRepository repository;

    @GetMapping("/listarTodos")
    public ResponseEntity<List<PedidoModel>> listarTodos() {
        return ResponseEntity.ok(repository.findAll());
    }

    @PostMapping("/salvar")
    public ResponseEntity<PedidoModel> salvar(@RequestBody @NonNull PedidoModel pedido) {

        if (pedido.getId() == null || pedido.getId().isEmpty()) {
            pedido.setId(UUID.randomUUID().toString());
        }

        return ResponseEntity.ok(repository.save(pedido));
    }

}
