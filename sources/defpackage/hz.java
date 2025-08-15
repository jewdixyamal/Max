package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: hz  reason: default package */
public final class hz extends ffe implements a66 {
    public final /* synthetic */ kz X;
    public final /* synthetic */ es8 Y;
    public final /* synthetic */ Long Z;
    public final /* synthetic */ int s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hz(kz kzVar, es8 es8, Long l, int i, Continuation continuation) {
        super(2, continuation);
        this.X = kzVar;
        this.Y = es8;
        this.Z = l;
        this.s0 = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((hz) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new hz(this.X, this.Y, this.Z, this.s0, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0173  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r23) {
        /*
            r22 = this;
            r0 = r22
            defpackage.od2.a0(r23)
            kz r1 = r0.X
            r1.getClass()
            es8 r2 = r0.Y
            cu8 r3 = r2.a
            int r3 = r3.b()
            je7 r4 = r1.h
            int r5 = r0.s0
            java.lang.String r6 = ""
            cu8 r7 = r2.a
            if (r3 != 0) goto L_0x003a
            java.lang.String r3 = r7.s0
            if (r3 == 0) goto L_0x003a
            int r8 = r3.length()
            if (r8 != 0) goto L_0x0027
            goto L_0x003a
        L_0x0027:
            java.lang.Object r0 = r4.getValue()
            ida r0 = (defpackage.ida) r0
            java.util.List r1 = r7.R0
            java.lang.CharSequence r0 = r0.j(r3, r1, r5)
            if (r0 != 0) goto L_0x0037
            goto L_0x0265
        L_0x0037:
            r6 = r0
            goto L_0x0265
        L_0x003a:
            r3 = 2
            r8 = 1
            java.lang.Long r0 = r0.Z
            r9 = 0
            if (r0 == 0) goto L_0x00d3
            long r10 = r0.longValue()
            k8g r0 = r7.z0
            if (r0 == 0) goto L_0x00d3
            java.lang.Object r0 = r0.a
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x00d3
            java.util.Iterator r0 = r0.iterator()
        L_0x0053:
            boolean r12 = r0.hasNext()
            if (r12 == 0) goto L_0x00cf
            java.lang.Object r12 = r0.next()
            r13 = r12
            l20 r13 = (defpackage.l20) r13
            g20 r14 = r13.a
            if (r14 != 0) goto L_0x0066
            r14 = -1
            goto L_0x006e
        L_0x0066:
            int[] r15 = defpackage.gz.$EnumSwitchMapping$0
            int r14 = r14.ordinal()
            r14 = r15[r14]
        L_0x006e:
            if (r14 == r8) goto L_0x00c4
            if (r14 == r3) goto L_0x00b9
            r15 = 3
            if (r14 == r15) goto L_0x00ae
            r15 = 4
            if (r14 == r15) goto L_0x00a3
            r15 = 5
            if (r14 != r15) goto L_0x0086
            i10 r13 = r13.e
            if (r13 == 0) goto L_0x0053
            long r13 = r13.a
            int r13 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r13 != 0) goto L_0x0053
            goto L_0x00d0
        L_0x0086:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Attach with given id = "
            r1.<init>(r2)
            r1.append(r10)
            java.lang.String r2 = " not found"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00a3:
            s10 r13 = r13.j
            if (r13 == 0) goto L_0x0053
            long r13 = r13.a
            int r13 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r13 != 0) goto L_0x0053
            goto L_0x00d0
        L_0x00ae:
            c20 r13 = r13.g
            if (r13 == 0) goto L_0x0053
            long r13 = r13.a
            int r13 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r13 != 0) goto L_0x0053
            goto L_0x00d0
        L_0x00b9:
            k20 r13 = r13.d
            if (r13 == 0) goto L_0x0053
            long r13 = r13.a
            int r13 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r13 != 0) goto L_0x0053
            goto L_0x00d0
        L_0x00c4:
            x10 r13 = r13.b
            if (r13 == 0) goto L_0x0053
            long r13 = r13.s0
            int r13 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r13 != 0) goto L_0x0053
            goto L_0x00d0
        L_0x00cf:
            r12 = r9
        L_0x00d0:
            l20 r12 = (defpackage.l20) r12
            goto L_0x00d4
        L_0x00d3:
            r12 = r9
        L_0x00d4:
            java.lang.String r0 = "audio.transcription.enabled"
            je7 r10 = r1.b
            r11 = 0
            if (r12 == 0) goto L_0x0173
            boolean r2 = r12.f()
            if (r2 == 0) goto L_0x00ef
            android.content.Context r0 = r1.a()
            x10 r1 = r12.b
            boolean r1 = r1.X
            java.lang.String r6 = defpackage.are.r(r0, r1, r11)
            goto L_0x0265
        L_0x00ef:
            boolean r2 = r12.g()
            if (r2 == 0) goto L_0x011f
            android.content.Context r0 = r1.a()
            java.lang.String[] r1 = defpackage.are.b
            c20 r1 = r12.g
            java.lang.String r2 = r1.e
            boolean r3 = defpackage.oag.u(r2)
            if (r3 == 0) goto L_0x0108
        L_0x0105:
            r6 = r2
            goto L_0x0265
        L_0x0108:
            java.lang.String r1 = r1.c
            boolean r2 = defpackage.oag.u(r1)
            if (r2 != 0) goto L_0x0113
        L_0x0110:
            r6 = r1
            goto L_0x0265
        L_0x0113:
            int r1 = defpackage.c2c.tt_link
            java.lang.String r0 = r0.getString(r1)
            java.lang.String r0 = defpackage.eae.g0(r0)
            goto L_0x0037
        L_0x011f:
            boolean r2 = r12.c()
            if (r2 == 0) goto L_0x012b
            s10 r0 = r12.j
            java.lang.String r6 = r0.c
            goto L_0x0265
        L_0x012b:
            k20 r2 = r12.d
            if (r2 == 0) goto L_0x0145
            int r2 = r2.b
            if (r2 != r3) goto L_0x0145
            android.content.Context r0 = r1.a()
            java.lang.String[] r1 = defpackage.are.b
            int r1 = defpackage.c2c.oneme_video_message
            java.lang.String r0 = r0.getString(r1)
            java.lang.String r6 = defpackage.eae.g0(r0)
            goto L_0x0265
        L_0x0145:
            boolean r2 = r12.i()
            if (r2 == 0) goto L_0x0155
            android.content.Context r0 = r1.a()
            java.lang.String r6 = defpackage.are.t(r0, r11)
            goto L_0x0265
        L_0x0155:
            boolean r2 = r12.a()
            if (r2 == 0) goto L_0x0265
            android.content.Context r1 = r1.a()
            java.lang.Object r2 = r10.getValue()
            hp r2 = (defpackage.hp) r2
            kxc r2 = (defpackage.kxc) r2
            ne7 r2 = r2.g
            boolean r0 = r2.getBoolean(r0, r8)
            java.lang.String r6 = defpackage.are.g(r1, r11, r0)
            goto L_0x0265
        L_0x0173:
            java.lang.String r3 = r7.s0
            if (r3 == 0) goto L_0x01b7
            int r3 = r3.length()
            if (r3 != 0) goto L_0x017e
            goto L_0x01b7
        L_0x017e:
            boolean r3 = r7.D()
            if (r3 != 0) goto L_0x01b7
            boolean r3 = r7.C()
            java.lang.String r12 = r7.s0
            if (r3 != 0) goto L_0x018e
            r3 = r11
            goto L_0x01a5
        L_0x018e:
            if (r12 == 0) goto L_0x01a4
            int r3 = r12.length()
            if (r3 != 0) goto L_0x0197
            goto L_0x01a4
        L_0x0197:
            c20 r3 = r7.i()
            if (r3 == 0) goto L_0x019f
            java.lang.String r9 = r3.b
        L_0x019f:
            boolean r3 = r12.equals(r9)
            goto L_0x01a5
        L_0x01a4:
            r3 = r8
        L_0x01a5:
            if (r3 != 0) goto L_0x01b7
            java.lang.Object r0 = r4.getValue()
            ida r0 = (defpackage.ida) r0
            java.util.List r1 = r7.R0
            java.lang.CharSequence r0 = r0.j(r12, r1, r5)
            if (r0 != 0) goto L_0x0037
            goto L_0x0265
        L_0x01b7:
            boolean r3 = r7.t()
            if (r3 == 0) goto L_0x01cf
            android.content.Context r0 = r1.a()
            java.lang.String[] r1 = defpackage.are.b
            int r1 = defpackage.c2c.oneme_video_message
            java.lang.String r0 = r0.getString(r1)
            java.lang.String r6 = defpackage.eae.g0(r0)
            goto L_0x0265
        L_0x01cf:
            boolean r3 = r7.C()
            if (r3 == 0) goto L_0x020d
            android.content.Context r0 = r1.a()
            c20 r1 = r7.i()
            if (r1 == 0) goto L_0x0201
            java.lang.String[] r2 = defpackage.are.b
            java.lang.String r2 = r1.e
            boolean r3 = defpackage.oag.u(r2)
            if (r3 == 0) goto L_0x01eb
            goto L_0x0105
        L_0x01eb:
            java.lang.String r1 = r1.c
            boolean r2 = defpackage.oag.u(r1)
            if (r2 != 0) goto L_0x01f5
            goto L_0x0110
        L_0x01f5:
            int r1 = defpackage.c2c.tt_link
            java.lang.String r0 = r0.getString(r1)
            java.lang.String r0 = defpackage.eae.g0(r0)
            goto L_0x0037
        L_0x0201:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Required value was null."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x020d:
            boolean r3 = r7.w()
            if (r3 == 0) goto L_0x0228
            android.content.Context r0 = r1.a()
            n10 r2 = r7.e()
            je7 r1 = r1.g
            java.lang.Object r1 = r1.getValue()
            ak3 r1 = (defpackage.ak3) r1
            java.lang.String r6 = defpackage.are.j(r0, r2, r1, r11, r11)
            goto L_0x0265
        L_0x0228:
            je7 r3 = r1.a
            java.lang.Object r3 = r3.getValue()
            r11 = r3
            are r11 = (defpackage.are) r11
            android.content.Context r12 = r1.a()
            java.lang.Object r3 = r4.getValue()
            r13 = r3
            ida r13 = (defpackage.ida) r13
            java.lang.Object r3 = r10.getValue()
            hp r3 = (defpackage.hp) r3
            kxc r3 = (defpackage.kxc) r3
            ne7 r3 = r3.g
            boolean r18 = r3.getBoolean(r0, r8)
            je7 r0 = r1.c
            java.lang.Object r0 = r0.getValue()
            q33 r0 = (defpackage.q33) r0
            hyc r0 = (defpackage.hyc) r0
            long r19 = r0.t()
            r16 = 0
            r17 = 0
            cu8 r14 = r2.a
            r15 = 0
            r21 = 0
            java.lang.String r6 = r11.f(r12, r13, r14, r15, r16, r17, r18, r19, r21)
        L_0x0265:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hz.o(java.lang.Object):java.lang.Object");
    }
}
