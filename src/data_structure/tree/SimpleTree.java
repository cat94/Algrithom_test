package data_structure.tree;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by shen on 15/5/19.
 *
 * A simple  binary tree
 *
 * the key of node is stored in the map
 *
 */
public class SimpleTree<T>{
    private class Node{
        public Integer key;
        public T value;
//        the parent of node
        private Integer p;
        private Integer leftKey, rightKey;


        public Node(T value) {
            this.value = value;
        }

        public void setP(Integer p) {
            this.p = p;
        }

        public void setLeft(Integer left) {
            this.leftKey = left;
        }

        public void setRightKey(Integer rightKey) {
            this.rightKey = rightKey;
        }

        public Node right(){
            if (rightKey !=null)
                return treeMap.get(rightKey);
            else
                return null;
        }

        public Node left(){
            if (leftKey !=null)
                return treeMap.get(rightKey);
            else
                return null;
        }

        public Node p(){
            if (p!=null)
                return treeMap.get(p);
            else
                return null;
        }
    }

    private Map<Integer, Node> treeMap = new HashMap<Integer, Node>();
    private Node rootItem;

    public Node root(){
        return rootItem;
    }

    public void addNode(Node node){
        Node y = null;
        Node x = root();

        while (x != null){
            y = x;
            if ( node.key > x.key) {
                x = x.right();
            }else{
                x = x.left();
            }
        }

//        if the tree is null
        if (y == null){
            rootItem = node;
        }else if (node.key < x.key){
            node.setP(x.key);
            x.setLeft(node.key);
        }else{
            node.setP(x.key);
            x.setRightKey(node.key);
        }

        treeMap.put(node.key, node);
    }

    public Node find(int key){
        return treeMap.get(key);
    }

//    find the min node of the tree rooted by key
    public Node min(int key){
        Node n = treeMap.get(key);
        while (n.leftKey !=null){
            n = n.left();
        }

        return n;
    }

    public Node successor(int key){
        Node n = treeMap.get(key);
        if (n == null){
            return null;
        }
        else if (n.rightKey != null) {
            return min(n.rightKey);
        }
//       if the node don't have a right subTree , just up to a node that its parent has a left node
        else {
            Node y = n.p();
            while (y!=null && n.key == y.rightKey){
                n = y;
                y = y.p();
            }
            return y;
        }
    }

    private void transplant(Node u, Node v){
        if (u == rootItem) {
            rootItem = v;
        }else if (u.p().leftKey == u.key){
            u.p().leftKey = v.key;
        }else{
            u.p().rightKey = v.key;
        }
        if (v!=null)
            v.p = u.p;
    }

    public void delete(int key){
        Node n = find(key);
        if (n.leftKey == null){
            transplant(n,n.right());
        }else if (n.rightKey == null){
            transplant(n,n.left());
        }else{
            Node y = successor(n.key);
            if (y.p != n.key){
                transplant(y,y.right());
                y.right().p = y.p;
                y.rightKey = n.rightKey;
            }
            transplant(n,y);
            y.leftKey = n.leftKey;
            y.left().p = y.key;
        }
    }


}
