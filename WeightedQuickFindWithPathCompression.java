package UnionFindpack;

public class WeightedQuickFindWithPathCompression {
    private int id[];
    private int sz[];
    private int node;

    WeightedQuickFindWithPathCompression(int n) {
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
        int record[] = new int[node+5],top = 0;
        while(rt != id[rt])
        {
            record[top++] = rt; // PATH COMPRESSION step 1
            record[top++] = id[rt];
            rt = id[id[rt]]; // PATH COMPRESSION step 2
        }
        while(top > 0)
        {
            id[record[--top]] = rt;
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
