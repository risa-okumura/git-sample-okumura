package jp.co.rakus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.SystemPropertyUtils;

@SpringBootApplication
public class ControllerSample1Application {

	public static void main(String[] args) {
		SpringApplication.run(ControllerSample1Application.class, args);
		System.out.println();
	}
}
