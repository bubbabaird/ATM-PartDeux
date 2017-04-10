package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Scanner createAcct = new Scanner(System.in);
        Scanner removeAcct = new Scanner(System.in);

        HashMap<String, Double> accounts = new HashMap<>();

        accounts.put("Ben", 158800.23);
        accounts.put("Jake", 2838.45);
        accounts.put("Daniel", 838.80);
        accounts.put("Jared", 559.10);
        accounts.put("Keith", 1189.59);

        //Display this on the screen:
        System.out.println("Welcome to We'll Fartgo!");

        while (true) {
            System.out.println("Please type in your name.");

            //This "input" is assigned to a string type:
            //This program will now stop to allow the user to give input.

            String name  = input.nextLine();

            // see if name is in the hashmap.
            if (accounts.containsKey(name)) {
                System.out.println("Welcome Back " + name);
                // (is accounts.get(name) null?)
                // if the user doesn't enter a name, ask the user to try again
            } else if (name.isEmpty()) {
                System.out.println("Sorry, you must enter a name, please try again.");

                // if the user does enter a name, first check the hashmap for the name.
                // if the user does NOT (!) already exist, ask if they would like to create an acct.
            } else if (!accounts.containsKey(name)) {
                System.out.println("Hello, " + name + ", would you like create a new account?");
                System.out.println("Please press Y or N");
                String createAcctResp = createAcct.nextLine();
                // if the user presses Y
                // if it's not, add it to the accounts hash map with a default balance of 100.00.
                // e.g. accounts.put(name, 100.00);
                if (createAcctResp.equals("y")) {
                    accounts.put(name, 100.00);
                    System.out.println("Congrats " + name + " you now have a brand new account!");
                    System.out.println();
                    System.out.println("To start you out, we have awarded you with $" + 100.00 + ".");
                    // if the user presses N
                } else if (createAcctResp.equals("n")) {
                    //throw new Exception("Okay, thanks, we hope you'll consider opening an account with us again soon.");
                    continue;
                } else if (createAcctResp.isEmpty()) {
                    System.out.println("Sorry, to continue, you must enter either y or n");
                    continue;
                }
                    // if the user does exist,

                }

            // If name = this... then that; else that:
            // if (name.trim().equals("")) {
            //    throw new Exception("Sorry you must enter a Name");
            //}

            // If name is parameters are valid, print this:
            // System.out.println("Welcome, " + name);

            while (true) {
                //Then say, "What would you like to do:"
                System.out.println("What would you like to do:");

                System.out.println("1) Check my balance 2) Withdraw funds 3) Cancel 4) Remove Account");
                System.out.println("Please a select number: (1, 2, 3 or 4) and press return.");
                System.out.println("HARHARHARHAR");
                // The "input" is now assigned to a string type:
                String choice = input.nextLine();

                // Specify 1, 2, or 3 IF statements here:
                if (choice.equals("1")) {

                    System.out.println("You have $" + accounts.get(name));

                } else if (choice.equals("2")) {
                    // update the hashmap at "name" with a new balance
                    // but only do this if the amount they ask for is
                    // less than the amount they have
                    // accounts.put(name, new balance whatever that is);
                    System.out.println("How much money would you like to withdraw?");

                    String withdrawenAmt = input.nextLine();
                    System.out.println("Here is your $" + withdrawenAmt + " money.");
                } else if (choice.equals("3")) {
                    System.out.println("Thank you and please come again.");
                    break;

                } else if (choice.equals("4")) {
                    System.out.println("You are about to remove your account, are you sure you want to do this?");
                    System.out.println("Please press y to remove or n to keep your account.");
                    String yesRemoveAcct = removeAcct.nextLine();
                    if (yesRemoveAcct.equals("y")) {
                        accounts.remove(name);
                        System.out.println("You have successfully removed your account.");
                        break;
                    } else if (yesRemoveAcct.equals("n")){
                        break;
                    } else yesRemoveAcct.equals("");
                        System.out.println("Sorry, you didn't give a response.");
                }
                else {
                    throw new Exception("Invalid option.");
                }
            }
        }
    }
}
