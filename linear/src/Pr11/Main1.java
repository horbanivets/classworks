package Pr11;

public class Main1 {
    public static void main(String[] args) {
    int[] m ={-9,-8,67,34,5,-17,55,29};
    int min = (int)Double.POSITIVE_INFINITY;
    int max = (int)Double.NEGATIVE_INFINITY;
    int maxI = -1,minI = -1;

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
    int[] m1=new int[m.length -2];
    int j=0;
    for (int i = 0, n = m.length; i < n; i++) {
        if(i==minI | i== maxI){
            j++;
        }else{
            m1[i-j]=m[i];
        }
    }
    for (int t:m) {
        System.out.print(" "+t);
    }
    System.out.println();
    for (int t:m1) {
        System.out.print(" "+t);
    }
}
}
