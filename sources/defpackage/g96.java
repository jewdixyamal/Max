package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: g96  reason: default package */
public final class g96 extends ffe implements a66 {
    public List X;
    public int Y;
    public final /* synthetic */ z96 Z;
    public final /* synthetic */ b86 s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g96(z96 z96, b86 b86, Continuation continuation) {
        super(2, continuation);
        this.Z = z96;
        this.s0 = b86;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((g96) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new g96(this.Z, this.s0, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0098 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0099  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r12) {
        /*
            r11 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r11.Y
            e5f r2 = defpackage.e5f.a
            java.lang.String r3 = "z96"
            r4 = 3
            r5 = 2
            r6 = 1
            b86 r7 = r11.s0
            r8 = 0
            z96 r9 = r11.Z
            if (r1 == 0) goto L_0x0034
            if (r1 == r6) goto L_0x0030
            if (r1 == r5) goto L_0x0027
            if (r1 != r4) goto L_0x001f
            java.util.List r11 = r11.X
            defpackage.od2.a0(r12)
            goto L_0x00af
        L_0x001f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0027:
            java.util.List r1 = r11.X
            defpackage.od2.a0(r12)
            r10 = r1
            r1 = r12
            r12 = r10
            goto L_0x008b
        L_0x0030:
            defpackage.od2.a0(r12)
            goto L_0x0071
        L_0x0034:
            defpackage.od2.a0(r12)
            q0e r12 = r9.z0
            java.lang.Object r12 = r12.getValue()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L_0x0046
            return r2
        L_0x0046:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r1 = "start fetch medias for "
            r12.<init>(r1)
            r12.append(r7)
            java.lang.String r12 = r12.toString()
            defpackage.hm9.m(r3, r12, new java.lang.Object[0])
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            q0e r1 = r9.z0
            r1.m(r8, r12)
            a86 r12 = r7.a
            hq7 r1 = r9.X
            fz6 r1 = (defpackage.fz6) r1
            java.util.List r12 = r1.c(r12)
            r11.Y = r6
            java.lang.Object r12 = defpackage.z96.q(r9, r12, r11)
            if (r12 != r0) goto L_0x0071
            return r0
        L_0x0071:
            java.util.List r12 = (java.util.List) r12
            q0e r1 = r9.w0
            r1.setValue(r12)
            w86 r1 = r9.y0
            int r1 = r1.b
            r11.X = r12
            r11.Y = r5
            hq7 r5 = r9.X
            fz6 r5 = (defpackage.fz6) r5
            java.lang.Object r1 = r5.d(r7, r1, r11)
            if (r1 != r0) goto L_0x008b
            return r0
        L_0x008b:
            gq7 r1 = (defpackage.gq7) r1
            q0e r5 = r9.z0
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r5.m(r8, r6)
            boolean r5 = r1 instanceof defpackage.eq7
            if (r5 == 0) goto L_0x0099
            return r2
        L_0x0099:
            boolean r5 = r1 instanceof defpackage.fq7
            if (r5 == 0) goto L_0x00cc
            fq7 r1 = (defpackage.fq7) r1
            java.util.List r1 = r1.a
            r11.X = r12
            r11.Y = r4
            java.lang.Object r11 = defpackage.z96.q(r9, r1, r11)
            if (r11 != r0) goto L_0x00ac
            return r0
        L_0x00ac:
            r10 = r12
            r12 = r11
            r11 = r10
        L_0x00af:
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r11 = defpackage.x53.t0(r11, r12)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "finish fetch medias for "
            r12.<init>(r0)
            r12.append(r7)
            java.lang.String r12 = r12.toString()
            defpackage.hm9.m(r3, r12, new java.lang.Object[0])
            q0e r12 = r9.w0
            r12.m(r8, r11)
            return r2
        L_0x00cc:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g96.o(java.lang.Object):java.lang.Object");
    }
}
