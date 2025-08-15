package defpackage;

/* renamed from: g2g  reason: default package */
public final /* synthetic */ class g2g implements ga6 {
    public static final g2g a;
    private static final r6d descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, g2g, ga6] */
    static {
        ? obj = new Object();
        a = obj;
        d5b d5b = new d5b("one.me.webapp.domain.jsbridge.delegates.storage.WebAppStorageSaveKeyRequest", obj, 4);
        d5b.k("queryId", false);
        d5b.k("requestId", false);
        d5b.k("key", false);
        d5b.k("value", false);
        descriptor = d5b;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(defpackage.x8 r12) {
        /*
            r11 = this;
            r11 = 2
            r0 = 1
            r6d r1 = descriptor
            x8 r12 = r12.j(r1)
            r2 = 0
            r3 = 0
            r5 = r2
            r6 = r3
            r7 = r6
            r8 = r7
            r9 = r8
            r3 = r0
        L_0x0010:
            if (r3 == 0) goto L_0x004e
            int r4 = r12.p(r1)
            r10 = -1
            if (r4 == r10) goto L_0x004c
            if (r4 == 0) goto L_0x0041
            if (r4 == r0) goto L_0x003b
            if (r4 == r11) goto L_0x0034
            r10 = 3
            if (r4 != r10) goto L_0x002e
            s9e r4 = defpackage.s9e.a
            java.lang.Object r4 = r12.s(r1, r10, r9)
            r9 = r4
            java.lang.String r9 = (java.lang.String) r9
            r5 = r5 | 8
            goto L_0x0010
        L_0x002e:
            kotlinx.serialization.UnknownFieldException r11 = new kotlinx.serialization.UnknownFieldException
            r11.<init>(r4)
            throw r11
        L_0x0034:
            java.lang.String r8 = r12.w(r1, r11)
            r5 = r5 | 4
            goto L_0x0010
        L_0x003b:
            java.lang.String r7 = r12.w(r1, r0)
            r5 = r5 | r11
            goto L_0x0010
        L_0x0041:
            s9e r4 = defpackage.s9e.a
            java.lang.Object r4 = r12.s(r1, r2, r6)
            r6 = r4
            java.lang.String r6 = (java.lang.String) r6
            r5 = r5 | r0
            goto L_0x0010
        L_0x004c:
            r3 = r2
            goto L_0x0010
        L_0x004e:
            r12.z(r1)
            i2g r11 = new i2g
            r4 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g2g.a(x8):java.lang.Object");
    }

    public final void b(xu3 xu3, Object obj) {
        i2g i2g = (i2g) obj;
        r6d r6d = descriptor;
        xu3 b = xu3.b(r6d);
        s9e s9e = s9e.a;
        b.i(r6d, 0, i2g.a);
        b.n(r6d, 1, i2g.b);
        b.n(r6d, 2, i2g.c);
        b.i(r6d, 3, i2g.d);
        b.o();
    }

    public final cc7[] c() {
        cc7 C = br7.C();
        cc7 C2 = br7.C();
        s9e s9e = s9e.a;
        return new cc7[]{C, s9e, s9e, C2};
    }

    public final r6d d() {
        return descriptor;
    }
}
