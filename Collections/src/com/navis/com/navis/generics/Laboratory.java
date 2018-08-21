package com.navis.com.navis.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Laboratory {

    public static void main(String[] args)
    {
        Living l = new Living();
        Animals a = new Animals();
        Plant p = new Plant();
        Dog d = new Dog();

        Living l1=new Animals();
        Living l2=new Plant();
        Living l3=new Dog();

      //  Animals a1 = new Living();

        Living lAry[] = new Animals[2];

        List<Animals> al = new ArrayList<Animals>();
        al.add(new Dog());
        al.add(new Animals());

        System.out.println(al);
        method(al);
        ArrayList <Animals> alll= new ArrayList<Animals>();
       // method2(alll);

    }

    //When u tell the type it makes sure its an object of the user type and not upcasted to Object type.
    static void method2(List <?> list) {

    }
    //Dog is  the upperbound. ? is the wildcard. if "? super Dog" then Dog lowerbound.
    //Itll accept anything above dog. in case of super. else anything below dog if its extends.
    static void method(List<? extends Living> list)
    {
        System.out.println(list.get(1)+"from method");
      //  list.add(new Dog());
    }
    static void m3(List<? super Dog> list)
    {
        list.add(new Dog());
    }


}
