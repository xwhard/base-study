package com.xwhtest;

public class Test {
    class Solution {
        public int reverse(int x) {
            boolean flag = true;
            if(x<0){
                flag = false;
                x=-x;
            }
            int result = 0;
            while(x/10 >= 0){
                int a = x%10;
                result = result*10+a;
                x /= 10;
                if(x==0)
                    break;
            }
            if(!flag)
                result = 0-result;
            return result;
        }
    }
}
