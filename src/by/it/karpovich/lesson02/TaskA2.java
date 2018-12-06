package by.it.karpovich.lesson02;

/*
напишите тело main программы которая выводит на экран 5 строк
"Я начинаю изучать Java!"

Для ручной проверки запустите программу Ctrl+Shift+F10
Для автоматической проверки откройте и запустите класс Testing
*/



public class TaskA2 {

    public static void main(String[] args) {

        System.out.println("Я начинаю изучать Java!");

        printTextMoreTimes("Я начинаю изучать Java!", 5);
    }

    private static void printTextMoreTimes (String phrase, int count) {
        for (int i = 1; i < count; i++) {
            System.out.println(phrase);
        }
    }


}





