package com.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class TestRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
System.out.println("from the Test Runner Class");
	}

}
