import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();
        System.out.print("Введите третье число: ");
        double num3 = scanner.nextDouble();
        double max1, max2;
        if (num1 >= num2 && num1 >= num3) {
            max1 = num1;
            if (num2 >= num3) {
                max2 = num2;
            } else {
                max2 = num3;
            }
        } else if (num2 >= num1 && num2 >= num3) {
            max1 = num2;
            if (num1 >= num3) {
                max2 = num1;
            } else {
                max2 = num3;
            }
        } else {
            max1 = num3;
            if (num1 >= num2) {
                max2 = num1;
            } else {
                max2 = num2;
            }
        }
        double sumOfMax = max1 + max2;
        System.out.println("Сумма двух наибольших чисел: " + sumOfMax);
    }
}

