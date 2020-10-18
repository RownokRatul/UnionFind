package UnionFindpack;

public class WeightedQuickUnion {
    private int id[];
    private int sz[];
    private int node;

    WeightedQuickUnion(int n){
        node = n;
        id = new int[n];
        sz = new int[n];
        for(int i=0;i<n;i++)
        {
            id[i] = i;
            sz[i] = 1;
        }
    }
    int root(int nd){
        int rt = nd;
        while(rt != id[rt])
        {
            rt = id[rt];
        }
        return rt;
    }
    boolean connected(int i,int j){
        return root(i) == root(j);
    }
    void union(int i,int j){
        int root_i = root(i);
        int root_j = root(j);
        if(root_i != root_j)
        {
            if(sz[root_i] > sz[root_j])
            {
                id[root_j] = root_i;
                sz[root_i] += sz[root_j];
            }
            else
            {
                id[root_i] = root_j;
                sz[root_j] += sz[root_i];
            }
        }
    }
}
