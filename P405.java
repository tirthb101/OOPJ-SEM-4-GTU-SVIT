import java.util.Scanner;

/*
 Write a program that prompts the user to enter a decimal number
and displays the number in a fraction.
Hint: Read the decimal number as a string, extract the integer part
and fractional part from the string.
PRAC
 */
public class P405 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if (input.contains(".")) {
            String[] arr = input.split("\\.");
            System.out.println(arr[0]);
        } else {
            System.err.println(input);
        }
        sc.close();
    }
}
