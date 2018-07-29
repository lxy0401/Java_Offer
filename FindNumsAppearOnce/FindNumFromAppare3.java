package FindNumsAppearOnce;

import java.util.Arrays;

/**
 * @author LXY
 * @email 403824215@qq.com
 * @date 2018/7/29 18:04
 *
 * 数组中唯一出现一次的数字
 *
 */
public class FindNumFromAppare3 {
    public int FindNumsAppearOnce(int[] array) {
        Arrays.sort(array);
        if(array[array.length - 1] != array[array.length - 2])
        {
            return array[array.length - 1];
        }
        for(int i = 0;i < array.length;i = i + 3)
        {
            if(array[i] != array[i + 1])
            {
                return array[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        FindNumFromAppare3 findNumFromAppare3 = new FindNumFromAppare3();
        int[] array = {1,9,9,5,6,2,5,2,9,7,5,2,7,6,7,6};
        System.out.println(findNumFromAppare3.FindNumsAppearOnce(array));
    }
}