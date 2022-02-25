package cigma.pfe.services;

import cigma.pfe.models.Client;
import cigma.pfe.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service

public class ClientServiceImpl implements ClientService{

    @Autowired
    private ClientRepository clientRepository ;

    public ClientServiceImpl(ClientRepository clientRepository) {
        System.out.println("call setter par Service IMPL par Constructor");
        this.clientRepository = clientRepository;
    }


    @Transactional
    public Client save(Client c) {
        return clientRepository.save(c);
    }

    @Transactional
    public Client modify(Client c) {
        Client cl =clientRepository.findById(c.getId()).get();
        cl.setName(c.getName());
        return clientRepository.save(cl);
    }

    @Transactional
    public void removeById(long id) {
        clientRepository.deleteById(id);

    }

    public Client getById(long id) {
        return clientRepository.findById(id).get();
    }

    public List<Client> getAll() {
        return (List<Client>) clientRepository.findAll();
    }

    @Override
    public List<Client> FindbyName(String name) {
        return  clientRepository.findByName(name);
    }

    public ClientServiceImpl() {
        System.out.println("Call ClientServiceImpl ....");
    }



}
