
package loop_condition;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Enter the Value 1:");
            int value1 = in.nextInt();

            System.out.println("Enter the Value 2:");
            int value2 = in.nextInt();

            System.out.println("Enter the choice:");
            System.out.println("1. Add");
            System.out.println("2. Sub");
            System.out.println("3. Multi");
            System.out.println("4. Div");
            System.out.println("0. Exit");

            choice = in.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Addition: " + (value1 + value2));
                    break;

                case 2:
                    System.out.println("Subtraction: " + (value1 - value2));
                    break;

                case 3:
                    System.out.println("Multiplication: " + (value1 * value2));
                    break;

                case 4:
                    if (value2 != 0) {
                        System.out.println("Division: " + (value1 / value2));
                    } else {
                        System.out.println("Cannot divide by zero");
                    }
                    break;

                case 0:
                    System.out.println("Calculator Closed...");
                    break;

                default:
                    System.out.println("Invalid input...");
            }

        } while (choice != 0);

        in.close();
    }
}
