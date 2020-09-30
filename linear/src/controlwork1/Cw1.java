package controlwork1;

import java.util.Scanner;

public class Cw1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double y,x;
        System.out.println("Введите х:");
        x = s.nextDouble();
         if(x < 1){
             System.out.println(y = -x+1);
         }else if(x >= 1){
             System.out.println(0);
         }
    }
}
