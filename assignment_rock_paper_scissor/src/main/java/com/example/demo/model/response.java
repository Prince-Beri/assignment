package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class response {

	@JsonProperty("Player choice")
	private String playerChoice;

	@JsonProperty("Computer choice")
	private String computerChoice;

	@JsonProperty("Game result")
	private String gameResult;

	public response(String playerChoice, String computerChoice, String gameResult) {
		super();
		this.playerChoice = playerChoice;
		this.computerChoice = computerChoice;
		this.gameResult = gameResult;
	}

	public String getPlayerChoice() {
		return playerChoice;
	}

	public void setPlayerChoice(String playerChoice) {
		this.playerChoice = playerChoice;
	}

	public String getComputerChoice() {
		return computerChoice;
	}

	public void setComputerChoice(String computerChoice) {
		this.computerChoice = computerChoice;
	}

	public String getGameResult() {
		return gameResult;
	}

	public void setGameResult(String gameResult) {
		this.gameResult = gameResult;
	}

	@Override
	public String toString() {
		return "response [playerChoice=" + playerChoice + ", computerChoice=" + computerChoice + ", gameResult="
				+ gameResult + "]";
	}

	

}
