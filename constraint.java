
import java.io.*;
import java.lang.String;
import java.util.ArrayList;
import java.lang.*;

// Class for constraints in CSP //
// A -- c1 -- B
// c1 = A < B + 2, has scope {A,B}
// The arc is <A,c1> is constraint(0,1,2,"<")
// The arc is <c1,B> is constraint(1,0,-2,">")
public class constraint {
    // Index of variable on the LHS
	int scopeA = 0;
    // Index of variable on the RHS
	int scopeB = 0;
    // Constant appears in the constraint
	int constant = 0;
    // Operator type
    String op = "GT";
    
	// Construct a constraint
	public constraint(int valA, int valB, int valC, String op) {
        this.scopeA = valA;
        this.scopeB = valB;
        this.constant = valC; // Constant
        this.op = op;
	}

    
    // Evaluate the boolean function between two SPECIFIC value
    // Values must be the domain specified by C.scopeA, C.scopeB
    // Examples:
    // "2<3" -----> isSatisfied(2,3), C.constant = 0, C.OP = "<"
    // "2>3" -----> isSatisfied(2,3), C.constant = 0, C.OP = ">"
    // "2<3+1" -----> isSatisfied(2,3), C.constant = 1, C.OP = "<"
    // "2=3" -----> isSatisfied(2,3), C.constant = 0, C.OP = "="
    // "2=3" -----> isSatisfied(2,3), C.constant = 0, C.OP = "="
    public boolean isSatisfied(int a, int b) {
        switch (op) {
            case "<":
                return a<(b+this.constant);
            case ">":
                return a>(b+this.constant);
            case "<=":
                return a<=(b+this.constant);
            case ">=":
                return a>=(b+this.constant);
            case "!=":
                return a!=(b+this.constant);
            case "=":
                return a==(b+this.constant);
            case "absEqual":
                return (Math.abs(a-b)==(this.constant));
            case "absNotEqual":
                return (Math.abs(a-b)!=(this.constant));
            case "absOdd":
                return (Math.abs(a-b)%2==1);
            case "absEven":
                return (Math.abs(a-b)%2==0);
            default:
                break;
        }
        return false;
    }



}


		



