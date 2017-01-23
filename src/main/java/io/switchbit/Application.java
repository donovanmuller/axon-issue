package io.switchbit;

import org.axonframework.spring.config.EnableAxon;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// NOTE: don't use `@EnableAxon` if using `axon-spring-boot-starter`
// the Spring auto configuration mechanism together with `@EnableAxon` results
// in `SpringAxonAutoConfigurer` being invoked twice.
// See https://github.com/AxonFramework/AxonFramework/issues/253
//@EnableAxon
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
