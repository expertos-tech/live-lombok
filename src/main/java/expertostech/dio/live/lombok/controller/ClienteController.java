package expertostech.dio.live.lombok.controller;

import expertostech.dio.live.lombok.model.ClienteModel;
import expertostech.dio.live.lombok.repository.ClienteRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cliente")
@AllArgsConstructor
public class ClienteController {

    private final ClienteRepository repository;

    @GetMapping("/listarTodos")
    public ResponseEntity<List<ClienteModel>> listarTodos() {
        return ResponseEntity.ok(repository.findAll());
    }

    @PostMapping("/salvar")
    public ResponseEntity<ClienteModel> salvar(@RequestBody ClienteModel cliente) {
        return ResponseEntity.ok(repository.save(cliente));
    }

}
