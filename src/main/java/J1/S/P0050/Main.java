package J1.S.P0050;

import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        EquationProgram program = new EquationProgram();

        while (true) {
            System.out.println("\n========= Equation Program =========");
            System.out.println("1. Calculate Superlative Equation");
            System.out.println("2. Calculate Quadratic Equation");
            System.out.println("3. Exit");
            System.out.print("Please choose one option: ");

            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    System.out.println("----- Calculate Equation -----");
                    float a1 = inputFloat("Enter A: ");
                    float b1 = inputFloat("Enter B: ");
                    List<Float> res1 = program.calculateEquation(a1, b1);
                    if (res1 == null) {
                        System.out.println("No solution.");
                    } else if (res1.isEmpty()) {
                        System.out.println("Infinite solutions.");
                    } else {
                        System.out.println("Solution: x = " + res1.get(0));
                    }
                    program.displayOddEvenSquare(a1, b1);
                    break;

                case "2":
                    System.out.println("----- Calculate Quadratic Equation -----");
                    float a2 = inputFloat("Enter A: ");
                    float b2 = inputFloat("Enter B: ");
                    float c2 = inputFloat("Enter C: ");
                    List<Float> res2 = program.calculateQuadraticEquation(a2, b2, c2);
                    if (res2 == null) {
                        System.out.println("No solution.");
                    } else if (res2.isEmpty()) {
                        System.out.println("Infinite solutions.");
                    } else if (res2.size() == 1) {
                        System.out.println("Solution: x = " + res2.get(0));
                    } else {
                        System.out.println("Solutions: x1 = " + res2.get(0) + ", x2 = " + res2.get(1));
                    }
                    program.displayOddEvenSquare(a2, b2, c2);
                    break;

                case "3":
                    return;

                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }

    private static float inputFloat(String msg) {
        while (true) {
            System.out.print(msg);
            String input = sc.nextLine();
            if (Number.checkFloat(input)) {
                return Float.parseFloat(input);
            }
            System.out.println("Please input a number.");
        }
    }
}
