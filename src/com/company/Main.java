package com.company;
import java.util.Random;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = "";

        String[] reply = new String[20];
        reply[0] = "It is certain";
        reply[1] = "It is decidedly so";
        reply[2] = "Without a doubt";
        reply[3] = "Yes definitely";
        reply[4] = "You may rely on it";
        reply[5] = "As I see it, yes";
        reply[6] = "Most likely";
        reply[7] = "Outlook good";
        reply[8] = "Yes";
        reply[9] = "Signs point to yes";
        reply[10] = "Reply hazy, try again";
        reply[11] = "Ask again later";
        reply[12] = "Better not tell you now";
        reply[13] = "Cannot predict now";
        reply[14] = "Concentrate and ask again";
        reply[15] = "Don't cont on it";
        reply[16] = "My reply is no";
        reply[17] = "My sources say no";
        reply[18] = "Outlook not so good";
        reply[19] = "Very doubtful";

        while(!userInput.equalsIgnoreCase("n")) {
            System.out.println("Would you like to play?");
            userInput = scanner.nextLine();
            System.out.print("Ask a question: ");
            userInput = scanner.nextLine();
            Random generator = new Random();
            int randomIndex = generator.nextInt(reply.length);
            String answer = reply[randomIndex];

            System.out.print("Answer: " + answer + "\n");

        }

        System.out.println("Thanks for playing!");

    }






}
