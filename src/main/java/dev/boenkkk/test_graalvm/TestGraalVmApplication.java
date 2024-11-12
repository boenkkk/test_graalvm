package dev.boenkkk.test_graalvm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.time.Duration;
import java.time.Instant;

@SpringBootApplication
public class TestGraalVmApplication {

	public static void main(String[] args) {
		// SpringApplication.run(TestGraalVmApplication.class, args);
		// testPrint1M();

		measureStartupTime();
	}

	private static void testPrint1M(){
		Instant start = Instant.now(); // Start time
		System.out.println("Start time: " + start);

		for (int i = 1; i <= 1_000_000; i++) {
			System.out.println(i);
		}

		Instant finish = Instant.now(); // Finish time
		System.out.println("Finish time: " + finish);

		Duration executionTime = Duration.between(start, finish); // Calculate duration
		System.out.println("Execution time: " + executionTime.toMillis() + " milliseconds");
	}

	public static void measureStartupTime() {
		Instant start = Instant.now(); // Start time
		System.out.println("Starting Spring Boot application...");

		// Launch the Spring Boot application
		try (ConfigurableApplicationContext context = SpringApplication.run(TestGraalVmApplication.class)) {
			// Keep the application running for testing purposes
			System.out.println("Application is running...");
		}

		Instant finish = Instant.now(); // Finish time
		System.out.println("Spring Boot application has finished running.");

		// Calculate and display the startup duration
		Duration startupTime = Duration.between(start, finish);
		System.out.println("Startup time: " + startupTime.toMillis() + " milliseconds");
	}
}
