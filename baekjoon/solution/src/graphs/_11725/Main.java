package graphs._11725;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Node[] nodes = new Node[n + 1];
        for (int i = 1; i <= n; i++) {
            nodes[i] = new Node(i);
        }

        for (int i = 0; i < n - 1; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(stringTokenizer.nextToken());
            int b = Integer.parseInt(stringTokenizer.nextToken());

            nodes[a].linkNode(nodes[b]);
            nodes[b].linkNode(nodes[a]);
        }

        nodes[1].setParentNode(nodes[1]);

        for (int i = 2; i <= n; i++) {
            System.out.println(nodes[i].getParentNodeId());
        }
    }

    private static class Node {
        private final int id;
        private Node parentNode;
        private final List<Node> linkedNodes = new ArrayList<>();

        public Node(int id) {
            this.id = id;
        }

        public boolean hasParent() {
            return parentNode != null;
        }

        public int getParentNodeId() {
            return parentNode.id;
        }

        public void linkNode(Node node) {
            linkedNodes.add(node);
        }

        public void setParentNode(Node parentNode) {
            this.parentNode = parentNode;
            for (Node node : linkedNodes) {
                if (!node.hasParent()) {
                    node.setParentNode(this);
                }
            }
        }
    }
}
