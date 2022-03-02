package cigma.pfe.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data

public class Company {

    @EmbeddedId
    private CompanyId companyId;

    private String name;
    private String address;
    private String phone;

    @Embedded
    @AttributeOverride(name = "phone", column = @Column(name = "PHONE_PERSON"))
    private ContactPerson contactPerson;
}
