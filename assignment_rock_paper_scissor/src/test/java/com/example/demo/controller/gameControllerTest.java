package com.example.demo.controller;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.service.playerService;

@SpringBootTest
public class gameControllerTest {
	
	@InjectMocks
	private gameController controller;
	
	@Mock
	private playerService service;
	
	@Test
	void testCotroller() {
		
		assertNotNull(controller.get("rock"));
	}
	
}
