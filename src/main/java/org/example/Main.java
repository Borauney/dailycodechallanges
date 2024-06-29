package org.example;

import java.util.ArrayList;
import java.util.List;

import static java.lang.reflect.Array.set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        ArrayList<Integer> result = questiontwo(list);
        System.out.println(result);
        
    }

    public static ArrayList<Integer> questiontwo(List<Integer>list){
        ArrayList<Integer> result = new ArrayList<>();
        result.addAll(list);

        for(int i=0; i<list.size();i++){
            int product=1;
            for(int j=0; j<list.size();j++){
                    if(i!=j){
                        product*=list.get(j);

                }
            }
            result.set(i,product);
        }
        return  result;

    }

}
