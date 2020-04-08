package cc.cloudflight.sfgdi.controllers;

import cc.cloudflight.sfgdi.services.GreetingService;

class SetterInjectedController {

    private GreetingService greetingService;

    void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    String getGreeting() {
        return greetingService.sayGreeting();
    }
}
