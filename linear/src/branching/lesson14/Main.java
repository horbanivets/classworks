package branching.lesson14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Input a: ");
        int a = s.nextInt();
        System.out.println("Input b: ");
        int b = s.nextInt();
        System.out.println("Input c: ");
        int c = s.nextInt();
        double d = b*b - 4*a*c;
        if(d<0){
            System.out.println("Корней нет");
        }
        if (d==0){
            double x = ((-b + Math.sqrt(d))/2);
            System.out.println(x);
        }
        if (d>0){
         double x1 = ((-b + Math.sqrt(d))/2);
         double x2 = ((-b - Math.sqrt(d))/2);
            System.out.println("x1 : " + x1);
            System.out.println("x2 : " + x2);
        }
        }
    }


