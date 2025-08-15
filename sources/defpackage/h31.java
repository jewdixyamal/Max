package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: h31  reason: default package */
public final class h31 extends ffe implements a66 {
    public ti9 X;
    public l31 Y;
    public Object Z;
    public Object s0;
    public String t0;
    public CharSequence u0;
    public Long v0;
    public int w0;
    public int x0;
    public /* synthetic */ Object y0;
    public final /* synthetic */ l31 z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h31(l31 l31, Continuation continuation) {
        super(2, continuation);
        this.z0 = l31;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((h31) n((t51) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        h31 h31 = new h31(this.z0, continuation);
        h31.y0 = obj;
        return h31;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00d4, code lost:
        if (r7.c(r3, new defpackage.y21(r9 == null ? new java.lang.Long(r9.a) : null, r2.b, r2.c, r2.d, r2.e, r2.f, r2.g)) == false) goto L_0x0080;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01ab A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01ef  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.x0
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x004c
            if (r2 == r5) goto L_0x0038
            if (r2 != r4) goto L_0x0030
            int r2 = r0.w0
            java.lang.Long r7 = r0.v0
            java.lang.CharSequence r8 = r0.u0
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            java.lang.String r9 = r0.t0
            java.lang.Object r10 = r0.s0
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r0.Z
            l31 r12 = r0.Y
            ti9 r13 = r0.X
            java.lang.Object r14 = r0.y0
            t51 r14 = (defpackage.t51) r14
            defpackage.od2.a0(r22)
            r15 = r7
            r7 = r2
            r2 = r22
            goto L_0x01ac
        L_0x0030:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0038:
            java.lang.Object r2 = r0.s0
            y21 r2 = (defpackage.y21) r2
            java.lang.Object r3 = r0.Z
            l31 r4 = r0.Y
            ti9 r7 = r0.X
            java.lang.Object r8 = r0.y0
            java.lang.Long r8 = (java.lang.Long) r8
            defpackage.od2.a0(r22)
            r9 = r22
            goto L_0x00a6
        L_0x004c:
            defpackage.od2.a0(r22)
            java.lang.Object r2 = r0.y0
            t51 r2 = (defpackage.t51) r2
            boolean r7 = r2 instanceof defpackage.e51
            l31 r8 = r0.z0
            if (r7 == 0) goto L_0x00d8
            q0e r3 = r8.j
            java.lang.Object r3 = r3.getValue()
            y21 r3 = (defpackage.y21) r3
            java.lang.Long r3 = r3.b
            q0e r4 = r8.j
            java.lang.Object r7 = r4.getValue()
            y21 r7 = (defpackage.y21) r7
            java.lang.Long r7 = r7.a
            if (r3 == 0) goto L_0x01f9
            if (r7 != 0) goto L_0x01f9
            e51 r2 = (defpackage.e51) r2
            vz2 r2 = r2.a
            java.util.Set r2 = r2.s0
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L_0x01f9
            r7 = r4
            r4 = r8
            r8 = r3
        L_0x0080:
            java.lang.Object r3 = r7.getValue()
            r2 = r3
            y21 r2 = (defpackage.y21) r2
            bc7[] r9 = defpackage.l31.p
            iy2 r9 = r4.a()
            long r10 = r8.longValue()
            r0.y0 = r8
            r0.X = r7
            r0.Y = r4
            r0.Z = r3
            r0.s0 = r2
            r0.x0 = r5
            jz2 r9 = (defpackage.jz2) r9
            java.lang.Object r9 = r9.k(r10, r0)
            if (r9 != r1) goto L_0x00a6
            return r1
        L_0x00a6:
            e52 r9 = (defpackage.e52) r9
            if (r9 == 0) goto L_0x00b3
            java.lang.Long r10 = new java.lang.Long
            long r11 = r9.a
            r10.<init>(r11)
            r14 = r10
            goto L_0x00b4
        L_0x00b3:
            r14 = r6
        L_0x00b4:
            java.lang.Long r15 = r2.b
            y21 r9 = new y21
            java.lang.CharSequence r10 = r2.c
            java.lang.String r11 = r2.d
            java.lang.Long r12 = r2.e
            java.lang.CharSequence r13 = r2.f
            boolean r2 = r2.g
            r19 = r13
            r13 = r9
            r16 = r10
            r17 = r11
            r18 = r12
            r20 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            boolean r2 = r7.c(r3, r9)
            if (r2 == 0) goto L_0x0080
            goto L_0x01f9
        L_0x00d8:
            boolean r7 = r2 instanceof defpackage.l51
            if (r7 == 0) goto L_0x0103
            l51 r2 = (defpackage.l51) r2
            long r0 = r2.a
            java.lang.Long r2 = r8.o
            if (r2 != 0) goto L_0x00e6
            goto L_0x01f9
        L_0x00e6:
            long r2 = r2.longValue()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x01f9
            r8.o = r6
        L_0x00f0:
            q0e r0 = r8.j
            java.lang.Object r1 = r0.getValue()
            r2 = r1
            y21 r2 = (defpackage.y21) r2
            y21 r2 = defpackage.y21.h
            boolean r0 = r0.c(r1, r2)
            if (r0 == 0) goto L_0x00f0
            goto L_0x01f9
        L_0x0103:
            boolean r7 = r2 instanceof defpackage.m51
            if (r7 == 0) goto L_0x01f9
            r7 = r2
            m51 r7 = (defpackage.m51) r7
            hi7 r7 = r7.a
            long r9 = r7.a
            java.lang.Long r7 = r8.o
            if (r7 != 0) goto L_0x0114
            goto L_0x01f9
        L_0x0114:
            long r11 = r7.longValue()
            int r7 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r7 != 0) goto L_0x01f9
            r8.o = r6
            q0e r7 = r8.j
            r14 = r2
            r13 = r7
            r12 = r8
        L_0x0123:
            java.lang.Object r11 = r13.getValue()
            r2 = r11
            y21 r2 = (defpackage.y21) r2
            r2 = r14
            m51 r2 = (defpackage.m51) r2
            hi7 r7 = r2.a
            def r7 = r7.Y
            if (r7 == 0) goto L_0x013b
            java.lang.Integer r8 = new java.lang.Integer
            int r7 = r7.s0
            r8.<init>(r7)
            goto L_0x013c
        L_0x013b:
            r8 = r6
        L_0x013c:
            hi7 r2 = r2.a
            if (r8 != 0) goto L_0x0142
        L_0x0140:
            r7 = r5
            goto L_0x014a
        L_0x0142:
            def r7 = r2.Y
            int r7 = r7.s0
            if (r7 != 0) goto L_0x0149
            goto L_0x0140
        L_0x0149:
            r7 = 0
        L_0x014a:
            def r8 = r2.Y
            if (r8 == 0) goto L_0x0152
            java.lang.String r8 = r8.o
            r10 = r8
            goto L_0x0153
        L_0x0152:
            r10 = r6
        L_0x0153:
            dh6 r8 = r2.X
            if (r8 == 0) goto L_0x015b
            java.lang.String r8 = r8.Y
            r9 = r8
            goto L_0x015c
        L_0x015b:
            r9 = r6
        L_0x015c:
            java.lang.String r8 = ""
            if (r7 == 0) goto L_0x0161
            goto L_0x0173
        L_0x0161:
            java.util.regex.Pattern r15 = defpackage.fca.a
            if (r10 != 0) goto L_0x0166
            goto L_0x0167
        L_0x0166:
            r8 = r10
        L_0x0167:
            je7 r15 = r12.e
            java.lang.Object r15 = r15.getValue()
            ida r15 = (defpackage.ida) r15
            java.lang.CharSequence r8 = defpackage.fca.a(r8, r15)
        L_0x0173:
            def r2 = r2.Y
            if (r2 == 0) goto L_0x017f
            java.lang.Long r15 = new java.lang.Long
            long r5 = r2.Z
            r15.<init>(r5)
            goto L_0x0180
        L_0x017f:
            r15 = 0
        L_0x0180:
            if (r15 == 0) goto L_0x01b8
            long r5 = r15.longValue()
            bc7[] r2 = defpackage.l31.p
            iy2 r2 = r12.a()
            r0.y0 = r14
            r0.X = r13
            r0.Y = r12
            r0.Z = r11
            r0.s0 = r10
            r0.t0 = r9
            r3 = r8
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r0.u0 = r3
            r0.v0 = r15
            r0.w0 = r7
            r0.x0 = r4
            jz2 r2 = (defpackage.jz2) r2
            java.lang.Object r2 = r2.k(r5, r0)
            if (r2 != r1) goto L_0x01ac
            return r1
        L_0x01ac:
            e52 r2 = (defpackage.e52) r2
            r3 = r11
            r5 = r12
            r6 = r13
            r19 = r14
        L_0x01b3:
            r14 = r8
            r12 = r9
            r11 = r10
            r10 = r15
            goto L_0x01bf
        L_0x01b8:
            r3 = r11
            r5 = r12
            r6 = r13
            r19 = r14
            r2 = 0
            goto L_0x01b3
        L_0x01bf:
            if (r2 == 0) goto L_0x01cc
            java.lang.Long r8 = new java.lang.Long
            r22 = r5
            long r4 = r2.a
            r8.<init>(r4)
            r9 = r8
            goto L_0x01cf
        L_0x01cc:
            r22 = r5
            r9 = 0
        L_0x01cf:
            if (r10 == 0) goto L_0x01d6
            long r4 = r10.longValue()
            goto L_0x01d8
        L_0x01d6:
            r4 = -9223372036854775808
        L_0x01d8:
            y21 r2 = new y21
            java.lang.Long r13 = new java.lang.Long
            r13.<init>(r4)
            if (r7 == 0) goto L_0x01e3
            r15 = 1
            goto L_0x01e4
        L_0x01e3:
            r15 = 0
        L_0x01e4:
            r8 = r2
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            boolean r2 = r6.c(r3, r2)
            if (r2 == 0) goto L_0x01ef
            goto L_0x01f9
        L_0x01ef:
            r12 = r22
            r13 = r6
            r14 = r19
            r4 = 2
            r5 = 1
            r6 = 0
            goto L_0x0123
        L_0x01f9:
            e5f r0 = defpackage.e5f.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h31.o(java.lang.Object):java.lang.Object");
    }
}
