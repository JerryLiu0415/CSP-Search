
import java.io.*;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;




public class searchMain {
    

	public static void main(String [] args) {
        // Current domain
        ArrayList<ArrayList> domains = new ArrayList<ArrayList>();
        domains.add(new ArrayList<Integer>(Arrays.asList(1,2,3,4))); // A -> 0
        domains.add(new ArrayList<Integer>(Arrays.asList(1,2,3,4))); // B -> 1
        domains.add(new ArrayList<Integer>(Arrays.asList(1,2,3,4))); // C -> 2
        domains.add(new ArrayList<Integer>(Arrays.asList(1,2,3,4))); // D -> 3
        domains.add(new ArrayList<Integer>(Arrays.asList(1,2,3,4))); // E -> 4
        domains.add(new ArrayList<Integer>(Arrays.asList(1,2,3,4))); // F -> 5
        domains.add(new ArrayList<Integer>(Arrays.asList(1,2,3,4))); // G -> 6
        domains.add(new ArrayList<Integer>(Arrays.asList(1,2,3,4))); // H -> 7
        
        // Constraints
        ArrayList<constraint> constraints = new ArrayList<constraint>();
        // A > G
        constraints.add(new constraint(0,6,0,">"));
        // A ≤ H
        constraints.add(new constraint(0,7,0,"<="));
        // |F – B| = 1
        constraints.add(new constraint(5,1,1,"absEqual"));
        // G < H
        constraints.add(new constraint(6,7,0,"<"));
        // |G – C| = 1
        constraints.add(new constraint(6,2,1,"absEqual"));
        // |H – C| is even
        constraints.add(new constraint(7,2,0,"absEven"));
        // H != D
        constraints.add(new constraint(7,3,0,"!="));
        // D > G
        constraints.add(new constraint(3,6,0,">"));
        // D != C
        constraints.add(new constraint(3,2,0,"!="));
        // E != C
        constraints.add(new constraint(4,2,0,"!="));
        // E < D – 1
        constraints.add(new constraint(4,3,-1,"<"));
        // E != H – 2
        constraints.add(new constraint(4,7,-2,"!="));
        // G != F
        constraints.add(new constraint(6,5,0,"!="));
        // H != F
        constraints.add(new constraint(7,5,0,"!="));
        // C != F
        constraints.add(new constraint(2,5,0,"!="));
        // D != F
        constraints.add(new constraint(3,5,0,"!="));
        // |E – F| is odd
        constraints.add(new constraint(4,5,0,"absOdd"));

        
        // Print current domains
        System.out.println("Current Domain: ");
        System.out.println(domains);
        System.out.println(" ");

        
    
        // Calling search function on current domain and constraints
        // Need to construct a search object first
        varSearch vs = new varSearch(domains, constraints);
        
        // Initial assigment to each variables (-1 means don't have a value yet)
        ArrayList<Integer> initAssign = new ArrayList<Integer>(Arrays.asList(null,null,null,null,null,null,null,null));
        
        // Calling search function with initial assignment with depth 1
        System.out.println("====Start searching!====");
        vs.search(initAssign, 1);
        System.out.println("====End!====");
        System.out.println("====Here lists the solutions====");
        for (int i = 0; i < vs.solutions.size(); i++) {
            vs.printNode(vs.solutions.get(i),1,"");
        }
        System.out.println("====Number of failures====");
        System.out.println(vs.numFails);
        
    }
}


		



