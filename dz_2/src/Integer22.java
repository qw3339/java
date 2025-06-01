//        Integer22◦
//        . С начала суток прошло N секунд (N — целое). Найти количество
//секунд, прошедших с начала последнего часа.

import java.util.Scanner;
public class Integer22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество секунд, прошедших с начала суток (N): ");
        int N = sc.nextInt();
        int second = N % 3600;
        System.out.println("С начала последнего часа прошло " + second + " секунд.");
        sc.close();

    }
}
