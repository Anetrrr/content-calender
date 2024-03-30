package com.spring.project.contentcalenderv;

import com.spring.project.contentcalenderv.config.ContentCalenderProperties;
import com.spring.project.contentcalenderv.model.Content;
import com.spring.project.contentcalenderv.model.Status;
import com.spring.project.contentcalenderv.model.Type;
import com.spring.project.contentcalenderv.repository.ContentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@EnableConfigurationProperties(ContentCalenderProperties.class)
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(ContentRepository repository) {
		return args -> {
			Content content = new Content(
							1,
							"Sunshine and Daisies",
							"Blog about the finer things",
							Status.IDEA,
							Type.ARTICLE,
							LocalDateTime.now(),
							null,
							"https://www.google.com"
			);
			Content content2 = new Content(
					2,
					"Moonshine and Daffodils",
					"Blog about the some things",
					Status.IDEA,
					Type.ARTICLE,
					LocalDateTime.now(),
					null,
					"https://www.google.com"
			);
			Content content3 = new Content(
					3,
					"Denims and Flipflops",
					"Blog about the fashion things",
					Status.IDEA,
					Type.ARTICLE,
					LocalDateTime.now(),
					null,
					"https://www.google.com"
			);
			Content content4 = new Content(
					4,
					"Denims and Flipflops",
					"Blog about the fashion things",
					Status.IN_PROGRESS,
					Type.VIDEO,
					LocalDateTime.now(),
					null,
					"https://www.google.com"
			);
			repository.save(content);
			repository.save(content2);
			repository.save(content3);
			repository.save(content4);
		};
	}

}

