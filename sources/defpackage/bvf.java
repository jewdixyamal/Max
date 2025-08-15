package defpackage;

/* renamed from: bvf  reason: default package */
public final /* synthetic */ class bvf implements ga6 {
    public static final bvf a;
    private static final r6d descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [bvf, java.lang.Object, ga6] */
    static {
        ? obj = new Object();
        a = obj;
        d5b d5b = new d5b("one.me.webapp.domain.jsbridge.delegates.biometry.WebAppBiometryInfoResponse", obj, 7);
        d5b.k("requestId", false);
        d5b.k("available", false);
        d5b.k("type", false);
        d5b.k("accessRequested", false);
        d5b.k("accessGranted", false);
        d5b.k("tokenSaved", false);
        d5b.k("deviceId", false);
        descriptor = d5b;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(defpackage.x8 r15) {
        /*
            r14 = this;
            r6d r14 = descriptor
            x8 r15 = r15.j(r14)
            cc7[] r0 = defpackage.dvf.h
            r1 = 1
            r2 = 0
            r3 = 0
            r5 = r2
            r7 = r5
            r9 = r7
            r10 = r9
            r11 = r10
            r6 = r3
            r8 = r6
            r12 = r8
            r3 = r1
        L_0x0014:
            if (r3 == 0) goto L_0x0060
            int r4 = r15.p(r14)
            switch(r4) {
                case -1: goto L_0x005e;
                case 0: goto L_0x0057;
                case 1: goto L_0x0050;
                case 2: goto L_0x0043;
                case 3: goto L_0x003b;
                case 4: goto L_0x0033;
                case 5: goto L_0x002b;
                case 6: goto L_0x0023;
                default: goto L_0x001d;
            }
        L_0x001d:
            kotlinx.serialization.UnknownFieldException r14 = new kotlinx.serialization.UnknownFieldException
            r14.<init>(r4)
            throw r14
        L_0x0023:
            r4 = 6
            java.lang.String r12 = r15.w(r14, r4)
            r5 = r5 | 64
            goto L_0x0014
        L_0x002b:
            r4 = 5
            boolean r11 = r15.o(r14, r4)
            r5 = r5 | 32
            goto L_0x0014
        L_0x0033:
            r4 = 4
            boolean r10 = r15.o(r14, r4)
            r5 = r5 | 16
            goto L_0x0014
        L_0x003b:
            r4 = 3
            boolean r9 = r15.o(r14, r4)
            r5 = r5 | 8
            goto L_0x0014
        L_0x0043:
            r4 = 2
            r13 = r0[r4]
            java.lang.Object r4 = r15.t(r14, r4, r13, r8)
            r8 = r4
            java.util.List r8 = (java.util.List) r8
            r5 = r5 | 4
            goto L_0x0014
        L_0x0050:
            boolean r7 = r15.o(r14, r1)
            r5 = r5 | 2
            goto L_0x0014
        L_0x0057:
            java.lang.String r6 = r15.w(r14, r2)
            r5 = r5 | 1
            goto L_0x0014
        L_0x005e:
            r3 = r2
            goto L_0x0014
        L_0x0060:
            r15.z(r14)
            dvf r14 = new dvf
            r4 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvf.a(x8):java.lang.Object");
    }

    public final void b(xu3 xu3, Object obj) {
        dvf dvf = (dvf) obj;
        r6d r6d = descriptor;
        xu3 b = xu3.b(r6d);
        b.n(r6d, 0, dvf.a);
        b.e(r6d, 1, dvf.b);
        b.k(r6d, 2, dvf.h[2], dvf.c);
        b.e(r6d, 3, dvf.d);
        b.e(r6d, 4, dvf.e);
        b.e(r6d, 5, dvf.f);
        b.n(r6d, 6, dvf.g);
        b.o();
    }

    public final cc7[] c() {
        cc7 cc7 = dvf.h[2];
        s9e s9e = s9e.a;
        zp0 zp0 = zp0.a;
        return new cc7[]{s9e, zp0, cc7, zp0, zp0, zp0, s9e};
    }

    public final r6d d() {
        return descriptor;
    }
}
