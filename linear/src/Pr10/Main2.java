package Pr10;

public class Main2 {
    public static void main(String[] args) {
        int[]m1= {1,2,-3,0};
        int [] m2 = {4,8,2,12,9};
        int [] m3 = new int[m1.length+m2.length];
        for (int i = 0, n = m3.length; i < n; i++) {
            if (i < m1.length){
                m3[i]=m1[i];
            }else{
                m3[i]= m2[i-m1.length];
            }
        }
        for (int t:m3) {
            System.out.print(" "+ t);
        }
    }
}
