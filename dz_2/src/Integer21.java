//Integer21◦
//        . С начала суток прошло N секунд (N — целое). Найти количество
//секунд, прошедших с начала последней минуты.


import java.util.Scanner;
public class Integer21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите количество секунд с начала суток (целое число N): ");
        int N = sc.nextInt();

        int second = N % 60;

        System.out.println("Количество секунд с начала последней минуты: " + second);

        sc.close();

    }
}