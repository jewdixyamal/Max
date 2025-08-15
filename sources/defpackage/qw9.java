package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: qw9  reason: default package */
public final class qw9 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ rw9 Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ long s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qw9(rw9 rw9, long j, long j2, Continuation continuation) {
        super(2, continuation);
        this.Y = rw9;
        this.Z = j;
        this.s0 = j2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((qw9) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new qw9(this.Y, this.Z, this.s0, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c9 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r13) {
        /*
            r12 = this;
            tx3 r6 = defpackage.tx3.a
            int r0 = r12.X
            r7 = 5
            r8 = 4
            r1 = 3
            r2 = 2
            r3 = 1
            long r9 = r12.Z
            rw9 r11 = r12.Y
            if (r0 == 0) goto L_0x003a
            if (r0 == r3) goto L_0x0035
            if (r0 == r2) goto L_0x0030
            if (r0 == r1) goto L_0x002b
            if (r0 == r8) goto L_0x0026
            if (r0 != r7) goto L_0x001e
            defpackage.od2.a0(r13)
            goto L_0x00ca
        L_0x001e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0026:
            defpackage.od2.a0(r13)
            r0 = r13
            goto L_0x0091
        L_0x002b:
            defpackage.od2.a0(r13)
            r0 = r13
            goto L_0x0076
        L_0x0030:
            defpackage.od2.a0(r13)
            r0 = r13
            goto L_0x005f
        L_0x0035:
            defpackage.od2.a0(r13)
            r0 = r13
            goto L_0x0050
        L_0x003a:
            defpackage.od2.a0(r13)
            je7 r0 = r11.b
            java.lang.Object r0 = r0.getValue()
            iy2 r0 = (defpackage.iy2) r0
            r12.X = r3
            jz2 r0 = (defpackage.jz2) r0
            java.lang.Object r0 = r0.k(r9, r12)
            if (r0 != r6) goto L_0x0050
            return r6
        L_0x0050:
            e52 r0 = (defpackage.e52) r0
            if (r0 == 0) goto L_0x0066
            r12.X = r2
            long r1 = r12.s0
            java.lang.Object r0 = defpackage.rw9.b(r11, r0, r1, r12)
            if (r0 != r6) goto L_0x005f
            return r6
        L_0x005f:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x007c
        L_0x0066:
            r12.X = r1
            long r1 = r12.Z
            long r3 = r12.s0
            rw9 r0 = r12.Y
            r5 = r12
            java.lang.Object r0 = r0.c(r1, r3, r5)
            if (r0 != r6) goto L_0x0076
            return r6
        L_0x0076:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
        L_0x007c:
            if (r0 == 0) goto L_0x00ca
            je7 r0 = r11.b
            java.lang.Object r0 = r0.getValue()
            iy2 r0 = (defpackage.iy2) r0
            r12.X = r8
            jz2 r0 = (defpackage.jz2) r0
            java.lang.Object r0 = r0.k(r9, r12)
            if (r0 != r6) goto L_0x0091
            return r6
        L_0x0091:
            e52 r0 = (defpackage.e52) r0
            if (r0 == 0) goto L_0x00b4
            k92 r0 = r0.b
            int r1 = r0.m
            if (r1 <= 0) goto L_0x00a7
            je7 r0 = r11.o
            java.lang.Object r0 = r0.getValue()
            cea r0 = (defpackage.cea) r0
            r0.f(r9)
            goto L_0x00b4
        L_0x00a7:
            je7 r1 = r11.o
            java.lang.Object r1 = r1.getValue()
            cea r1 = (defpackage.cea) r1
            long r2 = r0.a
            r1.a(r2)
        L_0x00b4:
            je7 r0 = r11.X
            java.lang.Object r0 = r0.getValue()
            qx9 r0 = (defpackage.qx9) r0
            r12.X = r7
            long r1 = r12.Z
            long r3 = r12.s0
            r5 = r12
            java.lang.Object r0 = r0.g(r1, r3, r5)
            if (r0 != r6) goto L_0x00ca
            return r6
        L_0x00ca:
            e5f r0 = defpackage.e5f.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qw9.o(java.lang.Object):java.lang.Object");
    }
}
