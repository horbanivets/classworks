package massivy.Lesson25;

public class Main2 {
    public static void main(String[] args) {
        int[] n = {23,5,74,26,1};
        for (int i = 0,a = n.length; i < a; i++) {
            System.out.println(n[i]);
        }
        int sum = 0;
        int cr = 0;
        for (int i = 0,a = n.length; i < a; i++){
            sum = sum + n[i];
            cr = sum/n.length;

        }
        System.out.println(sum);
        System.out.println(cr);


    }
}
