package Pr14;

public class Dispatcher {
    public static void main(String[] args) {

        Model m1 = new Model();
        Model m2 = new Model();

        m1.x=5;
        m1.y=8;
        m2.x=-93;
        m2.y=27;

        Controller c = new Controller();

        int sum = c.add(m1.x,m1.y);
        int substract = c.substract(m1.x,m1.y);
        int multiply = c.multiply(m1.x,m1.y);
        double div = c.div(m1.x,m1.y);

        View v = new View();

        v.displayInt(sum);
        v.displayInt(substract);
        v.displayInt(multiply);
        v.displayDouble(div);
    }
}
