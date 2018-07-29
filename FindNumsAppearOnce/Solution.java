package FindNumsAppearOnce;

/**
 * @author LXY
 * @email 403824215@qq.com
 * @date 2018/7/25 17:26
 *
 * 一个整型数组里除了两个数字之外，其他的数字都出现了偶数次。
 * 请写程序找出这两个只出现一次的数字。
 * 使用位运算
 */
//num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果
public class Solution {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        int num = 0;
        for(int i = 0; i < array.length;i++)
        {
            num ^= array[i];//将数组中的元素从头到尾开始进行进行异或运算（二进制）
        }
        int index = Find(num);//在二进制结果中查找最后出现1的位置为index
        num1[0] = 0;
        num2[0] = 0;
        for(int i = 0;i < array.length ;i++)
        {
            //将数组进行分组（分组标准为：index位置上的数为1/0）
            if (((array[i] >> index) & 1) == 1)
            {
                //index位置上的数为1的数为一组
                //然后与同组的元素进行异或操作，最终剩下的结果为最终结果
                num1[0] ^= array[i];
            }
            else
            {
                //index位置上的数为0的数为一组
                //然后与同组的元素进行异或操作，最终剩下的结果为最终结果
                num2[0] ^= array[i];
            }
        }
    }

    //在二进制中查找第一个出现1的位置为index
    private int Find(int num) {
        int index = 0;
        while((num & 1) == 0)
        {
            //只要最后一位为0，就一直运算
            num >>= 1;
            index++;
        }
        return index;
    }
}
