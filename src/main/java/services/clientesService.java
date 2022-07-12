package services;

import model.cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.ClientesRepository;

@Service
public class clientesService {

    private ClientesRepository repository;

    @Autowired
    public clientesService(ClientesRepository repository){
        this.repository = repository;
    }

    public void salvarCliente(cliente cliente){
        validarCliente(cliente);
        this.repository.persistir(cliente);

    }

    public void validarCliente(cliente cliente){
        //aplica validacoes

    }
}
