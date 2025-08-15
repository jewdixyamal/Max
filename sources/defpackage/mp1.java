package defpackage;

import java.util.List;

/* renamed from: mp1  reason: default package */
public final class mp1 {
    public final int a;
    public final List b;
    public final List c;

    public mp1(int i, List list, List list2) {
        this.a = i;
        this.b = list;
        this.c = list2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.mp1) r5;
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
            boolean r1 = r5 instanceof defpackage.mp1
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            mp1 r5 = (defpackage.mp1) r5
            int r1 = r5.a
            int r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            java.util.List r1 = r4.b
            java.util.List r3 = r5.b
            boolean r1 = defpackage.tpa.f(r1, r3)
            if (r1 != 0) goto L_0x001e
            return r2
        L_0x001e:
            java.util.List r4 = r4.c
            java.util.List r5 = r5.c
            boolean r4 = defpackage.tpa.f(r4, r5)
            if (r4 != 0) goto L_0x0029
            return r2
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mp1.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return this.c.hashCode() + k7d.g(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Attendee(totalCount=");
        sb.append(this.a);
        sb.append(", addedParticipantIds=");
        sb.append(this.b);
        sb.append(", removedParticipantIds=");
        return au1.i(sb, this.c, ")");
    }
}
