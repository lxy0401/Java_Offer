package replaceAll;

/**
 * @author LXY
 * @email 403824215@qq.com
 * @date 2018/7/17 16:31
 */
//方法二：
public class Solution2 {
    public String replaceSpace(StringBuffer str)
    {
        //先将字符串变为数组
        String newstr = str.toString();
        char[] strChar = newstr.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();
        for(int i = 0; i < strChar.length;i++)
        {
            if(strChar[i] == ' ')
            {
                stringBuffer.append("%20");
            }
            else
            {
                stringBuffer.append(strChar[i]);
            }
        }
        return stringBuffer.toString();
    }
}
