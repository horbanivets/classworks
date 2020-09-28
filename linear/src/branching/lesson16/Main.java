package branching.lesson16;

public class Main {
    public static void main(String[] args) {
        int x = 2;
        int y = 1;

        System.out.println(x & y);
        System.out.println(x | y);
        System.out.println(~x);
        int z = 3;
        System.out.println(z >> 1);
        System.out.println(z << 3); //0001 1000
        System.out.println(z >>> 1);

    }
}
