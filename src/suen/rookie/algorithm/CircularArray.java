package suen.rookie.algorithm;

/**
 * Created by bjhksun on 2016/9/20.
 */
public class CircularArray {

    public static void main(String[] args){
        System.out.println("testing");
        test();
    }

    public static void test(){
        int[] a = new int[8];
        for (int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }
        /*�����鵱�ɻ�����ʹ�ã��±��ʹ��(i+1)%a.length�ķ�ʽ��ȷ����iΪ��ǰ������±�*/
        for (int i=0; i<12; i++){
            a[i%a.length] = i;
        }
        System.out.println("-------------------------------------");
        for (int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }
    }

}
