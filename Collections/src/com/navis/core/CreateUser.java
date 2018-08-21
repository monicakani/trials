package com.navis.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.navis.core.User;

public class CreateUser{

    public static void main(String[] args)
    {
        User u1 = new User("Aman", "aman@navis.com");
        User u2 = new User("Dhruv", "dhruv@navis.com");
        User u3 = new User("Arjun", "arjun@navis.com");
        User u4 = new User("Surya", "surya@navis.com");
        User u5 = new User("Arvind", "arvind@navis.com");



        ArrayList <com.navis.core.User> list = new ArrayList<>();
        list.add(u1);
        list.add(u2);
        list.add(u3);
        //list.add(new String("Hello"));
        list.add(u5);
        //list.add(new Integer("10"));
        //list.add(new Double("10.234"));
        System.out.println(list.size()+"list");


        List<User> subList = list.subList(0, 3);
        System.out.println(subList.size()+" sublist");
        subList.add(new User("monica","mon@navis.com"));
        System.out.println(subList.size()+" modified sub");
        System.out.println(list.size()+" modi list");
        System.out.println("----------------------------------------");
        subList.remove(1);
        System.out.println(list.size()+" modi list2");
        System.out.println(subList.size()+" modified sub2");

       /* Object oref = list.get(3);
        System.out.println(oref);

        if(list.get(3) instanceof com.navis.core.User) {
            User ref = (User)list.get(3);
            System.out.println(ref.getUserName());
        }

        Iterator <User>iter = list.iterator(); //for each loop
        while(iter.hasNext()){
            System.out.println(iter.next().getUserName());
        }


        for(User u : list)
        {
           System.out.println(u.getUserName());
        }
        for(int i=0; i<list.size();i++){
            System.out.println(list.get(i).toString());
        } */
    }

}