package cc.cloudflight.sfgdi.controllers;

import cc.cloudflight.sfgdi.services.GreetingService;
import cc.cloudflight.sfgdi.services.SetterGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    @Qualifier("setterGreetingService")
    @Autowired
    private GreetingService greetingService;

    void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
