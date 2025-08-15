package defpackage;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: mi9  reason: default package */
public final class mi9 extends wma implements vh9 {
    /* JADX WARNING: type inference failed for: r0v0, types: [wma, mi9] */
    public static mi9 b() {
        return new wma(new TreeMap(wma.b));
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [wma, mi9] */
    public static mi9 c(ce3 ce3) {
        TreeMap treeMap = new TreeMap(wma.b);
        for (aa0 aa0 : ce3.g()) {
            Set<be3> i = ce3.i(aa0);
            ArrayMap arrayMap = new ArrayMap();
            for (be3 be3 : i) {
                arrayMap.put(be3, ce3.l(aa0, be3));
            }
            treeMap.put(aa0, arrayMap);
        }
        return new wma(treeMap);
    }

    public final void d(aa0 aa0, be3 be3, Object obj) {
        be3 be32;
        TreeMap treeMap = this.a;
        Map map = (Map) treeMap.get(aa0);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            treeMap.put(aa0, arrayMap);
            arrayMap.put(be3, obj);
            return;
        }
        be3 be33 = (be3) Collections.min(map.keySet());
        if (!Objects.equals(map.get(be33), obj) && be33 == (be32 = be3.c) && be3 == be32) {
            throw new IllegalArgumentException("Option values conflicts: " + aa0.a + ", existing value (" + be33 + ")=" + map.get(be33) + ", conflicting (" + be3 + ")=" + obj);
        }
        map.put(be3, obj);
    }

    public final void j(aa0 aa0, Object obj) {
        d(aa0, be3.o, obj);
    }
}
