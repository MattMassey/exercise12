package com.company.week1;
import java.util.*;

//Matthew Massey, 4/15/2019
//Program demonstrates generics

public class Main {
    public static void main(String[] agrs) {
        Queue<String> strings = new Queue<>();
            strings.enqueue("Hello");
            strings.enqueue("World");
            System.out.println(strings.dequeue());
            System.out.println(strings.dequeue());

    }
}

class Queue<E> {
    private ArrayList<E> elements = new ArrayList<>();

    void enqueue(E element ) {
        elements.add(element);
    }

    E dequeue () {
        E element = elements.get(0);
        elements.remove(0);
        return element;
    }
}
