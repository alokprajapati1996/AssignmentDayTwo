package com.brigelabz.program;
import java.util.Scanner;
public class Program {
    public static void checkVowels() {
        char ch = 'O';
        switch (ch) {
            case 'a':
                System.out.println("Vowel");
                break;
            case 'e':
                System.out.println("Vowel");
                break;
            case 'i':
                System.out.println("Vowel");
                break;
            case 'o':
                System.out.println("Vowel");
                break;
            case 'u':
                System.out.println("Vowel");
                break;
            case 'A':
                System.out.println("Vowel");
                break;
            case 'E':
                System.out.println("Vowel");
                break;
            case 'I':
                System.out.println("Vowel");
                break;
            case 'O':
                System.out.println("Vowel");
                break;
            case 'U':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
        }
    }

    public static void printMonth() {
        int month = 7;
        String monthString = "";
        switch (month) {
            case 1:
                monthString = "1 - January";
                break;
            case 2:
                monthString = "2 - February";
                break;
            case 3:
                monthString = "3 - March";
                break;
            case 4:
                monthString = "4 - April";
                break;
            case 5:
                monthString = "5 - May";
                break;
            case 6:
                monthString = "6 - June";
                break;
            case 7:
                monthString = "7 - July";
                break;
            case 8:
                monthString = "8 - August";
                break;
            case 9:
                monthString = "9 - September";
                break;
            case 10:
                monthString = "10 - October";
                break;
            case 11:
                monthString = "11 - November";
                break;
            case 12:
                monthString = "12 - December";
                break;
            default:
                System.out.println("Invalid Month!");
        }
        System.out.println(monthString);
    }
  public static void quadraticRoots(){
    Scanner input = new Scanner(System.in);
System.out.print("Enter the value of a: ");
    double a = input.nextDouble();
System.out.print("Enter the value of b: ");
    double b = input.nextDouble();
System.out.print("Enter the value of c: ");
    double c = input.nextDouble();
    double delta= b * b - 4 * a * c;

        double r1 = (-b + Math.sqrt(delta)) / (2 * a);
        double r2 = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.println("The roots are r1= " + r1);
      System.out.println("The roots are  r2= " + r2 );

    }
    public static void distance(int x,int y) {
        double distance = Math.sqrt(x*x+y*y);
        System.out.println("Distance from (0, 0) to (" +
                x + ", " + y + ") is " +
                distance);

    }
    public static void main(String[] args) {
        checkVowels();
        printMonth();
        quadraticRoots();
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        distance(x,y);
    }
}
