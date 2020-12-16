package Pr58lesson.Packet1;

import Pr58lesson.Packet2.Dog;

public class Dispatcher {
   private int x1;
   public int x2;
   static int x3;
   protected int x4;

    public static void main(String[] args) {
        Cat c = new Cat();
        Dog d = new Dog();
        /*//Cat
        System.out.println(c.z1);
        System.out.println(c.z2);
        System.out.println(c.z3);//error приват только в предал класа
        System.out.println(c.z4);
        // Animal (Cat extends Animal)
        System.out.println(c.a1); //error другой пакет
        System.out.println(c.a2);
        System.out.println(c.a3); //error другой клас
        System.out.println(c.a4); //error другой пакет
        //Dog
        System.out.println(d.c1); //error default другой пакет
        System.out.println(d.c2); //public
        System.out.println(d.c3); //error private другой пакет и клас
        System.out.println(d.c4); //error protected другой пакет
        // Animal (Dog extends Animal)
        System.out.println(d.a1); //error другой пакет
        System.out.println(d.a2); //
        System.out.println(d.a3); //error другой клас
        System.out.println(d.a4); //error другой пакет*/


    }
}
