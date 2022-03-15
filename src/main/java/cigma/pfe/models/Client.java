package cigma.pfe.models;

import lombok.*;

import javax.persistence.*;


@Data
@AllArgsConstructor
@Entity

public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ;
    private String name;

    public Client(String name) {
        this.name = name; }

    public Client(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
