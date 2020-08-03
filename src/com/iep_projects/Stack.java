package com.iep_projects;

import java.util.EmptyStackException;

public class Stack {
    private int maxSize;
    private int[] stackData;
    private int top;

    public Stack(int maxSize){
        this.maxSize = maxSize;
        stackData = new int[maxSize];
        top = -1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == maxSize - 1;
    }

    public int Peak(){
        if (!isEmpty())
            return stackData[top];
        else
            return -1;
    }

    public void Push(int item){
        if (!isFull()) {
            top++;
            stackData[top] = item;
        }
//        else
//            throw new StackOverflowError();
    }

    public int Pop(){
        int pop;
        if (isEmpty())
            throw new EmptyStackException();
        else{
            pop = stackData[top--];
            return pop;
        }
    }
}
