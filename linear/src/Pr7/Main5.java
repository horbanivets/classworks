package Pr7;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите к: ");
        int k = s.nextInt();
        int ne = 2;
        int x=2;;
        boolean f =true;
        System.out.println(1);
        while (ne<k){
             if (x%2==0 | x%3==0){
                f=false;
            }


                if (f==true){
            System.out.println(x);}
            ne++;
            x++;
        }


    }
}
