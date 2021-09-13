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

}
