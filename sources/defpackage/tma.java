package defpackage;

import java.util.Objects;

/* renamed from: tma  reason: default package */
public final class tma {
    public static final tma b = new tma((Object) null);
    public final Object a;

    public tma(Object obj) {
        this.a = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r2 = (defpackage.tma) r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            boolean r0 = r2 instanceof defpackage.tma
            if (r0 == 0) goto L_0x0016
            tma r2 = (defpackage.tma) r2
            if (r2 == r1) goto L_0x0014
            if (r2 == 0) goto L_0x0016
            java.lang.Object r1 = r1.a
            java.lang.Object r2 = r2.a
            boolean r1 = java.util.Objects.equals(r1, r2)
            if (r1 == 0) goto L_0x0016
        L_0x0014:
            r1 = 1
            goto L_0x0017
        L_0x0016:
            r1 = 0
        L_0x0017:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tma.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    public final String toString() {
        Object obj = this.a;
        return obj != null ? String.format("Optional[%s]", new Object[]{obj}) : "Optional.empty";
    }
}
