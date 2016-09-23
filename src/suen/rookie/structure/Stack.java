package suen.rookie.structure;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by bjhksun on 2016/9/22.
 * 使用数组来实现栈，需要一个数组和一个指向数组末尾的top指针。
 */
public class Stack {

    public static void main(String[] args){
        symbolmatch();
    }

    public static void symbolmatch(){
        Map<Character, Character> map = new HashMap<Character, Character>();
        map.put('{','}');
        map.put('[','[');
        map.put('(',')');
        char[] a = {'{','(','[',']',')','[',']','}'};
        char[] t = new char[9];
        int top=0;
        for (int i=0; i<a.length; i++){
            if (top>0){
                if (map.get(t[top-1])==a[i]){
                    --top;
                }

            }else{
                t[top++] = a[i];
            }

        }
        if (top==0){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }

    public static void palindrome(){
        char[] a = {'a','h','a','a','t','a'};
        char[] t = new char[6];

        int mid = a.length/2-1;
        int top = 0;
        int next = 0;
        if (a.length%2 == 0){
            next = mid+1;
        }else {
            next = mid +2;
        }
        for (int i=0; i<=mid; i++){
            t[top++] = a[i];
        }
        System.out.println("top:"+top);
        for (int i=next; i<a.length; i++){
            if (a[i]!=t[top-1]){
                break;
            }
            top--;
        }

        if(top==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

}
