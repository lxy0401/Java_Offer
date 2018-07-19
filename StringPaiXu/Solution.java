package StringPaiXu;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author LXY
 * @email 403824215@qq.com
 * @date 2018/7/19 14:50
 */
//输入一个字符串,按字典序打印出该字符串中字符的所有排列。
// 例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
public class Solution {
    public ArrayList<String> Permutation(String str) {
        if(str == null)
        {
            return null;
        }
        ArrayList<String> list = new ArrayList<>();
        //将字符串转为数组
        char[] charStr = str.toCharArray();
        //将字符串进行排列组合
        Permute(charStr,0,list);
        //将list进行排序变为字典的顺序
        Collections.sort(list);
        return list;
    }

    //该函数表示要将安排的元素
    //i表示要判断元素的下标
    private void Permute(char[] charStr, int i, ArrayList<String> list) {
        if(charStr == null)
        {
            return;
        }
        if(i == charStr.length - 1)
        {
            //要进行安排的元素为最后一个元素
            if(list.contains(String.valueOf(charStr)))
            {
                //链表已经包含
                return;
            }
            list.add(String.valueOf(charStr));
        }
        else
        {
            //要安排的元素不是最后一个
            for(int j = i;j < charStr.length;j++)
            {
                //将两个元素交换
                swap(charStr,i,j);
                Permute(charStr,i + 1,list);
                swap(charStr,i,j);
            }
        }
    }

    private void swap(char[] charStr, int i, int j) {
        char tmp = charStr[j];
        charStr[j] = charStr[i];
        charStr[i] = tmp;
    }

    public static void main(String[] args) {
        String str = "abc";
        Solution solution = new Solution();
        System.out.println(solution.Permutation(str));
    }
}
