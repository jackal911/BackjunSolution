import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Queue;

public class Q1260 {
    static int N;
    static int M;
    static int V;
    static int[][] linked;
    static int[] visited;

    public static void dfs(int start){
        visited[start] = 1;
        System.out.print(start + " ");

        for(int k=1;k<=N;k++){
            if(linked[start][k] == 1 && visited[k] == 0){
                dfs(k);
            }
        }
    }
    public static void main(String[] args) throws IOException { // DFS와 BFS
        Queue<Integer> queue = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);
        V = Integer.parseInt(input[2]);
        linked = new int[N+1][N+1];
        visited = new int[N+1];
        for(int i=0;i<M;i++){
            String[] linkInput = br.readLine().split(" ");
            int from = Integer.parseInt(linkInput[0]);
            int to = Integer.parseInt(linkInput[1]);
            linked[from][to] = 1;
            linked[to][from] = 1;
        }

        dfs(V);

        System.out.println();

        for(int i=0;i<=N;i++){ // 방문 초기화
            visited[i] = 0;
        }

        //bfs();
        queue.add(V);
        visited[V] = 1;
        int curPoint;
        for(int j=0;j<N;j++){
            if(!queue.isEmpty()) {
                curPoint = queue.remove();
            }else{
                break;
            }
            System.out.print(curPoint);
            for(int k=1;k<=N;k++){
                if(linked[curPoint][k] == 1 && visited[k] == 0){
                    queue.add(k);
                    visited[k] = 1;
                }
            }
            if(j!=N-1) {
                System.out.print(" ");
            }
        }
    }
}
