package my;

import java.util.Scanner;

public class TriangleTask {
    public static void main(String[] args) {

        double sideA = getNumber();
        double sideB = getNumber();
        double sideC = getNumber();
        boolean triangleCheck = isTriangle(sideA, sideB, sideC);
        System.out.println("У вас получится треугольник - " + triangleCheck);

        if (triangleCheck == true) {
            String result = getResult(sideA, sideB, sideC);
            System.out.println("Тип треугольника: " + result);
        }
    }

    public static double getNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите одну из сторон треугольника (формат 0,0 или 0): ");
        if (sc.hasNextDouble()) {
            return sc.nextDouble();
        } else {
            System.out.println("Вы ввели неверный формат данных. Попробуйте еще раз");
            return getNumber();
        }
    }

    public static boolean isTriangle(double sideA, double sideB, double sideC) {

        if (sideA + sideB <= sideC || sideA + sideC <= sideB) {
            return false;
        } else if (sideB + sideC <= sideA) {
            return false;
        } else {
            return true;
        }
    }

    public static String getResult(double sideA, double sideB, double sideC) {

        if (sideA == sideB) {
            if (sideB == sideC) {
                return "равносторонний треугольник";
            } else {
                return "равнобедренный треугольник";
            }
        } else if (sideB == sideC) {
            return "равнобедренный треугольник";
        } else
            return "разносторонний треугольник";
    }

}



