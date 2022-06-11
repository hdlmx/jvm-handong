package cn.hdlmx.stack;

public class StackFIFO {
    static void m1() {
        System.out.println("开始执行m1方法");
        m2();
        System.out.println("方法m1()执行完毕");
    }
    static void m2() {
        System.out.println("开始执行m2方法");
        m3();
        System.out.println("方法m2()执行完毕");
    }
    static int m3() {
        System.out.println("开始执行m3方法");
        int i = 0;
        long j=1L;
        System.out.println("方法m3()执行完毕");
        return i;
    }

    public static void main(String[] args) {
        m1();
    }
}
