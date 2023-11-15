package Assignmentexample;

import java.util.Scanner;


public class Asscl1 {

   //attribut
    private String ord;
    private int numOfLines;
    private int numOfChars;
    private int numOfWords;

    Scanner scan = new Scanner(System.in);


//konstruktor
    public Object setInput() {
        StringBuilder inputStringbuilder = new StringBuilder();
        while (true) {
            System.out.println("Please enter a word or write exit to stop the program");
            ord = scan.nextLine();
            if (ord.equalsIgnoreCase("exit")) {
                break;
            } else {
                inputStringbuilder.append(ord).append("\n");
                numOfChars += ord.length();
                numOfWords += ord.split("\\s+").length;
                numOfLines++;

            }

        }
        ord = inputStringbuilder.toString().trim();
        return ord;
    }


    //metoden för att skriva ut datan ifrån classen
    public void printText() {
        System.out.println(ord);
        System.out.println("Your total number of characters is: " + numOfChars);
        System.out.println("Your total number of words is: " + numOfWords);
        System.out.println("Your total number of line is: " + numOfLines);

    }


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

    public void setNumOfChars(int numOfChars) {
        this.numOfChars = numOfChars;
    }
}


