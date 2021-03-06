package PrintMinNumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author LXY
 * @email 403824215@qq.com
 * @date 2018/7/20 14:58
 */
//输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
// 例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
public class Solution {
    public String PrintMinNumber(int [] numbers) {
        if(numbers.length == 0 || numbers == null)
        {
            return "";
        }
        int len = numbers.length;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i < len;i++)
        {
            list.add(numbers[i]);
        }
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer str1, Integer str2) {
                String s1 = str1 + "" + str2;
                String s2 = str2 + "" + str1;
                return s1.compareTo(s2);
            }
        });
        String s = "";
        for(int j :list)
        {
            s = s + j;
        }
        return s;
    }
}
