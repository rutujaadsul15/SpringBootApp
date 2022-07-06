package com.example.SpringBootApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class SpringBootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAppApplication.class, args);
		System.out.println("Application started");

		ArrayList<String> list = new ArrayList<>();
		list.add("abc");
		list.add("dsfhrth");
		list.add("dfhfh");
		list.add("abc");
		list.add("bvn");

		//create 1 list which will not have "abc" in it. write a code




	}

}
