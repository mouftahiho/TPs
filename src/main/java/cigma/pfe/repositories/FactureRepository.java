package cigma.pfe.repositories;

import cigma.pfe.models.Facture;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

    @Repository
    public interface FactureRepository extends CrudRepository<Facture, Long> {
        List<Facture> findByDate(Date date);
    }

