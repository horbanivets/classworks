package treugolniki.Fifth;

public class Main {
    public static void main(String[] args) {
        int r1 = 6;
        int r2 = 6;
        for (int i = 0; i < r1; i++) {
            for (int f = r1; f > i; f--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("#");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
        for (int i = 0; i < r2; i++) {
            for (int f = r2; f > i; f--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("#");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}