package defpackage;

/* renamed from: wvc  reason: default package */
public final class wvc {
    public static final wvc e = new wvc(xvc.o, (kvc) null, false, (CharSequence) null);
    public final xvc a;
    public final kvc b;
    public final boolean c;
    public final CharSequence d;

    public wvc(xvc xvc, kvc kvc, boolean z, CharSequence charSequence) {
        this.a = xvc;
        this.b = kvc;
        this.c = z;
        this.d = charSequence;
    }

    public static wvc a(wvc wvc, xvc xvc, kvc kvc, boolean z, String str, int i) {
        if ((i & 1) != 0) {
            xvc = wvc.a;
        }
        if ((i & 2) != 0) {
            kvc = wvc.b;
        }
        if ((i & 4) != 0) {
            z = wvc.c;
        }
        CharSequence charSequence = str;
        if ((i & 8) != 0) {
            charSequence = wvc.d;
        }
        wvc.getClass();
        return new wvc(xvc, kvc, z, charSequence);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.wvc) r5;
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
            boolean r1 = r5 instanceof defpackage.wvc
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            wvc r5 = (defpackage.wvc) r5
            xvc r1 = r5.a
            xvc r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            kvc r1 = r4.b
            kvc r3 = r5.b
            boolean r1 = defpackage.tpa.f(r1, r3)
            if (r1 != 0) goto L_0x001e
            return r2
        L_0x001e:
            boolean r1 = r4.c
            boolean r3 = r5.c
            if (r1 == r3) goto L_0x0025
            return r2
        L_0x0025:
            java.lang.CharSequence r4 = r4.d
            java.lang.CharSequence r5 = r5.d
            boolean r4 = defpackage.tpa.f(r4, r5)
            if (r4 != 0) goto L_0x0030
            return r2
        L_0x0030:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wvc.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = 0;
        kvc kvc = this.b;
        int d2 = ms2.d((hashCode + (kvc == null ? 0 : kvc.hashCode())) * 31, 31, this.c);
        CharSequence charSequence = this.d;
        if (charSequence != null) {
            i = charSequence.hashCode();
        }
        return d2 + i;
    }

    public final String toString() {
        return "ScreenRecordData(state=" + this.a + ", data=" + this.b + ", isApproved=" + this.c + ", recordUserName=" + this.d + ")";
    }
}
