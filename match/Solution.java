package match;

/**
 * @author LXY
 * @email 403824215@qq.com
 * @date 2018/7/28 15:44
 */
public class Solution {
    public boolean match(char[] str, char[] pattern)
    {
        if(str == null || pattern == null)
        {
            return false;
        }
        int strIndex = 0;
        int patternIndex = 0;
        return matchCore(str,strIndex,pattern,patternIndex);
    }

    private boolean matchCore(char[] str, int strIndex, char[] pattern, int patternIndex) {
        if(strIndex == str.length && patternIndex == pattern.length)
        {
            //待匹配字符串和正则表达式都到达结尾，表示匹配结束，成功
            return true;
        }
        if(strIndex != str.length && patternIndex == pattern.length)
        {
            //正则表达式判断结束，但是待匹配字符串没有结束，表示匹配失败
            return false;
        }
        if(strIndex == str.length && patternIndex != pattern.length)
        {
            //待匹配字符串匹配结束，但是正则表达式没有结束，不一定失败，只要后面是x*x*x*x*x*的情况就可以
            if(patternIndex + 1 < pattern.length && pattern[patternIndex + 1] =='*')
            {
                return matchCore(str,strIndex,pattern,patternIndex + 2);
            }
            //否则匹配失败
            return false;
        }
        //下面为待匹配字符串和正则表达式都未匹配结束的情况
        if(patternIndex + 1 < pattern.length && pattern[patternIndex + 1] == '*')
        {
            //正则表达式未判断结束 && 正则表达式待判断字符的下一个字符为*
            if((pattern[patternIndex] == str[strIndex]) || (pattern[patternIndex] == '.' && strIndex != str.length))
            {
                //正则表达式正判断字符 = 带判断字符串正在判断的字符 || 正则表达式正判断字符为 . 且 带判断字符串也没有判断结束
                return matchCore(str,strIndex,pattern,patternIndex + 2)//匹配*字符但是匹配到0个，结束
                        || matchCore(str,strIndex + 1,pattern,patternIndex + 2)//匹配*字符匹配到一个，结束
                        || matchCore(str,strIndex + 1,pattern,patternIndex);//匹配*字符匹配到一个，继续往下匹配
            }
            else
            {
                //跳过*字符
                return matchCore(str,strIndex,pattern,patternIndex +2);
            }
        }
        if(pattern[patternIndex] == str[strIndex] || (pattern[patternIndex] == '.' && strIndex != str.length))
        {
            //正则表达式正匹配字符与待匹配字符串正匹配字符相等 || 正则表达式正匹配字符为 . 且待匹配字符串没有匹配结束
            return matchCore(str,strIndex + 1,pattern,patternIndex + 1);
        }
        return false;
    }
}