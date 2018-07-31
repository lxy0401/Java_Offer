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
 * 再重新构建一个数组arr[]，将number[]数组中的元素插入arr[]数组的对应位置上，
 * 若发现arr[]的位置上元素与number[]要插入的元素相等，则找到
 *
 */
public class Solution1 {
    public int duplicate(int numbers[],int length) {
        if(numbers == null || length != numbers.length)
        {
            return -1;
        }
        int[] arr = new int[length];
        for(int i = 0;i < length;i++)
        {
            if(numbers[i] == arr[numbers[i]])
            {
                return numbers[i];
            }
            arr[numbers[i]] = numbers[i];
        }
        return -1;

    }

    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        int[] arr = {2,2,3,1,4};
        System.out.println(solution.duplicate(arr,arr.length));
    }
}
