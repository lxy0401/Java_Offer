package T11_minNumberInRotateArray;

/**
 * @author LXY
 * @email 403824215@qq.com
 * @date 2018/7/31 21:26
 *
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 *
 * 使用二分查找
 * 首先要先看题目，题目中的数组一定是一个由一个升序有序数组旋转得到的，一定不是一个无序的数组
 * 所以可以将数组看成是两个部分，分别为前半部分的升序数组和后半部分的升序升序数组
 * （1）使用两个指针，head指向数组头部，last指向数组尾部
 * （2）使用mid 表示中间元素的位置
 * （3）判断arr[head]、arr[last]和arr[mid]之间的关系
 *         1）array[mid] == array[head]：表示中间位置的元素与前面指针所指元素相等（说明数组中有很多重复元素），
 *                                      这时只能顺序查找，不能使用二分查找
 *         2）array[mid] >= array[head]：表示中间位置的元素 >= 前面指针所指元素（说明mid位置一定在前半部分的升序序列上）
 *                                      将head的位置指向mid的位置，继续使用二分查找
 *         3）array[mid] <= array[last]：表示中间位置的元素 <= 后面指针所指元素位置（说明mid位置在后半部分的升序序列上）
 *                                      将last的位置指向mid的位置，继续使用二分查找
 */
public class Solution {
    public int minNumberInRotateArray(int [] array) {
        if(array.length == 0)
        {
            return 0;
        }
        //使用两个指针分别指向数组的开头和结尾
        int head = 0;
        int last = array.length - 1;
        while (head < last)
        {
            int mid =  head + (last - head) / 2;
            if(array[mid] == array[head])
            {
                //如果head和mid位置上的值相等，则只能是顺序查找
                head++;
            }
            else if(array[mid] >= array[head])
            {
                //如果mid位置上的值大于head位置上的值，表示mid位置在前半部分的升序列上
                //则最小值还在mid位置的后面
                head = mid;
            }
            else if(array[mid] <= array[last])
            {
                //如果mid位置上的值小于last位置上的值，表示mid位置在后半部分的升序列上
                //则最小值位于mid位置的前面
                last = mid;
            }
        }
        return array[head];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {2,1,5,4,3,2};
        System.out.println(solution.minNumberInRotateArray(arr));
    }
}
