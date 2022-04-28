package com.ochki.todo;

import com.ochki.todo.entity.Todo;
import com.ochki.todo.entity.Users;
import com.ochki.todo.repository.TodoRepository;
import com.ochki.todo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class TodoApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private TodoRepository todoRepository;

	@Autowired
	PasswordEncoder passwordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Users users = new Users();
		users.setId(1);
		users.setUsername("ochki");
		String password = "p";

		users.setPassword(passwordEncoder.encode(password));
		users.setEnabled(true);

		userRepository.save(users);

	}
}
