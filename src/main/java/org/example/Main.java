package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.lang.reflect.Array.set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(0);
        

        int result = questionthree(list);
        System.out.println(result);
        
    }

    public static int questionthree(List<Integer>list) {
        Collections.sort(list);
        int needed =0;
        for (int i =0; i<list.size();i++){

            if(list.get(i)>0 && !list.contains(needed)){
               return needed = list.get(i)+1;
            }
        }

        return  list.getLast()+1;


    }


}
