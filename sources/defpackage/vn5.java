package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: vn5  reason: default package */
public final class vn5 extends ffe implements a66 {
    public xa3 X;
    public p8c Y;
    public int Z;
    public long s0;
    public int t0;
    public /* synthetic */ Object u0;
    public final /* synthetic */ mn5 v0;
    public final /* synthetic */ long w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vn5(long j, mn5 mn5, Continuation continuation) {
        super(2, continuation);
        this.v0 = mn5;
        this.w0 = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((vn5) n((iab) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        vn5 vn5 = new vn5(this.w0, this.v0, continuation);
        vn5.u0 = obj;
        return vn5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x00eb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r25) {
        /*
            r24 = this;
            r0 = r24
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.t0
            r3 = 1
            r10 = 0
            if (r2 == 0) goto L_0x002b
            if (r2 != r3) goto L_0x0023
            long r4 = r0.s0
            int r2 = r0.Z
            p8c r6 = r0.Y
            xa3 r7 = r0.X
            java.lang.Object r8 = r0.u0
            iab r8 = (defpackage.iab) r8
            defpackage.od2.a0(r25)
            r11 = r4
            r13 = r6
            r14 = r7
            r15 = r8
            r4 = r25
            goto L_0x00e0
        L_0x0023:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x002b:
            defpackage.od2.a0(r25)
            java.lang.Object r2 = r0.u0
            iab r2 = (defpackage.iab) r2
            y77 r4 = defpackage.pag.a()
            un5 r5 = new un5
            mn5 r6 = r0.v0
            r5.<init>(r6, r4, r10)
            hz4 r6 = defpackage.hz4.a
            vx3 r7 = defpackage.vx3.a
            r8 = 4
            r9 = 2147483647(0x7fffffff, float:NaN)
            zt0 r8 = defpackage.c37.a(r9, r3, r8)
            lx3 r6 = defpackage.v3c.x(r2, r6)
            fab r11 = new fab
            r11.<init>(r6, r8)
            r11.start(r7, r11, r5)
            long r5 = r0.w0
            r15 = r2
            r14 = r4
            r2 = r9
            r13 = r11
            r11 = r5
        L_0x005c:
            y3d r9 = new y3d
            lx3 r4 = r0.b
            r9.<init>(r4)
            r4 = r14
            z87 r4 = (defpackage.z87) r4
            u3d r16 = r4.getOnJoin()
            sn5 r22 = new sn5
            r17 = 0
            r4 = r22
            r5 = r13
            r6 = r2
            r7 = r15
            r8 = r10
            r25 = r9
            r9 = r17
            r4.<init>(r5, r6, r7, r8, r9)
            w3d r4 = new w3d
            r5 = r16
            a8g r5 = (defpackage.a8g) r5
            java.lang.Object r6 = r5.a
            kotlinx.coroutines.internal.Symbol r21 = defpackage.b4d.e
            java.lang.Object r7 = r5.b
            r19 = r7
            c66 r19 = (defpackage.c66) r19
            java.lang.Object r7 = r5.c
            r23 = r7
            c66 r23 = (defpackage.c66) r23
            java.lang.Object r5 = r5.o
            r20 = r5
            a4d r20 = (defpackage.a4d) r20
            r16 = r4
            r17 = r25
            r18 = r6
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            r5 = 0
            r9 = r25
            r9.f(r4, r5)
            sn5 r8 = new sn5
            r16 = 1
            r4 = r8
            r5 = r13
            r6 = r2
            r7 = r15
            r3 = r8
            r8 = r10
            r10 = r9
            r9 = r16
            r4.<init>(r5, r6, r7, r8, r9)
            long r4 = defpackage.j47.p0(r11)
            defpackage.dy7.G(r10, r4, r3)
            r0.u0 = r15
            r0.X = r14
            r0.Y = r13
            r0.Z = r2
            r0.s0 = r11
            r3 = 1
            r0.t0 = r3
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = defpackage.y3d.Y
            java.lang.Object r4 = r4.get(r10)
            boolean r4 = r4 instanceof defpackage.w3d
            if (r4 == 0) goto L_0x00d9
            java.lang.Object r4 = r10.c(r0)
            goto L_0x00dd
        L_0x00d9:
            java.lang.Object r4 = r10.d(r0)
        L_0x00dd:
            if (r4 != r1) goto L_0x00e0
            return r1
        L_0x00e0:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L_0x00eb
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x00eb:
            r10 = 0
            goto L_0x005c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vn5.o(java.lang.Object):java.lang.Object");
    }
}
