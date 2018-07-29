package FindNumsAppearOnce;

import java.util.ArrayList;

/**
 * @author LXY
 * @email 403824215@qq.com
 * @date 2018/7/29 12:24
 */
public class SolutionByList {
    public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0;i < array.length;i++)
        {
            if(!arrayList.contains(array[i]))
            {
                //若arrayList中不包含待判断元素，就将元素插入到arrayList中
                arrayList.add(array[i]);
            }
            else
            {
                //若arrayList中包含待判断元素，就将包含的元素从arrayList中删除
                arrayList.remove(new Integer(array[i]));
            }
        }
        if(arrayList.size() == 2)
        {
            num1[0] = arrayList.get(0);
            num2[0] = arrayList.get(1);
        }
    }
}