package branching.lesson13;

public class Main {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(x = 8); //присвоение
        System.out.println(x == 8); //сравнение - логическая операция
        // > < >= <= != ==
        int y = 20;
        boolean c = x < y;
        System.out.println(c);
        int cash = -6;
        if (cash < 0); {
            System.out.println("cash is negative");
        }
        if (true)
            if (false)
                System.out.println("a");
            else
                System.out.println("b");

        int price = 100;
        int money = 1000;
        boolean isOpen = true;
        if(isOpen) {
            if (price <= money) {
                System.out.println("can buy");
            } else {
                System.out.println("Cant buy");
            }
        }else{
            System.out.println("Shop is close");
        }

        int m = 4;
        System.out.println("value is");
    }
}
