package by.it._tasks_.lesson02;

/*
напишите тело main программы которая выводит на экран 5 строк
"Я начинаю изучать Java!"

Для ручной проверки запустите программу Ctrl+Shift+F10
Для автоматической проверки откройте и запустите класс Testing
*/

public class TaskA2 {
    private static final String TEXT = "Я начинаю изучать Java";
    public static void main(String[] args) {
        System.out.println(TEXT);

        String s = "Я начинаю изучать Java";

        printTextMoreTimes(s, 5);
    }
    private static void printTextMoreTimes (String phrase, int count) {
        for (int i = 1; i < count; i++) {
            System.out.println(phrase);
        }
    }
}
