package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: vp1  reason: default package */
public final class vp1 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ wp1 Y;
    public final /* synthetic */ je7 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vp1(wp1 wp1, je7 je7, Continuation continuation) {
        super(2, continuation);
        this.Y = wp1;
        this.Z = je7;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((vp1) n((oa) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        vp1 vp1 = new vp1(this.Y, this.Z, continuation);
        vp1.X = obj;
        return vp1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: up1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: rp1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: rp1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: tp1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: rp1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: sp1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: tp1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: tp1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v23, resolved type: tp1} */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0022, code lost:
        if ((!r15.b.isEmpty()) != false) goto L_0x0140;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r15) {
        /*
            r14 = this;
            defpackage.od2.a0(r15)
            java.lang.Object r15 = r14.X
            oa r15 = (defpackage.oa) r15
            wp1 r0 = r14.Y
            q0e r1 = r0.c
        L_0x000b:
            java.lang.Object r2 = r1.getValue()
            r3 = r2
            up1 r3 = (defpackage.up1) r3
            java.util.Map r4 = r15.a
            boolean r5 = r4.isEmpty()
            r6 = 1
            if (r5 == 0) goto L_0x0026
            java.util.Set r5 = r15.b
            boolean r5 = r5.isEmpty()
            r5 = r5 ^ r6
            if (r5 == 0) goto L_0x0026
            goto L_0x0140
        L_0x0026:
            boolean r3 = r4.isEmpty()
            if (r3 == 0) goto L_0x0035
            sp1 r3 = new sp1
            long r4 = r15.c
            r3.<init>(r4)
            goto L_0x0140
        L_0x0035:
            int r3 = r4.size()
            je7 r5 = r14.Z
            if (r3 != r6) goto L_0x009b
            java.util.Set r3 = r4.entrySet()
            java.lang.Object r3 = defpackage.x53.f0(r3)
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r3 = r3.getKey()
            r7 = r3
            gg1 r7 = (defpackage.gg1) r7
            java.util.Set r3 = r4.entrySet()
            java.lang.Object r3 = defpackage.x53.f0(r3)
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r3 = r3.getValue()
            bo1 r3 = (defpackage.bo1) r3
            java.lang.String r4 = r3.getName()
            java.lang.CharSequence r4 = defpackage.wp1.r(r0, r4)
            iqe r8 = new iqe
            r8.<init>(r4)
            java.lang.Object r4 = r5.getValue()
            bn1 r4 = (defpackage.bn1) r4
            int r5 = defpackage.b8a.S1
            eqe r6 = new eqe
            r6.<init>(r5)
            iqe r9 = r4.a(r6)
            long r4 = r3.d()
            java.lang.Long r6 = new java.lang.Long
            r6.<init>(r4)
            java.lang.CharSequence r4 = r3.j()
            uc0 r10 = defpackage.oag.a(r4, r6)
            java.lang.String r11 = r3.q()
            tp1 r3 = new tp1
            long r12 = r15.c
            r6 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12)
            goto L_0x0140
        L_0x009b:
            int r3 = r4.size()
            r7 = 2
            if (r3 != r7) goto L_0x00f4
            java.util.Collection r3 = r4.values()
            java.util.List r3 = defpackage.x53.v0(r3)
            java.lang.Object r4 = defpackage.x53.g0(r3)
            bo1 r4 = (defpackage.bo1) r4
            java.lang.Object r6 = defpackage.x53.p0(r3)
            bo1 r6 = (defpackage.bo1) r6
            rp1 r13 = new rp1
            int r7 = defpackage.b8a.R1
            java.lang.String r4 = r4.getName()
            java.lang.CharSequence r4 = defpackage.wp1.r(r0, r4)
            java.lang.String r6 = r6.getName()
            java.lang.CharSequence r6 = defpackage.wp1.r(r0, r6)
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r6}
            gqe r8 = new gqe
            java.util.List r4 = defpackage.ys.m0(r4)
            r8.<init>(r7, r4)
            java.lang.Object r4 = r5.getValue()
            bn1 r4 = (defpackage.bn1) r4
            int r5 = defpackage.b8a.T1
            eqe r6 = new eqe
            r6.<init>(r5)
            iqe r9 = r4.a(r6)
            kl7 r10 = defpackage.wp1.q(r0, r3)
            long r11 = r15.c
            r7 = r13
            r7.<init>(r8, r9, r10, r11)
        L_0x00f2:
            r3 = r13
            goto L_0x0140
        L_0x00f4:
            java.util.Collection r3 = r4.values()
            java.util.List r3 = defpackage.x53.v0(r3)
            java.lang.Object r4 = defpackage.x53.g0(r3)
            bo1 r4 = (defpackage.bo1) r4
            rp1 r13 = new rp1
            int r7 = defpackage.b8a.Q1
            java.lang.String r4 = r4.getName()
            java.lang.CharSequence r4 = defpackage.wp1.r(r0, r4)
            int r8 = r3.size()
            int r8 = r8 - r6
            java.lang.String r6 = java.lang.String.valueOf(r8)
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r6}
            gqe r8 = new gqe
            java.util.List r4 = defpackage.ys.m0(r4)
            r8.<init>(r7, r4)
            java.lang.Object r4 = r5.getValue()
            bn1 r4 = (defpackage.bn1) r4
            int r5 = defpackage.b8a.T1
            eqe r6 = new eqe
            r6.<init>(r5)
            iqe r9 = r4.a(r6)
            kl7 r10 = defpackage.wp1.q(r0, r3)
            long r11 = r15.c
            r7 = r13
            r7.<init>(r8, r9, r10, r11)
            goto L_0x00f2
        L_0x0140:
            boolean r2 = r1.c(r2, r3)
            if (r2 == 0) goto L_0x000b
            e5f r14 = defpackage.e5f.a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vp1.o(java.lang.Object):java.lang.Object");
    }
}
