package com.mao.clazz.stack;

import com.mao.clazz.list.DoubleNode;

/**
 * @author MaoYongjie
 * @date 2022/1/29 14:30
 * @Description:
 */
public class ListStack<T> {

    private DoubleNode<T> p;

    private DoubleNode<T> last;

    private int capacity;

    public ListStack() {
        this.p = new DoubleNode<>();
        this.last = p;
        p.nextNode = null;
        this.capacity = 0;
    }

    public void pop() {
        if (p != last) {
            DoubleNode node = last.preNode;
            last.delThisNode();
            last = node;
            capacity--;
        }
    }

    public void push(T data) {
        last.insertAtRight(data);
        last = last.nextNode;
        capacity++;
    }

    public boolean isEmpty() {
        return p == last;
    }

    public int size() {
        return capacity;
    }

    public void printStack() {
        DoubleNode node = p;
        while (node.nextNode != null) {
            node = node.nextNode;
            System.out.print(node.getData() + " ");
        }
        System.out.println();
    }

}
