package suen.rookie.algorithm;

/**
 * Created by bjhksun on 2016/9/21.
 */
public class BucketSort {

    /**
     * Ͱ����Ͱ����ҳ��죬���Ǻ�ռ�ÿռ䣬Ͱ�ĸ���ͨ����Ҫ��Ҫ��������ķ�ΧҪ����ΪҪʹ�ô����������Ϊ
     * Ͱ���±꣬�����ڶ�������������ʱ�򣬾�ֱ������Ӧ��Ͱ�м�1.��󵱴��������������Ͱ�к�ֻ��Ҫ����һ��Ͱ���ڵ����飬����ԡ�
     * �ɴ˿ɼ�Ͱ�����ռ�ÿռ䣬�����5����������������20000000���Ǿ���Ҫ���úܴ��Ͱ�����ˣ����������С�����͸�û�취Ū��
     */
    public static void main(String[] args){
        int[] a = new int[11];
        int[] score = {2,9,7,4,4,3,6};//�������ظ�������
        for (int i=0; i<score.length; i++){
            a[score[i]] += 1;
        }
        for (int i=0; i<a.length; i++){
            for (int j=1; j<=a[i]; j++){ //��ӡ�ظ�������
                System.out.println(i+";");
            }
        }
    }

}
