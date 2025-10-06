package com.pluralsight;

import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {
        try {
            String[] quoteList = {"Time and tide wait for no man", "What goes around comes around", "An eye for a eye makes everyone blind", "An apple a day keeps the doctor away", "The early bird catches the worm", "Sticks and stones may break my bones, but words will never hurt me", "We're all friends in the clurb", "The unexamined life is not worth living", "The best revenge is massive success", "You miss 100 percent of the shots you don't take"};
            boolean isDone = false;
            Scanner quoteScanner = new Scanner(System.in);
            while (!isDone) {
                System.out.println("Please select which quote you would like to read: (1-10)");
                int quoteSelection = quoteScanner.nextInt();
                String repeatStep = "no";
                switch (quoteSelection) {
                    case 1:
                        System.out.println(quoteList[quoteSelection - 1]);
                        quoteScanner.nextLine();
                        System.out.println("Would you like to read another quote? (yes/no)");
                        repeatStep = quoteScanner.nextLine();
                        if (repeatStep.equalsIgnoreCase("yes")) {
                            System.out.println("Please select which quote you would like to read: (1-10)");
                        } else {
                            isDone = true;
                            break;
                        }
                    case 2:
                        break;

                }
            }
        } catch (Exception e) {
            System.out.println("Invalid Selection");
        }
    }
}
