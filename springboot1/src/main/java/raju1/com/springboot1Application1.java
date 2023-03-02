package raju1.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan
public class springboot1Application1 {

	public static void main(String[] args) {
		
		SpringApplication.run(springboot1Application1.class, args);
		System.out.println("DONE");
	}

}
