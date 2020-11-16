package Bolb.m;

public class Zadacha7 {
    public static void main(String[] args) {


        int i = 0;
        int[][] m = new int[4][4];
        for (int n = m.length; i < n; i++) {
            for (int k=0; k < n; k++) {
                m[i][k]=k+1;
                System.out.print(m[i][k] + " ");
            }
            System.out.println();
        }
    }
}