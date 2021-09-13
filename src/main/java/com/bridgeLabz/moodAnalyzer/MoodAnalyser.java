package com.bridgeLabz.moodAnalyzer;

public class MoodAnalyser {

	String message = "I am happy right now";

	public MoodAnalyser(String message) {
		// TODO Auto-generated constructor stub
		this.message = message;
	}

	public String analiseMood() {
		try {
			if (message.contains("Sad")) {
				return "SAD";
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return "HAPPY";
		
	}

}
