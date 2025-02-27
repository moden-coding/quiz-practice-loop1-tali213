
/**
 *  Write a Java program that reads an unspecified number of integers from the user 
 *  until the user enters -1. For each number, indicate whether it is odd or even. 
 *  After the user enters -1, print the count of even and odd numbers entered.
 */

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int even = 0;
        int odd = 0;
        while (true) {
            int integer = Integer.valueOf(scanner.nextLine());
            if (integer == -1) {

                break;
            }
            if (integer % 2 == 0) {
                System.out.println("even");
                even++;
            } else {
                System.out.println("odd");
                odd++;
            }

        }
        System.out.println("Number of odd numbers: " + odd + " and " + "number of even numbers: " + even);

    }
}
