package Pr7;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int k,i;
        int x=1;
        int c=0;
        System.out.println("Ведите к: ");
        k = s.nextInt();
        System.out.println("Ведите i: ");
        i = s.nextInt();
        while (x<=1000){
            if (x%k==0 & x%i==0){
                c++;
            }
            x++;

        }
        System.out.println(c);
    }
}
