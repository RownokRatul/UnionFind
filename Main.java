package UnionFindpack;

public class Main {
    public static void main(String args[]){
        WeightedQuickFindWithPathCompression qf = new WeightedQuickFindWithPathCompression(10);
        System.out.println(qf.connected(1,6));
        qf.union(0,1);
        qf.union(2,3);
        qf.union(4,5);
        qf.union(9,8);
        qf.union(9,7);
        qf.union(7,8);
        qf.union(6,7);
        System.out.println(qf.connected(1,6));
        System.out.println(qf.connected(2,8));
        qf.union(2,8);
        System.out.println(qf.connected(2,8));
        System.out.println(qf.connected(9,5));
        System.out.println(qf.connected(9,2));
    }
}
