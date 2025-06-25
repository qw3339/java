//Array87. Дан массив размера N, все элементы которого, кроме первого, упорядочены по возрастанию. Сделать массив упорядоченным, переместив
//первый элемент на новую позицию.

import java.util.Scanner;
import java.util.Arrays;

public class Array87 {
    public static void sortt(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }

        int firstEl = arr[0];
        int i;


        for (i = 1; i < arr.length; i++) {
            if (firstEl <= arr[i]) {
                break;
            }
        }

        System.arraycopy(arr, 1, arr, 0, i -1 );

        arr[i - 1] = firstEl;
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 2, 3, 4};
        System.out.println("Массив до сортировки: " + Arrays.toString(arr));
        sortt(arr);
        System.out.println("Массив после сортировки: " + Arrays.toString(arr));
    }


}
