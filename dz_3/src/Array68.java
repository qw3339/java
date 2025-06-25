//Array68. Дан массив размера N. Поменять местами его минимальный и максимальный элементы.


import java.util.Scanner;
public class Array68 {
    public static void main(String[] args) {
        int[] arr = {10, 15,1,6,8,9};
        int n = arr.length;

        if (n == 0) {
            System.out.println("Массив пуст.  Нечего менять.");
            return;
        }

        int minn = 0;
        int maxx = 0;
        int minValue = arr[0];
        int maxValue = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
                minn = i;
            }
            if (arr[i] > maxValue) {
                maxValue = arr[i];
                maxx = i;
            }
        }

        int temp = arr[minn];
        arr[minn] = arr[maxx];
        arr[maxx] = temp;

        System.out.print("Измененный массив: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}





