package com.SebastianIsmaelG.LibrosAPI;

import com.SebastianIsmaelG.LibrosAPI.main.Main;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibrosApiApplication implements CommandLineRunner { //buscar implements CommandLineRunner

	public static void main(String[] args) {

		SpringApplication.run(LibrosApiApplication.class, args);
	}
	public void run(String... args) throws Exception {

		Main main = new Main();
		main.principalInterface();




	}
}
