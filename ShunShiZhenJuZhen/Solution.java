package ShunShiZhenJuZhen;

import java.util.ArrayList;

/**
 * @author LXY
 * @email 403824215@qq.com
 * @date 2018/7/19 10:29
 */
public class Solution {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> array = new ArrayList<>();
        if(matrix.length == 0 || matrix[0].length == 0)
        {
            //行数为0，或者每行元素个数为0
            return array;
        }
        int n = matrix.length;//数组行数
        int m = matrix[0].length;//数组每行元素个数
        int layer = (Math.min(n,m) - 1) / 2 + 1;//数组顺时针遍历层数
        for(int i = 0;i < layer;i++)
        {
            //按层开始循环
            for(int k = i;k < m - i;k++)
            {
                //k表示列
                //将元素从左到右插入到数组array中
                //k < m - i是因为每行有m个元素，但是最后一个元素的下标是m - 1
                array.add(matrix[i][k]);
            }
            for(int j = i + 1; j <= n - 1 - i; j++)
            {
                //j表示行
                //将元素从上到下插入到数组中
                //j = i + 1表示从第二行开始往下开始加，
                // 因为第一行的数在上一个循环中（从左到右的循环）已经加过了
                array.add(matrix[j][m-i-1]);
            }
            for(int k = (m-1)-i-1;(k >= i) && (n-i-1 != i);k--)
            {
                //k表示列
                //元素从右往左插入数组array中
                //k = (m-1)-i-1中的m-1是表示下标的开始-i-1
                array.add(matrix[n-i-1][k]);
            }
            for(int j = (n-1)-i-1;(j > i) && (m-i-1 != i);j--)
            {
                array.add(matrix[j][i]);
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int arry[][] = {{1,2},{3,4}};
        Solution solution = new Solution();
        System.out.println(solution.printMatrix(arry));
    }
}
