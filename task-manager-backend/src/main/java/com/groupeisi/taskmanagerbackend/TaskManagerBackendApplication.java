package com.groupeisi.taskmanagerbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.groupeisi.taskmanagerbackend")
public class TaskManagerBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskManagerBackendApplication.class, args);
	}

}
