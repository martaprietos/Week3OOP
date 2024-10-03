package ie.atu.week1;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        //methods
        System.out.println("Please enter your first number");
        Scanner sc1 = new Scanner(System.in);
        double a = sc1.nextInt();
        System.out.println();
        System.out.println("Please enter your second number");
        double b = sc1.nextInt();
        System.out.println("Please enter an operation - add, sub, mul, div, exp: ");
        String op = sc1.next();
        switch(op){
            case "add": add(a, b); break;
            case "sub": sub(a, b); break;
            case "mul": mul(a, b); break;
            case "div": div(a, b); break;
            case "exp": exp(a, b); break;

            default:System.out.println(("Invalid operation")); break;
        }

    }

    public static void add(double a, double b){
        double sum = a + b;
        System.out.println("The result is: " + sum);
    }

    public static void sub(double a, double b){
        double sum = a - b;
        System.out.println("The result is: " + sum);
    }

    public static void mul(double a, double b){
        double sum = a * b;
        System.out.println("The result is: " + sum);

    }

    public static void div(double a, double b){
        if(b == 0){
            System.out.println("Invalid Operation");
        } else{
            double sum = a / b;
            System.out.println("The result is: " + sum);
        }

    }

    public static void exp(double a, double b){System.out.println("Your result is: " + Math.pow(a, b));
    }
}
