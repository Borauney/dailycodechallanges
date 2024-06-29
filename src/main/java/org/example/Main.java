package org.example;

import java.util.ArrayList;
import java.util.List;

import static java.lang.reflect.Array.set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(15);
        list.add(3);
        list.add(3);

        boolean result = twosum(list,17);
        System.out.println(result);
        
    }

    public static boolean twosum(List<Integer>list,int k){

        for (int i =0; i<list.size();i++){

            for(int j=0 ; j<list.size();j++){

                if(list.get(i)==k || list.get(i)+list.get(j)==k ){
                    return true;
                }
 gi
            }
        }
        return  false;
    }

}