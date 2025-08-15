package defpackage;

/* renamed from: eh9  reason: default package */
public final class eh9 extends mi0 {
    public final /* synthetic */ uh9 X;
    public final long c;
    public final String o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public eh9(uh9 uh9, long j, String str, String str2) {
        super(uh9, j, str2);
        this.X = uh9;
        this.c = j;
        this.o = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(kotlin.coroutines.Continuation r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof defpackage.dh9
            if (r0 == 0) goto L_0x0013
            r0 = r12
            dh9 r0 = (defpackage.dh9) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.s0 = r1
            goto L_0x0018
        L_0x0013:
            dh9 r0 = new dh9
            r0.<init>(r11, r12)
        L_0x0018:
            java.lang.Object r12 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0040
            if (r2 == r4) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            eh9 r11 = r0.o
            defpackage.od2.a0(r12)
            goto L_0x0097
        L_0x002d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0035:
            cu8 r11 = r0.X
            eh9 r2 = r0.o
            defpackage.od2.a0(r12)
            r10 = r2
            r2 = r11
            r11 = r10
            goto L_0x006d
        L_0x0040:
            defpackage.od2.a0(r12)
            uh9 r12 = r11.X
            au8 r2 = r12.d
            long r6 = r11.c
            cu8 r2 = r2.q(r6)
            if (r2 != 0) goto L_0x0050
            return r5
        L_0x0050:
            je7 r12 = r12.j
            java.lang.Object r12 = r12.getValue()
            iy2 r12 = (defpackage.iy2) r12
            long r6 = r2.t0
            jz2 r12 = (defpackage.jz2) r12
            w7c r12 = r12.m(r6)
            r0.o = r11
            r0.X = r2
            r0.s0 = r4
            java.lang.Object r12 = defpackage.od2.A(r12, r0)
            if (r12 != r1) goto L_0x006d
            return r1
        L_0x006d:
            e52 r12 = (defpackage.e52) r12
            if (r12 == 0) goto L_0x00dc
            k92 r12 = r12.b
            long r6 = r12.a
            uh9 r12 = r11.X
            je7 r12 = r12.i
            java.lang.Object r12 = r12.getValue()
            kda r12 = (defpackage.kda) r12
            long r8 = r2.c
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r8)
            java.util.List r2 = java.util.Collections.singletonList(r2)
            r0.o = r11
            r0.X = r5
            r0.s0 = r3
            java.lang.Object r12 = r12.a(r6, r2, r0)
            if (r12 != r1) goto L_0x0097
            return r1
        L_0x0097:
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r12 = defpackage.x53.i0(r12)
            fs8 r12 = (defpackage.fs8) r12
            if (r12 != 0) goto L_0x00a2
            return r5
        L_0x00a2:
            wz r12 = r12.s0
            java.util.Iterator r12 = r12.iterator()
        L_0x00a8:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00ba
            java.lang.Object r0 = r12.next()
            r1 = r0
            bz r1 = (defpackage.bz) r1
            boolean r1 = r1 instanceof defpackage.v20
            if (r1 == 0) goto L_0x00a8
            goto L_0x00bb
        L_0x00ba:
            r0 = r5
        L_0x00bb:
            boolean r12 = r0 instanceof defpackage.v20
            if (r12 == 0) goto L_0x00c2
            v20 r0 = (defpackage.v20) r0
            goto L_0x00c3
        L_0x00c2:
            r0 = r5
        L_0x00c3:
            if (r0 == 0) goto L_0x00dc
            java.lang.String r12 = r0.X
            if (r12 != 0) goto L_0x00ca
            goto L_0x00dc
        L_0x00ca:
            uh9 r0 = r11.X
            au8 r0 = r0.d
            m82 r1 = new m82
            r2 = 4
            r1.<init>(r12, r2)
            long r2 = r11.c
            java.lang.String r11 = r11.o
            r0.v(r2, r11, r1)
            return r12
        L_0x00dc:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eh9.a(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
