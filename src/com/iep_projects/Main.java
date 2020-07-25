package com.iep_projects;

public class Main {

    public static void main(String[] args) {
//        Array numbers = new Array(3);
//        numbers.insert(10);
//        numbers.insert(20);
//        numbers.insert(30);
//        numbers.insert(40);
//        numbers.removeAt(1);
//        numbers.print();
//        System.out.println(numbers.indexOf(40));

        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
//        list.removeFirst();
        list.removeLast();
        System.out.println(list.indexOf(50));
        System.out.println(list.contains(50));


    }
}
