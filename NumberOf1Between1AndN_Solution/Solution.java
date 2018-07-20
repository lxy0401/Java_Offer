package NumberOf1Between1AndN_Solution;

/**
 * @author LXY
 * @email 403824215@qq.com
 * @date 2018/7/20 11:41
 */
//求出1~13的整数中1出现的次数,并算出100~1300的整数中1出现的次数？
// 为此他特别数了一下1~13中包含1的数字有1、10、11、12、13因此共出现6次,但是对于后面问题他就没辙了。
// ACMer希望你们帮帮他,并把问题更加普遍化,可以很快的求出任意非负整数区间中1出现的次数（从1 到 n 中1出现的次数）。
    //个位上出现1的个数：n / 10 + (n % 10 != 0 ? 1 : 0)
    //十位上出现1的个数：(n / 100) * 10 + if((n % 100) > 19)10 else if((n % 100) < 10) 0 else (n % 100) - 10 + 1
    //百位上出现1的个数：(n / 1000) * 100 + if((n % 1000) > 199)100 else if((n % 1000) < 1000) 0 else (n % 1000) - 100 + 1
    //...
    //i位上出现1的个数：(n / i* 10) * i + if((n % i * 10) > 2*i-1)i else if((n % i * 10) < i * 10) 0 else (n % i * 10) - i + 1
public class Solution {
    public int NumberOf1Between1AndN_Solution(int n) {
        if(n <= 0)
        {
            return 0;
        }
        int count = 0;
        for(long i = 1;i <= n;i = i * 10)
        {
            long diviver = i * 10;
            count += (n / diviver) * i + Math.min(Math.max(n % diviver - i + 1,0),i);
        }
        return count;
    }
}
