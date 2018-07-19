package PrintNodeOfList;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author LXY
 * @email 403824215@qq.com
 * @date 2018/7/16 15:18
 */

//输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
//方法：使用栈，先进后出
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode)
    {
        Stack<Integer> stack = new Stack<Integer>();
        while (listNode != null)
        {
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        ArrayList<Integer> list = new ArrayList<>();
        while (!stack.isEmpty())
        {
            int cur = stack.pop();
            list.add(cur);
        }
        return list;
    }
}
