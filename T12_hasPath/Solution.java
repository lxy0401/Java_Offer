package T12_hasPath;

/**
 * @author LXY
 * @email 403824215@qq.com
 * @date 2018/8/2 17:08
 */
public class Solution {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
        int flags[] = new int[matrix.length];
        //使用i来控制行（相当是行）
        for(int i = 0;i < rows;i++)
        {
            //使用j来控制每行的元素个数
            for(int j = 0;j < cols;j++)
            {
                if(hasPathHelp(matrix,rows,cols,i,j,str,0,flags))
                {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean hasPathHelp(char[] matrix, int rows, int cols, int i, int j, char[] str, int cur, int[] flags) {
        int index = i * cols + j;
        //合法性判断
        //传入的数组matrix为空 || matrix数组长度为0 ||  数组str为空 || 长度为0 || 数组越界（长、宽）|| matrix要判断位置的元素与str要判断位置的元素不相等 || matrix要判断位置的元素的flag为1（表示该位置已经走过了）
        if(matrix == null || matrix.length == 0  || str == null || str.length == 0 || i < 0 || i >= rows || j < 0 || j >= cols || matrix[index] != str[cur] || flags[index] == 1)
        {
            return false;
        }
        //如果判断的位置为str的最后一个位置，则表示全部判断结束，直接返回true
        if(cur == str.length - 1)
        {
            return true;
        }
        //先将数组要判断的位置置为1，表示走过
        flags[index] = 1;
        //紧接着
        if(hasPathHelp(matrix,rows,cols,i - 1,j,str,cur + 1,flags)
                || hasPathHelp(matrix,rows,cols,i + 1,j,str,cur + 1,flags)
                || hasPathHelp(matrix,rows,cols,i,j - 1,str,cur + 1,flags)
                || hasPathHelp(matrix,rows,cols,i,j + 1,str,cur + 1,flags))
        {
            return true;
        }
        else
        {
            flags[index] = 0;
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        char[] arr = {'a','b','c','e','s','f','c','s','a','d','e','e'};
        char[] str = {'b','c','c','e','d'};
        char[] str2 = {'a','b','c','b'};
        System.out.println(solution.hasPath(arr,3,4,str));
    }

}
