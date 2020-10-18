package UnionFindpack;

public class QuickUnion {
    private int id[];
    private int node;

    QuickUnion(int n){
        node = n;
        id = new int[n];
        for(int i=0;i<n;i++)
        {
            id[i] = i;
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
            id[root_i] = root_j;
        }
    }
}
