package massivy.lesson26;

public class Main {
    public static void main(String[] args) {
        int[] n = {23,5,74,-5,26,1,0,666,228,-777};
        int max = (int)Double.NEGATIVE_INFINITY;
        int min = (int)Double.POSITIVE_INFINITY;
        for (int i = 0, m =n.length; i < m; i++) {
            if (n[i] > max){
                max =n[i];
            }
            if (n[i]<min){
                min = n[i];
            }

        }
        System.out.println(max);
        System.out.println(min);




        int temp =n[1];
        n[1]=n[2];
        n[2]= temp;
    }
}
