package massivy.lesson29;

public class Main4 {
    public static void main(String[] args) {
        int[] m = {7, 0, 4, 6, 1, -3, 9};
        int t = 0, p = 0;
        int min = (int) Double.POSITIVE_INFINITY;
        int max = (int) Double.NEGATIVE_INFINITY;
        int maxI = -1, minI = -1;
        //for (int i = 0, n = m.length; i < n; i++) {
            //m[i] = (int) (Math.random() * 100*Math.pow(-1,i));
        //}
        for (int i = 0,n=m.length; i < n; i++) {
            if (min > m[i]){
                min = m[i];
                minI =i;
            }
            if (max < m[i]){
                max = m[i];
                maxI = i;
            }

        }
        t = m[minI];
        m[minI] = m[maxI];
        m[maxI] = t;

        for (int r : m) {
            System.out.print(" " + r);
        }
    }
}
