package treugolniki.third;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int f = 10; f > i ; f--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i  ; j++) {
                System.out.print("#");

            }
            System.out.println();
        }


    }
}