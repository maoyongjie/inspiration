package com.mao.clazz.list;

/**
 * @author MaoYongjie
 * @date 2022/1/29 9:42
 * @Description:
 */
public class MyLinkedListUtil {

    public static void revert(Node p){
        Node pre = p.nextNode;
        if(pre != null){
            Node node = pre.nextNode;
            pre.nextNode = null;
            while (node!=null){
                Node next = node.nextNode;
                node.nextNode = pre;
                pre = node;
                node = next;
            }
            p.nextNode=pre;
        }

    }
    public static void print(Node p){
        Node start = p.nextNode;
        while (start!=null){
            System.out.print(start.data+" ");
            start = start.nextNode;
        }
        System.out.println();
    }

    public static boolean detectCircleList(Node p){
        Node fast = p.nextNode;
        Node slow = p.nextNode;

        while (fast.nextNode != null){
            slow =slow.nextNode;
            fast = fast.nextNode.nextNode;
            if(slow == fast){
                return true;
            }
        }

        return false;
    }

}
