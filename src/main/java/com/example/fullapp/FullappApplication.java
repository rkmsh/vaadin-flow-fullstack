package com.example.fullapp;

import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.theme.Theme;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Theme(value = "springish")
public class FullappApplication implements AppShellConfigurator {

	public static void main(String[] args) {
		SpringApplication.run(FullappApplication.class, args);
	}

}
