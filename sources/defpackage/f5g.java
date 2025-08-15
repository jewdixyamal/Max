package defpackage;

/* renamed from: f5g  reason: default package */
public final class f5g {
    public final e5g a;
    public final d5g b;
    public final z07 c;
    public final e d;

    public f5g(e5g e5g, d5g d5g, z07 z07, e eVar) {
        this.a = e5g;
        this.b = d5g;
        this.c = z07;
        this.d = eVar;
    }

    public final String a() {
        d5g d5g = this.b;
        String str = d5g != null ? d5g.a : null;
        return str == null ? "" : str;
    }

    public final boolean b() {
        return this.a == e5g.Y && this.c != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r2 = r2.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c() {
        /*
            r2 = this;
            e5g r0 = defpackage.e5g.c
            e5g r1 = r2.a
            if (r1 != r0) goto L_0x0014
            d5g r2 = r2.b
            if (r2 == 0) goto L_0x0014
            java.lang.String r2 = r2.a
            int r2 = r2.length()
            if (r2 <= 0) goto L_0x0014
            r2 = 1
            goto L_0x0015
        L_0x0014:
            r2 = 0
        L_0x0015:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f5g.c():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.f5g) r5;
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
            boolean r1 = r5 instanceof defpackage.f5g
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            f5g r5 = (defpackage.f5g) r5
            e5g r1 = r5.a
            e5g r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            d5g r1 = r4.b
            d5g r3 = r5.b
            boolean r1 = defpackage.tpa.f(r1, r3)
            if (r1 != 0) goto L_0x001e
            return r2
        L_0x001e:
            z07 r1 = r4.c
            z07 r3 = r5.c
            boolean r1 = defpackage.tpa.f(r1, r3)
            if (r1 != 0) goto L_0x0029
            return r2
        L_0x0029:
            e r4 = r4.d
            e r5 = r5.d
            boolean r4 = defpackage.tpa.f(r4, r5)
            if (r4 != 0) goto L_0x0034
            return r2
        L_0x0034:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f5g.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = 0;
        d5g d5g = this.b;
        int hashCode2 = (hashCode + (d5g == null ? 0 : d5g.hashCode())) * 31;
        z07 z07 = this.c;
        int hashCode3 = (hashCode2 + (z07 == null ? 0 : z07.hashCode())) * 31;
        e eVar = this.d;
        if (eVar != null) {
            i = eVar.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "Content(type=" + this.a + ", textContent=" + this.b + ", keyboard=" + this.c + ", icon=" + this.d + ")";
    }
}
