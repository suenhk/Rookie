package suen.rookie.structure;

/**
 * Created by bjhksun on 2016/9/21.
 * ʹ������ʵ�ֶ��У�ע����ν��βָ��Ҫָ�����Ԫ�ص���һ��λ�á�ʹ��head==tail���ж϶��еĽ�����
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
