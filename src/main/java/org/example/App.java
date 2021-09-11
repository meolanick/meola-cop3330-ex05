/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Nicholas Meola
 */

package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        System.out.println( "What is the first number?" );
        String first_number = scan.nextLine();
        int fn =Integer.parseInt( first_number );

        System.out.println( "What is the second number?");
        String second_number = scan.nextLine();
        int sn =Integer.parseInt( second_number );

        //MATH
        int sum = fn + sn;
        int sub = fn - sn;
        int mult = fn * sn;
        int div = fn / sn;

        //SCREEN OUTPUT
        System.out.println( fn + " + " + sn + " = " + sum + "\n" +
                fn + " - " + sn + " = " + sub + "\n" +
                fn + " * " + sn + " = " + mult + "\n" +
                fn + " / " + sn + " = " + div );

    }
}