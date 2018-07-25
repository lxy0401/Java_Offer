package FindMIn4Node;

import java.util.ArrayList;

/**
 * @author LXY
 * @email 403824215@qq.com
 * @date 2018/7/25 14:59
 */
//输入n个整数，找出其中最小的K个数。
// 例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
//思路：先进行排序，再输出
public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if(k > input.length)
        {
            return list;
        }
        int tmp = -1;
        for(int i = 0;i < input.length - 1;i++)
        {
            for(int j = 0;j < input.length;j++)
            {
                if(input[i] < input[j])
                {
                    tmp = input[i];
                    input[i] = input[j];
                    input[j] = tmp;
                }
            }
        }
        for(int i = 0;i < k;i++)
        {
            list.add(input[i]);
        }
        return list;
    }
}
