package massivy.lesson29;

public class Main {
    public static void main(String[] args) {
        int [] m = {1,6,3,7,1,-9,7,-11,0};
        for (int i = 0,n=m.length; i < n; i++) {
            m[i] = (int) (Math.random() * 100);
        }
        for (int t :m
             ) {
            System.out.print(" "+t);
        }
        int c =0, sum=0;
        for (int i = 0,n=m.length; i < n; i++) {
            if (i%2 ==0& (20<= m[i] & m[i]<=30)){
                c++;
                sum=sum+m[i];
            }
        }
        System.out.print(" Количество "+c+"Сумма "+sum);
    }
}
