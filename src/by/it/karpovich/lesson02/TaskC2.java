package by.it.karpovich.lesson02;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и 4 раза выводит их сумму с обозначением системы счисления на экран в
ДЕСЯТИЧНОМ ДВОИЧНОМ ШЕСТНАДЦАТИРИЧНОМ ВОСЬМИРИЧНОМ виде

Вот пример ввода с клавиатуры:
34 26

Тогда вывод ожидается такой (обратите внимание на регистр букв):
DEC:34+26=60
BIN:100010+11010=111100
HEX:22+1a=3c
OCT:42+32=74
*/
class TaskC2 { public static void main(String[] args) {
    System.out.println("Please enter your numbers");

    Scanner sc = new Scanner(System.in);
    int a =sc.nextInt();
    int b =sc.nextInt();

    int s = a+b;

    System.out.println("DEC:"+ a + "+" + b + "=" + s);
    System.out.println("BIN:"+ Integer.toBinaryString(a) + "+" + Integer.toBinaryString(b) + "=" + Integer.toBinaryString(s));
    System.out.println("HEX:"+ Integer.toHexString(a) + "+" + Integer.toHexString(b) + "=" + Integer.toHexString(s));
    System.out.println("OCT:"+ Integer.toOctalString(a) + "+" + Integer.toOctalString(b) + "=" + Integer.toOctalString(s));
}


}
