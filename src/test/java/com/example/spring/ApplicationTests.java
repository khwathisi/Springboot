package com.example.spring;

import com.example.spring.dao.FakeRepoInterface;
import com.example.spring.model.User;
import com.example.spring.service.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.Assert;

import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

@SpringBootTest
class ApplicationTests {
	FakeRepoInterface fakeRepoInterface = new FakeRepoInterface() {
		@Override
		public String insertUser(Long id, User user) {
			return user.getName();
		}

		@Override
		public String findUserById(Long id) {
			return "Mphuluseni";
		}

		@Override
		public String deleteUser(Long id) {
			return "Mphuluseni";
		}
	};
	UserServiceImpl userService = new UserServiceImpl(fakeRepoInterface);
	@Test
	void contextLoads() {

	}

	@Test
	void addUser(){
		Long id = ThreadLocalRandom.current().nextLong(10,100);
		String name = "Mphuluseni";
		String surname = "Khwathisi";
		User user = new User(id, name, surname);

		Assert.assertEquals("Mphuluseni entered",userService.addUser(user));
	}

	@Test
	void removeUser(){
		String  l = "1";
		Long id = Long.parseLong(l);
		String name = "Mphuluseni";
		String surname = "Khwathisi";
		User user = new User(id, name, surname);
		userService.addUser(user);
		Assert.assertEquals("Mphuluseni removed",userService.removeUser(id));
	}

	@Test
	void getUser(){
		String  l = "1";
		Long id = Long.parseLong(l);
		String name = "Mphuluseni";
		String surname = "Khwathisi";
		User user = new User(id, name, surname);
		userService.addUser(user);
		Assert.assertEquals("hello Mphuluseni",userService.getUser(id));
	}

}
