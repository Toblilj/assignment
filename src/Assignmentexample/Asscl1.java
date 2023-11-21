package Assignmentexample;

import java.util.Scanner;


public class Asscl1 {

    //attribut
    private StringBuilder inputStringbuilder = new StringBuilder();
    private String ord;
    private int numOfLines;
    private int numOfChars;
    private int numOfWords;


    //konstruktor
    //räknar ut värdet på user inskrivna ord
    public void Asscl1(String input) {
        ord = input;
        inputStringbuilder.append(ord).append("\n");
        numOfChars += ord.length();
        numOfWords += ord.split("\\s+").length;
        numOfLines++;


    }

        //setters och getters för mina variabler, för mina testcases och printText metod.
    public String getOrd() {
        return ord;
    }

    public void setOrd(String ord) {
        this.ord = ord;
    }

    public int getnumOfLines() {
        int getnumOfLines = numOfLines;
        return getnumOfLines;
    }

    public int getNumOfChars() {
        return numOfChars;
    }

    public int getNumOfWords() {
        return numOfWords;
    }

    public void setNumOfWords(int numOfWords) {
        this.numOfWords = numOfWords;
    }

    public void setNumOfChars(int numOfChars) {
        this.numOfChars = numOfChars;
    }
}


