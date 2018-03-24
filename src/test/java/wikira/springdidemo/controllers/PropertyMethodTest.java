package wikira.springdidemo.controllers;

import org.junit.Before;
import org.junit.Test;
import wikira.springdidemo.controller.PropertyInjectedController;
import wikira.springdidemo.services.GreetingServiceImpl;

import static org.junit.Assert.assertEquals;

public class PropertyMethodTest {

    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setUp() throws Exception {
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingService = new GreetingServiceImpl();
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_MATE, propertyInjectedController.sayHello());
    }


}

