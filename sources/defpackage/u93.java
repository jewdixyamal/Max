package defpackage;

import java.util.Map;

/* renamed from: u93  reason: default package */
public final class u93 extends m2 {
    public final Object a;
    public int b;
    public final /* synthetic */ v93 c;

    public u93(v93 v93, int i) {
        this.c = v93;
        Object obj = v93.u0;
        this.a = v93.i()[i];
        this.b = i;
    }

    public final void a() {
        int i = this.b;
        Object obj = this.a;
        v93 v93 = this.c;
        if (i != -1 && i < v93.size()) {
            if (f46.B(obj, v93.i()[this.b])) {
                return;
            }
        }
        Object obj2 = v93.u0;
        this.b = v93.d(obj);
    }

    public final Object getKey() {
        return this.a;
    }

    public final Object getValue() {
        v93 v93 = this.c;
        Map b2 = v93.b();
        if (b2 != null) {
            return b2.get(this.a);
        }
        a();
        int i = this.b;
        if (i == -1) {
            return null;
        }
        return v93.j()[i];
    }

    public final Object setValue(Object obj) {
        v93 v93 = this.c;
        Map b2 = v93.b();
        Object obj2 = this.a;
        if (b2 != null) {
            return b2.put(obj2, obj);
        }
        a();
        int i = this.b;
        if (i == -1) {
            v93.put(obj2, obj);
            return null;
        }
        Object obj3 = v93.j()[i];
        v93.j()[this.b] = obj;
        return obj3;
    }
}
