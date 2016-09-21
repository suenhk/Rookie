package suen.rookie.algorithm;

/**
 * Created by bjhksun on 2016/9/21.
 */
public class QuickSort {

    int[] a = {6,1,2,7,9,3,4,5,10,8};
    public static void main(String[] args){

        QuickSort qs = new QuickSort();
        qs.test(0, 9);
        for (int i=0; i<qs.a.length; i++){
            System.out.println(qs.a[i]);
        }

    }

    public void test(int i, int j){
        if(i>j){ //递归的程序一定要有结束条件
            return;
        }

        int left = i, right = j;
        int t = a[i];
        int temp;
        while (left<right){
            while (a[right]>t && right>left){
                right--;
            }
            while (a[left]<=t && left<right){
                left++;
            }
            if (left<right){
                temp=a[left];
                a[left]=a[right];
                a[right]=temp;
            }
        }
        //将基准数归位
        a[i] = a[left];
        a[left] =t;
        //递归的进行左右排序，这时要排除基准数
        test(i, left-1);
        test(left+1, j);
    }

}
