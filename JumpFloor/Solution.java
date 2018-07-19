package JumpFloor;

/**
 * @author LXY
 * @email 403824215@qq.com
 * @date 2018/7/18 15:38
 */
//一只青蛙一次可以跳上1级台阶，也可以跳上2级。
// 求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
//相当于是斐波那契额数
//n表示台阶数,f(n)表示跳法
// f(1) = 1;
// f(2) = 2;
// ...
// f(n) = f(n-1) + f(n-2)
public class Solution {
    public int JumpFloor(int target) {
        int num1 = 1;
        int num2 = 2;
        int result = 0;
        int count = 2;
        if(target == 1)
        {
            return 1;
        }
        if(target == 2)
        {
            return 2;
        }
        while(count < target)
        {
            result = num1 + num2;
            num1 = num2;
            num2 = result;
            count++;
        }
        return result;
    }
}