package Pr9.Main1;

public class Main {
    public static void main(String[] args) {
        int[] m ={3,9,1,65,-3,67};
        int max = (int)Double.NEGATIVE_INFINITY;
        int min = (int)Double.POSITIVE_INFINITY;
        for (int i = 0, n =m.length; i < n; i++) {
            if (m[i] > max){
                max =m[i];
            }
            if (m[i]<min){
                min = m[i];
            }

        }
        System.out.println(max);
        System.out.println(min);

    }
}
