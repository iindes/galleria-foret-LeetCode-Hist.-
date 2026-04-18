class Solution {
    public boolean validTree(int n, int[][] edges) {
        if (edges.length != n-1) {
            return false;
        }

        int[] par = new int[n];
        int[] rank = new int[n];
        for (int i = 0; i < n; i++) {
            par[i] = i;
        }

        for (int[] edge: edges) {
            int r1 = find(par, edge[0]);
            int r2 = find(par, edge[1]);
            if (r1 == r2) {
                return false;
            }
            union(par, rank, r1, r2);
        }
        return true;
    }
    private int find(int[] par, int x) {
        if (par[x] != x) {
            par[x] = find(par, par[x]);
            
        }
        return par[x];
    }
    private void union(int[]par, int[] rank, int a, int b) {
        if (rank[a] > rank[b]) {
            par[b] = a;
        }
        else if (rank[a] < rank[b]) {
            par[a] = b;
        }
        else {
            par[b] = a;
            rank[a]++;
        }
    }
}