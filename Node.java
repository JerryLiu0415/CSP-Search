
import java.io.*;
import java.lang.String;
import java.util.ArrayList;

public static class Node<T> {
        private T data;
        private Node<T> parent;
        private List<Node<T>> children;
    }

    public Node<T>(T data, Node<T> parent, Node<T> children) {

    	data = null;
    	parent = null;
    	children = null;
    }
}