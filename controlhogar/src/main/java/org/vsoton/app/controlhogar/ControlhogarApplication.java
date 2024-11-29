package org.vsoton.app.controlhogar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ControlhogarApplication {
	private static Logger LOG = LoggerFactory.getLogger(ControlhogarApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(ControlhogarApplication.class, args);
	}

}
