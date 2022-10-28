package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<LinkedList<Integer>> input = new LinkedList<>();
        LinkedList<Integer> first = new LinkedList<>();
        LinkedList<Integer> second = new LinkedList<>();
        LinkedList<Integer> third = new LinkedList<>();
        LinkedList<Integer> fourth = new LinkedList<>();
        first.add(1);first.add(7);first.add(4);first.add(3);first.add(2);first.add(5);
        second.add(4);second.add(9);second.add(8);second.add(6);second.add(0);second.add(2);
        third.add(14);third.add(-2);third.add(7);
        fourth.add(2);
        input.add(first);input.add(second);input.add(third);input.add(fourth);

        //Printing original list
        System.out.println(input);

        //Printing modified list
        System.out.println(flatten(input));

        //Checking if original component lists are emptied
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);
    }

    public static LinkedList<Integer> flatten (LinkedList<LinkedList<Integer>> input)
    {
        LinkedList<Integer> result = new LinkedList<>();
        for(LinkedList<Integer> el: input)
        {
            result.addAll(el);
            el.clear();
        }
        return result;
    }
}
