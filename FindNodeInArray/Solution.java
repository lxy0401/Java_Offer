package FindNodeInArray;

/**
 * @author LXY
 * @email 403824215@qq.com
 * @date 2018/7/17 16:03
 */
//在一个二维数组中（每个一维数组的长度相同），
// 每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
// 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。

//因此可以将左下角或右上角作为基准
public class Solution {
    public boolean Find(int target, int [][] array) {
        //以左下角为基准点
        //注：此处算最大值时，行为array.length，列为array[0].length
        int row = array.length - 1;
        int col = 0;
        while(row >= 0 && col <= array[0].length - 1)
        {
            if(target == array[row][col])
            {
                return true;
            }
            else if(target > array[row][col])
            {
                col++;
            }
            else if(target < array[row][col])
            {
                row--;
            }
        }
        return false;
    }
}
