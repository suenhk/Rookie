package suen.rookie.algorithm;

/**
 * Created by bjhksun on 2016/9/23.
 * 递归的用法，自身可以理解，但是遇到复杂情况自己写还有些困难。
 */
public class Search {

    public static int[] book = new int[5];
    public static int[] t = new int[30];

    public static void main(String[] args){
        dfs(1);
    }

    //深度优先搜索
    public static void dfs(int step){

        if (step == 4){
            for (int i=1; i<=3; i++){
                System.out.print(t[i]);
            }
            System.out.println();
            return;
        }

        for (int i=1; i<4; i++){
            if(book[i] == 0){
                book[i] = 1;
                t[step] = i;
                dfs(step+1);//此处最先写了step++，在当成参数传递给函数时，step++传入函数中的是step没有加1的值，执行函数后，跳回本体的时候step才会加1,；而++step则是传入函数时就会加1，跳回本体函数后也是加1的状态
                book[i] = 0;
            }
        }

    }

    //广度优先搜索，迷宫问题，当然同样可以使用dfs的方法来搜索。
    public static void bfs(){





    }

}
