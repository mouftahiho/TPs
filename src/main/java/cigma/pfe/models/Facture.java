package cigma.pfe.models;


import javax.persistence.*;
import java.util.Date;

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

        public Facture(Date date, double amount) {
            this.date = date;
            this.amount = amount;
        }

    @Override
    public String toString() {
        return "Facture{" +
                "id=" + id +
                ", date=" + date +
                ", amount=" + amount +
                '}';
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
