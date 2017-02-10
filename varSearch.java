
import java.io.*;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;


// Class for varSearch in CSP 

// X=t Y=t failure
//     Y=f Z=t solution
//         Z=f failure
// X=f Y=t Z=t failure
//         Z=f solution
//     Y=f failure

public class varSearch {

    // A list of variable domains (as 2d array)
    // domains[0] returns the domain of variable "A" (as 1d array)
	ArrayList<ArrayList> domains = new ArrayList<ArrayList>();
    // A list of constraints
    ArrayList<constraint> constraints = new ArrayList<constraint>();
    // Global variable to collect solutions
    // A solution is a 1d array (node)
    ArrayList<ArrayList> solutions = new ArrayList<ArrayList>();
    
    
    //======================= Probably not needed
    // a stack for printing the variables in a DFS order
    //Stack toPrint = new Stack();
	// a set of branches that lead to solution, i.e., all possible assignments
    //List<ArrayList> solu = new List<ArrayList>();
    //======================= Probably not needed

	// Construct a varSearch
    // The search obj needs to know the set of domains and constriants
	public varSearch(ArrayList<ArrayList> domains, ArrayList<constraint> constraints) {
        this.domains = domains;
        this.constraints = constraints;
	}
    
    // Recursively assign value to variables
    // If it reaches depth k where k = # of vairables and consistent, store the sol
    // If some constraints are violated, return without going deeper
    // Search takes a node, which is a current assignment of the variables
    // node is represented as 1d array, where node[0] gives the value of variable A
    // Search need to keep track of the current depth
    public void search(ArrayList<Integer> node, int depth) {
        // Go over all constaints to see if everyone is satisfied
        boolean isAllConsistent = true;
        for (int i = 0; i < constraints.size(); i++) {
            // Constaint will select proper varible based on it scope
            constraint c = constraints.get(i);
            int a = c.scopeA; // First associated variable index
            int b = c.scopeB; // Second associated variable index
            // Only cares about values already been assigned
            // -1 won't make make constraints unhappy
            if (node.get(a) != -1 && node.get(b) != -1) {
                // If any constraint is not happy, break and label as fail
                if (!c.isSatisfied(node.get(a), node.get(b))){
                    isAllConsistent = false;
                    break;
                }
            }
        }
        
        // If some constraint is violated, base case reached and terminate
        if (!isAllConsistent) {
            printNode(node, depth, " fail");
            return;
        }
        
        // At this step everything should be consistent
        // If we are at the max depth, report find a solution
        if (depth == node.size()+1) {
            printNode(node, depth, " solution");
            this.solutions.add(node);
            return;
        }
        
        // Just print the node without messages
        printNode(node, depth, "");
        
        // At this step, neither some constraint is violated nor max depth reached
        // Recursively call search with the (depth-1)th variable assigned
        // Branching factor depends on the domain size of the (depth-1)th variable
        for (int i = 0; i < domains.get(depth-1).size(); i++) {
            ArrayList<Integer> newAsgn = node;
            newAsgn.set(depth-1, (int)(domains.get(depth-1).get(i)));
            search(newAsgn, depth+1);
        }
    }
    
    // Print the current assignment with proper indientation
    public void printNode(ArrayList<Integer> node, int depth, String msg) {
        String spacing = "";
        for (int i = 0; i < depth; i++) {
            spacing += "  ";
        }
        System.out.println(spacing + node + msg);
        
    }

    //======================= Probably not needed
    // generate a tree for all the assignments of the variable
    // node key -> variable name; node data -> value assignment
//    public Tree<T> genTree(ArrayList<Integer> listofVar, ArrayList<constraint> listOfCon){
//        Tree<T> tree = new Tree<T>;
//        return tree;
//    }

//    // print tree in DFS order
//    public void printTree(Tree tree){
//        return;
//    }
//
//    // get the solution by traversing the tree
//    // returns a list of (list of nodes)
//    public ArrayList<ArrayList<Node<T>>> getSolution(Tree<T> tree){
//        
//    }
    //======================= Probably not needed
}


