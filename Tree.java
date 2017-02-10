
import java.io.*;
import java.lang.String;
import java.util.ArrayList;
import CPS-Search.Node;

public class Tree<T> {
    private Node<T> root = null;

    public Tree(T rootData) {
        root = new Node<T>();
        root.data = rootData;
        root.children = new ArrayList<Node<T>>();
    }

    public Node<T> getRoot(){
    	return root;
    }

    public void setRoot(){
    	return;
    }

}