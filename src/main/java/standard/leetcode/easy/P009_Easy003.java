package standard.leetcode.easy;

/**
 * @author:xwh
 * @date 2019/3/13 15:00
 */
public class P009_Easy003 {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        else if(x==0)
            return true;
        else {
            String a = Integer.toString(x);
            char[] chars = a.toCharArray();
            for(int i = 0;i<chars.length/2+1;i++){
                if(chars[i]!=chars[chars.length-i-1]){
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        int number = -1210;
        boolean flag = new P009_Easy003().isPalindrome(number);
        System.out.println(flag);
    }
}
