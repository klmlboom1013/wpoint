package com.inicis.wpoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
@ComponentScan(basePackages = {"com.inicis.wpoint", "com.inicis.wpaycore.comms.openbank"})
public class WpointApplication {

	public static void main(String[] args) {
		SpringApplication.run(WpointApplication.class, args);
	}

}
