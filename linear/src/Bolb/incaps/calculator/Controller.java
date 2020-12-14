package Bolb.incaps.calculator;

public class Controller {
    int zx (int a, int s) {
        return a+s;
    }
    int dif (int a, int s){
        return a-s;
    }
    int b (int a ,int s){
        return a*s;
    }
    double n (int a, int s) {
        if (s != 0) {
            return (double) a / s;
        }else {
            return 0;
        }

    }
}
