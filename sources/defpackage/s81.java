package defpackage;

import java.util.Map;

/* renamed from: s81  reason: default package */
public final class s81 {
    public final boolean a;
    public final Map b;

    public s81(Map map, boolean z) {
        this.a = z;
        this.b = map;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.s81) r5;
        r1 = r5.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof defpackage.s81
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            s81 r5 = (defpackage.s81) r5
            boolean r1 = r5.a
            boolean r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            java.util.Map r4 = r4.b
            java.util.Map r5 = r5.b
            boolean r4 = defpackage.tpa.f(r4, r5)
            if (r4 != 0) goto L_0x001e
            return r2
        L_0x001e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s81.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "SelectedMode(isEnabled=" + this.a + ", selectedIds=" + this.b + ")";
    }

    public /* synthetic */ s81() {
        this(oz4.a, false);
    }
}
