package com.example.dialog;
import java.util.Scanner;

public class Dialog {
    public static void main(String[] args) {
        String n = "";
        Scanner scan = new Scanner (System.in);
        System.out.println("Hi, I'm Dane - your dialog machine! What's your name?");
        String uname = scan.nextLine();
        System.out.println("Nice to meet you, " + uname + " How old are you?");
        int old = scan.nextInt();
        System.out.println("So you are " + old + "! That is " + old*12 + " months, or " + old*12*29.3 + " days, hehe" + ". I am just a code but forgot to ask you to input you surname, so type it in chat please:");
        String surname = scan.next();
        System.out.println("Where are you from?");
        String from = scan.next();
        System.out.println("I like how its going! Tell me now, what kind of sport activity you enjoy doing or watching?");
        String activity = scan.next();
        System.out.println(activity + "? I love it too! What year have you been graduated from school?");
        int year = scan.nextInt();
        System.out.println("Do you own a car? \nType 'y' for 'yes' or 'n' for 'no'\n");
        String car = scan.next();
        if (car.equals("y")) {
            System.out.println("Cool, what model is it?");
            String carm = scan.next();
            n = "You own a " + carm;
        } else if (car.equals("n")) {
            System.out.println("Btw, I don't think that it is a big problem to live w/o a car");
            n = "You don't have a car";
        }
        else {
            System.out.println("Seems like your answer is something other than 'y' or 'n', try again!");
            n = "And try again!";
        }
        System.out.print("Cool! To sum up, your name is " + surname + " " + uname + " and you are " + old + " years old.");
        System.out.print("You are from " + from + " and have been graduated from school in " + year + ". Your favorite activity is " + activity + " and " + n );
    }
}
