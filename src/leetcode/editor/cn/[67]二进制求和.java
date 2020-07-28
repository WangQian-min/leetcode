//给你两个二进制字符串，返回它们的和（用二进制表示）。 
//
// 输入为 非空 字符串且只包含数字 1 和 0。 
//
// 
//
// 示例 1: 
//
// 输入: a = "11", b = "1"
//输出: "100" 
//
// 示例 2: 
//
// 输入: a = "1010", b = "1011"
//输出: "10101" 
//
// 
//
// 提示： 
//
// 
// 每个字符串仅由字符 '0' 或 '1' 组成。 
// 1 <= a.length, b.length <= 10^4 
// 字符串如果不是 "0" ，就都不含前导零。 
// 
// Related Topics 数学 字符串


import com.sun.org.apache.regexp.internal.RE;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    StringBuilder sb = new StringBuilder();
    public String addBinary(String a, String b) {
        add(a, a.length()-1, b, b.length()-1, 0);
        return sb.reverse().toString();

    }
    public void add(String a, int aIdx, String b, int bIdx, int count) {
        int sum = 0;
        if (aIdx >= 0 && bIdx >= 0)
            sum = Integer.parseInt(String.valueOf(a.charAt(aIdx))) + Integer.parseInt(String.valueOf(b.charAt(bIdx))) + count;
            else if (aIdx >= 0 && bIdx < 0)
                sum = Integer.parseInt(String.valueOf(a.charAt(aIdx))) + 0 + count;
             else if ( aIdx < 0 && bIdx >= 0 )
                sum = 0 + Integer.parseInt(String.valueOf(b.charAt(bIdx))) + count;
             else {
                if (count == 1) {
                 sb.append('1');
                 }
            return;
                }
            switch (sum) {
                case 0:
                    sb.append('0');
                    add(a, aIdx - 1, b, bIdx - 1, 0);
                    break; //可选
                case 1:
                    sb.append('1');
                    add(a, aIdx - 1, b, bIdx - 1, 0);
                    break; //可选
                //你可以有任意数量的case语句
                case 2: //可选
                    sb.append('0');
                    add(a, aIdx - 1, b, bIdx - 1, 1);
                    break; //可选
                case 3: //可选
                    sb.append('1');
                    add(a, aIdx - 1, b, bIdx - 1, 1);
                    break; //可选
            }
        }

    }

//leetcode submit region end(Prohibit modification and deletion)
