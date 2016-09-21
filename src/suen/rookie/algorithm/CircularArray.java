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
        /*把数组当成环形来使用，下标可使用(i+1)%a.length的方式来确定，i为当前数组的下标*/
        for (int i=0; i<12; i++){
            a[i%a.length] = i;
        }
        System.out.println("-------------------------------------");
        for (int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }
    }

}
