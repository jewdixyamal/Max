package defpackage;

import java.util.List;

/* renamed from: jp1  reason: default package */
public final class jp1 {
    public final nnf a;
    public final List b;
    public final w4f c;
    public final qd7 d;
    public final boolean e;
    public final md0 f;
    public final boolean g;

    public jp1(nnf nnf, List list, w4f w4f, qd7 qd7, boolean z, md0 md0, boolean z2) {
        this.a = nnf;
        this.b = list;
        this.c = w4f;
        this.d = qd7;
        this.e = z;
        this.f = md0;
        this.g = z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.jp1) r5;
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
            boolean r1 = r5 instanceof defpackage.jp1
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            jp1 r5 = (defpackage.jp1) r5
            nnf r1 = r5.a
            nnf r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            java.util.List r1 = r4.b
            java.util.List r3 = r5.b
            boolean r1 = defpackage.tpa.f(r1, r3)
            if (r1 != 0) goto L_0x001e
            return r2
        L_0x001e:
            w4f r1 = r4.c
            w4f r3 = r5.c
            boolean r1 = defpackage.tpa.f(r1, r3)
            if (r1 != 0) goto L_0x0029
            return r2
        L_0x0029:
            qd7 r1 = r4.d
            qd7 r3 = r5.d
            boolean r1 = defpackage.tpa.f(r1, r3)
            if (r1 != 0) goto L_0x0034
            return r2
        L_0x0034:
            boolean r1 = r4.e
            boolean r3 = r5.e
            if (r1 == r3) goto L_0x003b
            return r2
        L_0x003b:
            md0 r1 = r4.f
            md0 r3 = r5.f
            boolean r1 = defpackage.tpa.f(r1, r3)
            if (r1 != 0) goto L_0x0046
            return r2
        L_0x0046:
            boolean r4 = r4.g
            boolean r5 = r5.g
            if (r4 == r5) goto L_0x004d
            return r2
        L_0x004d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jp1.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int g2 = k7d.g(this.b, this.a.hashCode() * 31, 31);
        int i = 0;
        w4f w4f = this.c;
        int hashCode = (g2 + (w4f == null ? 0 : w4f.hashCode())) * 31;
        qd7 qd7 = this.d;
        int d2 = ms2.d((hashCode + (qd7 == null ? 0 : qd7.hashCode())) * 31, 31, this.e);
        md0 md0 = this.f;
        if (md0 != null) {
            i = md0.hashCode();
        }
        return Boolean.hashCode(this.g) + ((d2 + i) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallViewState(activeMode=");
        sb.append(this.a);
        sb.append(", modes=");
        sb.append(this.b);
        sb.append(", unavailableCallState=");
        sb.append(this.c);
        sb.append(", labelSpeakerState=");
        sb.append(this.d);
        sb.append(", isGroupCall=");
        sb.append(this.e);
        sb.append(", mainSpeakerAvatar=");
        sb.append(this.f);
        sb.append(", isCallEventsUnavailable=");
        return au1.j(sb, this.g, ")");
    }
}
