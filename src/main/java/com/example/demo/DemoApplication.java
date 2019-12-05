package com.example.demo;

import com.example.demo.persistance.repositories.IncidentRepository;
import com.example.demo.persistance.repositories.SecteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

@EntityScan(basePackages = {"com.example.demo"})
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class DemoApplication implements CommandLineRunner {

	 @Autowired
	 private IncidentRepository incidentRepository;
	 @Autowired
	 private SecteurRepository secteurRepository;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		DateFormat df =new SimpleDateFormat("dd/MM/yyyy");

		incidentRepository.findBySecteur(secteurRepository.findById(1)).forEach(c->{

			System.out.println(c.getDescription());
		});

	}
}
