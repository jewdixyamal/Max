package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: xb6  reason: default package */
public final class xb6 {
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;

    public xb6(je7 je7, je7 je72, je7 je73, je7 je74) {
        this.a = je7;
        this.b = je72;
        this.c = je73;
        this.d = je74;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(defpackage.xb6 r21, defpackage.yf4 r22, defpackage.es8 r23, kotlin.coroutines.Continuation r24) {
        /*
            r0 = r22
            r1 = r23
            r2 = r24
            r21.getClass()
            boolean r3 = r2 instanceof defpackage.wb6
            if (r3 == 0) goto L_0x001c
            r3 = r2
            wb6 r3 = (defpackage.wb6) r3
            int r4 = r3.t0
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x001c
            int r4 = r4 - r5
            r3.t0 = r4
            goto L_0x0023
        L_0x001c:
            wb6 r3 = new wb6
            r4 = r21
            r3.<init>(r4, r2)
        L_0x0023:
            java.lang.Object r2 = r3.Z
            tx3 r4 = defpackage.tx3.a
            int r5 = r3.t0
            r6 = 2
            r7 = 1
            if (r5 == 0) goto L_0x004f
            if (r5 == r7) goto L_0x0043
            if (r5 != r6) goto L_0x003b
            long r0 = r3.X
            es8 r3 = r3.o
            defpackage.od2.a0(r2)
            r8 = r0
            r1 = r3
            goto L_0x0093
        L_0x003b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0043:
            long r0 = r3.Y
            long r4 = r3.X
            es8 r3 = r3.o
            defpackage.od2.a0(r2)
            r8 = r0
            r1 = r3
            goto L_0x0070
        L_0x004f:
            defpackage.od2.a0(r2)
            cu8 r2 = r1.a
            long r8 = r2.c
            boolean r2 = r2.p()
            if (r2 == 0) goto L_0x0086
            bw8 r2 = r1.c
            long r5 = r2.b
            r3.o = r1
            r3.X = r5
            r3.Y = r8
            r3.t0 = r7
            java.lang.Object r2 = r0.a(r3)
            if (r2 != r4) goto L_0x006f
            goto L_0x00c3
        L_0x006f:
            r4 = r5
        L_0x0070:
            e52 r2 = (defpackage.e52) r2
            k92 r0 = r2.b
            long r2 = r0.a
            bw8 r0 = r1.c
            java.lang.String r6 = r0.d
            java.lang.String r0 = r0.e
            r16 = r0
            r14 = r1
            r17 = r2
            r12 = r4
        L_0x0082:
            r15 = r6
            r19 = r8
            goto L_0x00bc
        L_0x0086:
            r3.o = r1
            r3.X = r8
            r3.t0 = r6
            java.lang.Object r2 = r0.a(r3)
            if (r2 != r4) goto L_0x0093
            goto L_0x00c3
        L_0x0093:
            e52 r2 = (defpackage.e52) r2
            boolean r0 = r2.I()
            r3 = 0
            k92 r4 = r2.b
            if (r0 == 0) goto L_0x00a2
            java.lang.String r0 = r4.g
            r6 = r0
            goto L_0x00a3
        L_0x00a2:
            r6 = r3
        L_0x00a3:
            boolean r0 = r2.I()
            if (r0 == 0) goto L_0x00b2
            boolean r0 = r2.a0()
            if (r0 == 0) goto L_0x00b2
            java.lang.String r0 = r4.I
            goto L_0x00b3
        L_0x00b2:
            r0 = r3
        L_0x00b3:
            long r4 = r4.a
            r16 = r0
            r14 = r1
            r12 = r4
            r17 = r12
            goto L_0x0082
        L_0x00bc:
            bw8 r4 = new bw8
            r11 = 2
            r10 = r4
            r10.<init>(r11, r12, r14, r15, r16, r17, r19)
        L_0x00c3:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xb6.a(xb6, yf4, es8, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object b(cz5 cz5, Continuation continuation) {
        return j47.t0(((w9a) ((kke) this.a.getValue())).b(), new vb6(cz5, this, (Continuation) null), continuation);
    }
}
