package FindNumsAppearOnce;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author LXY
 * @email 403824215@qq.com
 * @date 2018/7/28 19:43
 */
public class SolutionBySort {
    public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Arrays.sort(array);
        for(int i = 0;i < array.length;i++)
        {
            if(i == array.length - 1 && array[i] != array[i - 1])
            {
                arrayList.add(array[i]);
            }
            else if(i == 0 && array[i] != array[i + 1])
            {
                arrayList.add(array[i]);
            }
            else if(i != 0 && i != array.length - 1 && array[i] != array[i - 1] && array[i] != array[i + 1])
            {
                arrayList.add(array[i]);
            }
        }
        num1[0] = arrayList.get(0);
        num2[0] = arrayList.get(1);
    }
}