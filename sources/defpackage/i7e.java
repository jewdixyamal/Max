package defpackage;

import java.util.Collection;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: i7e  reason: default package */
public final class i7e extends pnf {
    public final g6e X;
    public final je7 Y;
    public final je7 Z;
    public final long b;
    public final b6e c;
    public final kke o;
    public final je7 s0;
    public final s35 t0 = new s35(0);
    public final s35 u0 = new s35(0);
    public final q0e v0;
    public final w7c w0;
    public final us x0;

    /* JADX WARNING: type inference failed for: r1v5, types: [qpd, us] */
    public i7e(long j, b6e b6e, kke kke, g6e g6e, je7 je7, je7 je72, je7 je73) {
        this.b = j;
        this.c = b6e;
        this.o = kke;
        this.X = g6e;
        this.Y = je7;
        this.Z = je72;
        this.s0 = je73;
        q0e a = r0e.a(xnd.c);
        this.v0 = a;
        this.w0 = new w7c(a);
        this.x0 = new qpd(0);
        od2.L(od2.F(new zn5(new j31(b6e.e, g6e.e, c7e.s0, 4), new d7e(this, (Continuation) null), 5), ((w9a) kke).b()), this.a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object q(defpackage.i7e r10, java.util.List r11, defpackage.d6e r12, kotlin.coroutines.Continuation r13) {
        /*
            r10.getClass()
            boolean r0 = r13 instanceof defpackage.e7e
            if (r0 == 0) goto L_0x0016
            r0 = r13
            e7e r0 = (defpackage.e7e) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x001b
        L_0x0016:
            e7e r0 = new e7e
            r0.<init>(r10, r13)
        L_0x001b:
            java.lang.Object r13 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L_0x003e
            if (r2 == r3) goto L_0x0038
            if (r2 != r4) goto L_0x0030
            i7e r10 = r0.o
            defpackage.od2.a0(r13)
            goto L_0x00c5
        L_0x0030:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0038:
            i7e r10 = r0.o
            defpackage.od2.a0(r13)
            goto L_0x008e
        L_0x003e:
            defpackage.od2.a0(r13)
            java.lang.Class<i7e> r13 = defpackage.i7e.class
            java.lang.String r13 = r13.getName()
            ir6 r2 = defpackage.hm9.m
            if (r2 != 0) goto L_0x004c
            goto L_0x007c
        L_0x004c:
            boolean r5 = r2.c()
            if (r5 == 0) goto L_0x007c
            us7 r5 = defpackage.us7.X
            int r6 = r11.size()
            r12.getClass()
            d6e r7 = defpackage.g6e.k
            if (r12 != r7) goto L_0x0061
            r7 = r3
            goto L_0x0062
        L_0x0061:
            r7 = 0
        L_0x0062:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Showcase content. Sets size from sections:"
            r8.<init>(r9)
            r8.append(r6)
            java.lang.String r6 = ", search in initial:"
            r8.append(r6)
            r8.append(r7)
            java.lang.String r6 = r8.toString()
            r7 = 0
            r2.d(r5, r13, r6, r7)
        L_0x007c:
            r12.getClass()
            d6e r13 = defpackage.g6e.k
            if (r12 != r13) goto L_0x00a1
            r0.o = r10
            r0.Z = r3
            java.lang.Object r13 = r10.t(r11, r0)
            if (r13 != r1) goto L_0x008e
            goto L_0x00cf
        L_0x008e:
            java.util.List r13 = (java.util.List) r13
            boolean r11 = r13.isEmpty()
            if (r11 == 0) goto L_0x0099
            xnd r11 = defpackage.xnd.c
            goto L_0x00c8
        L_0x0099:
            xnd r11 = new xnd
            wnd r12 = defpackage.wnd.b
            r11.<init>(r12, r13)
            goto L_0x00c8
        L_0x00a1:
            boolean r11 = r12.b
            if (r11 == 0) goto L_0x00ba
            q0e r11 = r10.v0
            java.lang.Object r11 = r11.getValue()
            xnd r11 = (defpackage.xnd) r11
            wnd r12 = defpackage.wnd.a
            java.util.List r13 = r11.b
            r11.getClass()
            xnd r11 = new xnd
            r11.<init>(r12, r13)
            goto L_0x00c8
        L_0x00ba:
            r0.o = r10
            r0.Z = r4
            java.lang.Object r13 = r10.s(r12, r0)
            if (r13 != r1) goto L_0x00c5
            goto L_0x00cf
        L_0x00c5:
            r11 = r13
            xnd r11 = (defpackage.xnd) r11
        L_0x00c8:
            q0e r10 = r10.v0
            r10.setValue(r11)
            e5f r1 = defpackage.e5f.a
        L_0x00cf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i7e.q(i7e, java.util.List, d6e, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean r() {
        List list;
        g6e g6e = this.X;
        if (!g6e.a()) {
            b6e b6e = this.c;
            Long l = (Long) b6e.f.get();
            if ((l != null && l.longValue() == 0) || !(!((Collection) b6e.d.getValue()).isEmpty())) {
                return false;
            }
        } else if (((c6e) g6e.g.get()).a == 0 || (list = ((d6e) g6e.d.getValue()).a) == null || list.isEmpty()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object s(defpackage.d6e r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.f7e
            if (r0 == 0) goto L_0x0013
            r0 = r8
            f7e r0 = (defpackage.f7e) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            f7e r0 = new f7e
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            wnd r6 = r0.o
            defpackage.od2.a0(r8)
            goto L_0x005e
        L_0x0029:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0031:
            defpackage.od2.a0(r8)
            java.util.List r8 = r7.a
            wnd r2 = defpackage.wnd.o
            if (r8 == 0) goto L_0x0044
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L_0x0041
            goto L_0x0044
        L_0x0041:
            wnd r8 = defpackage.wnd.c
            goto L_0x0045
        L_0x0044:
            r8 = r2
        L_0x0045:
            nz4 r4 = defpackage.nz4.a
            if (r8 != r2) goto L_0x004a
            goto L_0x0062
        L_0x004a:
            java.util.List r7 = r7.a
            if (r7 != 0) goto L_0x004f
            goto L_0x0050
        L_0x004f:
            r4 = r7
        L_0x0050:
            r0.o = r8
            r0.Z = r3
            java.lang.Object r6 = r6.t(r4, r0)
            if (r6 != r1) goto L_0x005b
            return r1
        L_0x005b:
            r5 = r8
            r8 = r6
            r6 = r5
        L_0x005e:
            r4 = r8
            java.util.List r4 = (java.util.List) r4
            r8 = r6
        L_0x0062:
            xnd r6 = new xnd
            r6.<init>(r8, r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i7e.s(d6e, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object t(java.util.List r39, kotlin.coroutines.Continuation r40) {
        /*
            r38 = this;
            r0 = r40
            boolean r1 = r0 instanceof defpackage.g7e
            if (r1 == 0) goto L_0x0017
            r1 = r0
            g7e r1 = (defpackage.g7e) r1
            int r2 = r1.v0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0017
            int r2 = r2 - r3
            r1.v0 = r2
            r2 = r38
            goto L_0x001e
        L_0x0017:
            g7e r1 = new g7e
            r2 = r38
            r1.<init>(r2, r0)
        L_0x001e:
            java.lang.Object r0 = r1.t0
            tx3 r3 = defpackage.tx3.a
            int r4 = r1.v0
            r5 = 10
            r6 = 1
            if (r4 == 0) goto L_0x0048
            if (r4 != r6) goto L_0x0040
            java.util.Collection r2 = r1.s0
            m3e r4 = r1.Z
            java.util.Iterator r7 = r1.Y
            java.util.Collection r8 = r1.X
            i7e r9 = r1.o
            defpackage.od2.a0(r0)
            r37 = r4
            r4 = r2
            r2 = r9
            r9 = r7
            r7 = r37
            goto L_0x009e
        L_0x0040:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0048:
            defpackage.od2.a0(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r4 = r39
            int r7 = defpackage.z53.S(r4, r5)
            r0.<init>(r7)
            java.util.Iterator r4 = r39.iterator()
            r7 = r4
        L_0x005b:
            boolean r4 = r7.hasNext()
            if (r4 == 0) goto L_0x0147
            java.lang.Object r4 = r7.next()
            m3e r4 = (defpackage.m3e) r4
            je7 r8 = r2.Y
            java.lang.Object r8 = r8.getValue()
            sc5 r8 = (defpackage.sc5) r8
            long r9 = r4.a
            r8.getClass()
            c10 r11 = new c10
            r12 = 15
            r11.<init>(r9, r12)
            ml0 r8 = r8.s0
            r8.getClass()
            e0a r9 = new e0a
            r10 = 1
            r9.<init>(r8, r11, r10)
            r1.o = r2
            r1.X = r0
            r1.Y = r7
            r1.Z = r4
            r1.s0 = r0
            r1.v0 = r6
            java.lang.Object r8 = defpackage.s36.g(r9, r1)
            if (r8 != r3) goto L_0x0099
            return r3
        L_0x0099:
            r9 = r7
            r7 = r4
            r4 = r0
            r0 = r8
            r8 = r4
        L_0x009e:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r19 = r0.booleanValue()
            r2.getClass()
            long r11 = r7.a
            java.lang.String r0 = r7.b
            if (r0 != 0) goto L_0x00af
            java.lang.String r0 = ""
        L_0x00af:
            iqe r13 = new iqe
            r13.<init>(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r10 = r7.h
            int r14 = defpackage.z53.S(r10, r5)
            r0.<init>(r14)
            java.util.Iterator r10 = r10.iterator()
        L_0x00c3:
            boolean r14 = r10.hasNext()
            if (r14 == 0) goto L_0x0124
            java.lang.Object r14 = r10.next()
            d2e r14 = (defpackage.d2e) r14
            z2e r15 = new z2e
            long r5 = r14.a
            r38 = r1
            java.lang.String r1 = r14.s0
            boolean r16 = defpackage.oag.t(r1)
            if (r16 == 0) goto L_0x00df
            java.lang.String r1 = r14.o
        L_0x00df:
            r27 = r1
            je7 r1 = r2.s0
            java.lang.Object r1 = r1.getValue()
            qe5 r1 = (defpackage.qe5) r1
            se5 r1 = (defpackage.se5) r1
            boolean r1 = r1.w()
            if (r1 == 0) goto L_0x00f6
            java.lang.String r1 = r14.z0
        L_0x00f3:
            r29 = r1
            goto L_0x00f8
        L_0x00f6:
            r1 = 0
            goto L_0x00f3
        L_0x00f8:
            r33 = 0
            r39 = r2
            long r1 = r14.a
            r34 = r1
            long r1 = r14.v0
            r25 = r1
            r23 = r1
            java.lang.String r1 = r14.w0
            r28 = r1
            r30 = 0
            r31 = 0
            r32 = 0
            r36 = 4032(0xfc0, float:5.65E-42)
            r20 = r15
            r21 = r5
            r20.<init>(r21, r23, r25, r27, r28, r29, r30, r31, r32, r33, r34, r36)
            r0.add(r15)
            r1 = r38
            r2 = r39
            r5 = 10
            r6 = 1
            goto L_0x00c3
        L_0x0124:
            r38 = r1
            r39 = r2
            w3e r1 = new w3e
            r15 = 0
            r18 = 0
            java.lang.String r14 = r7.c
            r17 = 5
            r20 = 72
            r10 = r1
            r16 = r0
            r10.<init>(r11, r13, r14, r15, r16, r17, r18, r19, r20)
            r4.add(r1)
            r1 = r38
            r2 = r39
            r0 = r8
            r7 = r9
            r5 = 10
            r6 = 1
            goto L_0x005b
        L_0x0147:
            java.util.List r0 = (java.util.List) r0
            ky6 r1 = new ky6
            r2 = 14
            r1.<init>(r2)
            java.util.List r0 = defpackage.x53.x0(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i7e.t(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
