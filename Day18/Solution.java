
public class Solution {
       Stack<Character> stack = new Stack<>();
    Queue<Character> queue = new LinkedList<>();
     private void pushCharacter(char c) {
        stack.add(c);
    }

    private void enqueueCharacter(char c) {
        queue.add(c);
    }

    private Character popCharacter() {
       return stack.pop(); 
    }

    private Character dequeueCharacter() {
        return queue.remove();
    }
