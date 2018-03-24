package wikira.springdidemo.controllers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import wikira.springdidemo.controller.SetterInjectedController;
import wikira.springdidemo.services.GreetingServiceImpl;

public class SetterMethodTest {

    private SetterInjectedController setterInjectedController;

    @Before
    public void setUp() throws Exception {
        this.setterInjectedController = new SetterInjectedController();
        this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception{
        Assert.assertEquals(GreetingServiceImpl.HELLO_MATE, setterInjectedController.sayHello());
    }

}
