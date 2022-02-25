package cigma.pfe.services;

import cigma.pfe.models.Facture;
import cigma.pfe.repositories.FactureRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
class FactureServiceImpl implements FactureService {

    @Autowired
    FactureRepository factureRepository;


    public Facture save(Facture f){
        return (Facture) factureRepository.save(f);
    }

    @Transactional

    public Facture modify(Facture newFacture) {
        Facture   oldFacture = factureRepository.findById(newFacture.getId()).get();
        oldFacture.setAmount(newFacture.getAmount());
        oldFacture.setDate(newFacture.getDate());

        return factureRepository.save(oldFacture);
    }


    public List<Facture> getAll() {
        return (List<Facture>) factureRepository.findAll();
    }


    public Facture getOne(long id) {
        return factureRepository.findById(id).get();
    }
    @Transactional

    public void remove(long id) {
        factureRepository.deleteById(id);
    }

    @Override
    public List<Facture> FindbyDate(Date date) {
        return factureRepository.findByDate(date);
    }


    public List<Facture> Find(Date date) {
        return (List<Facture>) factureRepository.findByDate(date);
    }
}
