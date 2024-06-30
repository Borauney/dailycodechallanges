package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

import static java.lang.reflect.Array.set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String... args) {
        System.out.println(car(cons(3, 4)));
        System.out.println(cdr(cons(3, 4)));
    }

    private static Function<Function<Pair, Integer>, Integer> cons(int a, int b) {
        return func -> func.apply(new Pair(a, b));
    }

    private static int car(Function<Function<Pair, Integer>, Integer> cons) {
        return cons.apply(pair -> pair.a);
    }

    private static int cdr(Function<Function<Pair, Integer>, Integer> cons) {
        return cons.apply(pair -> pair.b);
    }

    private static class Pair {
        int a;
        int b;
        public Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }





}
