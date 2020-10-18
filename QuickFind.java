package UnionFindpack;

public class QuickFind {
    private int id[];
    private int node;

    QuickFind(int n){
        id = new int[n];
        for(int i=0;i<n;i++)
        {
            id[i] = i;
        }
        node = n;
    }

    boolean connected(int i,int j){
        return id[i] == id[j];
    }

    void union(int i,int j){
        if(id[i] != id[j]){
            int prev = id[i];
            for(int k=0;k<node;k++)
            {
                id[k] = (id[k]==prev)?id[j]:id[k];
            }
        }
    }

}
