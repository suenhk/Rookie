package suen.rookie.structure;

/**
 * Created by bjhksun on 2016/9/22.
 */
public class LinkedList {

    public Node<Integer> current;//��ǰ�����β���������¶����ʱ��ʹ�á�
    public Node<Integer> head;//�����ͷ��һ�㵥������head����Զָ�������ײ��������ǰ�����������
    public Node<Integer> t;//�ڱ��������ʱ�����headʹ��

    public void addNode(Node<Integer> node){
        if (head==null){
            head = node;
            current = node;
        }else{
            current.next = node;
            current = node;
        }
    }


    public static void main(String[] args){
        LinkedList list = new LinkedList();
        for (int i=10; i>0; i--){
            Node<Integer> node = new Node<Integer>(i);
            list.addNode(node);
            i--;
        }

        list.t = list.head;
        while (list.t!=null){
            System.out.println(list.t.data);
            list.t = list.t.next;
        }
    }

}

class Node<T>{
    T data;
    Node<T> next;

    Node(T data){
        this.data = data;
        this.next = null;
    }
}
