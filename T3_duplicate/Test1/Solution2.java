package T3_duplicate.Test1;

/**
 * @author LXY
 * @email 403824215@qq.com
 * @date 2018/7/31 17:57
 *
 * T3
 * 在一个长度为n的数组里的所有数字都在0到n-1的范围内。
 * 数组中某些数字是重复的，但不知道有几个数字是重复的。
 * 也不知道每个数字重复几次。请找出数组中任意一个重复的数字。
 * 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是第一个重复的数字2。
 *
 * 使用数组来判断，将数组numbers[]中的元素个数存储在res[]数组的对应位置上，
 * 再循环判断res[]数组各位置上的元素是否大于1
 */
public class Solution2 {
    // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    这里要特别注意~返回任意重复的一个，赋值duplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        if(numbers == null || length != numbers.length)
        {
            return false;
        }
        int[] arr = new int[length];
        for(int i = 0;i < length;i++)
        {
            arr[numbers[i]]++;
        }
        for(int i = 0;i < arr.length;i++)
        {
            if(arr[i] > 1)
            {
                duplication[0] = i;
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        int[] arr = {2,1,3,1,4};
        int[] res = {-1};
        System.out.println(solution.duplicate(arr,arr.length,res));
    }
}
