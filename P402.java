/*
 * Write a program for calculator to accept an expression as a string
in which the operands and operator are separated by zero or more
spaces.
For ex: 3+4 and 3 + 4 are acceptable expressions. 
 */

import java.util.Scanner;

public class P402 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] arr;
        int[] arr2;
        Character temp = '@';
        Boolean valid = false;

        if (input.contains("+")) {
            temp = '+';
        } else if (input.contains("-")) {
            temp = '-';
        } else if (input.contains("*")) {
            temp = '*';
        } else if (input.contains("/")) {
            temp = '/';
        }
        arr = input.split("\\" + temp);
        arr2 = new int[arr.length];

        try {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = arr[i].trim();
                arr2[i] = Integer.parseInt(arr[i]);
            }
            valid = true;

        } catch (Exception e) {
            System.err.println(e);
        }

        if (valid) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
        sc.close();

    }
}
