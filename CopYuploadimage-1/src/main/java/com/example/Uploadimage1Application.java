package com.example;

import java.io.File;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import controller.FileUploadController;

@SpringBootApplication
@ComponentScan({"com.example","controller"})
public class Uploadimage1Application {

	public static void main(String[] args) {
		new File(FileUploadController.uploadDirectory).mkdir();
		SpringApplication.run(Uploadimage1Application.class, args);
	}

}
