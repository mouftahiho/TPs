package ma.education.spring.ioc;

import ma.education.tp3.Client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringIocApplicationContextcontenant {
    public static void main(String[] args) {
        ApplicationContext  appContext= new ClassPathXmlApplicationContext("spring.xml");
        Client c = (Client) appContext.getBean("clt");
        Client c1 = (Client) appContext.getBean("clt");
        Client c2 = (Client) appContext.getBean("clt");
    }
}
