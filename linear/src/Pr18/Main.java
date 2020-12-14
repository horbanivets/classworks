package Pr18;

import com.sun.xml.internal.ws.encoding.soap.SOAP12Constants;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        GregorianCalendar g = new GregorianCalendar();
        int y = 2020;
        int t = 0;
        g.set(Calendar.DAY_OF_MONTH,26);
        g.set(Calendar.MONTH,Calendar.MAY);
        for (int i = 2016;i <= y; i++) {
            t = i;
            g.set(Calendar.YEAR,t);
            System.out.println(g.get(Calendar.YEAR));


            int n = g.get(Calendar.DAY_OF_WEEK);
            switch (n){
                case 1:
                    System.out.println("Sunday");break;
                case 2:
                    System.out.println("Monday");break;
                case 3:
                    System.out.println("Вторник");break;
                case 4:
                    System.out.println("Среда");break;
                case 5:
                    System.out.println("Четверг");break;
                case 6:
                    System.out.println("Пятница");break;
                case 7:
                    System.out.println("Cубота");
                    break;
            }
        }

    }
}
