package T3_duplicate.Test1;

/**
 * @author LXY
 * @email 403824215@qq.com
 * @date 2018/7/31 17:57
 * <p>
 * T3
 * 在一个长度为n的数组里的所有数字都在0到n-1的范围内。
 * 数组中某些数字是重复的，但不知道有几个数字是重复的。
 * 也不知道每个数字重复几次。请找出数组中任意一个重复的数字。
 * 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是第一个重复的数字2。
 * <p>
 * （剑指Offer方法）使用哈希特性
 * （其实就是相当于认为是1位置上的元素为1，2位置上的元素为2。。。位置与元素一一对应）
 * 循环遍历数组，将i位置上的元素m与m位置上的元素n作比较
 * 若m==n则表示找到了相同的元素，若没有找到，则将i与m位置上的元素交换
 */
public class Solution3 {
    // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    这里要特别注意~返回任意重复的一个，赋值duplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false
    public boolean duplicate(int numbers[], int length, int[] duplication) {
        if (numbers == null || length != numbers.length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            while (i != numbers[i]) {
                if (numbers[i] == numbers[numbers[i]]) {
                    duplication[0] = numbers[i];
                    return true;
                }
                /**
                 * 注：此处不能写成
                 * int tmp = numbers[i];
                 * numbers[i] = numbers[numbers[i]];
                 * numbers[numbers[i]] = tmp;
                 */
                int tmp = numbers[i];
                numbers[i] = numbers[tmp];
                numbers[tmp] = tmp;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution3 solution = new Solution3();
        int[] arr = {2, 1, 3, 0, 4};
        int[] res = {-10};
        System.out.println(solution.duplicate(arr, arr.length, res));
    }
}
