package defpackage;

/* renamed from: o22  reason: default package */
public final class o22 implements q22 {
    public final int a;
    public final n22 b;
    public final String c;
    public final jqe d;
    public final Integer e;
    public final boolean f;

    public o22(int i, n22 n22, String str, jqe jqe, Integer num, boolean z) {
        this.a = i;
        this.b = n22;
        this.c = str;
        this.d = jqe;
        this.e = num;
        this.f = z;
    }

    public static o22 a(o22 o22, String str, jqe jqe, Integer num, boolean z, int i) {
        if ((i & 4) != 0) {
            str = o22.c;
        }
        String str2 = str;
        if ((i & 32) != 0) {
            z = o22.f;
        }
        return new o22(o22.a, o22.b, str2, jqe, num, z);
    }

    public final boolean b(q22 q22) {
        if (q22 == null || !(q22 instanceof o22)) {
            return false;
        }
        o22 o22 = (o22) q22;
        return this.b != o22.b || !tpa.f(this.c, o22.c);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.o22) r5;
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
            boolean r1 = r5 instanceof defpackage.o22
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            o22 r5 = (defpackage.o22) r5
            int r1 = r5.a
            int r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            n22 r1 = r4.b
            n22 r3 = r5.b
            if (r1 == r3) goto L_0x001a
            return r2
        L_0x001a:
            java.lang.String r1 = r4.c
            java.lang.String r3 = r5.c
            boolean r1 = defpackage.tpa.f(r1, r3)
            if (r1 != 0) goto L_0x0025
            return r2
        L_0x0025:
            jqe r1 = r4.d
            jqe r3 = r5.d
            boolean r1 = defpackage.tpa.f(r1, r3)
            if (r1 != 0) goto L_0x0030
            return r2
        L_0x0030:
            java.lang.Integer r1 = r4.e
            java.lang.Integer r3 = r5.e
            boolean r1 = defpackage.tpa.f(r1, r3)
            if (r1 != 0) goto L_0x003b
            return r2
        L_0x003b:
            boolean r4 = r4.f
            boolean r5 = r5.f
            if (r4 == r5) goto L_0x0042
            return r2
        L_0x0042:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o22.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31;
        int i = 0;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        jqe jqe = this.d;
        int hashCode3 = (hashCode2 + (jqe == null ? 0 : jqe.hashCode())) * 31;
        Integer num = this.e;
        if (num != null) {
            i = num.hashCode();
        }
        return Boolean.hashCode(this.f) + ((hashCode3 + i) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Chat(title=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", link=");
        sb.append(this.c);
        sb.append(", hint=");
        sb.append(this.d);
        sb.append(", hintColor=");
        sb.append(this.e);
        sb.append(", hasError=");
        return au1.j(sb, this.f, ")");
    }

    public /* synthetic */ o22(n22 n22, String str) {
        this(vea.d2, n22, str, (jqe) null, (Integer) null, false);
    }
}
