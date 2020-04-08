package cc.cloudflight.sfgdi.controllers;

import cc.cloudflight.sfgdi.services.GreetingService;

class ConstructorInjectedController {
    private final GreetingService greetingService;

    ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    String getGreeting() {
        return greetingService.sayGreeting();
    }

}
