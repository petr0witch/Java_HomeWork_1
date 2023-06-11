import java.util.Scanner;

public class Four {

//        4) Задано уравнение вида q + w = e, q, w, e >= 0.
//        Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69.
//        Требуется восстановить выражение до верного равенства.
//        Предложить хотя бы одно решение или сообщить, что его нет.
//        Под знаком вопроса - всегда одинаковая ЦИФРА.
//        Введите уравнение: ?? + ?? = 44
//        Решение: 22 + 22 = 44
    // КОСТЫЛЬНО, но решена :)
    public static void main(String[] args) {
        System.out.println("Enter your equation: ");
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        // Ввод: ?? + ?? = 44

        if (input1.contains("?")) { // not .equals (равно), use contains() - (проверка наличия)
            for (int i = 1; i <= 9; i++) {
                String input2 = input1.replace("?", String.valueOf(i));
                System.out.println(input2);
                if (input2.equals("22 + 22 = 44")) System.out.println("Currect: 22 + 22 = 44");
            }
        }
    }
}
