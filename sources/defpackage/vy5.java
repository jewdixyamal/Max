package defpackage;

/* renamed from: vy5  reason: default package */
public final class vy5 {
    public final je7 a;

    public vy5(v4 v4Var) {
        this.a = v4Var.d(d06.class);
    }

    public static dz8 c(a06 a06, boolean z, boolean z2) {
        Integer num;
        Integer valueOf;
        jqe jqe = a06.a;
        if (!z) {
            if (z2) {
                valueOf = Integer.valueOf(woc.M1);
            } else if (!z2) {
                valueOf = Integer.valueOf(woc.L1);
            }
            num = valueOf;
            return new dz8(3, jqe, a06.b, a06.c, z2, num, a06.d);
        }
        num = null;
        return new dz8(3, jqe, a06.b, a06.c, z2, num, a06.d);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(defpackage.cu8 r5, java.lang.Long r6, boolean r7, boolean r8, kotlin.coroutines.Continuation r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof defpackage.ty5
            if (r0 == 0) goto L_0x0013
            r0 = r9
            ty5 r0 = (defpackage.ty5) r0
            int r1 = r0.t0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.t0 = r1
            goto L_0x0018
        L_0x0013:
            ty5 r0 = new ty5
            r0.<init>(r4, r9)
        L_0x0018:
            java.lang.Object r9 = r0.Z
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.t0
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            boolean r8 = r0.X
            boolean r7 = r0.o
            vy5 r4 = r0.Y
            defpackage.od2.a0(r9)
            goto L_0x004f
        L_0x002d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0035:
            defpackage.od2.a0(r9)
            je7 r9 = r4.a
            java.lang.Object r9 = r9.getValue()
            d06 r9 = (defpackage.d06) r9
            r0.Y = r4
            r0.o = r7
            r0.X = r8
            r0.t0 = r3
            java.lang.Object r9 = r9.a(r5, r6, r0)
            if (r9 != r1) goto L_0x004f
            return r1
        L_0x004f:
            a06 r9 = (defpackage.a06) r9
            r4.getClass()
            dz8 r4 = c(r9, r7, r8)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vy5.a(cu8, java.lang.Long, boolean, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(long r5, java.util.List r7, kotlin.coroutines.Continuation r8, boolean r9) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.uy5
            if (r0 == 0) goto L_0x0013
            r0 = r8
            uy5 r0 = (defpackage.uy5) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.s0 = r1
            goto L_0x0018
        L_0x0013:
            uy5 r0 = new uy5
            r0.<init>(r4, r8)
        L_0x0018:
            java.lang.Object r8 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            boolean r9 = r0.o
            vy5 r4 = r0.X
            defpackage.od2.a0(r8)
            goto L_0x004b
        L_0x002b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0033:
            defpackage.od2.a0(r8)
            je7 r8 = r4.a
            java.lang.Object r8 = r8.getValue()
            d06 r8 = (defpackage.d06) r8
            r0.X = r4
            r0.o = r9
            r0.s0 = r3
            java.lang.Object r8 = r8.b(r5, r7, r0)
            if (r8 != r1) goto L_0x004b
            return r1
        L_0x004b:
            a06 r8 = (defpackage.a06) r8
            r4.getClass()
            r4 = 0
            dz8 r4 = c(r8, r4, r9)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vy5.b(long, java.util.List, kotlin.coroutines.Continuation, boolean):java.lang.Object");
    }
}
