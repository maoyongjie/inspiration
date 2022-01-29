package com.mao.clazz.list;

/**
 * @author MaoYongjie
 * @date 2022/1/28 15:33
 * @Description:
 */
public class DoubleNode<T> {

    public DoubleNode<T> preNode;

    public DoubleNode<T> nextNode;

    private T data;

    public DoubleNode(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public DoubleNode() {
    }

    public void delThisNode() {
        this.preNode.nextNode = this.nextNode;
        if(this.nextNode != null){
            this.nextNode.preNode = this.preNode;
        }
    }

    public void insertAtLeft(T data) {
        DoubleNode<T> node = new DoubleNode<>(data);
        this.preNode.nextNode = node;
        node.preNode = this.preNode;
        node.nextNode = this;
        this.preNode = node;
    }

    public void insertAtRight(T data) {
        DoubleNode<T> node = new DoubleNode<>(data);
        if (this.nextNode == null) {
            this.nextNode = node;
            node.preNode = this;
            node.nextNode = null;
        } else {
            this.nextNode.insertAtLeft(data);
        }
    }
}
