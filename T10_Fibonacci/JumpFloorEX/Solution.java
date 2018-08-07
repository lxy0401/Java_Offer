package T10_Fibonacci.JumpFloorEX;

/**
 * @author LXY
 * @email 403824215@qq.com
 * @date 2018/7/18 15:50
 *
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
 *  求该青蛙跳上一个n级的台阶总共有多少种跳法。
 *
 * 思路：
 * 关于本题，前提是n个台阶会有一次n阶的跳法。分析如下:
 *
 * f(1) = 1
 *
 * f(2) = f(2-1) + f(2-2)         //f(2-2) 表示2阶一次跳2阶的次数。
 *
 * f(3) = f(3-1) + f(3-2) + f(3-3) 
 *
 * ...
 *
 * f(n) = f(n-1) + f(n-2) + f(n-3) + ... + f(n-(n-1)) + f(n-n) 
 *
 * 综上：
 * f(n) = 1       ,(n=1 )
 *        2*f(n-1),(n>=2)   结论
 */

//小红花
public class Solution {
    public int JumpFloorII(int target) {
        if(target == 1)
        {
            return 1;
        }
        else
        {
            return 2 * JumpFloorII(target - 1);
        }
    }
}
