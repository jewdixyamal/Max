package defpackage;

import android.content.Context;

/* renamed from: nzc  reason: default package */
public final class nzc {
    public final Context a;
    public final ida b;
    public final lr2 c;
    public final uba d;
    public final iy2 e;
    public final w7b f;
    public final q33 g;
    public final je7 h;

    public nzc(Context context, ida ida, lr2 lr2, uba uba, iy2 iy2, w7b w7b, q33 q33, je7 je7) {
        this.a = context;
        this.b = ida;
        this.c = lr2;
        this.d = uba;
        this.e = iy2;
        this.f = w7b;
        this.g = q33;
        this.h = je7;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(defpackage.kzc r19, kotlin.coroutines.Continuation r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            boolean r3 = r2 instanceof defpackage.mzc
            if (r3 == 0) goto L_0x0019
            r3 = r2
            mzc r3 = (defpackage.mzc) r3
            int r4 = r3.s0
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.s0 = r4
            goto L_0x001e
        L_0x0019:
            mzc r3 = new mzc
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r2 = r3.Y
            tx3 r4 = defpackage.tx3.a
            int r5 = r3.s0
            r6 = 1
            if (r5 == 0) goto L_0x003e
            if (r5 != r6) goto L_0x0036
            kzc r0 = r3.X
            nzc r1 = r3.o
            defpackage.od2.a0(r2)
            r17 = r1
            r1 = r0
            r0 = r17
            goto L_0x0058
        L_0x0036:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003e:
            defpackage.od2.a0(r2)
            e52 r2 = r1.o
            if (r2 != 0) goto L_0x005a
            iy2 r2 = r0.e
            long r7 = r1.Z
            r3.o = r0
            r3.X = r1
            r3.s0 = r6
            jz2 r2 = (defpackage.jz2) r2
            java.lang.Object r2 = r2.k(r7, r3)
            if (r2 != r4) goto L_0x0058
            return r4
        L_0x0058:
            e52 r2 = (defpackage.e52) r2
        L_0x005a:
            r11 = r2
            r2 = 0
            if (r11 == 0) goto L_0x0078
            kk0 r3 = defpackage.kk0.c
            jk0 r4 = defpackage.jk0.a
            java.lang.String r3 = r11.g(r3, r4)
            if (r3 == 0) goto L_0x0078
            boolean r4 = defpackage.w9e.C0(r3)
            if (r4 != 0) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r3 = r2
        L_0x0070:
            if (r3 == 0) goto L_0x0078
            android.net.Uri r3 = defpackage.j47.N(r3)
            r8 = r3
            goto L_0x0079
        L_0x0078:
            r8 = r2
        L_0x0079:
            fs8 r3 = r1.Y
            aw8 r4 = r3.t0
            r5 = 0
            if (r4 == 0) goto L_0x0083
            int r7 = r4.a
            goto L_0x0084
        L_0x0083:
            r7 = r5
        L_0x0084:
            r9 = 3
            if (r7 != r9) goto L_0x0089
            fs8 r3 = r4.c
        L_0x0089:
            r10 = r3
            if (r11 == 0) goto L_0x0091
            r11.k0()
            java.lang.CharSequence r2 = r11.u0
        L_0x0091:
            r14 = r2
            java.util.List r2 = r10.C0
            java.util.ArrayList r2 = defpackage.iz7.u(r2)
            java.lang.String r3 = r10.Z
            java.lang.String r4 = ""
            if (r3 == 0) goto L_0x00a4
            java.lang.String r3 = defpackage.bre.e(r3)
            if (r3 != 0) goto L_0x00a5
        L_0x00a4:
            r3 = r4
        L_0x00a5:
            java.util.List r7 = r1.c
            boolean r7 = r7.isEmpty()
            r7 = r7 ^ r6
            if (r7 == 0) goto L_0x017d
            uba r7 = r0.d
            ida r0 = r0.b
            w6b r0 = r0.i(r3, r2)
            java.util.List r2 = r1.c
            r7.getClass()
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x00c3
            goto L_0x017b
        L_0x00c3:
            java.lang.CharSequence r3 = r0.a
            java.lang.String r3 = r3.toString()
            java.util.List r3 = defpackage.ema.s(r3, r2)
            boolean r12 = r3.isEmpty()
            r12 = r12 ^ r6
            java.lang.String[] r13 = r0.b
            if (r12 == 0) goto L_0x00f0
            pq9 r2 = defpackage.qp4.u0
            android.content.Context r4 = r7.a
            qp4 r2 = r2.b(r4)
            fka r2 = r2.i()
            java.lang.CharSequence r0 = r0.a
            android.text.SpannableString r0 = defpackage.ema.u(r0, r3, r2)
            w6b r2 = new w6b
            r2.<init>(r0, r13)
            r0 = r2
            goto L_0x017b
        L_0x00f0:
            wz r3 = r10.s0
            boolean r12 = r3.isEmpty()
            if (r12 == 0) goto L_0x00fa
            goto L_0x017b
        L_0x00fa:
            java.util.Iterator r3 = r3.iterator()
        L_0x00fe:
            boolean r12 = r3.hasNext()
            if (r12 == 0) goto L_0x016f
            java.lang.Object r12 = r3.next()
            bz r12 = (defpackage.bz) r12
            b10 r15 = r12.a
            if (r15 != 0) goto L_0x0110
            r15 = -1
            goto L_0x0118
        L_0x0110:
            int[] r16 = defpackage.tba.$EnumSwitchMapping$0
            int r15 = r15.ordinal()
            r15 = r16[r15]
        L_0x0118:
            if (r15 == r6) goto L_0x0157
            r6 = 2
            if (r15 == r6) goto L_0x0144
            if (r15 == r9) goto L_0x0133
            r6 = 4
            if (r15 == r6) goto L_0x0124
        L_0x0122:
            r12 = 1
            goto L_0x0166
        L_0x0124:
            v20 r12 = (defpackage.v20) r12
            java.lang.String r4 = r12.t0
            java.lang.String[] r4 = new java.lang.String[]{r4}
            java.lang.String r6 = "🎤"
            java.lang.CharSequence r4 = r7.a(r6, r2, r5, r4)
            goto L_0x0122
        L_0x0133:
            zj3 r12 = (defpackage.zj3) r12
            java.lang.String r4 = r12.Z
            java.lang.String r6 = r12.s0
            java.lang.String[] r4 = new java.lang.String[]{r4, r6}
            java.lang.String r6 = "👤"
            java.lang.CharSequence r4 = r7.a(r6, r2, r5, r4)
            goto L_0x0122
        L_0x0144:
            sjd r12 = (defpackage.sjd) r12
            java.lang.String r4 = r12.Y
            java.lang.String r6 = r12.Z
            java.lang.String r12 = r12.s0
            java.lang.String[] r4 = new java.lang.String[]{r12, r4, r6}
            java.lang.String r6 = "🔗"
            java.lang.CharSequence r4 = r7.a(r6, r2, r5, r4)
            goto L_0x0122
        L_0x0157:
            lf5 r12 = (defpackage.lf5) r12
            java.lang.String r4 = r12.Y
            java.lang.String[] r4 = new java.lang.String[]{r4}
            java.lang.String r6 = "📄"
            r12 = 1
            java.lang.CharSequence r4 = r7.a(r6, r2, r12, r4)
        L_0x0166:
            int r6 = r4.length()
            if (r6 <= 0) goto L_0x016d
            goto L_0x016f
        L_0x016d:
            r6 = r12
            goto L_0x00fe
        L_0x016f:
            int r2 = r4.length()
            if (r2 != 0) goto L_0x0176
            goto L_0x017b
        L_0x0176:
            w6b r0 = new w6b
            r0.<init>(r4, r13)
        L_0x017b:
            r13 = r0
            goto L_0x0184
        L_0x017d:
            ida r0 = r0.b
            w6b r0 = r0.i(r3, r2)
            goto L_0x017b
        L_0x0184:
            mx8 r0 = new mx8
            java.util.List r9 = r1.c
            java.lang.String r12 = r1.b
            long r1 = r1.Z
            r7 = r0
            r15 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nzc.a(kzc, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:294:0x062b, code lost:
        if (r1.u() == true) goto L_0x0632;
     */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x027f  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x02a1  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x02b2  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x02bd  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x02d5  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x02d8  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x02df  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x02f5  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02fd  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0375  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0395  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0398  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0425  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0428  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x044a  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x045f  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x04f5  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x051b  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x051d  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x0564  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x057f  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x05b4  */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x05b7  */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x05c5  */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x05c8  */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x060a  */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x060d  */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x061e  */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x0631  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(defpackage.kzc r49, kotlin.coroutines.Continuation r50) {
        /*
            r48 = this;
            r0 = r48
            r1 = r49
            r2 = 13
            int r3 = r1.a
            jk0 r4 = defpackage.jk0.a
            kk0 r5 = defpackage.kk0.c
            pq9 r6 = defpackage.qp4.u0
            java.lang.String r8 = "Sequence is empty."
            n71 r9 = defpackage.n71.s0
            r11 = 4
            r12 = 1
            r13 = 2
            r14 = 0
            if (r3 == r12) goto L_0x03dc
            if (r3 != r13) goto L_0x001c
            goto L_0x03dc
        L_0x001c:
            if (r3 != r11) goto L_0x0156
            android.content.Context r3 = r0.a
            qp4 r4 = r6.b(r3)
            fka r4 = r4.i()
            uj3 r6 = r1.X
            java.util.List r11 = r1.c
            java.lang.Object r16 = defpackage.x53.i0(r11)
            r10 = r16
            java.lang.String r10 = (java.lang.String) r10
            java.util.List r15 = r6.i()
            java.lang.String r6 = r6.j()
            at r7 = new at
            r7.<init>(r13, r15)
            ww9 r15 = new ww9
            r15.<init>(r2)
            r1f r2 = new r1f
            r2.<init>(r7, r15)
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            c6d r6 = defpackage.ys.Q(r6)
            c6d[] r7 = new defpackage.c6d[r13]
            r7[r14] = r2
            r7[r12] = r6
            c6d r2 = defpackage.ys.Q(r7)
            um5 r2 = defpackage.l6d.d0(r2, r9)
            q12 r6 = new q12
            r7 = 5
            r6.<init>(r10, r7)
            qk5 r2 = defpackage.l6d.Z(r2, r6)
            lr1 r6 = new lr1
            r6.<init>(r10, r4)
            java.util.Iterator r2 = r2.iterator()
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0150
            java.lang.Object r2 = r2.next()
            java.lang.Object r2 = r6.invoke(r2)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r4 = r11.isEmpty()
            r4 = r4 ^ r12
            uj3 r1 = r1.X
            if (r4 == 0) goto L_0x00a9
            int r4 = r2.length()
            if (r4 <= 0) goto L_0x00a4
            java.lang.String r4 = r2.toString()
            java.lang.String r6 = r1.d()
            boolean r4 = defpackage.tpa.f(r4, r6)
            if (r4 == 0) goto L_0x00a4
        L_0x00a1:
            r21 = r2
            goto L_0x00be
        L_0x00a4:
            java.lang.String r2 = r1.d()
            goto L_0x00a1
        L_0x00a9:
            ida r2 = r0.b
            java.lang.CharSequence r4 = r1.b
            if (r4 != 0) goto L_0x00bb
            java.lang.String r4 = r1.d()
            tx4 r2 = r2.j
            java.lang.CharSequence r2 = r2.b(r14, r4)
            r1.b = r2
        L_0x00bb:
            java.lang.CharSequence r2 = r1.b
            goto L_0x00a1
        L_0x00be:
            int r2 = r1.k()
            if (r2 != 0) goto L_0x00cd
            boolean r2 = r1.w()
            if (r2 == 0) goto L_0x00cb
            goto L_0x00cd
        L_0x00cb:
            r2 = r14
            goto L_0x00ce
        L_0x00cd:
            r2 = r12
        L_0x00ce:
            w7b r4 = r0.f
            if (r2 == 0) goto L_0x00d5
            r22 = 0
            goto L_0x0107
        L_0x00d5:
            boolean r2 = r1.Y
            if (r2 == 0) goto L_0x00e2
            int r2 = defpackage.dpc.F
            java.lang.String r15 = r3.getString(r2)
        L_0x00df:
            r22 = r15
            goto L_0x0107
        L_0x00e2:
            boolean r2 = r1.t()
            if (r2 == 0) goto L_0x00f5
            boolean r2 = r1.v()
            if (r2 == 0) goto L_0x00f5
            int r2 = defpackage.jpc.O2
            java.lang.String r15 = r3.getString(r2)
            goto L_0x00df
        L_0x00f5:
            boolean r2 = r1.t()
            if (r2 == 0) goto L_0x0102
            int r2 = defpackage.jpc.p
            java.lang.String r15 = r3.getString(r2)
            goto L_0x00df
        L_0x0102:
            java.lang.CharSequence r15 = r4.b(r1)
            goto L_0x00df
        L_0x0107:
            long r2 = r1.n()
            u7b r4 = r4.d()
            r7b r2 = r4.b(r2)
            int r2 = r2.a
            r3 = 10
            if (r2 == r3) goto L_0x0125
            r3 = 20
            if (r2 == r3) goto L_0x0125
            r3 = 40
            if (r2 != r3) goto L_0x0122
            goto L_0x0125
        L_0x0122:
            r23 = r14
            goto L_0x0127
        L_0x0125:
            r23 = r12
        L_0x0127:
            jq3 r2 = new jq3
            long r19 = r1.n()
            boolean r24 = r1.u()
            q33 r0 = r0.g
            hyc r0 = (defpackage.hyc) r0
            java.lang.String r0 = r0.q()
            int r3 = defpackage.ld0.j
            java.lang.String r0 = r1.q(r0, r5)
            android.net.Uri r26 = defpackage.j47.N(r0)
            java.lang.CharSequence r27 = r1.m()
            r18 = r2
            r25 = r11
            r18.<init>(r19, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x0643
        L_0x0150:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>(r8)
            throw r0
        L_0x0156:
            java.lang.String r2 = ""
            java.lang.String r7 = "Required value was null."
            r8 = 5
            if (r3 != r8) goto L_0x022d
            vpb r8 = r1.s0
            if (r8 == 0) goto L_0x0168
            kq3 r9 = r8.c
            if (r9 == 0) goto L_0x0168
            wm3 r9 = r9.a
            goto L_0x0169
        L_0x0168:
            r9 = 0
        L_0x0169:
            if (r9 == 0) goto L_0x022c
            if (r8 == 0) goto L_0x0170
            kq3 r15 = r8.c
            goto L_0x0171
        L_0x0170:
            r15 = 0
        L_0x0171:
            if (r15 == 0) goto L_0x0222
            wm3 r3 = r15.a
            if (r3 == 0) goto L_0x0218
            ga r4 = new ga
            r6 = 29
            r4.<init>(r0, r6, r1)
            java.lang.String r0 = r3.a()
            if (r0 == 0) goto L_0x018d
            int r0 = r0.length()
            if (r0 != 0) goto L_0x018b
            goto L_0x018d
        L_0x018b:
            r0 = r14
            goto L_0x018e
        L_0x018d:
            r0 = r12
        L_0x018e:
            r0 = r0 ^ r12
            if (r0 == 0) goto L_0x019e
            java.lang.String r0 = r3.a()
            java.lang.Object r0 = r4.invoke(r0)
            w6b r0 = (defpackage.w6b) r0
        L_0x019b:
            r24 = r0
            goto L_0x01a3
        L_0x019e:
            w6b r0 = defpackage.w6b.a()
            goto L_0x019b
        L_0x01a3:
            java.util.regex.Pattern r0 = defpackage.fca.a
            java.lang.String r0 = r3.b()
            if (r0 != 0) goto L_0x01ac
            goto L_0x01ad
        L_0x01ac:
            r2 = r0
        L_0x01ad:
            java.lang.String r0 = r3.c()
            java.lang.String r23 = defpackage.fca.b(r2, r0)
            java.lang.String r0 = r3.w0
            java.lang.String r0 = defpackage.bre.c(r0)
            jyc r2 = defpackage.jyc.a
            b0d r2 = r2.r()
            java.util.List r1 = r1.c
            java.util.List r2 = r2.d(r0, r1)
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ r12
            if (r2 == 0) goto L_0x01d7
            java.lang.Object r0 = r4.invoke(r0)
            w6b r0 = (defpackage.w6b) r0
        L_0x01d4:
            r25 = r0
            goto L_0x01dc
        L_0x01d7:
            w6b r0 = defpackage.w6b.a()
            goto L_0x01d4
        L_0x01dc:
            s7b r0 = r15.o
            r7b r0 = defpackage.iz7.l(r0)
            int r2 = r0.a
            r4 = 10
            if (r2 == r4) goto L_0x01f3
            r4 = 20
            if (r2 == r4) goto L_0x01f3
            r4 = 40
            if (r2 == r4) goto L_0x01f3
            r26 = r14
            goto L_0x01f5
        L_0x01f3:
            r26 = r12
        L_0x01f5:
            td6 r2 = new td6
            vm3 r4 = defpackage.vm3.OFFICIAL
            java.util.List r6 = r3.u0
            boolean r27 = r6.contains(r4)
            java.lang.String r4 = r3.d(r5)
            android.net.Uri r28 = defpackage.j47.N(r4)
            long r4 = r3.a
            r20 = r2
            r21 = r4
            r29 = r0
            r30 = r3
            r31 = r1
            r20.<init>(r21, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            goto L_0x0643
        L_0x0218:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r7.toString()
            r0.<init>(r1)
            throw r0
        L_0x0222:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r7.toString()
            r0.<init>(r1)
            throw r0
        L_0x022c:
            r8 = 5
        L_0x022d:
            if (r3 != r8) goto L_0x03b9
            vpb r8 = r1.s0
            if (r8 == 0) goto L_0x0236
            f52 r9 = r8.a
            goto L_0x0237
        L_0x0236:
            r9 = 0
        L_0x0237:
            if (r9 == 0) goto L_0x03b9
            if (r8 == 0) goto L_0x023e
            f52 r3 = r8.a
            goto L_0x023f
        L_0x023e:
            r3 = 0
        L_0x023f:
            if (r3 == 0) goto L_0x03af
            java.lang.String r7 = r3.Z
            boolean r8 = defpackage.oag.t(r7)
            if (r8 != 0) goto L_0x024e
            java.lang.String r4 = defpackage.ju0.t(r7, r5, r4)
            goto L_0x024f
        L_0x024e:
            r4 = 0
        L_0x024f:
            if (r4 == 0) goto L_0x0262
            boolean r5 = defpackage.w9e.C0(r4)
            if (r5 != 0) goto L_0x0258
            goto L_0x0259
        L_0x0258:
            r4 = 0
        L_0x0259:
            if (r4 == 0) goto L_0x0262
            android.net.Uri r4 = defpackage.j47.N(r4)
            r21 = r4
            goto L_0x0264
        L_0x0262:
            r21 = 0
        L_0x0264:
            ida r4 = r0.b
            java.lang.String r5 = r3.Y
            w6b r7 = r4.h(r5)
            java.util.List r8 = r1.c
            uba r9 = r0.d
            r9.getClass()
            java.lang.String r10 = r3.D0
            java.lang.String r13 = defpackage.bre.c(r10)
            boolean r13 = defpackage.ema.x(r13, r8)
            if (r13 != 0) goto L_0x0283
            boolean r15 = defpackage.ema.x(r5, r8)
        L_0x0283:
            java.lang.CharSequence r15 = r7.a
            java.lang.String r15 = r15.toString()
            java.util.List r15 = defpackage.ema.s(r15, r8)
            android.content.Context r14 = r9.a
            qp4 r18 = r6.b(r14)
            fka r12 = r18.i()
            android.text.SpannableString r12 = defpackage.ema.v(r12, r7, r15)
            java.lang.String r15 = defpackage.bre.c(r10)
            if (r13 == 0) goto L_0x02b2
            java.util.List r13 = defpackage.ema.s(r15, r8)
            qp4 r14 = r6.b(r14)
            fka r14 = r14.i()
            android.text.SpannableString r13 = defpackage.ema.u(r15, r13, r14)
            goto L_0x02b3
        L_0x02b2:
            r13 = 0
        L_0x02b3:
            w6b r14 = new w6b
            java.lang.String[] r7 = r7.b
            r14.<init>(r12, r7)
            if (r13 != 0) goto L_0x02bd
            goto L_0x02c9
        L_0x02bd:
            java.lang.String r7 = r13.toString()
            ida r9 = r9.b
            r9.getClass()
            defpackage.bre.d(r7, r9)
        L_0x02c9:
            java.lang.CharSequence r26 = defpackage.fca.a(r5, r4)
            java.lang.String r7 = defpackage.bre.c(r10)
            vpb r1 = r1.s0
            if (r1 == 0) goto L_0x02d8
            java.util.List r9 = r1.b
            goto L_0x02d9
        L_0x02d8:
            r9 = 0
        L_0x02d9:
            boolean r9 = defpackage.ema.x(r7, r9)
            if (r9 != 0) goto L_0x02ed
            if (r1 == 0) goto L_0x02e4
            java.util.List r10 = r1.b
            goto L_0x02e5
        L_0x02e4:
            r10 = 0
        L_0x02e5:
            boolean r5 = defpackage.ema.x(r5, r10)
            if (r5 == 0) goto L_0x02ed
            r5 = 1
            goto L_0x02ee
        L_0x02ed:
            r5 = 0
        L_0x02ee:
            int r10 = r3.X0
            if (r10 == r11) goto L_0x02fd
            r12 = 3
            if (r10 == r12) goto L_0x02fd
            w6b r1 = defpackage.w6b.a()
            r23 = r1
            goto L_0x0371
        L_0x02fd:
            java.lang.String r12 = r3.z0
            if (r9 == 0) goto L_0x0306
            w6b r15 = r4.h(r7)
            goto L_0x0326
        L_0x0306:
            if (r5 != 0) goto L_0x0325
            if (r1 == 0) goto L_0x030d
            java.util.List r1 = r1.b
            goto L_0x030e
        L_0x030d:
            r1 = 0
        L_0x030e:
            jyc r5 = defpackage.jyc.a
            b0d r5 = r5.r()
            java.util.List r1 = r5.d(r12, r1)
            boolean r1 = r1.isEmpty()
            r5 = 1
            r1 = r1 ^ r5
            if (r1 == 0) goto L_0x0325
            w6b r15 = r4.h(r12)
            goto L_0x0326
        L_0x0325:
            r15 = 0
        L_0x0326:
            if (r15 == 0) goto L_0x0330
            java.lang.CharSequence r1 = r15.a
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0344
        L_0x0330:
            if (r12 == 0) goto L_0x033f
            int r1 = r12.length()
            if (r1 != 0) goto L_0x0339
            goto L_0x033f
        L_0x0339:
            w6b r1 = r4.h(r12)
        L_0x033d:
            r15 = r1
            goto L_0x0344
        L_0x033f:
            w6b r1 = r4.h(r7)
            goto L_0x033d
        L_0x0344:
            java.lang.CharSequence r1 = r15.a
            java.lang.String r1 = r1.toString()
            java.util.List r5 = defpackage.ema.s(r1, r8)
            android.content.Context r7 = r0.a
            qp4 r6 = r6.b(r7)
            fka r6 = r6.i()
            android.text.SpannableString r1 = defpackage.ema.u(r1, r5, r6)
            int r5 = r1.length()
            if (r5 <= 0) goto L_0x036f
            w6b r15 = new w6b
            java.lang.String r5 = r1.toString()
            java.lang.String[] r4 = defpackage.bre.d(r5, r4)
            r15.<init>(r1, r4)
        L_0x036f:
            r23 = r15
        L_0x0371:
            fs8 r1 = r3.t0
            if (r1 == 0) goto L_0x038f
            q33 r2 = r0.g
            hyc r2 = (defpackage.hyc) r2
            java.util.Locale r28 = r2.v()
            long r4 = r1.b
            long r31 = r2.n()
            android.content.Context r0 = r0.a
            r33 = 0
            r27 = r0
            r29 = r4
            java.lang.String r2 = defpackage.ay7.j(r27, r28, r29, r31, r33)
        L_0x038f:
            r20 = r2
            od6 r2 = new od6
            if (r10 != r11) goto L_0x0398
            r25 = 1
            goto L_0x039a
        L_0x0398:
            r25 = 0
        L_0x039a:
            km2 r0 = r3.C0
            boolean r0 = r0.c
            long r3 = r3.a
            r17 = r2
            r18 = r3
            r22 = r14
            r24 = r8
            r27 = r0
            r17.<init>(r18, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x0643
        L_0x03af:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r7.toString()
            r0.<init>(r1)
            throw r0
        L_0x03b9:
            r2 = 3
            if (r3 != r2) goto L_0x03ca
            java.lang.Object r0 = r48.a(r49, r50)
            tx3 r1 = defpackage.tx3.a
            if (r0 != r1) goto L_0x03c5
            return r0
        L_0x03c5:
            r2 = r0
            izc r2 = (defpackage.izc) r2
            goto L_0x0643
        L_0x03ca:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r1.a
            java.lang.String r1 = defpackage.z7b.l(r1)
            java.lang.String r2 = "Unsupported search result type: "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L_0x03dc:
            e52 r3 = r1.o
            java.lang.String r3 = r3.g(r5, r4)
            if (r3 == 0) goto L_0x03f5
            boolean r4 = defpackage.w9e.C0(r3)
            if (r4 != 0) goto L_0x03eb
            goto L_0x03ec
        L_0x03eb:
            r3 = 0
        L_0x03ec:
            if (r3 == 0) goto L_0x03f5
            android.net.Uri r3 = defpackage.j47.N(r3)
            r31 = r3
            goto L_0x03f7
        L_0x03f5:
            r31 = 0
        L_0x03f7:
            ida r3 = r0.b
            e52 r4 = r1.o
            r4.k0()
            java.lang.CharSequence r4 = r4.u0
            w6b r3 = r3.h(r4)
            uba r4 = r0.d
            java.util.List r5 = r1.c
            e52 r7 = r1.o
            r4.getClass()
            k92 r10 = r7.b
            java.lang.String r12 = r10.I
            java.lang.String r12 = defpackage.bre.c(r12)
            boolean r39 = defpackage.ema.x(r12, r5)
            if (r39 != 0) goto L_0x0428
            java.lang.String r12 = r7.q()
            boolean r12 = defpackage.ema.x(r12, r5)
            if (r12 == 0) goto L_0x0428
            r38 = 1
            goto L_0x042a
        L_0x0428:
            r38 = 0
        L_0x042a:
            java.lang.CharSequence r12 = r3.a
            java.lang.String r12 = r12.toString()
            java.util.List r12 = defpackage.ema.s(r12, r5)
            android.content.Context r14 = r4.a
            qp4 r15 = r6.b(r14)
            fka r15 = r15.i()
            android.text.SpannableString r12 = defpackage.ema.v(r15, r3, r12)
            java.lang.String r10 = r10.I
            java.lang.String r10 = defpackage.bre.c(r10)
            if (r39 == 0) goto L_0x045f
            java.util.List r2 = defpackage.ema.s(r10, r5)
            qp4 r5 = r6.b(r14)
            fka r5 = r5.i()
            android.text.SpannableString r2 = defpackage.ema.u(r10, r2, r5)
            r14 = 0
            r40 = 0
            goto L_0x04eb
        L_0x045f:
            if (r38 != 0) goto L_0x04e7
            boolean r10 = r5.isEmpty()
            r15 = 1
            r10 = r10 ^ r15
            if (r10 == 0) goto L_0x04e7
            uj3 r7 = r7.l()
            if (r7 == 0) goto L_0x04e7
            r10 = 0
            java.lang.Object r5 = r5.get(r10)
            java.lang.String r5 = (java.lang.String) r5
            java.util.Collections.singletonList(r5)
            qp4 r6 = r6.b(r14)
            fka r6 = r6.i()
            java.util.List r10 = r7.i()
            java.lang.String r7 = r7.j()
            at r14 = new at
            r14.<init>(r13, r10)
            ww9 r10 = new ww9
            r10.<init>(r2)
            r1f r2 = new r1f
            r2.<init>(r14, r10)
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            c6d r7 = defpackage.ys.Q(r7)
            c6d[] r10 = new defpackage.c6d[r13]
            r14 = 0
            r10[r14] = r2
            r2 = 1
            r10[r2] = r7
            c6d r2 = defpackage.ys.Q(r10)
            um5 r2 = defpackage.l6d.d0(r2, r9)
            q12 r7 = new q12
            r9 = 5
            r7.<init>(r5, r9)
            qk5 r2 = defpackage.l6d.Z(r2, r7)
            lr1 r7 = new lr1
            r7.<init>(r5, r6)
            java.util.Iterator r2 = r2.iterator()
            pk5 r2 = (defpackage.pk5) r2
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x04e1
            java.lang.Object r2 = r2.next()
            java.lang.Object r2 = r7.invoke(r2)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            int r5 = r2.length()
            if (r5 <= 0) goto L_0x04dd
            r5 = 1
            goto L_0x04de
        L_0x04dd:
            r5 = r14
        L_0x04de:
            r40 = r5
            goto L_0x04eb
        L_0x04e1:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>(r8)
            throw r0
        L_0x04e7:
            r14 = 0
            r40 = r14
            r2 = 0
        L_0x04eb:
            w6b r5 = new w6b
            java.lang.String[] r3 = r3.b
            r5.<init>(r12, r3)
            if (r2 != 0) goto L_0x04f5
            goto L_0x0501
        L_0x04f5:
            java.lang.String r2 = r2.toString()
            ida r3 = r4.b
            r3.getClass()
            defpackage.bre.d(r2, r3)
        L_0x0501:
            e52 r2 = r1.o
            es8 r3 = r2.c
            if (r3 == 0) goto L_0x051d
            uj3 r3 = r3.b
            if (r3 == 0) goto L_0x051d
            long r3 = r3.n()
            q33 r6 = r0.g
            hyc r6 = (defpackage.hyc) r6
            long r6 = r6.t()
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x051d
            r3 = 1
            goto L_0x051e
        L_0x051d:
            r3 = r14
        L_0x051e:
            es8 r2 = r2.c
            if (r2 == 0) goto L_0x055c
            if (r3 == 0) goto L_0x055c
            cu8 r2 = r2.a
            iu8 r2 = r2.u0
            iu8 r3 = defpackage.iu8.SENT
            if (r2 != r3) goto L_0x052d
            goto L_0x055c
        L_0x052d:
            if (r2 != 0) goto L_0x0532
            r2 = -1
        L_0x0530:
            r3 = 1
            goto L_0x053b
        L_0x0532:
            int[] r3 = defpackage.lzc.$EnumSwitchMapping$1
            int r2 = r2.ordinal()
            r2 = r3[r2]
            goto L_0x0530
        L_0x053b:
            if (r2 == r3) goto L_0x0559
            if (r2 == r13) goto L_0x0556
            r3 = 3
            if (r2 == r3) goto L_0x0553
            if (r2 == r11) goto L_0x0550
            r3 = 5
            if (r2 != r3) goto L_0x054a
            ml2 r2 = defpackage.ml2.X
            goto L_0x055e
        L_0x054a:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0550:
            ml2 r2 = defpackage.ml2.o
            goto L_0x055e
        L_0x0553:
            ml2 r2 = defpackage.ml2.c
            goto L_0x055e
        L_0x0556:
            ml2 r2 = defpackage.ml2.b
            goto L_0x055e
        L_0x0559:
            ml2 r2 = defpackage.ml2.a
            goto L_0x055e
        L_0x055c:
            ml2 r2 = defpackage.ml2.a
        L_0x055e:
            int r2 = r2.ordinal()
            if (r2 == 0) goto L_0x057f
            r3 = 1
            if (r2 == r3) goto L_0x057c
            if (r2 == r13) goto L_0x0579
            r3 = 3
            if (r2 == r3) goto L_0x0579
            if (r2 != r11) goto L_0x0573
            l62 r2 = defpackage.l62.X
        L_0x0570:
            r30 = r2
            goto L_0x0582
        L_0x0573:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0579:
            l62 r2 = defpackage.l62.c
            goto L_0x0570
        L_0x057c:
            l62 r2 = defpackage.l62.b
            goto L_0x0570
        L_0x057f:
            l62 r2 = defpackage.l62.a
            goto L_0x0570
        L_0x0582:
            vq2 r2 = new vq2
            e52 r3 = r1.o
            long r6 = r3.a
            boolean r24 = r3.N()
            e52 r3 = r1.o
            q33 r4 = r0.g
            boolean r25 = r3.V(r4)
            e52 r3 = r1.o
            boolean r26 = r3.B()
            e52 r3 = r1.o
            je7 r4 = r0.h
            java.lang.Object r4 = r4.getValue()
            y7d r4 = (defpackage.y7d) r4
            r4.getClass()
            k92 r3 = r3.b
            java.lang.String r3 = r3.m0
            if (r3 == 0) goto L_0x05b7
            int r3 = r3.length()
            if (r3 != 0) goto L_0x05b4
            goto L_0x05b7
        L_0x05b4:
            r27 = 1
            goto L_0x05b9
        L_0x05b7:
            r27 = r14
        L_0x05b9:
            e52 r3 = r1.o
            long r43 = r3.m()
            r8 = 0
            int r4 = (r43 > r8 ? 1 : (r43 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x05c8
            r28 = 0
            goto L_0x05f0
        L_0x05c8:
            java.lang.String r4 = r3.z0
            if (r4 != 0) goto L_0x05ec
            kr2 r4 = r3.B0
            rm4 r4 = r4.b
            java.lang.Object r4 = r4.get()
            ida r4 = (defpackage.ida) r4
            t33 r8 = r4.c
            java.util.Locale r42 = r8.v()
            long r45 = r8.n()
            android.content.Context r4 = r4.a
            r47 = 1
            r41 = r4
            java.lang.String r4 = defpackage.ay7.j(r41, r42, r43, r45, r47)
            r3.z0 = r4
        L_0x05ec:
            java.lang.String r15 = r3.z0
            r28 = r15
        L_0x05f0:
            e52 r3 = r1.o
            k92 r4 = r3.b
            int r4 = r4.m
            long r32 = r3.f()
            lr2 r0 = r0.c
            e52 r3 = r1.o
            ld2 r0 = (defpackage.ld2) r0
            java.lang.CharSequence r35 = r0.d(r3)
            java.util.List r0 = r1.c
            int r3 = r1.a
            if (r3 != r13) goto L_0x060d
            r37 = 1
            goto L_0x060f
        L_0x060d:
            r37 = r14
        L_0x060f:
            e52 r3 = r1.o
            r3.l0()
            java.lang.CharSequence r3 = r3.x0
            e52 r8 = r1.o
            boolean r8 = r8.X()
            if (r8 != 0) goto L_0x0631
            e52 r1 = r1.o
            uj3 r1 = r1.l()
            if (r1 == 0) goto L_0x062e
            boolean r1 = r1.u()
            r8 = 1
            if (r1 != r8) goto L_0x062e
            goto L_0x0632
        L_0x062e:
            r42 = r14
            goto L_0x0634
        L_0x0631:
            r8 = 1
        L_0x0632:
            r42 = r8
        L_0x0634:
            r21 = r2
            r22 = r6
            r29 = r4
            r34 = r5
            r36 = r0
            r41 = r3
            r21.<init>(r22, r24, r25, r26, r27, r28, r29, r30, r31, r32, r34, r35, r36, r37, r38, r39, r40, r41, r42)
        L_0x0643:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nzc.b(kzc, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
