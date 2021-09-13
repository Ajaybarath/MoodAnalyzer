package com.bridgeLabz.moodAnalyzer;

public class MoodAnalyser {
	
	String message = "I am happy right now";
	
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
