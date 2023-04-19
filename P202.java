
/*
Write a program that prompts the user to enter a letter and
check whether a letter is a vowel or constant.
 */
import java.util.Scanner;

public class P202 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a charactor: ");
        char data = sc.next().charAt(0);

        if (data == 'a' || data == 'A' || data == 'e' || data == 'E' || data == 'i' || data == 'I' || data == 'o'
                || data == 'O' || data == 'u' || data == 'U') {
            System.out.println("VOWEL");
        } else {
            System.out.println("CONSONANT");
        }
        sc.close();
    }
}
