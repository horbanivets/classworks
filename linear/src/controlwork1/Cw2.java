package controlwork1;

import java.util.Scanner;

public class Cw2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x1,x2;
        System.out.println("Введите десятие: ");
        x1 = s.nextInt();
        System.out.println("Введите еденици: ");
        x2 = s.nextInt();

        if(x1 + x2 >= 10){
            System.out.println("Da");
        }else System.out.println("Net");
    }
}
