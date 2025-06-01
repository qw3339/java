//Дано значение угла α в радианах (0 < α < 2·π). Определить значение
//этого же угла в градусах, учитывая, что 180◦ = π радианов. В качестве
//значения π использовать 3.14.

import java.util.Scanner;

public class num30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double PI = 3.14;

        System.out.print("Введите значение угла α в радианах (0 < α < 2π): ");
        double alpha = sc.nextDouble();

        if (alpha <= 0 || alpha >= 2 * PI) {
            System.out.println("Ошибка");
        } else {

            double degrees = alpha * (180 / PI);
            System.out.println("Угол в градусах: " + degrees);
        }

        sc.close();
    }


}
