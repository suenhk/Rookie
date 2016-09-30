package suen.rookie.structure;

/**
 * Created by bjhksun on 2016/9/29.
 */
public class Heap {

    public static int[] a = {0, 99, 5, 36, 7, 22, 17, 46, 12, 2, 19, 25, 28, 1, 92};

    public static void main(String[] args){

        for (int i=1; i<a.length; i++){
            createheap();
        }
    }

    public static void shiftheap(int n){
        int t = n/2;
        int cur = 0;
        for (int i=t; i>=1; i--){
            cur = i;
            if (a[i]>a[2*i]){
                cur = 2*i;
            }
            if (2*i+1<=n && a[cur]>a[2*i+1]){
                cur = 2*i+1;
            }
            swap(cur, i);
        }
    }

    public static void swap(int cur, int i){
        if (cur!=i){
            int t;
            t = a[cur];
            a[cur] = a[i];
            a[i] = t;
        }
    }

    public static void createheap(){
        int t, n=a.length-1;
        shiftheap(n);
        t = a[1];
        a[1]=a[n];
        n--;

        System.out.print(t+"：");
    }

}
