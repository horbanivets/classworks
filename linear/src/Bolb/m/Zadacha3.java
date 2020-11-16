package Bolb.m;

public class Zadacha3 {
    public static void main(String[] args) {
        int i=0;
        int [][] m = new int[5][5];
        for (int n =m.length;i<n;i++){
            for (int k=0; k < n; k++) {
                m[i][k]=(int)(Math.random()*100);
                System.out.print(m[i][k]+" ");
            }
            System.out.println();
        }
        i=0;

        System.out.println("\n");
        for (int n=m.length; i < n; i++) {
            for (int k = 0; k < n; k++) {
                if (m[i][k]%2==0){
                    System.out.print(m[i][k]+ " ");
                }
            }
            System.out.println();
        }
    }
}
