package data_structures._10828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static final String PUSH = "push";
    public static final String POP = "pop";
    public static final String SIZE = "size";
    public static final String EMPTY = "empty";
    public static final String TOP = "top";

    public static Stack<Integer> stack;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            runStackCommand(br.readLine());
        }
    }

    public static void runStackCommand(String command) {
        if (command.contains(PUSH)) {
            int element = Integer.parseInt(command.split(" ")[1]);
            stack.push(element);
            return;
        }

        if (command.equals(POP)) {
            System.out.println(stack.isEmpty() ? -1 : stack.pop());
            return;
        }

        if (command.equals(SIZE)) {
            System.out.println(stack.size());
            return;
        }

        if (command.equals(EMPTY)) {
            System.out.println(stack.isEmpty() ? 1 : 0);
            return;
        }

        if (command.equals(TOP)) {
            System.out.println(stack.isEmpty() ? -1 : stack.peek());
        }
    }
}
