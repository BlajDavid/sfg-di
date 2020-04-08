package cc.cloudflight.sfgdi;

import cc.cloudflight.sfgdi.controllers.ConstructorInjectedController;
import cc.cloudflight.sfgdi.controllers.MyController;
import cc.cloudflight.sfgdi.controllers.PropertyInjectedController;
import cc.cloudflight.sfgdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);

        MyController myController = (MyController) context.getBean("myController");

        String greeting = myController.sayHello();

        System.out.println(greeting);

        System.out.println("\n ---------> 1) DI by Property");
        PropertyInjectedController propertyInjectedController =
                (PropertyInjectedController) context.getBean("propertyInjectedController");

        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("\n ---------> 2) DI by Setter");
        SetterInjectedController setterInjectedController =
                (SetterInjectedController) context.getBean("setterInjectedController");

        System.out.println(setterInjectedController.getGreeting());

        System.out.println("\n ---------> 3) DI by Constructor");
        ConstructorInjectedController constructorInjectedController =
                (ConstructorInjectedController) context.getBean("constructorInjectedController");

        System.out.println(constructorInjectedController.getGreeting());
    }
}
