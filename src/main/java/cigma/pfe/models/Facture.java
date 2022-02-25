package cigma.pfe.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.*;
import java.util.Date;

@Setter
@Getter
@AllArgsConstructor


@Entity(name = "TFactures")
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private  long id;
    @Column
    private Date date;
    @Column
    private double amount;

    public Facture(){}

    public Facture(Data date, double amount) {
        this.date = (Date) date;
        this.amount = amount;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
