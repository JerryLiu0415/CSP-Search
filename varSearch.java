
import java.io.*;
import java.lang.String;
import java.util.ArrayList;
import CPS-Search.constraint;
import CPS-Search.Tree;


// Class for varSearch in CSP 

// X=t Y=t failure
//     Y=f Z=t solution
//         Z=f failure
// X=f Y=t Z=t failure
//         Z=f solution
//     Y=f failure

public class VarSearch {

    // a list of variables
	ArrayList<Integer> listOfVar = new ArrayList<Integer>(); 
    // a list of constraints
    ArrayList<constraint> listOfCon = new ArrayList<constraint>();
    // a stack for printing the variables in a DFS order
    Stack toPrint = new Stack();
	// a set of branches that lead to solution, i.e., all possible assignments
    List<ArrayList> solu = new List<ArrayList>();

	// Construct a varSearch
	public varSearch(ArrayList<Integer> listOfVar, ArrayList<constraint> listOfCon) {
        this.listOfVar = listOfVar;
        this.listOfCon = listOfCon;
	}

    // generate a tree for all the assignments of the variable
    // node key -> variable name; node data -> value assignment
    public Tree<T> genTree(ArrayList<Integer> listofVar, ArrayList<constraint> listOfCon){
        Tree<T> tree = new Tree<T>;
        return tree;
    }

    // print tree in DFS order
    public void printTree(Tree tree){
        return;
    }

    // get the solution by traversing the tree
    // returns a list of (list of nodes)
    public ArrayList<ArrayList<Node<T>>> getSolution(Tree<T> tree){
        
    }











}