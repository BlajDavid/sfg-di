package cc.cloudflight.sfgdi.controllers;

import cc.cloudflight.sfgdi.services.GreetingService;

class PropertyInjectedController {
    GreetingService greetingService;

    String getGreeting() {
        return greetingService.sayGreeting();
    }
}
