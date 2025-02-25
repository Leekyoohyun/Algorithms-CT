package src.boj_lec.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class P11724 {
    static boolean visited[];
    static ArrayList<Integer>[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        visited = new boolean[N + 1];
        arr = new ArrayList[N+1];
        for(int i = 1; i<N+1; i++){
            arr[i] = new ArrayList<Integer>();
        }
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            arr[s].add(e);
            arr[e].add(s);
        }
        int count = 0;
        for(int i=1; i<N+1; i++){
            if(!visited[i]){
                count++;
                DFS(i);
            }
        }
        System.out.println(count);

    }

    private static void DFS(int v) {
        if(visited[v]) return;
        visited[v] = true;
        for(int i: arr[v]){
            DFS(i);
        }
    }
}
