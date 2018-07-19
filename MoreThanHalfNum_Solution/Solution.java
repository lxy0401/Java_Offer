package MoreThanHalfNum_Solution;

import java.util.Arrays;

/**
 * @author LXY
 * @email 403824215@qq.com
 * @date 2018/7/19 15:41
 */
//链接：https://www.nowcoder.com/questionTerminal/e8a1b01a2df14cb2b228b30ee6a92163
//来源：牛客网
//
//数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
// 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
// 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        if(array.length == 0)
        {
            return 0;
        }
        //使用一个数组来存储相同元素的个数
        int[] count =new int[array.length];
        //利用循环判断
        for(int i = 0;i < array.length;i++)
        {
            for(int j = i + 1;j < array.length ;j++)
            {
                if(array[i] == array[j])
                {
                    count[i]++;

                }
            }
            if(count[i] >= array.length /2)
            {
                return array[i];
            }
        }
        return 0;
    }
}
