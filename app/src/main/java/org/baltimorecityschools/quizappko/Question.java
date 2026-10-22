package org.baltimorecityschools.quizappko;

public class Question {
    // 2 instane variables
    private String qPrompt;
    private String correctAns;
    private String choiceA;
    private String choiceB;

    // 3 constructors to initialize all the instance var
    // 3a default constructor
    public Question() {
        qPrompt = "unknown";
        correctAns = "unknown";
        choiceA = "unknown";
        choiceB = "unknown";
    }

    //3b pass-through constructors


    public Question(String qPrompt, String correctAns, String choiceA, String choiceB) {
        this.qPrompt = qPrompt;
        this.correctAns = correctAns;
        this.choiceA = choiceA;
        this.choiceB = choiceB;
    }

    // 4 methods
    // 4a getter methods
    public String getqPrompt() {
        return qPrompt;
    }
    public String isCorrectAns() {
        return correctAns;
    }

    public String getChoiceB() {
        return choiceB;
    }

    public String getChoiceA() {
        return choiceA;
    }

    public void setqPrompt(String newqPrompt) {
        qPrompt = newqPrompt;
    }
    public void setCorrectAns(String newcorrectAns) {
        correctAns = newcorrectAns;
    }

    public void setChoiceA(String choiceA) {
        this.choiceA = choiceA;
    }

    public void setChoiceB(String choiceB) {
        this.choiceB = choiceB;
    }

    //toString
    @Override
    public String toString(){
        return " qPrompt;" + qPrompt + "correctAns;" + correctAns;
    }

}
