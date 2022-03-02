package cigma.pfe.services;

import cigma.pfe.models.Client;
import cigma.pfe.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ClientServiceImpl implements ClientService{

    @Autowired
    private ClientRepository clientRepository ;

    public ClientServiceImpl(ClientRepository clientRepository) {
        System.out.println("call setter par Service IMPL par Constructor");
        this.clientRepository = clientRepository;
    }



    @Transactional
    public Client save(Client c) {
        System.out.println("Service Layer : ClientServiceImpl Level... ");
        return clientRepository.save(c);
    }

    @Transactional
    public Client modify(Client cnew) {
        Client cold = clientRepository.findById(cnew.getId()).get();
        cold.setName(cnew.getName());
        return clientRepository.save(cold);
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
        return clientRepository.findByName(name);
    }


    public ClientServiceImpl() {
        System.out.println("Call ClientServiceImpl ....");
    }


}
