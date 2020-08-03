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

//        LinkedList list = new LinkedList();
//        list.addLast(10);
//        list.addLast(20);
//        list.addLast(30);
////        list.removeFirst();
//        list.removeLast();
//        System.out.println(list.indexOf(50));
//        System.out.println(list.contains(50));

        Stack numbersStack = new Stack(5);
        numbersStack.Push(10);
        numbersStack.Push(20);
        numbersStack.Push(30);
        numbersStack.Push(40);
        System.out.println(numbersStack.Peak());
        numbersStack.Pop();
        System.out.println(numbersStack.Peak());




    }
}
