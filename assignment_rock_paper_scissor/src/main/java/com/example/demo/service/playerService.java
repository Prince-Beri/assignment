package com.example.demo.service;

import java.util.concurrent.ThreadLocalRandom;
import org.springframework.stereotype.Service;

import com.example.demo.model.response;

@Service
public class playerService {
	// moves that computer can choose from.	
	String[] computerChoice = {"rock", "paper", "scissor"};
	public response gameLogic(String userMove) {
		// get the random idx from 0 to 2 which helps computer to choose from computerChoice[].		
		int randomIdx = ThreadLocalRandom.current().nextInt(computerChoice.length);
		String computerMove = computerChoice[randomIdx];
		
		// computer and user choose's the same move then game is tie.
		String gameResult;			
		if(userMove.equals(computerMove)) {
			gameResult = "It is a tie";
		}else if(userMove.equals("rock") && computerMove.equals("scissor") ||
				 userMove.equals("paper") && computerChoice.equals("rock") ||
				 userMove.equals("scissor") && computerChoice.equals("paper")) 
		{
			gameResult = "Player wins";
		}else {
			gameResult = "Computer wins";
		}
		
		response response = new response(userMove, computerMove, gameResult);
		
		return response;
			     		
	}
	
}
