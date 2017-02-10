# CSP-Search
Question 2 [40 points] CSP - Search 
Consider a scheduling problem, where there are eight variables A, B, C, D, E, F, G, H each with domain {1, 2, 3, 4}. Suppose the constraints are: A > G, A ≤ H, |F – B| = 1, G < H, |G – C| = 1, |H – C| is even, H != D, D > G, D != C, E != C, E < D – 1, E != H – 2, G != F, H != F, C != F, D != F, |E – F| is odd. 
An AIspace representation for this graph named “as2csp.xml” is available in Connect. (To load this file in the applets, go to the File menu and select Load from File.) 

a) [25 points] Show how search can be used to solve this problem, using the variable ordering A, B, C, D, E, F, G, H. To do this you should write a program to draw the search tree generated, report all answers (models) found and the number of failing consistency checks. You can use whatever programming language you like. 
To indicate the search tree, write it in text form with each branch on one line. For example, suppose we had variables X, Y and Z with domains {t, f} and constraints X != Y, Y != Z. The corresponding search tree, with the order X, Y, Z, can be written as: 
X=t Y=t failure 
Y=f Z=t solution 
Z=f failure 
X=f Y=t Z=t failure 
Z=f solution 
Y=f failure 



Submit the printout of your tree and your search code as appendices at the end of your submission, but indicate the model assignments found and the number of failures in your answer to the question. 
b) [10 points] Is it possible to generate a smaller tree? Come up with a simple variable selection heuristic that results in as small a tree as you can find, and report the following: 
Your variable selection heuristic 
A variable ordering that you obtain using this heuristic 
How many failing consistency checks there are for the tree obtained from this variable ordering. 

c) [5 points] Explain why you expect the tree resulting from this heuristic to be good. (A good explanation as to why your ordering is expected to be good is more important than finding the best ordering).  
