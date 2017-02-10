
import java.io.*;
import java.lang.String;
import java.util.ArrayList;
import CPS-Search.constraint;


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

}