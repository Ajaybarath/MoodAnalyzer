package com.bridgeLabz.moodAnalyzer;

import com.bridgeLabz.moodAnalyzer.MoodAnalysisException.ExceptionType;

public class MoodAnalyser {

	String message = "";

	public MoodAnalyser(String message) {
		// TODO Auto-generated constructor stub
		this.message = message;
	}

	public String analyseMood() throws MoodAnalysisException {
		try {
			if (message.length() == 0) {
				throw new MoodAnalysisException("Please enter some data in the string", ExceptionType.EMPTY);
			}
			
			if (message.contains("Sad")) {
				return "SAD";
			}

		} catch (NullPointerException e) {
			throw new MoodAnalysisException("Please enter some data in the string", ExceptionType.NULL);

		}
		
		return "HAPPY";
		
	}

}
