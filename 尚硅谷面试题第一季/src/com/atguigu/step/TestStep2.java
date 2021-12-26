package com.atguigu.step;

import org.junit.Test;

public class TestStep2 {
    public int f(int n) throws IllegalAccessException {
        if (n < 1) {
            throw new IllegalAccessException(n+"不能小于1");
        }
        if (n == 1 || n == 2) {
            return n;
        }
        int one = 1;//初始化最后一步走一步的方法有
        int two = 1;//初始化最后一步走两步的方法有
        int sum = 2;//f(2)=2
        for (int i = 3; i <=n ; i++) {
            two = one;
            one = sum;
            sum = one + two;
        }
        return sum;
    }
    @Test
    public void test(){
        try {
            System.out.println(f(100));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
