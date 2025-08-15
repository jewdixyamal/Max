package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: rqc  reason: default package */
public class rqc implements Iterable {
    public oqc a;
    public oqc b;
    public final WeakHashMap c = new WeakHashMap();
    public int o = 0;

    public oqc a(Object obj) {
        oqc oqc = this.a;
        while (oqc != null && !oqc.a.equals(obj)) {
            oqc = oqc.c;
        }
        return oqc;
    }

    public Object b(Object obj, Object obj2) {
        oqc a2 = a(obj);
        if (a2 != null) {
            return a2.b;
        }
        oqc oqc = new oqc(obj, obj2);
        this.o++;
        oqc oqc2 = this.b;
        if (oqc2 == null) {
            this.a = oqc;
            this.b = oqc;
            return null;
        }
        oqc2.c = oqc;
        oqc.o = oqc2;
        this.b = oqc;
        return null;
    }

    public Object c(Object obj) {
        oqc a2 = a(obj);
        if (a2 == null) {
            return null;
        }
        this.o--;
        WeakHashMap weakHashMap = this.c;
        if (!weakHashMap.isEmpty()) {
            for (qqc a3 : weakHashMap.keySet()) {
                a3.a(a2);
            }
        }
        oqc oqc = a2.o;
        if (oqc != null) {
            oqc.c = a2.c;
        } else {
            this.a = a2.c;
        }
        oqc oqc2 = a2.c;
        if (oqc2 != null) {
            oqc2.o = oqc;
        } else {
            this.b = oqc;
        }
        a2.c = null;
        a2.o = null;
        return a2.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0048, code lost:
        if (r1.hasNext() != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
        if (((defpackage.nqc) r6).hasNext() != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r6 instanceof defpackage.rqc
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            rqc r6 = (defpackage.rqc) r6
            int r1 = r5.o
            int r3 = r6.o
            if (r1 == r3) goto L_0x0013
            return r2
        L_0x0013:
            java.util.Iterator r5 = r5.iterator()
            java.util.Iterator r6 = r6.iterator()
        L_0x001b:
            r1 = r5
            nqc r1 = (defpackage.nqc) r1
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0044
            r3 = r6
            nqc r3 = (defpackage.nqc) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0044
            java.lang.Object r1 = r1.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r3 = r3.next()
            if (r1 != 0) goto L_0x003b
            if (r3 != 0) goto L_0x0043
        L_0x003b:
            if (r1 == 0) goto L_0x001b
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x001b
        L_0x0043:
            return r2
        L_0x0044:
            boolean r5 = r1.hasNext()
            if (r5 != 0) goto L_0x0053
            nqc r6 = (defpackage.nqc) r6
            boolean r5 = r6.hasNext()
            if (r5 != 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r0 = r2
        L_0x0054:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rqc.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (true) {
            nqc nqc = (nqc) it;
            if (!nqc.hasNext()) {
                return i;
            }
            i += ((Map.Entry) nqc.next()).hashCode();
        }
    }

    public final Iterator iterator() {
        nqc nqc = new nqc(this.a, this.b, 0);
        this.c.put(nqc, Boolean.FALSE);
        return nqc;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            nqc nqc = (nqc) it;
            if (nqc.hasNext()) {
                sb.append(((Map.Entry) nqc.next()).toString());
                if (nqc.hasNext()) {
                    sb.append(", ");
                }
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
