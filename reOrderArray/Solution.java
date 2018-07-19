package reOrderArray;

/**
 * @author LXY
 * @email 403824215@qq.com
 * @date 2018/7/18 16:12
 */
//输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
// 使得所有的奇数位于数组的前半部分，所有的偶数位于位于数组的后半部分，
// 并保证奇数和奇数，偶数和偶数之间的相对位置不变。

public class Solution {
    public void reOrderArray(int [] array) {
        if(array.length == 0 || array.length == 1)
        {
            return;
        }
        int[] newArray = new int[array.length];
        int jishucount = 0;
        int index = 0;
        for(int i = 0;i < array.length;i++)
        {
            //将奇数的个数进行统计
            if(array[i] % 2 == 1)
            {
                jishucount++;
            }
        }
        for(int i = 0;i < array.length;i++)
        {
            if(array[i] % 2 == 1)
            {
                //将奇数放在数组前面
                newArray[index++] = array[i];
            }
            else
            {
                //将偶数放在后面
                newArray[jishucount++] = array[i];
            }
        }
        for(int i = 0; i < array.length ;i++)
        {
            array[i] = newArray[i];
        }
    }
}
