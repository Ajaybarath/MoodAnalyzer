package com.bridgeLabz.moodAnalyzer;

public class MoodAnalyser {
	
	String message = "I am happy right now";
	
	public MoodAnalyser(String message) {
		// TODO Auto-generated constructor stub
		this.message = message;
	}
	
	public String analiseMood() {
		if (message.contains("Sad")) {
			return "SAD";
		}
		else if (message.contains("Happy")){
			return "HAPPY";
		}
		return null;
	}

}
