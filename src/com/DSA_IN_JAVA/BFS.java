package com.DSA_IN_JAVA;

import java.util.*;

class Solution {
    public void bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        Queue<Integer> str = new LinkedList<Integer>();
        ArrayList<Integer> ans = new ArrayList<>();
        int[] f = new int[V];
        Arrays.fill(f,0);
        str.add(0);
        while(str.size() != 0){
            int p = str.peek();
            str.poll();
            ans.add(p);
            f[p] = 1;
            for(int i = 1 ; i  < V ; i++){
                if(adj.get(p).get(i) == 1 && f[i] == 0){
                    str.add(i);
                    f[i] = 1;
                }
            }
        }
        for(Integer a : ans)
            System.out.print(a + " ");
    }
}
public class BFS {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();
        ArrayList<ArrayList<Integer> > arr = new ArrayList< >();
        for(int i = 0 ; i < v; i++){
            arr.add(new ArrayList<>());
            for(int j  = 0 ; j < e ; j++){
                int val = sc.nextInt();
                arr.get(i).add(val);
            }
        }
        Solution s = new Solution();
        s.bfsOfGraph(v,arr);

    }
}
