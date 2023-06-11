public class SimpleNumbers {
    public static void main(String[] args) {

        // 2) Вывести все простые числа от 1 до 1000
        // Решения находил, но не понимаю на своём уровне как решить
        for (int i = 2; i <= 1000; i++){
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
