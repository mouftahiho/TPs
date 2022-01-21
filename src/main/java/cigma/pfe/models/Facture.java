package cigma.pfe.models;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
public class Facture {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY )
        private  long id;
        private double amount;
        private String description;


    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;



    public Facture(long id, double amount, String description, Client client) {
        this.id = id;
        this.amount = amount;
        this.description = description;
        this.client = client;
    }




    public double getAmount() {
        return amount;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /*
    @ManyToOne
    @JoinColumn(name = "produit_id")
    private Produit produit;
    */
}
