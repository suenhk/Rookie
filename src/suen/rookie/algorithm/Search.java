package suen.rookie.algorithm;

/**
 * Created by bjhksun on 2016/9/23.
 * 递归的用法，自身可以理解，但是遇到复杂情况自己写还有些困难。
 */
public class Search {

    public static int[] book = new int[100];
    public static int[] t = new int[30];
    public static int[][] net = {{0,0,0,0,0,0},{0,0,1,1,0,1},{0,1,0,0,1,0},{0,1,0,0,0,0},{0,0,1,0,0,0},{0,1,0,0,0,0}};
    public static int que[] = new int[10];//访问的顶点序号队列。

    public static void main(String[] args){
        bfs();
    }

    //深度优先搜索，全排列
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

    //广度优先搜索。主要是采用队列的形式记录，如果需要记录步数，可以在用另外增加一个数组记录。
    public static void bfs(){

        int head=1,tail=1, cur=1, n=5;
        que[tail] = 1;
        book[tail] = 1;
        tail++;

        while (head < tail){
            cur = que[head];
            for (int i=1; i<=n; i++){
                if (net[cur][i]>0 && book[i]==0){
                    book[i]=1;
                    que[tail]=i;
                    tail++;
                }
                if (tail>n){
                    break;
                }
            }
            head++;//这里是一个顶点扩展完之后需要前进一个扩展点的地方。
        }

        for (int i=1; i<=n; i++){
            System.out.println(que[i]);
        }

    }

}
