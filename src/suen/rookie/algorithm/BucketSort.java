package suen.rookie.algorithm;

/**
 * Created by bjhksun on 2016/9/21.
 */
public class BucketSort {

    /**
     * 桶排序，桶排序灰常快，但是很占用空间，桶的个数通常是要比要排序的数的范围要大，因为要使用待排序的数作为
     * 桶的下标，这样在读入待排序的数的时候，就直接在相应的桶中加1.最后当待排序的数都读入桶中后，只需要便利一边桶所在的数组，便可以。
     * 由此可见桶排序很占用空间，如果就5个数，但是最大的是20000000，那就需要设置很大的桶数组了，而且如果是小数，就更没办法弄了
     */
    public static void main(String[] args){
        int[] a = new int[11];
        int[] score = {2,9,7,4,4,3,6};//包含了重复的数字
        for (int i=0; i<score.length; i++){
            a[score[i]] += 1;
        }
        for (int i=0; i<a.length; i++){
            for (int j=1; j<=a[i]; j++){ //打印重复的数字
                System.out.println(i+";");
            }
        }
    }

}
