package defpackage;

import java.util.HashMap;

/* renamed from: xb5  reason: default package */
public final class xb5 extends rqc {
    public final HashMap X = new HashMap();

    public final oqc a(Object obj) {
        return (oqc) this.X.get(obj);
    }

    public final Object b(Object obj, Object obj2) {
        oqc a = a(obj);
        if (a != null) {
            return a.b;
        }
        HashMap hashMap = this.X;
        oqc oqc = new oqc(obj, obj2);
        this.o++;
        oqc oqc2 = this.b;
        if (oqc2 == null) {
            this.a = oqc;
            this.b = oqc;
        } else {
            oqc2.c = oqc;
            oqc.o = oqc2;
            this.b = oqc;
        }
        hashMap.put(obj, oqc);
        return null;
    }

    public final Object c(Object obj) {
        Object c = super.c(obj);
        this.X.remove(obj);
        return c;
    }
}
