package br.com.codekaffee.vinhos.services;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.codekaffee.vinhos.models.Vinho;
import br.com.codekaffee.vinhos.repository.VinhoRepository;

/**
 * VinhoService
 */
@Service
public class VinhoService implements ICrudService<Vinho> {

    @Autowired
    private VinhoRepository vinhoRepository;

    @Override
    public List<Vinho> getAll() {
        return vinhoRepository.findAllVinhos();
    }

    @Override
    public Vinho getById(String id) {
        return vinhoRepository.findById(id).get();
    }

    @Override
    public void create(Vinho obj) {
        vinhoRepository.save(obj);
    }

    @Override
    public void update(String id, Vinho obj) {
        Vinho vinho = vinhoRepository.findById(id).get();
        vinho.setNomeVinho(obj.getNomeVinho());
        vinho.setSafra(obj.getSafra());
        vinhoRepository.save(vinho);
    }

    @Override
    public void delete(String id) {
        Vinho vinho = vinhoRepository.findById(id).get();
        vinhoRepository.delete(vinho);
    }

    public Vinho getOldVinho(){
        List<Vinho> vinhos = vinhoRepository.findAllVinhos();
        return vinhos.stream().max(Comparator.comparing(Vinho::getSafra)).get();
    }

    public List<Vinho> getVinhosBySafra(int safra){
        List<Vinho> vinhos =  vinhoRepository.findAllVinhos();
        return vinhos.stream().filter(vinho -> vinho.getSafra() == safra).collect(Collectors.toList());
    }
}