package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(returnAge());
        System.out.println(returnName());
        printMathOperations(4,5);
    }

    static int returnAge() {
        return 21;
    }

    static String returnName() {
        return "Aga";
    }
    static void printMathOperations(int number1, int number2){
        System.out.println("Suma = "+ (number1+number2));
        System.out.println("Różnica = " +(number1-number2));
        System.out.println("Iloczyn = " + (number1*number2));
    }

}
