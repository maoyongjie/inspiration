import com.mao.clazz.list.DoubleNode;
import com.mao.clazz.list.MyLinkedListUtil;
import com.mao.clazz.list.Node;
import com.mao.clazz.stack.ArrayStack;
import com.mao.clazz.stack.ListStack;
import org.junit.Test;

/**
 * @author MaoYongjie
 * @date 2022/1/28 15:37
 * @Description:
 */

public class Mytest {

    @Test
    public void test_1() {
        Node<Integer> p = new Node<>();
        Node<Integer> node = new Node<>(1);
        p.nextNode = node;
        Node<Integer> start = new Node<>();
        int i = 10;

        for (int m = 2; m <= i; m++) {
            node.nextNode = new Node<>(m);
            node = node.nextNode;
            if(m == 5){
                start = node;
            }
        }

        node.nextNode = start;

        System.out.println(MyLinkedListUtil.detectCircleList(p));

//        MyLinkedListUtil.print(p);
    }

    @Test
    public void test_2() {
        DoubleNode<Integer> start = new DoubleNode<>(0);
        final DoubleNode<Integer> p = new DoubleNode<>();

        p.nextNode = start;
        start.preNode = p;
        DoubleNode<Integer> point = start;

        for (int i = 1; i <= 10; i++) {
            point.nextNode = new DoubleNode<>(i);
            DoubleNode<Integer> pre = point;
            point = point.nextNode;
            point.preNode = pre;
        }

        point.nextNode = null;

        while (start != null && start.getData() != 10) {
            start = start.nextNode;
        }

        if (start != null) {
            start.delThisNode();
        }

        start = p.nextNode;

        while (start != null) {
            System.out.println(start.getData());
            start = start.nextNode;
        }

    }

    @Test
    public void testArrayStack() throws Exception {
        ArrayStack<Integer> stack = new ArrayStack<>(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        stack.push(4);

        System.out.println(stack.getTopElement());
        stack.printStack();
    }

    @Test
    public void testListStack(){
        ListStack<Integer> stack = new ListStack<>();
        stack.push(1);
        stack.pop();
        stack.push(2);
        stack.pop();
        stack.push(3);
        stack.pop();
        stack.push(4);
        stack.pop();
        stack.printStack();
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
    }
}
