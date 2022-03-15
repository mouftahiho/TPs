package cigma.pfe.controllers;

import cigma.pfe.models.Client;
import cigma.pfe.services.ClientService;
import cigma.pfe.services.ClientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientService service;

    @GetMapping("/{id}")
    public Client getOne(@PathVariable("id") long id){
        return service.getById(id);
    }

    @GetMapping("/all")
    public List<Client> getAll(){
        return service.getAll();
    }
    @PostMapping("/create")
    public Client save(@RequestBody Client clt) {
        return service.save(clt);
    }
    @PutMapping("/update")
    public Client modify(@RequestBody Client clt){
        return service.modify(clt);
    }

/*
    @Autowired
    private ClientService clientService;



    @PostMapping("/create")
    public Client save(@RequestBody Client c ){
        System.out.println("ClientController level...");
        return clientService.save(c);
    }

    @PutMapping("/update")
    public void modify(@RequestBody Client c){
        clientService.modify(c);
    }
    public void removeById(long id){
        clientService.removeById(id);
    }
    @GetMapping("/{id}")
    public Client getById (@PathVariable("id") long id){
        return clientService.getById(id);
    }
    @GetMapping("/all")
    public List<Client> getAll(){
     return clientService.getAll();
    }


    public void remove(long id) {
        clientService.removeById(id);
    }

    public List<Client> Find(String name){
        return clientService.FindbyName(name);
    }
*/

/*
@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    ClientService service;

    @PostMapping("/create")
    public Client save(@RequestBody Client clt) {
        return service.save(clt);
    }

    @PutMapping("/modify")
    public Client modify(Client clt) {
        return service.modify(clt);
    }

    public void remove(long idClt) {
        service.removeById(idClt);
    }

    @GetMapping("/{id}")
    public Client getOne(@PathVariable("id") long idClt) {
        return service.getById(idClt);
    }

    @GetMapping("/all")
    public List<Client> getAll() {
        return service.getAll();
    }

    public List<Client> Find(String name) {
        return service.FindbyName(name);
    }

 */

}
