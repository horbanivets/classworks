package controlwork1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        double v;
        System.out.println("Введите объемный вес");
        v = s.nextDouble();
        if (v <= 1 ){
            double price = 30;
            System.out.println("Стоимость доставки:" + price);
        }else if(1 < v & v <= 2){
            double price = 30;
            System.out.println("Стоимость доставки:" + price);
        }else if(2 < v & v <= 5){
            double price = 50;
            System.out.println("Стоимость доставки:" + price);
        }else if(5 < v & v <= 10){
            double price = 70;
            System.out.println("Стоимость доставки:" + price);
        }else{
           double price = 100 + (v-10)*2;
            System.out.println("Стоимость доставки:" + price);

        }

    }
}
