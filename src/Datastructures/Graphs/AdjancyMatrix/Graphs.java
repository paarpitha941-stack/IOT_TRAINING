package Datastructures.Graphs.AdjancyMatrix;

public class Graphs {
    int v;
    int[][] adjMatrix;
    Graphs(int vertices){
       v=vertices;
        adjMatrix=new int[v][v];
    }
    void addedge(int u,int v){//int weight and int directions can be added
       adjMatrix[u][v]=1; //this is for undirected graph and unweighted
//       if(direction==1){adjMatrix[v][u]=1; }//for direction and weighted
       adjMatrix[v][u]=1;
    }
    void printadjmat(){
        for(int i=0;i<v;i++){
            for(int j=0;j<v;j++){
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
 class drivercode{
    public static void main(String[] args) {
        Graphs g=new Graphs(6);

        g.addedge(0,1);
        g.addedge(0,4);
        g.addedge(0,5);
        g.addedge(1,2);
        g.addedge(1,3);
        g.addedge(1,4);
        g.addedge(2,3);
        g.addedge(3,4);
        g.addedge(4,5);
        g.printadjmat();
    }
 }