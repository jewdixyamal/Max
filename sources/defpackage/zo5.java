package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: zo5  reason: default package */
public final class zo5 extends ffe implements c66 {
    public long X;
    public int Y;
    public /* synthetic */ Object Z;
    public /* synthetic */ Object s0;
    public final /* synthetic */ long t0;
    public final /* synthetic */ mn5 u0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zo5(long j, mn5 mn5, Continuation continuation) {
        super(3, continuation);
        this.t0 = j;
        this.u0 = mn5;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        zo5 zo5 = new zo5(this.t0, this.u0, (Continuation) obj3);
        zo5.Z = (sx3) obj;
        zo5.s0 = (on5) obj2;
        return zo5.o(e5f.a);
    }

    /* JADX WARNING: type inference failed for: r10v10, types: [l32] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00d9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 0
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0026
            if (r2 != r4) goto L_0x001e
            long r6 = r0.X
            java.lang.Object r2 = r0.s0
            p8c r2 = (defpackage.p8c) r2
            java.lang.Object r8 = r0.Z
            on5 r8 = (defpackage.on5) r8
            defpackage.od2.a0(r22)
            r5 = r22
            goto L_0x00ce
        L_0x001e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0026:
            defpackage.od2.a0(r22)
            java.lang.Object r2 = r0.Z
            sx3 r2 = (defpackage.sx3) r2
            java.lang.Object r6 = r0.s0
            on5 r6 = (defpackage.on5) r6
            int r7 = defpackage.ft4.o
            long r7 = r0.t0
            r9 = 0
            int r9 = defpackage.ft4.c(r7, r9)
            if (r9 <= 0) goto L_0x00db
            r9 = 2
            mn5 r10 = r0.u0
            mn5 r9 = defpackage.od2.f(r10, r3, r9)
            boolean r10 = r9 instanceof defpackage.l32
            if (r10 == 0) goto L_0x004c
            r10 = r9
            l32 r10 = (defpackage.l32) r10
            goto L_0x004d
        L_0x004c:
            r10 = r5
        L_0x004d:
            if (r10 != 0) goto L_0x005c
            t32 r10 = new t32
            r14 = 14
            r13 = 0
            r15 = 0
            r12 = 0
            r11 = r10
            r16 = r9
            r11.<init>(r12, r13, r14, r15, r16)
        L_0x005c:
            p8c r2 = r10.m(r2)
            r19 = r7
            r8 = r6
            r6 = r19
        L_0x0065:
            y3d r15 = new y3d
            lx3 r9 = r0.b
            r15.<init>(r9)
            v3d r9 = r2.c()
            xo5 r14 = new xo5
            r14.<init>(r8, r5)
            w3d r13 = new w3d
            m5d r9 = (defpackage.m5d) r9
            java.lang.Object r11 = r9.b
            java.lang.Object r10 = r9.o
            r16 = r10
            c66 r16 = (defpackage.c66) r16
            r17 = 0
            java.lang.Object r10 = r9.c
            r12 = r10
            c66 r12 = (defpackage.c66) r12
            java.lang.Object r9 = r9.X
            r18 = r9
            c66 r18 = (defpackage.c66) r18
            r9 = r13
            r10 = r15
            r4 = r13
            r13 = r16
            r16 = r14
            r14 = r17
            r5 = r15
            r15 = r16
            r16 = r18
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r5.f(r4, r3)
            yo5 r4 = new yo5
            r9 = 0
            r4.<init>(r6, r9)
            long r9 = defpackage.j47.p0(r6)
            defpackage.dy7.G(r5, r9, r4)
            r0.Z = r8
            r0.s0 = r2
            r0.X = r6
            r4 = 1
            r0.Y = r4
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r9 = defpackage.y3d.Y
            java.lang.Object r9 = r9.get(r5)
            boolean r9 = r9 instanceof defpackage.w3d
            if (r9 == 0) goto L_0x00c7
            java.lang.Object r5 = r5.c(r0)
            goto L_0x00cb
        L_0x00c7:
            java.lang.Object r5 = r5.d(r0)
        L_0x00cb:
            if (r5 != r1) goto L_0x00ce
            return r1
        L_0x00ce:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L_0x00d9
            e5f r0 = defpackage.e5f.a
            return r0
        L_0x00d9:
            r5 = 0
            goto L_0x0065
        L_0x00db:
            kotlinx.coroutines.TimeoutCancellationException r0 = new kotlinx.coroutines.TimeoutCancellationException
            java.lang.String r1 = "Timed out immediately"
            r2 = 0
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zo5.o(java.lang.Object):java.lang.Object");
    }
}
