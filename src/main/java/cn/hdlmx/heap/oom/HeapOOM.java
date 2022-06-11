package cn.hdlmx.heap.oom;

import java.util.ArrayList;
import java.util.List;

public class HeapOOM {
    static class OOMObject {

    }

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<>(1000*1024*1024);
        while (true) {
            list.add(new OOMObject());
        }
    }
}
