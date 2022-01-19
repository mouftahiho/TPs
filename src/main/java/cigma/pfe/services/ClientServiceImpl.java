package cigma.pfe.services;

import cigma.pfe.models.Client;
import cigma.pfe.repositories.ClientRepository;
import cigma.pfe.repositories.ClientRepositoryImpl;

public class ClientServiceImpl implements ClientService{

    ClientRepository clientRepository ;

    public ClientServiceImpl(ClientRepository clientRepository) {
        System.out.println("call setter par Service IMPL par Constructor");
        this.clientRepository = clientRepository;
    }

    public void setClientRepository(ClientRepository clientRepository) {
        System.out.println("call setter par Service IMPL ");
        this.clientRepository = clientRepository;
    }

    public Client save(Client c) {
        System.out.println("Service Layer : ClientServiceImpl Level... ");
        return clientRepository.save(c);
    }

    public ClientServiceImpl() {
        System.out.println("Call ClientServiceImpl ....");
    }
}
