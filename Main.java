import java.util.Scanner;
public class Main {
    public static <a> void main(String[] args) {

        // 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
        System.out.print("Введите число: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int res = 0;
        for (int i = 0; i <= a; i++) {
            res += i;
        }
        System.out.println(a + "\nТреугольного число от вашего: " + res);

        int fact = 1;
        for (int i = 1; i <= a ; i++) {
            fact *= i;
        }
        System.out.printf("Факториал числа: %d", fact);

    }
}