package com.company;

import org.junit.jupiter.api.Test;

class MoodAnalyserTest {
//    MoodAnalyser moodAnalyser = new MoodAnalyser();
//    MoodAnalyser moodAnalyser1 = new MoodAnalyser("I am in Any Mood");

    @Test
    void givenMessage_ContainSad_ReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        boolean result = moodAnalyser.analyseMood("I am in Sad Mood");
        if(result == true){
            System.out.println(MoodAnalyser.display.SAD);
        }
        else {
            System.out.println(MoodAnalyser.display.HAPPY);
        }
    }

    @Test
    void givenMessage_NotContainSad_Return_Happy() {
        MoodAnalyser moodAnalyser1 = new MoodAnalyser("I am in Any Mood");
        boolean result = moodAnalyser1.analyseMood1();
        if(result == true){
            System.out.println(MoodAnalyser.display.SAD);
        }
        else {
            System.out.println(MoodAnalyser.display.HAPPY);
        }
    }
}