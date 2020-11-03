package Pr9.Main2;

import com.oracle.xmlns.internal.webservices.jaxws_databinding.SoapBindingParameterStyle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println();
        int x = s.nextInt();
        int t = 0;
        boolean f = true;
       int [] m = {12,87,67,24,26,99,-2};
        for (int i = 0, n = m.length; i < n; i++) {
            m[i] = (int) (Math.random() * 10);
        }
        for (int i = 0, n = m.length; i < n; i++) {
            if (x == m[i]){
                t++;
            }
        }
        System.out.println("Количество: "+ t);
    }
}