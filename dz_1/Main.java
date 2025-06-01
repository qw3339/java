//Begin27◦
//        . Дано число A. Вычислить A^8
//        , используя вспомогательную переменную и три операции умножения. Для этого последовательно находить A^2
//        ,A^4, A^8 . Вывести все найденные степени числа A.

import java.util.Scanner;

public class Main  {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите число A: ");
        double a = sc.nextDouble();

        double result; // Вспомогательная переменная

        result = a * a; // Первая операция умножения
        System.out.println("A^2 = " + result);

        result = result * result; // Вторая операция умножения
        System.out.println("A^4 = " + result);

        result = result * result; // Третья операция умножения
        System.out.println("A^8 = " + result);

        sc.close();
    }
}














