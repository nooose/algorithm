package tree._1991;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    private static final HashMap<String, Node> nodes = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 노드 생성
        for (int i = 0; i < n; i++) {
            nodes.put(String.valueOf((char) (65 + i)), new Node((char) (65 + i)));
        }

        // 노드 연결
        for (int i = 0; i < n; i++) {
            StringTokenizer strTokenizer = new StringTokenizer(br.readLine(), " ");
            String nodeId = strTokenizer.nextToken();
            String leftChildId = strTokenizer.nextToken();
            String rightChildId = strTokenizer.nextToken();

            if (!leftChildId.equals(".")) {
                nodes.get(nodeId).setLeftChild(nodes.get(leftChildId));
            }

            if (!rightChildId.equals(".")) {
                nodes.get(nodeId).setRightChild(nodes.get(rightChildId));
            }
        }

        Node rootNode = nodes.get("A");

        preorderTraversal(rootNode);
        System.out.println();
        inorderTraversal(rootNode);
        System.out.println();
        postorderTraversal(rootNode);
    }

    private static void preorderTraversal(Node node) {
        System.out.print(node);

        if (node.hasLeftChild()) {
            preorderTraversal(node.getLeftChild());
        }

        if (node.hasRightChild()) {
            preorderTraversal(node.getRightChild());
        }
    }

    private static void inorderTraversal(Node node) {
        if (node.hasLeftChild()) {
            inorderTraversal(node.getLeftChild());
        }

        System.out.print(node);

        if (node.hasRightChild()) {
            inorderTraversal(node.getRightChild());
        }
    }

    private static void postorderTraversal(Node node) {
        if (node.hasLeftChild()) {
            postorderTraversal(node.getLeftChild());
        }

        if (node.hasRightChild()) {
            postorderTraversal(node.getRightChild());
        }

        System.out.print(node);
    }

    private static class Node {
        private final String id;
        private Node leftChild;
        private Node rightChild;

        public Node(char id) {
            this.id = String.valueOf(id);
        }

        public Node getLeftChild() {
            return leftChild;
        }

        public Node getRightChild() {
            return rightChild;
        }

        public void setLeftChild(Node leftChild) {
            this.leftChild = leftChild;
        }

        public void setRightChild(Node rightChild) {
            this.rightChild = rightChild;
        }

        public boolean hasLeftChild() {
            return leftChild != null;
        }

        public boolean hasRightChild() {
            return rightChild != null;
        }

        @Override
        public String toString() {
            return id;
        }
    }
}