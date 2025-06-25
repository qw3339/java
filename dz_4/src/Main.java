
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {


    static class WrongLoginException extends Exception {
        public WrongLoginException() {
        }

        public WrongLoginException(String message) {
            super(message);
        }
    }

    static class WrongPasswordException extends Exception {
        public WrongPasswordException() {
        }

        public WrongPasswordException(String message) {
            super(message);
        }
    }

    public static boolean checkLoginAndPassword(String login, String password, String confirmPassword) {
        try {

            if (!login.matches("^[a-zA-Z0-9_]+$")) {
                throw new WrongLoginException("Login содержит недопустимые символы.");
            }
            if (login.length() < 5) {
                throw new WrongLoginException("Длина логина должна быть не менее 5 символов.");
            }


            if (password.length() < 8) {
                throw new WrongPasswordException("Длина пароля должна быть не менее 8 символов.");
            }
            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Пароли не совпадают.");
            }


            int groupCount = 0;
            if (password.matches(".*[a-z].*")) groupCount++;
            if (password.matches(".*[A-Z].*")) groupCount++;
            if (password.matches(".*[0-9].*")) groupCount++;
            if (password.contains("_")) groupCount++;
            if (groupCount < 3) {
                throw new WrongPasswordException("Пароль должен содержать как минимум 3 из следующих групп: латинские буквы (большие и маленькие), цифры и знак подчеркивания.");
            }

            return true;
        } catch (WrongLoginException | WrongPasswordException e) {
            System.err.println("Ошибка: " + e.getMessage());
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите login: ");
        String login = sc.nextLine();
        System.out.print("Введите password: ");
        String password = sc.nextLine();
        System.out.print("Введите confirm password: ");
        String confirm_password = sc.nextLine();


        System.out.println( checkLoginAndPassword(login,password , confirm_password));




    }
}