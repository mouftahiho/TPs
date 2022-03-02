package cigma.pfe;

import cigma.pfe.controllers.ClientController;
import cigma.pfe.controllers.FactureController;
import cigma.pfe.models.Facture;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;


public class MonApplication {
    public static void main(String[] args) {





        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        ClientController ctrl = (ClientController) context.getBean("ctrl");
        FactureController fctrl = (FactureController) context.getBean("fctrl");

        fctrl.saveFacture(new Facture((new Date(2022-1900,02,15)),20));
        fctrl.saveFacture(new Facture(new Date(2021-1900,05,30),40));
        fctrl.modifierFacture(new Facture(new Date(2019,05,11),70));
        fctrl.getAllFactures(new Date(2022,02,15));
        fctrl.getFacturebyId(2);
        fctrl.findAllFactures();

        //fctrl.deleteFacture(1L);


/*
        ctrl.save(new Client("MOUFTAH"));
        ctrl.save(new ClientVip("MOUFTAH1","test"));
        ctrl.save(new ClientNormal("MOUFTAH2",2));
        ctrl.removeById(1L);
 */

        //ctrl.save(client);
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
/*
        Client c1 = new Client("BAHAFID");
        Client c2 = new Client("SAAD");
        Client c3 = new Client("ZIKO");
// Test1 => save 3 Clients
        c1=ctrl.save(c1);
        c2=ctrl.save(c2);
        c3=ctrl.save(c3);
// Test2 => getAll Clients before modify and remove
        ctrl.getAll().stream().forEach(i-> System.out.println(i));
// Test3 => getOne Client service
        System.out.println(ctrl.getById(1));
// Test4 => modify Client service
        c1.setName("OUSSAMA");
        ctrl.modify(c1);
// Test5 => remove Client service
        ctrl.removeById(2);
// Test getAll Client after modify and remove
        ctrl.getAll().stream().forEach(i-> System.out.println(i));

 */

    }

}
