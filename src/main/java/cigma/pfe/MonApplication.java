package cigma.pfe;

import cigma.pfe.controllers.ClientController;

import cigma.pfe.controllers.FactureController;
import cigma.pfe.models.Client;



import cigma.pfe.models.Facture;
import lombok.Data;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class MonApplication {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        ClientController ctrl0 = (ClientController) context.getBean("ctrl");
        FactureController fctrl = (FactureController) context.getBean("fctrl");
/*
        ctrl.save(new Client("MOUFTAH"));
        ctrl.save(new ClientVip("MOUFTAH1","test"));
        ctrl.save(new ClientNormal("MOUFTAH2",2));
        //ctrl.removeById(1L);


         //ctrl.save(client);

 */
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
        Client c1 = new Client("BAHAFID");
        Client c2 = new Client("SAAD");
        Client c3 = new Client("ZAKARIA");

        c1 = ctrl0.save(c1);
        c3 = ctrl0.save(c2);
        c3 = ctrl0.save(c3);

        ctrl0.getAll().stream().forEach(i -> System.out.println(i));

        System.out.println(ctrl0.getById(1));

        c1.setName("OUSSAMA");
        ctrl0.modify(c1);


        ctrl0.getAll().stream().forEach(i -> System.out.println(i));



        // Find by name
        ctrl0.Find("OUSSAMA").stream().forEach(i-> System.out.println(i));



        // PARTIE  FACTURE
        Facture facture1 = new Facture((Data) new Date(2022, 02, 15), 400);
        facture1 = fctrl.save(facture1);
        // Test2 => getAll Facture before modify and remove
        fctrl.getAll().stream().forEach(i -> System.out.println(i));
        // Test3 => getOne Facture
        System.out.println(fctrl.getOne(1));
        //  Modify facture
        // Test5 => remove Facture
        fctrl.remove(3);
        // Test getAll Facture after modify and remove
        fctrl.getAll().stream().forEach(i -> System.out.println(i));
        // Find by Date
        fctrl.FindbyDate(new Date(2022, 02, 14)).stream().forEach(i -> System.out.println(i));


    }
}
