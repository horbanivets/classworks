package Pr11;

public class Main2 {
    public static void main(String[] args) {
        int[] m = {-6,3,-6,4,4,5,9,-4,-6,-8,1};
        int t =0, r=0,t1=0,r1=0;
        for (int i = 0,n=m.length; i < n; i++) {
            if (m[i] > 0 ){
                t++;
            }


        }
        int[] m1 = new int[t];
        int [] m2 = new int[m.length-t];
        System.out.println(m1.length);
        System.out.println(m2.length);
        for (int te:m) {
            if(te>0){
                m1[t1]=te;
                t1++;
            }else if (te<0){
                m2[r1]=te;
                r1++;
            }
        }
        for (int tr:m1) {
            System.out.print(tr+ " ");
        }
        System.out.println();
        for (int tre:m2) {
            System.out.print(tre+ " ");
        }
    }
}
