package com.navis.model;
import java.util.*;
public class CreateModel {

    public static void main(String[] args)
    {

        Che cheRef = new Che();
        Che cheRef1 = new Che();
        Che cheRef2 = new Che();
        Che cheRef3 = new Che();
        Che cheRef4 = new Che();

        Container conRef = new Container();
        conRef.setcId("101");
        Container conRef1 = new Container();
        conRef1.setcId("102");
        Container conRef2 = new Container();
        conRef2.setcId("102");
        Container conRef3 = new Container();
        conRef3.setcId("104");
        Container conRef4 = new Container();
        conRef4.setcId("105");

        HashSet<Container> containerSet = new HashSet<>();
        containerSet.add(conRef);
        containerSet.add(conRef1);
        containerSet.add(conRef2);
        containerSet.add(conRef2);
        containerSet.add(conRef3);
        containerSet.add(conRef4);

        System.out.println(containerSet);

        TreeSet<Container> tree = new TreeSet<>();
        tree.add(conRef);
        tree.add(conRef1);
        tree.add(conRef2);
        tree.add(conRef3);
        tree.add(conRef4);

        System.out.println(tree.size());

        System.out.println(tree);

        HashMap<String,String> pairs = new HashMap<>();
        pairs.put("Rose","Jack");
        pairs.put("Juliet","Romeo");
        pairs.put("Laila","Majnu");
        pairs.put("Heer","Ranjha");

        System.out.println(pairs.get("Heer"));
        System.out.println("-----------------------------------------------");
        Set keys = pairs.keySet();
        System.out.println(keys);
        System.out.println("-----------------------------------------------");
        Collection values = pairs.values();
        System.out.println(values);
        System.out.println("-----------------------------------------------");
        Set ent = pairs.entrySet();
        System.out.println(ent);
        System.out.println("-----------------------------------------------");
        Iterator it = keys.iterator();
        while(it.hasNext())
        {
            System.out.println(pairs.get(it.next()));
        }

        Vessel vesRef = new Vessel();
        Vessel vesRef1 = new Vessel();
        Vessel vesRef2 = new Vessel();
        Vessel vesRef3 = new Vessel();
        Vessel vesRef4 = new Vessel();

        List coll = new ArrayList(containerSet);
        System.out.println(Collections.binarySearch(coll, conRef));
        //System.out.println(Collections.);
    }
}
