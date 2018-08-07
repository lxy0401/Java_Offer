package T10_Fibonacci;

/**
 * @author LXY
 * @email 403824215@qq.com
 * @date 2018/7/18 15:20
 *
 * 大家都知道斐波那契数列，现在要求输入一个整数n，
 * 请你输出斐波那契数列的第n项（从0开始，第0项为0）。n<=39
 */
public class Solution {
    public int Fibonacci(int n) {
        int n0 = 0;
        int n1 = 1;
        int num = 0;
        int count = 1;
        if(n == 0)
        {
            return 0;
        }
        if(n == 1)
        {
            return 1;
        }
        else
        {
            while (count < n)
            {
                num = n0 + n1;
                n0 = n1;
                n1 = num;
                count++;
            }
            return num;
        }
    }
}