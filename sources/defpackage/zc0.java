package defpackage;

/* renamed from: zc0  reason: default package */
public final class zc0 {
    public final je7 a;
    public final i56 b;
    public final khe c = new khe(new m(17));

    public zc0(int i, je7 je7) {
        this.a = je7;
        this.b = new i56(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(defpackage.nl2 r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.xc0
            if (r0 == 0) goto L_0x0013
            r0 = r6
            xc0 r0 = (defpackage.xc0) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.s0 = r1
            goto L_0x0018
        L_0x0013:
            xc0 r0 = new xc0
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            nl2 r5 = r0.X
            zc0 r4 = r0.o
            defpackage.od2.a0(r6)
            goto L_0x0043
        L_0x002b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0033:
            defpackage.od2.a0(r6)
            r0.o = r4
            r0.X = r5
            r0.s0 = r3
            java.io.Serializable r6 = r4.b(r5, r0)
            if (r6 != r1) goto L_0x0043
            return r1
        L_0x0043:
            kpa r6 = (defpackage.kpa) r6
            if (r6 == 0) goto L_0x0053
            i56 r4 = r4.b
            long r0 = r5.a
            java.lang.Long r5 = new java.lang.Long
            r5.<init>(r0)
            r4.put(r5, r6)
        L_0x0053:
            e5f r4 = defpackage.e5f.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zc0.a(nl2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0080 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.Serializable b(defpackage.nl2 r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.yc0
            if (r0 == 0) goto L_0x0013
            r0 = r8
            yc0 r0 = (defpackage.yc0) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            yc0 r0 = new yc0
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 != r4) goto L_0x002a
            android.net.Uri r6 = r0.o
            defpackage.od2.a0(r8)
            goto L_0x0072
        L_0x002a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0032:
            defpackage.od2.a0(r8)
            android.net.Uri r7 = r7.b
            if (r7 != 0) goto L_0x003a
            return r3
        L_0x003a:
            vc0 r8 = defpackage.h5a.a
            j5a r8 = defpackage.j5a.a
            xv6 r2 = defpackage.xv6.d(r7)
            uv6 r5 = defpackage.uv6.b
            r2.g = r5
            nj0 r8 = defpackage.h5a.a(r8)
            r2.l = r8
            a9b r8 = defpackage.a9b.c
            r2.k = r8
            khe r8 = r6.c
            java.lang.Object r8 = r8.getValue()
            jic r8 = (defpackage.jic) r8
            r2.d = r8
            wv6 r8 = r2.a()
            je7 r6 = r6.a
            java.lang.Object r6 = r6.getValue()
            io0 r6 = (defpackage.io0) r6
            r0.o = r7
            r0.Z = r4
            java.io.Serializable r8 = r6.b(r8, r0)
            if (r8 != r1) goto L_0x0071
            return r1
        L_0x0071:
            r6 = r7
        L_0x0072:
            byte[] r8 = (byte[]) r8
            if (r8 == 0) goto L_0x0080
            int r7 = r8.length
            if (r7 != 0) goto L_0x007a
            goto L_0x0080
        L_0x007a:
            kpa r7 = new kpa
            r7.<init>(r6, r8)
            return r7
        L_0x0080:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zc0.b(nl2, kotlin.coroutines.Continuation):java.io.Serializable");
    }
}
