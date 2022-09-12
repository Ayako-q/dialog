package com.example.dialog;
import java.util.Scanner;

public class Dialog {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Hi, I'm Dane - your dialog machine! What's your name?");
        String uname = scan.nextLine();
        System.out.println("Nice to meet you, " + uname + " How old are you?");
        int old = scan.nextInt();
        System.out.println("So you are " + old + " ");

    }
}