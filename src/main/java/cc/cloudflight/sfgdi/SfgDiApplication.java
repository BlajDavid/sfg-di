package cc.cloudflight.sfgdi;

import cc.cloudflight.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {
    private static ApplicationContext context;

    public static void main(String[] args) {
        context = SpringApplication.run(SfgDiApplication.class, args);

        primaryAnnotation();
        profileAnnotation();
        propertyDI();
        setterDI();
        constructorDI();
    }

    public static void primaryAnnotation() {
        System.out.println("\n ---------> When using @Primary annotation");
        PrimaryController primaryController = (PrimaryController) context.getBean("primaryController");

        System.out.println(primaryController.sayHello());
    }

    public static void profileAnnotation() {
        System.out.println("\n ---------> When using @Profile annotation");
        I18nController i18nController = (I18nController) context.getBean("i18nController");

        System.out.println(i18nController.sayHello());
    }

    public static void propertyDI() {
        System.out.println("\n ---------> 1) DI by Property");
        PropertyInjectedController propertyInjectedController =
                (PropertyInjectedController) context.getBean("propertyInjectedController");

        System.out.println(propertyInjectedController.getGreeting());
    }

    public static void setterDI() {
        System.out.println("\n ---------> 2) DI by Setter");
        SetterInjectedController setterInjectedController =
                (SetterInjectedController) context.getBean("setterInjectedController");

        System.out.println(setterInjectedController.getGreeting());
    }

    public static void constructorDI() {
        System.out.println("\n ---------> 3) DI by Constructor");
        ConstructorInjectedController constructorInjectedController =
                (ConstructorInjectedController) context.getBean("constructorInjectedController");

        System.out.println(constructorInjectedController.getGreeting());
    }
}
