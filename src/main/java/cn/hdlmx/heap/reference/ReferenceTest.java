package cn.hdlmx.heap.reference;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;

public class ReferenceTest {
    public static void main(String[] args) {
        SoftReference<Object> softReference = new SoftReference<>(new Object());
        Object o = softReference.get();

        System.out.println(softReference);

        Object obj = new Object();
        PhantomReference<Object> pf = new PhantomReference<Object>(obj, new ReferenceQueue<Object>());
        obj = null;

    }
}
