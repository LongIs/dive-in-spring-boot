package com.loong.diveinspringboot.Chapter1;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.LinkedHashSet;
import java.util.Set;

@SpringBootApplication
public class DiveInSpringBootApplication {
	public static void main(String[] args) {

		SpringApplication springApplication = new SpringApplication();
		ConfigurableApplicationContext run = springApplication.run(DiveInSpringBootApplication.class);
		//run.getBean(A.class);
		//run.getBean(B.class);



	}
}
@Component
class A implements ApplicationContextAware {

	/*@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("A : postProcessBeforeInitialization");
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("A : postProcessAfterInitialization");
		return bean;
	}*/

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("============================================================");
	}
}
// @Component
class B implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("B : postProcessBeforeInitialization");
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("B : postProcessAfterInitialization");
		return bean;
	}
}
/*@Component
class C {


	private final D d;

	public C (D d){
		this.d = d;
	}
}
@Component
class D {

	private final C c;

	public D (C c){
		this.c = c;
	}
}*/

