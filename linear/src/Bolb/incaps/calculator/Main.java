package Bolb.incaps.calculator;

import java.lang.reflect.MalformedParameterizedTypeException;

public class Main {
    public static void main(String[] args) {
        Model m1= new Model();
        m1.z= 50;
        m1.x =45;
        Model m2 = new Model();
        m2.z = 60;
        m2.x = 55;
        Controller c = new Controller();
        int sun = c.zx(m1.z,m1.x);
        System.out.println("Sum: "+sun);
        View v =new View();
        v.res(sun);
        System.out.println("\n");
        int raz = c.dif(m1.z,m1.x);
        System.out.println("Raz: "+raz);

        int ym = c.b(m2.z,m2.x);
        System.out.println("Ymn: "+ym);

        double del = c.n(m2.z,m2.x);
        System.out.println("Del: "+del);
    }
}
