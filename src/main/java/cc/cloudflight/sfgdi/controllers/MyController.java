package cc.cloudflight.sfgdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String sayHello() {
        System.out.println("Guten Tag");

        return "Hallo Allerseits";
    }
}
