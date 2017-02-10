
import java.io.*;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;




public class searchMain {
    

	public static void main(String [] args) {
        // Current domain
        ArrayList<ArrayList> domains = new ArrayList<ArrayList>();
        domains.add(new ArrayList<Integer>(Arrays.asList(1,2,3)));
        domains.add(new ArrayList<Integer>(Arrays.asList(3,4)));
        domains.add(new ArrayList<Integer>(Arrays.asList(9)));
        domains.add(new ArrayList<Integer>(Arrays.asList(1,2,4)));
        domains.add(new ArrayList<Integer>(Arrays.asList(3,4)));
        domains.add(new ArrayList<Integer>(Arrays.asList(5)));
        domains.add(new ArrayList<Integer>(Arrays.asList(1,2,4)));
        domains.add(new ArrayList<Integer>(Arrays.asList(3,4)));
        
        // Constraints
        ArrayList<constraint> constraints = new ArrayList<constraint>();
        // A < B
        constraints.add(new constraint(0,1,0,"<"));
        // B < C
        constraints.add(new constraint(1,2,0,"<"));
        // A < B + 1
        constraints.add(new constraint(0,1,1,"<"));
        
        // Print current domains
        System.out.println("Current Domain: ");
        System.out.println(domains);
        System.out.println(" ");

        
    
        // Calling search function on current domain and constraints
        // Need to construct a search object first
        varSearch vs = new varSearch(domains, constraints);
        
        // Initial assigment to each variables (-1 means don't have a value yet)
        ArrayList<Integer> initAssign = new ArrayList<Integer>(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1));
        
        // Calling search function with initial assignment with depth 1
        System.out.println("====Start searching!====");
        vs.search(initAssign, 1);
        System.out.println("====End!====");
        System.out.println("====Here lists the solutions====");
        System.out.println(vs.solutions);


    }
}


		



