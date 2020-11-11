package Bolb;

public class Main1 {
    public static void main(String[] args) {
        int []m = new int[20];
        int t=0;
        int sum=0,l=0;
        for (int i = 0,n=m.length; i < n; i++) {
            m[i]=(int)Math.floor(Math.random()*160)-70;
        }
        for(int temp :m){
            System.out.print(temp+", ");
        }
        for(int temp:m){
            sum=+temp;
            l++;
        }sum =sum/l;
        System.out.println("\n"+sum);
        for (int i = 0,n=m.length; i < n; i++) {
            if (m[i]>sum){
                t++;}
        }

        int [] m1 = new int[t];
        int j= 0;
        for (int i = 0,n=m.length; i < n; i++) {
            if(m[i]>sum){
                m1[j]=m[i];
                j++;
            }
        }
        for (int y:m1) {
            System.out.print(" "+y);
        }

    }
}
