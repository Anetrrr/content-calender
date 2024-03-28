package com.spring.project.contentcalenderv;

import com.spring.project.contentcalenderv.model.Content;
import com.spring.project.contentcalenderv.model.Status;
import com.spring.project.contentcalenderv.model.Type;
import com.spring.project.contentcalenderv.repository.ContentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(ContentRepository repository) {
		return args -> {
			Content content = new Content(
					null,
					"Sunshine and Daisies",
					"Blog about the finer things",
					Status.IDEA,
					Type.ARTICLE,
					LocalDateTime.now(),
					null,
					"https://www.google.com"

			);
			repository.save(content);
		};


	}

}

