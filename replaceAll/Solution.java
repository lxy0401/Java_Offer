package replaceAll;

/**
 * @author LXY
 * @email 403824215@qq.com
 * @date 2018/7/17 16:29
 */
//请实现一个函数，将一个字符串中的每个空格替换成“%20”。
// 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
//方法一:使用toString()的replaceAll()方法
public class Solution {
    public String replaceSpace(StringBuffer str) {
        return str.toString().replaceAll(" ","%20");
    }
}