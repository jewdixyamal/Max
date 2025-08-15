package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: zp2  reason: default package */
public final class zp2 extends ffe implements a66 {
    public Object X;
    public int Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ er7 s0;
    public final /* synthetic */ float t0;
    public final /* synthetic */ long u0;
    public final /* synthetic */ rq2 v0;
    public final /* synthetic */ Long w0;
    public final /* synthetic */ cz5 x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zp2(long j, er7 er7, float f, long j2, rq2 rq2, Long l, cz5 cz5, Continuation continuation) {
        super(2, continuation);
        this.Z = j;
        this.s0 = er7;
        this.t0 = f;
        this.u0 = j2;
        this.v0 = rq2;
        this.w0 = l;
        this.x0 = cz5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((zp2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new zp2(this.Z, this.s0, this.t0, this.u0, this.v0, this.w0, this.x0, continuation);
    }

    /* JADX WARNING: type inference failed for: r1v11, types: [f9d, y8d, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0093  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r14) {
        /*
            r13 = this;
            r0 = 2
            tx3 r6 = defpackage.tx3.a
            int r1 = r13.Y
            e5f r7 = defpackage.e5f.a
            r2 = 3
            r3 = 1
            long r8 = r13.Z
            rq2 r10 = r13.v0
            if (r1 == 0) goto L_0x0036
            if (r1 == r3) goto L_0x002d
            if (r1 == r0) goto L_0x0023
            if (r1 != r2) goto L_0x001b
            defpackage.od2.a0(r14)
            r0 = r14
            goto L_0x00ca
        L_0x001b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0023:
            java.lang.Object r1 = r13.X
            z8d r1 = (defpackage.z8d) r1
            defpackage.od2.a0(r14)
            r3 = r1
            r1 = r14
            goto L_0x0080
        L_0x002d:
            java.lang.Object r1 = r13.X
            y8d r1 = (defpackage.y8d) r1
            defpackage.od2.a0(r14)
            r3 = r14
            goto L_0x0062
        L_0x0036:
            defpackage.od2.a0(r14)
            y8d r1 = new y8d
            r1.<init>(r8)
            r4 = 0
            r1.l = r4
            er7 r4 = r13.s0
            r1.m = r4
            float r4 = r13.t0
            r1.n = r4
            long r11 = r13.u0
            r1.o = r11
            je7 r4 = r10.H0
            java.lang.Object r4 = r4.getValue()
            x19 r4 = (defpackage.x19) r4
            r13.X = r1
            r13.Y = r3
            java.lang.Long r3 = r13.w0
            java.lang.Object r3 = r4.a(r8, r3, r13)
            if (r3 != r6) goto L_0x0062
            return r6
        L_0x0062:
            bw8 r3 = (defpackage.bw8) r3
            r1.b = r3
            z8d r3 = new z8d
            r3.<init>(r1)
            je7 r1 = r10.F0
            java.lang.Object r1 = r1.getValue()
            xb6 r1 = (defpackage.xb6) r1
            r13.X = r3
            r13.Y = r0
            cz5 r4 = r13.x0
            java.lang.Object r1 = r1.b(r4, r13)
            if (r1 != r6) goto L_0x0080
            return r6
        L_0x0080:
            java.util.List r1 = (java.util.List) r1
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L_0x0093
            s8g r0 = defpackage.rq2.r(r10)
            r3.getClass()
            r0.a(r3)
            return r7
        L_0x0093:
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            r4.add(r3)
            r4.addAll(r1)
            h8d r1 = new h8d
            r1.<init>(r8, r4, r0)
            h9d r0 = new h9d
            r0.<init>(r1)
            s8g r1 = defpackage.rq2.r(r10)
            r1.a(r0)
            je7 r0 = r10.E0
            java.lang.Object r0 = r0.getValue()
            r3 = r0
            lu0 r3 = (defpackage.lu0) r3
            r0 = 0
            r13.X = r0
            r13.Y = r2
            r2 = 1
            cz5 r4 = r13.x0
            long r0 = r13.Z
            r5 = r13
            java.lang.Object r0 = defpackage.zo2.d.c(r0, r2, r3, r4, false, r5)
            if (r0 != r6) goto L_0x00ca
            return r6
        L_0x00ca:
            zo2 r0 = (defpackage.zo2) r0
            s35 r1 = r10.b1
            defpackage.pnf.o(r1, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zp2.o(java.lang.Object):java.lang.Object");
    }
}
