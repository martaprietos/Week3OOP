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
            case "sub": sub(a, b); break;
            case "mul": mul(a, b); break;
            case "div": div(a, b); break;

            default:System.out.println(("Invalid operation")); break;
        }

    }

    public static void add(int a, int b){
        int sum = a + b;
        System.out.println("The result is: " + sum);
    }

    public static void sub(int a, int b){
        int sum = a - b;
        System.out.println("The result is: " + sum);
    }

    public static void mul(int a, int b){
        int sum = a * b;
        System.out.println("The result is: " + sum);

    }

    public static void div(int a, int b){
        if(b == 0){
            System.out.println("Invalid Operation");
        } else{
            int sum = a / b;
            System.out.println("The result is: " + sum);
        }

    }
}
