package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.response;
import com.example.demo.service.playerService;

@RestController
@RequestMapping("/player")
public class gameController {
	@Autowired
	private playerService service;
	@GetMapping
	public ResponseEntity<response> get(@RequestParam("user") String user){
		return ResponseEntity.ok(service.gameLogic(user));
	}
	

}
