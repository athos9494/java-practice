/*左旋转字符串
* 字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。请定义一个函数实现字符串左旋转操作的功能。
* 比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。
* 输入: s = "abcdefg", k = 2
输出: "cdefgab"
*/

public class Solution {
    public String reverseLeftWords(String s, int n) {
        char[] chars = s.toCharArray();
        char[] newChar = new char[chars.length];
        for (int i = 0,j = n; i < chars.length - n&&j< chars.length; i++,j++) {
            newChar[i] = chars[j];
        }
        for (int i = chars.length-n,j = 0; i < chars.length&&j<n; i++,j++) {
            newChar[i] = chars[j];
        }
        System.out.println(String.valueOf(newChar));
        return String.valueOf(newChar);
    }

    public static void main(String[] args) {
        new Solution().reverseLeftWords("abcdefg",2);
    }
}
