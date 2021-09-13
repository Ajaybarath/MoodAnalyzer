package com.bridgeLabz.moodAnalyzer;

public class MoodAnalysisException extends Exception{

	public enum ExceptionType {
		EMPTY, NULL
	}
	
	public ExceptionType type;
	
	
	public MoodAnalysisException(String message, ExceptionType type) {
		// TODO Auto-generated constructor stub
		super(message);
		this.type = type;
	}
	
}
