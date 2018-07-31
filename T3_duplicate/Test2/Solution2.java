package T3_duplicate.Test2;

/**
 * @author LXY
 * @email 403824215@qq.com
 * @date 2018/7/31 17:57
 *
 * T3拓展
 *
 * 在一个长度为n+1的数组里的所有数字都在1~n的范围内，所以数组中至少有一个数字是重复的。
 * 请找出数组中任意一个重复的数字，但是不能修改输入的数组。
 * 例如，如果输入长度为8的数组{2,3,5,4,3,2,6,7}，那么对应的输出是重复的数字2或者3。
 *
 *
 *
 *
 */
public class Solution2 {
    public int duplicate(int numbers[],int length) {
        if(numbers == null || length != numbers.length)
        {
            return -1;
        }
        int start = 0;
        int end = length - 1;
        int mid = 0;
        int flag = 0;
        while(start <= end)
        {
            if(flag == 0)
            {
                mid = (start + end) /2;
            }
            int count = nodeCount(numbers,start,mid);
            if(end == start)
            {
                if(count > 1)
                {
                    return start;
                }
                else
                {
                    break;
                }
            }
            if(count > (mid - start + 1))
            {
                end = mid;
                flag = 0;
            }
            else if(count == (mid - start + 1))
            {
                mid = mid - 1;
                if(mid < start)
                {
                    start = (start + end) / 2 + 1;
                    flag = 0;
                }
                else
                {
                    flag = 1;
                }
            }
            else
            {
                end = mid + 1;
                flag = 0;
            }
        }
        return -1;

    }

    private int nodeCount(int[] numbers, int start, int end) {
        if(numbers == null)
        {
            return 0;
        }
        int count = 0;
        for(int i = 0;i < numbers.length;i++)
        {
            if(numbers[i] >= start && numbers[i] <= end)
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        int[] arr = {2,2,3,1,4};
        System.out.println(solution.duplicate(arr,arr.length));
    }
}
