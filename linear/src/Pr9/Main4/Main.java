package Pr9.Main4;

public class Main {
    public static void main(String[] args) {
        int[] m = {23, 5, 8, 9, 11};
        for (int i = 0, n = m.length; i < n; i++) {
        m[i] = (int) (Math.random() * 100);
        }
        int sum=0;
        int t=0;
        for (int i=0, n = m.length; i<n; i++){

            sum = sum +m[i];

        }
        double s = (int)sum/m.length;
        System.out.println("Середне: "+s);
        for (int u=0 , n= m.length; u< n ; u++) {

            if (m[u]>s){
                t++;
            }
        }
        System.out.println("Больше среднего: "+t);
    }
}
