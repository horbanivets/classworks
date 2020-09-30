package controlwork1;

import java.util.Scanner;

public class Cw2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x1,x2,x3;
        System.out.println("Введите число");
        x1 = s.nextInt();
        x2 = x1/10;
        x3 = x1 - x2*10;

        if(x2 + x3 >= 10){
            System.out.println("Da");
        }else System.out.println("Net");
    }
}
