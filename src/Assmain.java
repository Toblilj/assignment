import Assignmentexample.Asscl1;

import java.util.Scanner;

public class Assmain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //skapar konstruktor
        Asscl1 ordCounter = new Asscl1();
        //loop for user att skriva in ord eller stop ord

        while (true) {
            System.out.println("Please enter a word or write stop to exit the program");
            String input = scan.nextLine();
            ordCounter.Asscl1(input);

            //kollar om user har skrivit in stop och isåfall stoppar loopen.
            if (input.equalsIgnoreCase("stop")) {
                break;
            }


        }
        //kod för att kalla på min konstruktor
        printText(ordCounter);


    }

    //metod för att skriva ut informationen från user och ifrån min konstruktor
    public static void printText(Asscl1 ordCounter) {
        System.out.println(ordCounter.getOrd());
        System.out.println("Your total number of characters is: " + ordCounter.getNumOfChars());
        System.out.println("Your total number of words is: " + ordCounter.getNumOfWords());
        System.out.println("Your total number of line is: " + ordCounter.getnumOfLines());

    }

}


