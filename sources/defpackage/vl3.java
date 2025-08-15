package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: vl3  reason: default package */
public final class vl3 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ jm3 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vl3(jm3 jm3, Continuation continuation) {
        super(2, continuation);
        this.Y = jm3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((vl3) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new vl3(this.Y, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a5 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r12) {
        /*
            r11 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r11.X
            e5f r2 = defpackage.e5f.a
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            jm3 r7 = r11.Y
            if (r1 == 0) goto L_0x002f
            if (r1 == r6) goto L_0x002b
            if (r1 == r5) goto L_0x0027
            if (r1 == r4) goto L_0x0023
            if (r1 != r3) goto L_0x001b
            defpackage.od2.a0(r12)
            goto L_0x00a5
        L_0x001b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0023:
            defpackage.od2.a0(r12)
            goto L_0x0098
        L_0x0027:
            defpackage.od2.a0(r12)
            goto L_0x0074
        L_0x002b:
            defpackage.od2.a0(r12)
            goto L_0x0044
        L_0x002f:
            defpackage.od2.a0(r12)
            je7 r12 = r7.w
            java.lang.Object r12 = r12.getValue()
            gq3 r12 = (defpackage.gq3) r12
            r11.X = r6
            long r8 = r7.n
            r12.a(r8)
            if (r2 != r0) goto L_0x0044
            return r0
        L_0x0044:
            r12 = 48
            float r12 = (float) r12
            android.content.res.Resources r1 = defpackage.fk4.d()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r12 = r12 * r1
            int r12 = defpackage.tu0.G(r12)
            kld r1 = r7.e
            jgb r6 = new jgb
            int r8 = defpackage.vea.F0
            eqe r9 = new eqe
            r9.<init>(r8)
            v02 r8 = new v02
            r10 = 20
            r8.<init>(r10, r7)
            r6.<init>(r9, r12, r8)
            r11.X = r5
            java.lang.Object r12 = r1.a(r6, r11)
            if (r12 != r0) goto L_0x0074
            return r0
        L_0x0074:
            je7 r12 = r7.p
            java.lang.Object r12 = r12.getValue()
            iy2 r12 = (defpackage.iy2) r12
            jz2 r12 = (defpackage.jz2) r12
            long r5 = r7.n
            e52 r12 = r12.q(r5)
            if (r12 == 0) goto L_0x0098
            kld r1 = r7.d
            mfb r5 = new mfb
            long r8 = r12.a
            r5.<init>(r8)
            r11.X = r4
            java.lang.Object r12 = r1.a(r5, r11)
            if (r12 != r0) goto L_0x0098
            return r0
        L_0x0098:
            kld r12 = r7.d
            g43 r1 = defpackage.g43.b
            r11.X = r3
            java.lang.Object r11 = r12.a(r1, r11)
            if (r11 != r0) goto L_0x00a5
            return r0
        L_0x00a5:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vl3.o(java.lang.Object):java.lang.Object");
    }
}
