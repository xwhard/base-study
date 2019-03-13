package standard.leetcode.easy;

/**
 * @author:xwh
 * @date 2019/3/13 10:37
 */
public class P007_Easy002 {
    public int reverse(int x) {
        boolean flag = true;
        if (x < 0) {
            flag = false;
            x = -x;
        }
        int result = 0, a = 0, newResult = 0;
        while (x != 0) {
            a = x % 10;
            newResult = result;
            result = result * 10 + a;
            x /= 10;
        }
        if ((result - a) / 10 != newResult)
            return 0;
        if (!flag)
            result = 0 - result;
        return result;
    }


    public static void main(String[] args) {
        int number = 123;
//        int number = -123;
//        int number = -320;
//        int number = 320;
//        int number = 1233543539;
//        int number = -1343434329;
        int result = new P007_Easy002().reverse(number);
        System.out.println(result);

    }
}
