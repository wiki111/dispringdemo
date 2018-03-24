package wikira.springdidemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import wikira.springdidemo.controller.ConstructorInjectedController;
import wikira.springdidemo.controller.MyController;
import wikira.springdidemo.controller.PropertyInjectedController;
import wikira.springdidemo.controller.SetterInjectedController;

@SpringBootApplication
public class SpringdidemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringdidemoApplication.class, args);
		MyController controller = (MyController) ctx.getBean("myController");

		System.out.println(controller.hello());
		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
	}
}
