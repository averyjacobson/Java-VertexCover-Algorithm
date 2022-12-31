import java.io.*;
import java.util.*;


public class Driver {

    public static void main(String[] args){

        long startTime, endTime, duration;
        GraphToolBox GTB = new GraphToolBox();
        Graph graph1 = new Graph("graph1.txt"); //length 450
        Graph graph2 = new Graph("graph2.txt"); //length 945
        Graph graph3 = new Graph("graph3.txt"); //length 1272
        Graph graph4 = new Graph("graph4.txt"); //length 1534
        Graph graph5 = new Graph("graph5.txt"); //length 5
        Graph graph6 = new Graph("graph6.txt"); //length 18
        Graph graph7 = new Graph("graph7.txt"); //length 25
        Graph graph8 = new Graph("graph8.txt"); //length 20
        Graph graph9 = new Graph("graph9.txt"); //length 19

        System.out.println(Arrays.toString(GTB.exactVC(graph7)));
        System.out.println(Arrays.toString(GTB.inexactVC(graph7)));
        System.out.println(Arrays.toString(GTB.optimalIS(graph7)));
        System.out.println(Arrays.toString(GTB.inexactIS(graph7)));



    }
    
}
