// 3) Реализовать простой калькулятор (+-/*)
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {

        System.out.println("Введите первое число: ");
        Scanner sc1 = new Scanner(System.in);
        double first = sc1.nextInt();
        System.out.println("Введите второе число: ");
        Scanner sc2 = new Scanner(System.in);
        double second = sc2.nextInt();
        System.out.println("Введите операцию для этих чисел:\n 1: +\n 2: -\n 3: *\n 4: / ");
        Scanner sc3 = new Scanner(System.in);
        String operation = sc3.next();

        if (operation.equals("+")) System.out.println("Результат: " + (first + second));
        if (operation.equals("-")) System.out.println("Результат: " + (first - second));
        if (operation.equals("*")) System.out.println("Результат: " + (first * second));
        if (operation.equals("/")) {
            if (second != 0) System.out.println("Результат: " + (first / second));
            else System.out.println("Делить на 0 нельзя :с");
        }
    }
}
