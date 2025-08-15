package defpackage;

import java.util.List;

/* renamed from: q72  reason: default package */
public final /* synthetic */ class q72 implements qj3 {
    public final /* synthetic */ long X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ p82 a;
    public final /* synthetic */ List b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int o;
    public final /* synthetic */ mg4 s0;
    public final /* synthetic */ long t0;

    public /* synthetic */ q72(p82 p82, List list, long j, int i, long j2, int i2, long j3, mg4 mg4, long j4) {
        this.a = p82;
        this.b = list;
        this.c = j;
        this.o = i;
        this.X = j2;
        this.Y = i2;
        this.Z = j3;
        this.s0 = mg4;
        this.t0 = j4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00af  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void accept(java.lang.Object r25) {
        /*
            r24 = this;
            r0 = r24
            r6 = r25
            u82 r6 = (defpackage.u82) r6
            p82 r7 = r0.a
            r7.getClass()
            e92 r1 = r6.n
            mg4 r13 = r0.s0
            java.util.ArrayList r14 = r1.d(r13)
            int r2 = r0.Y
            long r3 = r0.Z
            java.util.List r5 = r0.b
            long r8 = r0.c
            int r10 = r0.o
            long r11 = r0.X
            r15 = r5
            r16 = r8
            r18 = r10
            r19 = r11
            r21 = r2
            r22 = r3
            java.util.ArrayList r2 = defpackage.hm9.s(r14, r15, r16, r18, r19, r21, r22)
            java.util.ArrayList r3 = r1.d(r13)
            r3.clear()
            defpackage.e92.e(r13)
            java.util.ArrayList r1 = r1.d(r13)
            r1.addAll(r2)
            defpackage.e92.e(r13)
            mg4 r1 = defpackage.mg4.DELAYED
            if (r13 != r1) goto L_0x0048
            goto L_0x0138
        L_0x0048:
            r14 = 0
            long r3 = r0.t0
            rm4 r15 = r7.s
            if (r10 <= 0) goto L_0x00a3
            r0 = 0
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x00a3
            java.util.Iterator r0 = r5.iterator()
            r1 = r14
        L_0x005a:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x006f
            java.lang.Object r2 = r0.next()
            fs8 r2 = (defpackage.fs8) r2
            long r10 = r2.b
            int r2 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r2 > 0) goto L_0x005a
            int r1 = r1 + 1
            goto L_0x005a
        L_0x006f:
            r0 = 2
            if (r1 >= r0) goto L_0x00a3
            java.lang.String r0 = "p82"
            java.lang.String r1 = "onChatHistory, history response size is less than one page, delete message before and findAndUpdateFirstMessage"
            defpackage.hm9.m(r0, r1, new java.lang.Object[0])
            r0 = 1
            long r8 = r8 - r0
            int r2 = r5.size()
            if (r2 <= 0) goto L_0x008b
            java.lang.Object r2 = r5.get(r14)
            fs8 r2 = (defpackage.fs8) r2
            long r8 = r2.b
            long r8 = r8 - r0
        L_0x008b:
            r11 = r8
            java.lang.Object r0 = r15.get()
            r8 = r0
            au8 r8 = (defpackage.au8) r8
            r9 = r3
            r8.d(r9, r11, r13)
            r8 = 0
            r0 = r7
            r1 = r3
            r10 = r3
            r3 = r6
            r12 = r5
            r4 = r8
            r0.v(r1, r3, r4)
            goto L_0x00a5
        L_0x00a3:
            r10 = r3
            r12 = r5
        L_0x00a5:
            java.util.Iterator r0 = r12.iterator()
        L_0x00a9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00d6
            java.lang.Object r1 = r0.next()
            fs8 r1 = (defpackage.fs8) r1
            long r2 = r1.o
            m7b r4 = r7.n
            p7b r4 = (defpackage.p7b) r4
            t33 r4 = r4.a
            long r4 = r4.t()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x00a9
            long r2 = r1.c
            long r4 = r1.b
            long r1 = defpackage.ote.c(r2, r4)
            long r3 = r6.Z
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 >= 0) goto L_0x00a9
            r6.Z = r1
            goto L_0x00a9
        L_0x00d6:
            e52 r0 = r7.C(r10)
            boolean r1 = defpackage.nd7.D(r12)
            if (r1 != 0) goto L_0x0138
            if (r0 == 0) goto L_0x0138
            boolean r0 = r0.G()
            if (r0 == 0) goto L_0x0138
            java.lang.Object r0 = r15.get()
            au8 r0 = (defpackage.au8) r0
            int r1 = r12.size()
            int r1 = r1 + -1
            java.lang.Object r1 = r12.get(r1)
            fs8 r1 = (defpackage.fs8) r1
            long r1 = r1.a
            cu8 r0 = r0.j(r10, r1)
            if (r0 == 0) goto L_0x0138
            long r1 = r0.b
            r6.j = r1
            java.util.Map r1 = r6.d()
            rm4 r2 = r7.r
            java.lang.Object r2 = r2.get()
            el3 r2 = (defpackage.el3) r2
            m7b r3 = r2.h
            p7b r3 = (defpackage.p7b) r3
            t33 r3 = r3.a
            long r3 = r3.t()
            uj3 r2 = r2.i(r3, r14)
            long r2 = r2.n()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            long r3 = r0.o
            java.lang.Long r5 = java.lang.Long.valueOf(r3)
            r1.put(r2, r5)
            e92 r1 = r6.n
            mg4 r0 = r0.U0
            defpackage.hm9.J(r1, r3, r0)
        L_0x0138:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q72.accept(java.lang.Object):void");
    }
}
