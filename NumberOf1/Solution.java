package NumberOf1;

/**
 * @author LXY
 * @email 403824215@qq.com
 * @date 2018/7/18 16:01
 */
//输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
//思路：将n与n-1做与运算，会将二进制数的1的个数减少1
public class Solution {
    public int NumberOf1(int n) {
        if(n == 0)
        {
            return 0;
        }
        int count = 0;
        while(n != 0)
        {
            count++;
            n = n & (n - 1);
        }
        return count;
    }
}
