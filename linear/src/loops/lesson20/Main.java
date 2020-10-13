package loops.lesson20;

public class Main {
    public static void main(String[] args) {
     int b = 1000;
     int g = 2000;
     int r = 11;
     int y = 0;
     while (b < g){
         double p = b * r / 100;
         b += p;
         y++;

     }
        System.out.println("Накопили " + b + "грн за " + y + " лет");
    }
}
