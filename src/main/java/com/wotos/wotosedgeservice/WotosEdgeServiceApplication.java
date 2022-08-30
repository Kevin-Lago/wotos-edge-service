package com.wotos.wotosedgeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {
		DataSourceAutoConfiguration.class
})
public class WotosEdgeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WotosEdgeServiceApplication.class, args);
	}

}
