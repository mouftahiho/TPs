package cigma.pfe;

import cigma.pfe.controllers.ClientController;
import cigma.pfe.controllers.FactureController;
import cigma.pfe.models.CarteFidelio;
import cigma.pfe.models.Client;
import cigma.pfe.models.Facture;
import cigma.pfe.models.Promotion;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class MonApplication {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        ClientController ctrl = (ClientController) context.getBean("controller");

         Client client = new Client("MOUFTAH");
        //List<Promotion> promotions=Arrays.asList(new Promotion("remise 10%"),new Promotion("solde 40%"));

        CarteFidelio carteFidelio = new CarteFidelio("A29930489");
        carteFidelio.setClient(client);
        client.setCarteFidelio(carteFidelio);

        //client.setPromotions(promotions);

         ctrl.save(client);
/*
        // Test save use case for three clients
        ctrl.save(new Client("ABDESSADEK"));
        ctrl.save(new Client("GHITA"));
        ctrl.save(new Client("SALMA"));
        ctrl.save(new Client("JRADA"));
        // Test modify use case for client with id==1
        ctrl.modify(new Client(2L," MY MOUFTAH OUSSAMA "));
        // Test remove use case for client with id==1
         ctrl.removeById(2L);

        // Test find use case for client with id==1
        Client found = ctrl.getById(2L);
        ctrl.getAll();

        //FACTURES

       /*
        FactureController ftrl = (FactureController) context.getBean("fcontroller");
        ftrl.create(new Facture(new Date(2022,02,15),10));
        ftrl.read();
        ftrl.delete(1);
        ftrl.update(new Facture(new Date(2022,03,15),20));


        */
    }

}
