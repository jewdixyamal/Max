package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: jc7  reason: default package */
public final class jc7 implements Serializable {
    public final Object a;

    public jc7(String str) {
        this.a = str;
    }

    public void a(Object obj, Object obj2) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.a;
        List list = (List) linkedHashMap.get(obj);
        if (list == null) {
            list = new ArrayList();
            linkedHashMap.put(obj, list);
        }
        list.add(obj2);
    }

    public int b() {
        int i = 0;
        for (List size : ((LinkedHashMap) this.a).values()) {
            i += size.size();
        }
        return i;
    }

    public jc7(o9g o9g) {
        this.a = (List) o9g.b;
    }

    public jc7() {
        this.a = new LinkedHashMap();
    }
}
