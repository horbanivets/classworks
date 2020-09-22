package lesson6;

public class Main {
    public static void main(String[] args) {
        int x = 8;
        int y = 6;
        System.out.println("x = " + x);
        String name = "I";
        String surname = "Am";
        String fio = name + " " + surname;
        System.out.println(fio);


        int x1 = 6;
        int y1 = 7;

        x1 +=4;
        System.out.println(x1);
        System.out.println(y1/x1);
        System.out.println(y1 % x1);


        double z1 = x1;
        //x1 = z1;//

        x1 = y1;


        int number = 725;
        int h = number / 100;
        int em = number % 100;
        int t = em / 10;
        int o = number % 10;
        System.out.println("Сотен: "
        + h + " , Десятков: "
        + t + " , Едениц: " + o);



    }
}
