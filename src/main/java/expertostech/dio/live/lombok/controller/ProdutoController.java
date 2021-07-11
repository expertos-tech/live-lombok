package expertostech.dio.live.lombok.controller;

import expertostech.dio.live.lombok.model.ClienteModel;
import expertostech.dio.live.lombok.model.ProdutoModel;
import expertostech.dio.live.lombok.repository.ProdutoRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produto")
@AllArgsConstructor
public class ProdutoController {

    private final ProdutoRepository repository;

    @GetMapping("/listarTodos")
    public ResponseEntity<List<ProdutoModel>> listarTodos() {
        return ResponseEntity.ok(repository.findAll());
    }

    @PostMapping("/salvar")
    public ResponseEntity<ProdutoModel> salvar(@RequestBody ProdutoModel produto) {
        return ResponseEntity.ok(repository.save(produto));
    }

}
