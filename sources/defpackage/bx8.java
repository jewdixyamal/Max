package defpackage;

import java.io.Serializable;

/* renamed from: bx8  reason: default package */
public final class bx8 implements Serializable {
    public final gx8 a;
    public final String b;

    public bx8(gx8 gx8, String str) {
        this.a = gx8;
        this.b = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.bx8) r5;
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
            boolean r1 = r5 instanceof defpackage.bx8
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            bx8 r5 = (defpackage.bx8) r5
            gx8 r1 = r5.a
            gx8 r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            java.lang.String r4 = r4.b
            java.lang.String r5 = r5.b
            boolean r4 = defpackage.tpa.f(r4, r5)
            if (r4 != 0) goto L_0x001e
            return r2
        L_0x001e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bx8.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessageReaction(reactionType=");
        sb.append(this.a);
        sb.append(", id=");
        return zr6.l(sb, this.b, ")");
    }
}
