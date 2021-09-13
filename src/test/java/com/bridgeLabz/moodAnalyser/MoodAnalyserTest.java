package com.bridgeLabz.moodAnalyser;

import org.junit.Test;

import com.bridgeLabz.moodAnalyzer.MoodAnalyser;

import junit.framework.Assert;

public class MoodAnalyserTest {
	
	@Test
	public void analyseSadTestCase() {
		
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
		
		String moodString = moodAnalyser.analiseMood();
		
		Assert.assertEquals("SAD", moodString);
	}
	
	@Test
	public void analyseAnyMoodTestCase() {
		
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Any Mood");
		
		String moodString = moodAnalyser.analiseMood();
		
		Assert.assertEquals("HAPPY", moodString);
	}
	
	@Test
	public void handleNullMoodTestCase() {
		
		MoodAnalyser moodAnalyser = new MoodAnalyser(null);
		
		String moodString = moodAnalyser.analiseMood();
		
		Assert.assertEquals("HAPPY", moodString);
	}

}
