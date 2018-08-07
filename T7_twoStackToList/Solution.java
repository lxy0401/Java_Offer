package T7_twoStackToList;

import java.util.Stack;

/**
 * @author LXY
 * @email 403824215@qq.com
 * @date 2018/7/31 21:04
 *
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。
 * 队列中的元素为int类型。
 */
public class Solution {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (stack1.isEmpty() || stack2.isEmpty()) {
            System.out.println("They are empty...");
        }
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                int node = stack1.pop();
                stack2.push(node);
            }
        }
        return stack2.pop();
    }
}
