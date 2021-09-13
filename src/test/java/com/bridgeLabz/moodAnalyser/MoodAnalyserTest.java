package com.bridgeLabz.moodAnalyser;

import org.junit.Test;

import com.bridgeLabz.moodAnalyzer.MoodAnalyser;
import com.bridgeLabz.moodAnalyzer.MoodAnalysisException;
import com.bridgeLabz.moodAnalyzer.MoodAnalysisException.ExceptionType;

import org.junit.Assert;

public class MoodAnalyserTest {
	
	@Test
	public void analyseSadTestCase() throws MoodAnalysisException {
		
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
		
		String moodString = moodAnalyser.analyseMood();
		
		Assert.assertEquals("SAD", moodString);
	}
	
	@Test
	public void analyseAnyMoodTestCase() throws MoodAnalysisException {
		
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Any Mood");
		
		String moodString = moodAnalyser.analyseMood();
		
		Assert.assertEquals("HAPPY", moodString);
	}
	
	@Test
	public void handleNullMoodTestCase() throws MoodAnalysisException {
		
		MoodAnalyser moodAnalyser = new MoodAnalyser(null);
		
		String moodString = moodAnalyser.analyseMood();
		
		Assert.assertEquals("Please enter some data in the string", moodString);
	}
	
	@Test
	public void nullMoodThrowExceptionTestCase() {
		
		MoodAnalyser moodAnalyser = new MoodAnalyser(null);
		try {
			moodAnalyser.analyseMood();
		}
		catch (MoodAnalysisException e) {

			Assert.assertEquals(MoodAnalysisException.ExceptionType.NULL, e.type);
		}
	}

}
