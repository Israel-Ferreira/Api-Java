package br.com.codekaffee.vinhos.controllers;

import br.com.codekaffee.vinhos.models.Vinho;
import br.com.codekaffee.vinhos.services.VinhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
public class VinhoController implements ICrudController<Vinho> {


    @Autowired
    private VinhoService vinhoService;

    @GetMapping("/vinhos")
    @Override
    public List<Vinho> getAll() {
        return vinhoService.getAll();
    }

    @GetMapping("/vinhos/{id}")
    @Override
    public Vinho getById(@PathVariable String id) {
        return vinhoService.getById(id);
    }

    @PostMapping("/vinhos")
    @Override
    public void create(@RequestBody @Valid Vinho obj) {
        vinhoService.create(obj);
    }


    @PutMapping("/vinhos/{id}")
    @Override
    public void update(@PathVariable String id, @RequestBody @Valid Vinho obj) {
        vinhoService.update(id,obj);
    }

    @DeleteMapping("/vinhos/{id}")
    @Override
    public void delete(@PathVariable String id) {
        vinhoService.delete(id);
    }
}
