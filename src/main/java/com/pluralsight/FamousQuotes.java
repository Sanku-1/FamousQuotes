package com.pluralsight;

import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {
        String[] quoteList = {"Time and tide wait for no man", "What goes around comes around" , "An eye for a eye makes everyone blind", "An apple a day keeps the doctor away", "The early bird catches the worm", "Sticks and stones may break my bones, but words will never hurt me", "We're all friends in the clurb", "The unexamined life is not worth living" , "The best revenge is massive success", "You miss 100 percent of the shots you don't take"};
        System.out.println(quoteList[0]);
        Scanner quoteScanner = new Scanner(System.in);
        System.out.println("Please select which quote you would like to read: (1-10)");
        int quouteSelection = quoteScanner.nextInt();
        System.out.println(quoteList[quouteSelection - 1]);
    }
}
