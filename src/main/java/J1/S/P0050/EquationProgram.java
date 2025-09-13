package J1.S.P0050;

import java.util.*;

public class EquationProgram {

    public List<Float> calculateEquation(float a, float b) {
        if (a == 0 && b == 0) return new ArrayList<>(); // vô số nghiệm
        if (a == 0) return null; // vô nghiệm

        List<Float> result = new ArrayList<>();
        result.add(-b / a);
        return result;
    }

    public List<Float> calculateQuadraticEquation(float a, float b, float c) {
        if (a == 0) return calculateEquation(b, c);

        float delta = b * b - 4 * a * c;
        if (delta < 0) return null; // vô nghiệm
        if (delta == 0) {
            List<Float> result = new ArrayList<>();
            result.add(-b / (2 * a));
            return result;
        }

        List<Float> result = new ArrayList<>();
        result.add((-b + (float)Math.sqrt(delta)) / (2 * a));
        result.add((-b - (float)Math.sqrt(delta)) / (2 * a));
        return result;
    }

    public void displayOddEvenSquare(float... nums) {
        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();
        StringBuilder square = new StringBuilder();

        for (float num : nums) {
            if (Number.isOdd(num)) odd.append(num).append(" ");
            else even.append(num).append(" ");
            if (Number.isPerfectSquare(num)) square.append(num).append(" ");
        }

        System.out.println("Odd Number(s): " + odd.toString());
        System.out.println("Even Number(s): " + even.toString());
        System.out.println("Perfect Square(s): " + square.toString());
    }

    void displayOddEvenSquare(float a2, float b2, float c2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
