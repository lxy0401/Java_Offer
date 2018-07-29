package FindNumsAppearOnce;

import java.util.Arrays;

/**
 * @author LXY
 * @email 403824215@qq.com
 * @date 2018/7/29 18:36
 */
public class FindNumFromAppare3X {
    public int FindNumsAppearOnce(int[] array) {
        int bits[] = new int[32];
        Arrays.fill(bits,0);
        for(int i = 0;i < array.length;i ++)
        {
            for(int j = 0;j < 32;j++)
            {
                bits[j] += ((array[i] >> j) & 1);
            }
        }
        int res = 0;
        for(int j = 0;j < 32;j++)
        {
            if(bits[j] % 3 != 0)
            {
                res += (1 << j);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        FindNumFromAppare3X findNumFromAppare3 = new FindNumFromAppare3X();
        int[] array = {1,1,9,5,6,2,5,2,1,7,5,2,7,6,7,6};
        System.out.println(findNumFromAppare3.FindNumsAppearOnce(array));
    }
}