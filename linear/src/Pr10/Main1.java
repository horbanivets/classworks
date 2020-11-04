package Pr10;

public class Main1 {
    public static void main(String[] args) {
        int [ ] m1 = {1,2,3,4,5,6,7,8,9,0};
        int [] m2 = {1,2,3,4,5,6,7,8,9,0};
        int [] m3 =new int [m1.length];
        for (int i = 0, n = m1.length; i < n; i++) {
            m3[i]= m1[i]+m2[i];

        }
        for (int t :m3) {
            System.out.println(t);
        }
    }
}
