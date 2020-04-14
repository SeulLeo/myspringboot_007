package myspringboot_007;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootApplicationFirst {
	
	public static void main(String[]args){
		SpringApplication.run(SpringBootApplicationFirst.class, args);
	}
	public static void run(String...arg0) {
		System.out.println("Hello world from Command Line Runner");
	}
}
