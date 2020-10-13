package treugolniki.fourth;

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
        for (int i = 0; i < 10; i++) {
            for (int f = 0; f < i ; f++) {
                System.out.print(" ");
            }
            for (int j = 10 - i; j > 0  ; j--) {
                System.out.print("#");

            }
            System.out.println();
        }
    }
}
