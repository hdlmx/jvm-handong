package cn.hdlmx.stack;

public class Demo1 {
    public static void main(String[] args) {
        int a=0;
        byte[] placeholder;
        {
            placeholder = new byte[64 * 10240 * 1024];
        }
        //placeholder=null;
        int i = 0;

        System.gc();
        System.out.println(a);
    }
}
