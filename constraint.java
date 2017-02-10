
import java.io.*;
import java.lang.String;
import java.util.ArrayList;

// Class for constraints in CSP
// A -- c1 -- B
// c1 = A < B + 2, has scope {A,B}
// The arc is <A,c1> is constraint(0,1,2,"<")
// The arc is <c1,B> is constraint(1,0,-2,">")
public class constraint {
	int valA = 0;
	int valB = 0;
	int valC = 0;
	String op = "GT";
	// Construct a constraint
	public constraint(int valA, int valB, int valC, String op) {
        this.valA = valA;
        this.valB = valB;
        this.valC = valC; // Constant
        this.op = op;
	}

    // For all items in V1, check whether we can find another value in V2
    // s.t. that constraint is satisfied.
    // V1, V2 are 1d arrays, the caller gives domains and ValA,Valb will
    // determine which variable is selected
	public boolean
    isConsistent(ArrayList<Integer> V1, ArrayList<Integer> V2) {
        for (int i = 0; i < V1.size(); i++) {
            boolean exists = false;
            for (int j = 0; j < V2.size(); j++) {
                // If such item exists in V2, move on to next in V1
                if (isSatisfied(V1.get(i),V2.get(j),valC,op)) {
                    exists = true;
                    break;
                }
            }
            // No value in V2 satisfy the constraint for current val in V1
            if (!exists) {
                return false;
            }
        }
        return true;
	}
    
    // Evaluate the boolean function between two single value
    // ">" -> op=">"
    // "<" -> op="<"
    // "is even" -> op="%2", c=0
    //  ...
    //
    public boolean isSatisfied(int a, int b, int c ,String op) {
        switch (op) {
            case "<":
                return a<(b+c);
            case ">":
                return a>(b+c);
            case "=":
                return a==(b+c);
            case "%2":
                return (a%2)==c;
            default:
                break;
        }
        return false;
    }



}


		



