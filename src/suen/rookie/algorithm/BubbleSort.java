package suen.rookie.algorithm;

/**
 * Created by bjhksun on 2016/9/21.
 */
public class BubbleSort {

    public static void main(String[] args){
        int[] a = {12,6,3,29,57,28,15,7,45,21};
        int temp;
        for (int i=1; i<a.length; i++){
            for (int j=0; j<a.length-i; j++){
                if (a[j] < a[j+1]){
                    temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }
    }

}
