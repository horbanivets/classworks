package Bolb.Zadachi;

public class zadach10 {
    public static void main(String[] args) {
        int l=0;
        int i=0;
        int s=0;
        int [] m1 = new int[10];
        int [][] m = new int[10][10];
        for (int n =m.length;i<n;i++){
            for (int k=0; k < n; k++) {
                m[i][k]=(int)(Math.random()*40);
                System.out.print(m[i][k]+" ");
            }
            System.out.println();
        }
        i=0;
        System.out.println(" ");
        for (int n =m.length;i<n;i++){
            for (int k=0; k < n; k++) {
                s+=m[i][k];
                System.out.print(s+" ");
            l++;
            }

            m1[i]=s/l;
s=0;
l=0;
            System.out.println();
        }
    }
}
