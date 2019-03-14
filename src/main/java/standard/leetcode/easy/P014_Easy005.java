package standard.leetcode.easy;


/**
 * @author:xwh
 * @date 2019/3/14 9:08
 */
public class P014_Easy005 {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }
        else{
            int maxLength = 0;
            int minLength = strs[0].length();
            String result = "";
            for (String s : strs) {
                if (s.length() > maxLength) {
                    maxLength = s.length();
                }
                if (s.length() < minLength) {
                    minLength = s.length();
                }

            }
            if (minLength != 0) {
                for (int i = 0; i < minLength; i++) {
                    boolean flag = true;
                    for (int j = 0; j < strs.length; j++) {
                        char temp = strs[0].charAt(i);
                        if (strs[j].charAt(i) != temp) {
                            flag = !flag;
                            break;
                        }
                    }
                    if (flag) {
                        result += strs[0].charAt(i);
                    } else {
                        break;
                    }
                }
            }
            return result;
        }

    }

    public static void main(String[] args) {
        String[] strings = {"aa","a"};
        String result = new P014_Easy005().longestCommonPrefix(strings);
        System.out.println(result);
    }
}
