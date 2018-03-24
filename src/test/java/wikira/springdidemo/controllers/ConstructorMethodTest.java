package wikira.springdidemo.controllers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import wikira.springdidemo.controller.ConstructorInjectedController;
import wikira.springdidemo.services.GreetingService;
import wikira.springdidemo.services.GreetingServiceImpl;

public class ConstructorMethodTest {

    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp() throws Exception {
        this.constructorInjectedController =
                new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception {
        Assert.assertEquals(GreetingServiceImpl.HELLO_MATE, constructorInjectedController.sayHello());
    }

}
