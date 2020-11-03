package massivy.lesson29;

public class Main2 {
    public static void main(String[] args) {
        int[] m = {20,21,22,23,24,25,26,27,28,29,30};
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
