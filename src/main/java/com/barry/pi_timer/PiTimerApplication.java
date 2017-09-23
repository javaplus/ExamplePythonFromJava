package com.barry.pi_timer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PiTimerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PiTimerApplication.class, args);

		Timer timer = new Timer();
		timer.callDisplay("Hey There");

	}
}
