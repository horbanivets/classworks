package lesson31;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        int [] m = new int[1+(int)(Math.random() * 10)];
        for(int i = 0,n=m.length; i < n; i++) {
            m[i] = (int) (Math.random() * 100*Math.pow(-1,i));
        }
        int [] m1 = new int[1+(int) (Math.random() * 10)];
        for(int i = 0,n=m1.length; i < n; i++) {
            m1[i] = (int) (Math.random() * 100*Math.pow(-1,i));
        }
        //[t[t[t[t[t[t[t[t[t[
        int a = 0, a1 = 0;
        for (int t: m) {
            a = a + t;
        }
        a = a / m.length;
        for (int t2: m) {
            System.out.print(t2 + " ");
        }
        System.out.println();
        System.out.println(a);
        /////////////////////////
        for (int t: m1) {
            a1 = a1 + t;
        }
        a1 = a1 / m1.length;
        for (int t2: m1) {
            System.out.print(t2 + " ");
        }
        System.out.println();
        System.out.println(a1);


        int [] m3 = new int[m.length+m1.length];
        for (int i = 0,n = m3.length; i < n; i++) {
            if (i<m.length) {
                m3[i] = m[i];
            }else{
                m3[i]= m1[i- m.length];
            }
        }
        for (int t:m3) {
            System.out.print(t + " ");
        }
        System.out.println();

        for (int t:m3) {
            if (a > a1){
                if (a1 < t & t < a){
                    count++;
                }
            }else{
                if (a < t & t < a1){
                    count++;
                }
            }
        }
    }
}
