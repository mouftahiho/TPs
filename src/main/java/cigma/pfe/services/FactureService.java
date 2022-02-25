package cigma.pfe.services;

import cigma.pfe.models.Client;
import cigma.pfe.models.Facture;

import java.util.Date;
import java.util.List;

public interface FactureService {

        public Facture save(Facture f);
        public Facture modify(Facture f);
        public List<Facture> getAll();
        public Facture getOne(long id);
        public void remove(long id);
        public List<Facture> FindbyDate(Date date);


    }

