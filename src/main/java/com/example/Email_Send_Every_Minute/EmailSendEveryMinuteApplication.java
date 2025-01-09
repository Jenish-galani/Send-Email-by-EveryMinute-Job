package com.example.Email_Send_Every_Minute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class EmailSendEveryMinuteApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmailSendEveryMinuteApplication.class, args);
	}

}
