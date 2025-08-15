package defpackage;

import java.lang.ref.SoftReference;
import java.util.LinkedList;

/* renamed from: ky9  reason: default package */
public final class ky9 extends ps0 {
    public LinkedList f;

    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, jy9] */
    public final void a(Object obj) {
        jy9 jy9 = (jy9) this.f.poll();
        jy9 jy92 = jy9;
        if (jy9 == null) {
            ? obj2 = new Object();
            obj2.a = null;
            obj2.b = null;
            obj2.c = null;
            jy92 = obj2;
        }
        jy92.a = new SoftReference(obj);
        jy92.b = new SoftReference(obj);
        jy92.c = new SoftReference(obj);
        this.c.add(jy92);
    }

    public final Object b() {
        jy9 jy9 = (jy9) this.c.poll();
        jy9.getClass();
        SoftReference softReference = jy9.a;
        Object obj = softReference == null ? null : softReference.get();
        SoftReference softReference2 = jy9.a;
        if (softReference2 != null) {
            softReference2.clear();
            jy9.a = null;
        }
        SoftReference softReference3 = jy9.b;
        if (softReference3 != null) {
            softReference3.clear();
            jy9.b = null;
        }
        SoftReference softReference4 = jy9.c;
        if (softReference4 != null) {
            softReference4.clear();
            jy9.c = null;
        }
        this.f.add(jy9);
        return obj;
    }
}
