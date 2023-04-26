package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.demo.model.response;

@ExtendWith(MockitoExtension.class)
public class playerServiceTest {

	@InjectMocks
	private playerService service;
	
	@Test
	void testService() {
		assertNotNull(service.gameLogic("paper"));
	}

	private response getResponse() {
		response res = new response("rock", "paper", "Computer wins");
		return res;
	}
}
