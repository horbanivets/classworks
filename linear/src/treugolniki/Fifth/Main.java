package treugolniki.Fifth;

public class Main {
    public static void main(String[] args) {
        int r1 = 4;
        int r2 = 6;
        int c = r2 - r1;
        for (int i = 0; i < r1; i++) {
            for (int f = r1+c; f > i; f--) {
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