package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: wh2  reason: default package */
public final class wh2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ xm8 Y;
    public final /* synthetic */ gi2 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wh2(gi2 gi2, xm8 xm8, Continuation continuation) {
        super(2, continuation);
        this.Y = xm8;
        this.Z = gi2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((wh2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new wh2(this.Z, this.Y, continuation);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: l20} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: l20} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: l20} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: l20} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: l20} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: l20} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: l20} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: l20} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: l20} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: l20} */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b4, code lost:
        if (r6 == null) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00e9, code lost:
        if (r6 == null) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0118, code lost:
        if (r6 == null) goto L_0x013b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0135  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r21) {
        /*
            r20 = this;
            r7 = r20
            tx3 r8 = defpackage.tx3.a
            int r0 = r7.X
            e5f r9 = defpackage.e5f.a
            gi2 r10 = r7.Z
            r1 = 3
            r2 = 2
            r3 = 1
            xm8 r4 = r7.Y
            if (r0 == 0) goto L_0x0031
            if (r0 == r3) goto L_0x002c
            if (r0 == r2) goto L_0x0026
            if (r0 != r1) goto L_0x001e
            defpackage.od2.a0(r21)
            r0 = r21
            goto L_0x0131
        L_0x001e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0026:
            defpackage.od2.a0(r21)
            r0 = r21
            goto L_0x0072
        L_0x002c:
            defpackage.od2.a0(r21)
            goto L_0x0164
        L_0x0031:
            defpackage.od2.a0(r21)
            boolean r0 = r4 instanceof defpackage.um8
            if (r0 == 0) goto L_0x0043
            um8 r4 = (defpackage.um8) r4
            r7.X = r3
            java.lang.Object r0 = defpackage.gi2.r(r10, r4, r7)
            if (r0 != r8) goto L_0x0164
            return r8
        L_0x0043:
            boolean r0 = r4 instanceof defpackage.vm8
            if (r0 == 0) goto L_0x005e
            vm8 r4 = (defpackage.vm8) r4
            java.lang.CharSequence r0 = r4.Z
            if (r0 != 0) goto L_0x004e
            return r9
        L_0x004e:
            s35 r1 = r10.K0
            jg2 r2 = new jg2
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            defpackage.pnf.o(r1, r2)
            goto L_0x0164
        L_0x005e:
            boolean r0 = r4 instanceof defpackage.wm8
            if (r0 == 0) goto L_0x013c
            r0 = r4
            wm8 r0 = (defpackage.wm8) r0
            long r5 = r0.b
            r7.X = r2
            bc7[] r0 = defpackage.gi2.R0
            java.lang.Object r0 = r10.y(r5, r7)
            if (r0 != r8) goto L_0x0072
            return r8
        L_0x0072:
            es8 r0 = (defpackage.es8) r0
            if (r0 != 0) goto L_0x0077
            return r9
        L_0x0077:
            wm8 r4 = (defpackage.wm8) r4
            int r5 = r4.X
            int r5 = defpackage.au1.s(r5)
            r6 = 0
            cu8 r0 = r0.a
            if (r5 == 0) goto L_0x00ec
            if (r5 == r3) goto L_0x00bd
            if (r5 != r2) goto L_0x00b7
            k8g r0 = r0.z0
            if (r0 == 0) goto L_0x00b6
            java.lang.Object r0 = r0.a
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x00b6
            java.util.Iterator r0 = r0.iterator()
        L_0x0096:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00b2
            java.lang.Object r2 = r0.next()
            r3 = r2
            l20 r3 = (defpackage.l20) r3
            if (r3 == 0) goto L_0x0096
            x10 r3 = r3.b
            if (r3 == 0) goto L_0x0096
            long r11 = r4.c
            long r13 = r3.s0
            int r3 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r3 != 0) goto L_0x0096
            r6 = r2
        L_0x00b2:
            l20 r6 = (defpackage.l20) r6
            if (r6 != 0) goto L_0x011b
        L_0x00b6:
            return r9
        L_0x00b7:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x00bd:
            k8g r0 = r0.z0
            if (r0 == 0) goto L_0x00eb
            java.lang.Object r0 = r0.a
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x00eb
            java.util.Iterator r0 = r0.iterator()
        L_0x00cb:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00e7
            java.lang.Object r2 = r0.next()
            r3 = r2
            l20 r3 = (defpackage.l20) r3
            if (r3 == 0) goto L_0x00cb
            k20 r3 = r3.d
            if (r3 == 0) goto L_0x00cb
            long r11 = r4.c
            long r13 = r3.a
            int r3 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r3 != 0) goto L_0x00cb
            r6 = r2
        L_0x00e7:
            l20 r6 = (defpackage.l20) r6
            if (r6 != 0) goto L_0x011b
        L_0x00eb:
            return r9
        L_0x00ec:
            k8g r0 = r0.z0
            if (r0 == 0) goto L_0x013b
            java.lang.Object r0 = r0.a
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x013b
            java.util.Iterator r0 = r0.iterator()
        L_0x00fa:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0116
            java.lang.Object r2 = r0.next()
            r3 = r2
            l20 r3 = (defpackage.l20) r3
            if (r3 == 0) goto L_0x00fa
            x10 r3 = r3.b
            if (r3 == 0) goto L_0x00fa
            long r11 = r4.c
            long r13 = r3.s0
            int r3 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r3 != 0) goto L_0x00fa
            r6 = r2
        L_0x0116:
            l20 r6 = (defpackage.l20) r6
            if (r6 != 0) goto L_0x011b
            goto L_0x013b
        L_0x011b:
            long r2 = r10.b
            long r4 = r4.b
            r7.X = r1
            r11 = 0
            java.lang.String r6 = r6.r
            r0 = r10
            r1 = r2
            r3 = r6
            r6 = r11
            r7 = r20
            java.lang.Object r0 = r0.z(r1, r3, r4, r6, r7)
            if (r0 != r8) goto L_0x0131
            return r8
        L_0x0131:
            pg2 r0 = (defpackage.pg2) r0
            if (r0 == 0) goto L_0x0164
            s35 r1 = r10.K0
            defpackage.pnf.o(r1, r0)
            goto L_0x0164
        L_0x013b:
            return r9
        L_0x013c:
            boolean r0 = r4 instanceof defpackage.qm8
            if (r0 == 0) goto L_0x0165
            bc7[] r0 = defpackage.gi2.R0
            je7 r0 = r10.A0
            java.lang.Object r0 = r0.getValue()
            r11 = r0
            z3b r11 = (defpackage.z3b) r11
            qm8 r4 = (defpackage.qm8) r4
            long r14 = r4.b
            java.lang.String r0 = r4.o
            java.lang.String r1 = r4.X
            java.lang.String r2 = r4.s0
            java.lang.String r3 = r4.Y
            long r12 = r10.b
            r16 = r0
            r17 = r1
            r18 = r2
            r19 = r3
            r11.a(r12, r14, r16, r17, r18, r19)
        L_0x0164:
            return r9
        L_0x0165:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wh2.o(java.lang.Object):java.lang.Object");
    }
}
