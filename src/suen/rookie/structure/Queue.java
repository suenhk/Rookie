package suen.rookie.structure;

/**
 * Created by bjhksun on 2016/9/21.
 * 使用数组实现队列，注意所谓的尾指针要指向最后元素的下一个位置。使用head==tail来判断队列的结束。
 */
public class Queue {

    public static void main(String[] args){
        int[] a = new int[20];
        int[] t = {6,3,1,7,5,8,9,2,4};
        int head=0, tail=1;
        for (int i=0; i<t.length; i++){
            a[i] = t[i];
        }

        tail = t.length;
        while (head!=tail && tail<a.length){
            if (head%2 != 0){
                a[tail] = a[head];
                tail++;
                a[head] = 0;
                head++;
            }else {
                head++;
            }
        }

        for (int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }
    }

}
