package ie.atu.week1;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        //methods
        System.out.println("Please enter your first number");
        Scanner sc1 = new Scanner(System.in);
        int a = sc1.nextInt();
        System.out.println();
        System.out.println("Please enter your second number");
        int b = sc1.nextInt();
        System.out.println("Please enter an operation - add, sub, mul, div: ");
        String op = sc1.next();
        switch(op){
            case "add": add(a, b); break;
            default:
                System.out.println(("Invalid operation")); break;
        }

    }

    public static void add(int a, int b){
        int sum = a + b;
        System.out.println("The sum is: " + sum);
    }
}
