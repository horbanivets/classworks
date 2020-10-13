package treugolniki.second;

public class Main {
    public static void main(String[] args) {
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
