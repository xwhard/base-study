package standard.leetcode.easy;

/**
 * @author:xwh
 * @date 2019/3/13 16:10
 */
// I可在VX前,X可在LC前,C可在DM前,则相减
public class P013_Easy004 {
    public int romanToInt(String s) {
        int[] digital = {1, 5, 10, 50, 100, 500, 1000};
        char[] vocabulary = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        int result = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length-1; i++) {
            char temp = chars[i];
            char later = chars[i + 1];
            if ('I' == temp) {
                if ('V' == later || 'X' == later) {
                    result -= 1;
                } else {
                    result += 1;
                }

            } else if ('V' == temp) {
                result += 5;
            } else if ('X' == temp) {
                if ('L' ==later || 'C' == later) {
                    result -= 10;
                } else {
                    result += 10;
                }
            } else if ('L' == temp) {
                result += 50;
            } else if ('C' == temp) {
                if ('D' == later || 'M' == later) {
                    result -= 100;
                } else {
                    result += 100;
                }
            } else if ('D' == temp) {
                result += 500;
            } else if ('M' == temp) {
                result += 1000;
            }
        }
        for (int i=0 ;i<vocabulary.length;i++){
            if(chars[chars.length-1]==vocabulary[i]){
                result += digital[i];
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String temp = "MCM";
        int result = new P013_Easy004().romanToInt(temp);
        System.out.println(result);
    }

}
