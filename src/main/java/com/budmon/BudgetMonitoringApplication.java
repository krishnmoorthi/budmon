package com.budmon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class BudgetMonitoringApplication extends SpringBootServletInitializer {
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(BudgetMonitoringApplication.class);
    }

	public static void main(String[] args) {
		SpringApplication.run(BudgetMonitoringApplication.class, args);
	}
	

}

