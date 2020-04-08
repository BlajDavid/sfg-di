package cc.cloudflight.sfgdi.controllers;

import cc.cloudflight.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    private final GreetingService greetingService;

    ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

   public String getGreeting() {
        return greetingService.sayGreeting();
    }

}
