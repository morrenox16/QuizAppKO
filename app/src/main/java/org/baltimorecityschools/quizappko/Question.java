package org.baltimorecityschools.quizappko;

public class Question {
    // 2 instane variables
    public String qPrompt;
    public String correctAns;


    // 3 constructors to initialize all the instance var
    // 3a default constructor
    public Question() {
        qPrompt = "unknown";
        correctAns = "unknown";
    }

    //3b pass-through constructor
    public Question (String newqPrompt, String newcorrectAns) {
        qPrompt = newqPrompt;
        correctAns = newcorrectAns;
    }

    // 4 methods
    // 4a getter methods
    public String getqPrompt() {
        return qPrompt;
    }
    public String isCorrectAns() {
        return correctAns;
    }
    public void setqPrompt(String newqPrompt) {
        qPrompt = newqPrompt;
    }
    public void setCorrectAns(String newcorrectAns) {
        correctAns = newcorrectAns;
    }
    //toString
    @Override
    public String toString(){
        return " qPrompt;" + qPrompt + "correctAns;" + correctAns;
    }

}
