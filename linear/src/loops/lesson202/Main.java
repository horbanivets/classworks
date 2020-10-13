package loops.lesson202;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int p;

        do {
            System.out.println("Введите пароль: ");
            p = s.nextInt();
        }while (p != 36060);
        System.out.println("Вы вошли поздравляю)");
    }
}
