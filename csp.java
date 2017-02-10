
import java.io.*;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;




public class csp {
    

	public static void main(String [] args) {
        // Current domain
        ArrayList<ArrayList> domains = new ArrayList<ArrayList>();
        domains.add(new ArrayList<Integer>(Arrays.asList(1,2,4)));
        domains.add(new ArrayList<Integer>(Arrays.asList(3,4)));
        domains.add(new ArrayList<Integer>(Arrays.asList(5)));
        
        // Constraints
        ArrayList<constraint> C = new ArrayList<constraint>();
        // A < B
        C.add(new constraint(0,1,0,"<"));
        // B > C
        C.add(new constraint(1,2,0,">"));
        // A < B + 1
        C.add(new constraint(0,1,1,"<"));
        
        // Print current domains
        System.out.println("Current Domain");
        System.out.println(domains);
        
        // Check if the first constraint is satisfied
        // Constraint 1 is about domain 1 and 2
        constraint c1 = C.get(0);
        constraint c2 = C.get(1);
        constraint c3 = C.get(2);
        System.out.println(" ");
        System.out.println("Is c1,c2,c3 consistent");
        System.out.println(c1.isConsistent(domains.get(c1.valA), domains.get(c1.valB)));
        System.out.println(c2.isConsistent(domains.get(c2.valA), domains.get(c2.valB)));
        System.out.println(c3.isConsistent(domains.get(c3.valA), domains.get(c3.valB)));
        

    }
}


		



