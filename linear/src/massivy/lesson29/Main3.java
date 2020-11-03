package massivy.lesson29;

public class Main3 {
    public static void main(String[] args) {
        int[] m =new int [10];
        int min = (int)Double.POSITIVE_INFINITY;
        int max = (int)Double.NEGATIVE_INFINITY;
        int maxI = -1,minI = -1;
        for (int i = 0,n=m.length; i < n; i++) {
            m[i] = (int) (Math.random() * 100*Math.pow(-1,i));
        }
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
        int[] r=new int[m.length -2];
        int j=0;
        for (int i = 0, n = m.length; i < n; i++) {
            if(i==minI | i== maxI){
                j++;
            }else{
                r[i-j]=m[i];
            }
        }
        for (int t:m) {
            System.out.print(" "+t);
        }
        System.out.println();
        for (int t:r) {
            System.out.print(" "+t);
        }
    }
}
