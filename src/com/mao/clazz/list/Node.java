package com.mao.clazz.list;

/**
 * @author MaoYongjie
 * @date 2022/1/28 15:34
 * @Description:
 */
public class Node<T> {

    public Node<T> nextNode;

    public T data;

    public Node(T data) {
        this.data = data;
    }

    public Node() {
    }

    public void insertAtRight(T data){
        Node<T> node = new Node<>(data);
        Node next = this.nextNode;
        this.nextNode = node;
        node.nextNode = next;
    }

    public void deleteThisNode(){

    }
}
