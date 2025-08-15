package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: is3  reason: default package */
public final class is3 extends ffe implements a66 {
    public Object X;
    public Object Y;
    public int Z;
    public /* synthetic */ Object s0;
    public final /* synthetic */ String t0;
    public final /* synthetic */ js3 u0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public is3(js3 js3, String str, Continuation continuation) {
        super(2, continuation);
        this.t0 = str;
        this.u0 = js3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((is3) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        is3 is3 = new is3(this.u0, this.t0, continuation);
        is3.s0 = obj;
        return is3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ff A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0100  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r15) {
        /*
            r14 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r14.Z
            e5f r2 = defpackage.e5f.a
            r3 = 0
            r4 = 3
            r5 = 5
            r6 = 4
            r7 = 2
            r8 = 1
            js3 r9 = r14.u0
            if (r1 == 0) goto L_0x0070
            if (r1 == r8) goto L_0x0060
            if (r1 == r7) goto L_0x0050
            if (r1 == r4) goto L_0x003f
            if (r1 == r6) goto L_0x002f
            if (r1 != r5) goto L_0x0027
            java.lang.Object r0 = r14.X
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r14 = r14.s0
            sx3 r14 = (defpackage.sx3) r14
            defpackage.od2.a0(r15)
            goto L_0x0104
        L_0x0027:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x002f:
            java.lang.Object r1 = r14.X
            yf4 r1 = (defpackage.yf4) r1
            java.lang.Object r4 = r14.s0
            sx3 r4 = (defpackage.sx3) r4
            defpackage.od2.a0(r15)
            r11 = r1
            r1 = r15
            r15 = r4
            goto L_0x00f1
        L_0x003f:
            java.lang.Object r0 = r14.Y
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r1 = r14.X
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r14 = r14.s0
            sx3 r14 = (defpackage.sx3) r14
            defpackage.od2.a0(r15)
            goto L_0x00dc
        L_0x0050:
            java.lang.Object r1 = r14.Y
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r5 = r14.X
            yf4 r5 = (defpackage.yf4) r5
            java.lang.Object r6 = r14.s0
            sx3 r6 = (defpackage.sx3) r6
            defpackage.od2.a0(r15)
            goto L_0x00c8
        L_0x0060:
            java.lang.Object r1 = r14.Y
            yf4 r1 = (defpackage.yf4) r1
            java.lang.Object r5 = r14.X
            yf4 r5 = (defpackage.yf4) r5
            java.lang.Object r6 = r14.s0
            sx3 r6 = (defpackage.sx3) r6
            defpackage.od2.a0(r15)
            goto L_0x00b4
        L_0x0070:
            defpackage.od2.a0(r15)
            java.lang.Object r15 = r14.s0
            sx3 r15 = (defpackage.sx3) r15
            java.lang.String r1 = r14.t0
            if (r1 == 0) goto L_0x0114
            int r10 = r1.length()
            if (r10 != 0) goto L_0x0083
            goto L_0x0114
        L_0x0083:
            gs3 r10 = new gs3
            r10.<init>(r9, r1, r3)
            zf4 r10 = defpackage.j47.h(r15, r3, r10, r4)
            hs3 r11 = new hs3
            r11.<init>(r9, r1, r3)
            zf4 r11 = defpackage.j47.h(r15, r3, r11, r4)
            td r12 = r9.c
            if (r12 == 0) goto L_0x00e4
            fs3 r5 = new fs3
            r5.<init>(r9, r1, r3)
            zf4 r1 = defpackage.j47.h(r15, r3, r5, r4)
            r14.s0 = r15
            r14.X = r11
            r14.Y = r1
            r14.Z = r8
            java.lang.Object r5 = r10.awaitInternal(r14)
            if (r5 != r0) goto L_0x00b1
            return r0
        L_0x00b1:
            r6 = r15
            r15 = r5
            r5 = r11
        L_0x00b4:
            java.util.List r15 = (java.util.List) r15
            r14.s0 = r6
            r14.X = r5
            r14.Y = r15
            r14.Z = r7
            java.lang.Object r1 = r1.a(r14)
            if (r1 != r0) goto L_0x00c5
            return r0
        L_0x00c5:
            r13 = r1
            r1 = r15
            r15 = r13
        L_0x00c8:
            java.util.List r15 = (java.util.List) r15
            r14.s0 = r6
            r14.X = r1
            r14.Y = r15
            r14.Z = r4
            java.lang.Object r14 = r5.a(r14)
            if (r14 != r0) goto L_0x00d9
            return r0
        L_0x00d9:
            r0 = r15
            r15 = r14
            r14 = r6
        L_0x00dc:
            java.util.List r15 = (java.util.List) r15
            dn3 r4 = new dn3
            r4.<init>(r1, r0, r15)
            goto L_0x010b
        L_0x00e4:
            r14.s0 = r15
            r14.X = r11
            r14.Z = r6
            java.lang.Object r1 = r10.awaitInternal(r14)
            if (r1 != r0) goto L_0x00f1
            return r0
        L_0x00f1:
            java.util.List r1 = (java.util.List) r1
            r14.s0 = r15
            r14.X = r1
            r14.Z = r5
            java.lang.Object r14 = r11.a(r14)
            if (r14 != r0) goto L_0x0100
            return r0
        L_0x0100:
            r0 = r1
            r13 = r15
            r15 = r14
            r14 = r13
        L_0x0104:
            java.util.List r15 = (java.util.List) r15
            dn3 r4 = new dn3
            r4.<init>(r0, r3, r15)
        L_0x010b:
            defpackage.j1e.o(r14)
            q0e r14 = r9.h
            r14.m(r3, r4)
            return r2
        L_0x0114:
            q0e r14 = r9.h
            j0e r15 = r9.b
            java.lang.Object r15 = r15.getValue()
            r14.setValue(r15)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.is3.o(java.lang.Object):java.lang.Object");
    }
}
