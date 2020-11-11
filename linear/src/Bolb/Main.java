package Bolb;

public class Main {
    public static void main(String[] args) {
        int []m = new int[30];
        int t=0;
        for (int i = 0,n=m.length; i < n; i++) {
            m[i]=(int)Math.floor(Math.random()*200)-100;
        }
        for (int i = 0,n=m.length; i < n; i++) {
            if (m[i]>0){
                t++;}
        }
        for (int i:m) {
            System.out.print(" "+ i);
        }
        System.out.println();
        int [] m1 = new int[t];
        int j= 0;
        for (int i = 0,n=m.length; i < n; i++) {
            if(m[i]>0){
                m1[j]=m[i];
                j++;
            }
        }
        for (int y:m1) {
            System.out.print(" "+y);
        }

    }
}
