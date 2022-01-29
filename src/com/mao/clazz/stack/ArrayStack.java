package com.mao.clazz.stack;

/**
 * @author MaoYongjie
 * @date 2022/1/29 10:52
 * @Description:
 */
public class ArrayStack<T> {

    private int loc;

    private int capacity;

    private T[] array;

    public ArrayStack(int capacity) {
        this.loc = -1;
        this.capacity = capacity;
        this.array = (T[]) new Object[capacity];
    }

    public void pop() {
        if (loc >= 0) {
            loc--;
        }

    }

    public void push(T data) throws Exception {
        if (loc >= capacity - 1) {
            throw new Exception("The stack is full !");
        } else {
            array[++loc] = data;
        }
    }

    public boolean isEmpty() {
        return loc == -1;
    }

    public int size(){
        return loc+1;
    }

    public T getTopElement(){
        return array[loc];
    }

    public void printStack(){
        for (int i = loc; i >=0 ; i--) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

}
