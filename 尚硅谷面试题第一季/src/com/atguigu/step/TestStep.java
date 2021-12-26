package com.atguigu.step;

public class TestStep {
    //实现f(n)一次只能走一步或者两步，走n步方法
    public static int f(int n) throws IllegalAccessException {
        if (n < 1) {
            throw new IllegalAccessException(n + "不能小于1");
        }
        if (n == 1 || n == 2) {
            return n;
        }
        return f(n-1) + f(n-2);
    }

    public static void main(String[] args) throws IllegalAccessException {
        long start = System.currentTimeMillis();
        System.out.println(f(100));
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
