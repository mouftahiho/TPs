package cigma.pfe.controllers;

import cigma.pfe.models.Facture;
import cigma.pfe.services.FactureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Date;
import java.util.List;

@Controller("fctrl")
public class FactureController {

    @Autowired
    FactureService service;

    public Facture save(Facture f){
        return  service.save(f);
    }

    public Facture modify(Facture f){
        return service.modify(f);
    }

    public List<Facture> getAll(){
        return service.getAll();
    }
    public Facture getOne(long id){
        return service.getOne(id);
    }

    public void remove(long id){
        service.remove(id);
    }

    public List<Facture> FindbyDate(Date date){
        return service.FindbyDate(date);
    }

}
