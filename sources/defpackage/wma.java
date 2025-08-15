package defpackage;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: wma  reason: default package */
public class wma implements ce3 {
    public static final ye4 b;
    public static final wma c;
    public final TreeMap a;

    static {
        ye4 ye4 = new ye4(12);
        b = ye4;
        c = new wma(new TreeMap(ye4));
    }

    public wma(TreeMap treeMap) {
        this.a = treeMap;
    }

    public static wma a(ce3 ce3) {
        if (wma.class.equals(ce3.getClass())) {
            return (wma) ce3;
        }
        TreeMap treeMap = new TreeMap(b);
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

    public final void e(f9 f9Var) {
        for (Map.Entry entry : this.a.tailMap(new aa0(Void.class, (Object) null, "camera2.captureRequest.option.")).entrySet()) {
            if (((aa0) entry.getKey()).a.startsWith("camera2.captureRequest.option.")) {
                aa0 aa0 = (aa0) entry.getKey();
                ce3 ce3 = (ce3) f9Var.c;
                ((mi9) ((wd6) f9Var.b).b).d(aa0, ce3.q(aa0), ce3.h(aa0));
            } else {
                return;
            }
        }
    }

    public final Object f(aa0 aa0, Object obj) {
        try {
            return h(aa0);
        } catch (IllegalArgumentException unused) {
            return obj;
        }
    }

    public final Set g() {
        return Collections.unmodifiableSet(this.a.keySet());
    }

    public final Object h(aa0 aa0) {
        Map map = (Map) this.a.get(aa0);
        if (map != null) {
            return map.get((be3) Collections.min(map.keySet()));
        }
        throw new IllegalArgumentException("Option does not exist: " + aa0);
    }

    public final Set i(aa0 aa0) {
        Map map = (Map) this.a.get(aa0);
        return map == null ? Collections.emptySet() : Collections.unmodifiableSet(map.keySet());
    }

    public final Object l(aa0 aa0, be3 be3) {
        Map map = (Map) this.a.get(aa0);
        if (map == null) {
            throw new IllegalArgumentException("Option does not exist: " + aa0);
        } else if (map.containsKey(be3)) {
            return map.get(be3);
        } else {
            throw new IllegalArgumentException("Option does not exist: " + aa0 + " with priority=" + be3);
        }
    }

    public final boolean o(aa0 aa0) {
        return this.a.containsKey(aa0);
    }

    public final be3 q(aa0 aa0) {
        Map map = (Map) this.a.get(aa0);
        if (map != null) {
            return (be3) Collections.min(map.keySet());
        }
        throw new IllegalArgumentException("Option does not exist: " + aa0);
    }
}
