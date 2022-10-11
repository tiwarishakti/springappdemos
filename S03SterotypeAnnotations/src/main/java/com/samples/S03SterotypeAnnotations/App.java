package com.samples.S03SterotypeAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.samples.S03SterotypeAnnotations.model.Instructor;


/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		// create the spring container
		ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext(
				"com/samples/S03SterotypeAnnotations/SpringConfig.xml");

		Instructor inst = (Instructor) springContainer.getBean("inst");
		System.out.println(inst);
		
		

	}
}