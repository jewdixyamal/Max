package defpackage;

import java.io.Serializable;

/* renamed from: ugc  reason: default package */
public final class ugc implements Serializable {
    public final lna X;
    public final int a;
    public final int b;
    public final String c;
    public final tva o;

    public ugc(int i, int i2, String str, tva tva, lna lna) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.o = tva;
        this.X = lna;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.ugc) r5;
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
            boolean r1 = r5 instanceof defpackage.ugc
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            ugc r5 = (defpackage.ugc) r5
            int r1 = r5.a
            int r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            int r1 = r4.b
            int r3 = r5.b
            if (r1 == r3) goto L_0x001a
            return r2
        L_0x001a:
            java.lang.String r1 = r4.c
            java.lang.String r3 = r5.c
            boolean r1 = defpackage.tpa.f(r1, r3)
            if (r1 != 0) goto L_0x0025
            return r2
        L_0x0025:
            tva r1 = r4.o
            tva r3 = r5.o
            boolean r1 = defpackage.tpa.f(r1, r3)
            if (r1 != 0) goto L_0x0030
            return r2
        L_0x0030:
            lna r4 = r4.X
            lna r5 = r5.X
            boolean r4 = defpackage.tpa.f(r4, r5)
            if (r4 != 0) goto L_0x003b
            return r2
        L_0x003b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ugc.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int d = rh4.d(ey8.g(this.b, au1.s(this.a) * 31, 31), 31, this.c);
        int i = 0;
        tva tva = this.o;
        int hashCode = (d + (tva == null ? 0 : tva.hashCode())) * 31;
        lna lna = this.X;
        if (lna != null) {
            i = lna.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReplyButton(type=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "UNKNOWN" : "LOCATION" : "CONTACT" : "IMAGE" : "MESSAGE");
        sb.append(", intent=");
        int i2 = this.b;
        sb.append(i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "null" : "UNKNOWN" : "NEGATIVE" : "POSITIVE" : "DEFAULT");
        sb.append(", text=");
        sb.append(this.c);
        sb.append(", image=");
        sb.append(this.o);
        sb.append(", outgoingMessage=");
        sb.append(this.X);
        sb.append(")");
        return sb.toString();
    }
}
