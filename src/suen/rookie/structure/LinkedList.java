package suen.rookie.structure;

/**
 * Created by bjhksun on 2016/9/22.
 */
public class LinkedList {

    public Node<Integer> current;//当前链表的尾部，加入新对象的时候使用。
    public Node<Integer> head;//链表的头，一般单项链表，head的永远指向链表首部，方便从前到后便利链表。
    public Node<Integer> t;//在便利链表的时候，替代head使用

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
