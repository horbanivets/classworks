package Pr6.seredne;

public class Main {
    public static void main(String[] args) {
        int s = 0;
        int c = 1;
        for (int i = 10; i <= 20; i++) {
            s += i;
            if (i!=10){
                c = s/(i-10);}
            if (i==20){
                System.out.println("Cума: " + s + " Середне арифметичне: " + c);}
        }
    }
}
