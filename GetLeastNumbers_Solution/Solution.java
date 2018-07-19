package GetLeastNumbers_Solution;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author LXY
 * @email 403824215@qq.com
 * @date 2018/7/19 15:56
 */
//输入n个整数，找出其中最小的K个数。
// 例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        if(input.length == 0 || k <= 0 || k > input.length)
        {
            return null;
        }
        //将数组进行排序
        Arrays.sort(input);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i < k;i++)
        {
            list.add(input[i]);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] input = {1,5,6,7,4,3,2};
        Solution solution = new Solution();
        System.out.println(solution.GetLeastNumbers_Solution(input,10));
    }
}
