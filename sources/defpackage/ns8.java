package defpackage;

import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: ns8  reason: default package */
public final class ns8 {
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;
    public final je7 f;
    public final je7 g;

    public ns8(je7 je7, je7 je72, je7 je73, je7 je74, je7 je75, je7 je76, je7 je77) {
        this.a = je7;
        this.b = je72;
        this.c = je73;
        this.d = je74;
        this.e = je75;
        this.f = je76;
        this.g = je77;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.util.List r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.js8
            if (r0 == 0) goto L_0x0013
            r0 = r6
            js8 r0 = (defpackage.js8) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            js8 r0 = new js8
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            ns8 r4 = r0.o
            defpackage.od2.a0(r6)
            goto L_0x0047
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            defpackage.od2.a0(r6)
            je7 r6 = r4.a
            java.lang.Object r6 = r6.getValue()
            r79 r6 = (defpackage.r79) r6
            r0.o = r4
            r0.Z = r3
            java.lang.Object r6 = r6.b(r5, r0)
            if (r6 != r1) goto L_0x0047
            return r1
        L_0x0047:
            java.util.List r6 = (java.util.List) r6
            boolean r5 = r6.isEmpty()
            if (r5 == 0) goto L_0x0052
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L_0x0052:
            je7 r5 = r4.d
            java.lang.Object r5 = r5.getValue()
            iy2 r5 = (defpackage.iy2) r5
            java.lang.Object r0 = defpackage.x53.g0(r6)
            cu8 r0 = (defpackage.cu8) r0
            long r0 = r0.t0
            jz2 r5 = (defpackage.jz2) r5
            w7c r5 = r5.m(r0)
            j0e r5 = r5.a
            java.lang.Object r5 = r5.getValue()
            e52 r5 = (defpackage.e52) r5
            if (r5 != 0) goto L_0x0075
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L_0x0075:
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x007c
            goto L_0x0094
        L_0x007c:
            java.util.Iterator r6 = r6.iterator()
        L_0x0080:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0094
            java.lang.Object r0 = r6.next()
            cu8 r0 = (defpackage.cu8) r0
            boolean r0 = r4.b(r5, r0)
            r0 = r0 ^ r3
            if (r0 == 0) goto L_0x0080
            r3 = 0
        L_0x0094:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ns8.a(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean b(e52 e52, cu8 cu8) {
        if (!e52.M()) {
            boolean x = e52.x();
            boolean z = ((se5) g()).t() && e52.y() && cu8.Y == ((hyc) f()).t();
            boolean z2 = ((se5) g()).t() && (e52.d0() || oag.s(e52.e(e52.Y), LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY));
            if (e52.I()) {
                return x || z || z2;
            }
            if (x && (e52.d0() || e52.b0())) {
                return true;
            }
        }
        if (cu8.o()) {
            return false;
        }
        long t = ((hyc) f()).t();
        long j = cu8.Y;
        if (j != t && (j != 0 || !e52.F())) {
            return false;
        }
        if (e52.F() && j != 0) {
            return false;
        }
        qyc qyc = (qyc) ((y7d) this.f.getValue());
        qyc.getClass();
        if ((((hyc) f()).n() - cu8.o) / ((long) 1000) >= ((long) ((int) qyc.q(PmsKey.f36edittimeout, (long) 86400)))) {
            return false;
        }
        return cu8.c != 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0122, code lost:
        if (defpackage.w9e.C0(r1) == false) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0128, code lost:
        if (defpackage.s5c.L(r8) != false) goto L_0x012a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0058 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.Serializable c(long r13, kotlin.coroutines.Continuation r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof defpackage.ks8
            if (r0 == 0) goto L_0x0013
            r0 = r15
            ks8 r0 = (defpackage.ks8) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.s0 = r1
            goto L_0x0018
        L_0x0013:
            ks8 r0 = new ks8
            r0.<init>(r12, r15)
        L_0x0018:
            java.lang.Object r15 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            long r13 = r0.X
            ns8 r12 = r0.o
            defpackage.od2.a0(r15)
            goto L_0x004b
        L_0x002b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0033:
            defpackage.od2.a0(r15)
            je7 r15 = r12.a
            java.lang.Object r15 = r15.getValue()
            r79 r15 = (defpackage.r79) r15
            r0.o = r12
            r0.X = r13
            r0.s0 = r3
            java.lang.Object r15 = r15.a(r13, r0)
            if (r15 != r1) goto L_0x004b
            return r1
        L_0x004b:
            cu8 r15 = (defpackage.cu8) r15
            nz4 r0 = defpackage.nz4.a
            if (r15 != 0) goto L_0x0052
            return r0
        L_0x0052:
            boolean r1 = r15.x()
            if (r1 == 0) goto L_0x0059
            return r0
        L_0x0059:
            je7 r1 = r12.b
            java.lang.Object r1 = r1.getValue()
            zu8 r1 = (defpackage.zu8) r1
            es8 r1 = defpackage.zu8.a(r1, r15)
            je7 r2 = r12.d
            java.lang.Object r2 = r2.getValue()
            iy2 r2 = (defpackage.iy2) r2
            long r4 = r15.t0
            jz2 r2 = (defpackage.jz2) r2
            w7c r2 = r2.m(r4)
            j0e r2 = r2.a
            java.lang.Object r2 = r2.getValue()
            e52 r2 = (defpackage.e52) r2
            if (r2 != 0) goto L_0x0080
            return r0
        L_0x0080:
            q33 r0 = r12.f()
            hyc r0 = (defpackage.hyc) r0
            long r4 = r0.t()
            long r6 = r15.Y
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            r4 = 0
            if (r0 != 0) goto L_0x0093
            r0 = r3
            goto L_0x0094
        L_0x0093:
            r0 = r4
        L_0x0094:
            kl7 r5 = defpackage.j1e.l()
            sw8 r8 = r12.h()
            boolean r8 = r8.b(r2, r1)
            if (r8 == 0) goto L_0x00a7
            gs8 r8 = defpackage.gs8.v0
            r5.add(r8)
        L_0x00a7:
            sw8 r8 = r12.h()
            boolean r8 = r8.d(r2, r1)
            if (r8 == 0) goto L_0x00b6
            gs8 r8 = defpackage.gs8.X
            r5.add(r8)
        L_0x00b6:
            sw8 r8 = r12.h()
            r8.getClass()
            cu8 r8 = r1.a
            boolean r9 = defpackage.sw8.c(r2, r8)
            if (r9 == 0) goto L_0x00ca
            gs8 r9 = defpackage.gs8.a
            r5.add(r9)
        L_0x00ca:
            int r9 = r8.b()
            if (r9 != r3) goto L_0x00d8
            boolean r9 = r8.y()
            if (r9 == 0) goto L_0x00d8
            r9 = r3
            goto L_0x00d9
        L_0x00d8:
            r9 = r4
        L_0x00d9:
            qe5 r10 = r12.g()
            se5 r10 = (defpackage.se5) r10
            r10.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r11 = ru.ok.tamtam.android.prefs.PmsKey.f38extsharingvideo
            boolean r10 = r10.n(r11, r4)
            if (r10 == 0) goto L_0x00f8
            int r10 = r8.b()
            if (r10 != r3) goto L_0x00f8
            boolean r10 = r8.E()
            if (r10 == 0) goto L_0x00f8
            r10 = r3
            goto L_0x00f9
        L_0x00f8:
            r10 = r4
        L_0x00f9:
            if (r9 != 0) goto L_0x00fd
            if (r10 == 0) goto L_0x0102
        L_0x00fd:
            gs8 r9 = defpackage.gs8.y0
            r5.add(r9)
        L_0x0102:
            java.lang.String r9 = r8.s0
            if (r9 == 0) goto L_0x010c
            boolean r9 = defpackage.w9e.C0(r9)
            if (r9 == 0) goto L_0x012a
        L_0x010c:
            bw8 r1 = r1.c
            if (r1 == 0) goto L_0x011b
            es8 r1 = r1.c
            if (r1 == 0) goto L_0x011b
            cu8 r1 = r1.a
            if (r1 == 0) goto L_0x011b
            java.lang.String r1 = r1.s0
            goto L_0x011c
        L_0x011b:
            r1 = 0
        L_0x011c:
            if (r1 == 0) goto L_0x0124
            boolean r1 = defpackage.w9e.C0(r1)
            if (r1 == 0) goto L_0x012a
        L_0x0124:
            boolean r1 = defpackage.s5c.L(r8)
            if (r1 == 0) goto L_0x012f
        L_0x012a:
            gs8 r1 = defpackage.gs8.b
            r5.add(r1)
        L_0x012f:
            boolean r1 = r2.K()
            if (r1 != 0) goto L_0x013a
            gs8 r1 = defpackage.gs8.o
            r5.add(r1)
        L_0x013a:
            g20 r1 = defpackage.g20.c
            k8g r8 = r15.z0
            if (r8 == 0) goto L_0x016b
            java.lang.Object r9 = r8.a
            java.util.List r9 = (java.util.List) r9
            if (r9 != 0) goto L_0x0147
            goto L_0x016b
        L_0x0147:
            g20 r10 = defpackage.g20.o
            boolean r10 = r15.m(r10)
            if (r10 != 0) goto L_0x0158
            boolean r10 = r15.m(r1)
            if (r10 == 0) goto L_0x0156
            goto L_0x0158
        L_0x0156:
            r10 = r4
            goto L_0x0159
        L_0x0158:
            r10 = r3
        L_0x0159:
            int r9 = r9.size()
            if (r9 != r3) goto L_0x0161
            r9 = r3
            goto L_0x0162
        L_0x0161:
            r9 = r4
        L_0x0162:
            if (r10 == 0) goto L_0x016b
            if (r9 == 0) goto L_0x016b
            gs8 r9 = defpackage.gs8.w0
            r5.add(r9)
        L_0x016b:
            if (r8 == 0) goto L_0x0185
            java.lang.Object r8 = r8.a
            java.util.List r8 = (java.util.List) r8
            if (r8 != 0) goto L_0x0174
            goto L_0x0185
        L_0x0174:
            boolean r1 = r15.m(r1)
            if (r1 == 0) goto L_0x0185
            int r1 = r8.size()
            if (r1 != r3) goto L_0x0185
            gs8 r1 = defpackage.gs8.x0
            r5.add(r1)
        L_0x0185:
            boolean r1 = r15.v()
            if (r1 != 0) goto L_0x01b0
            boolean r1 = r2.w()
            if (r1 == 0) goto L_0x01b0
            long r8 = r15.c
            r10 = 0
            int r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r1 <= 0) goto L_0x01b0
            es8 r1 = r2.X
            if (r1 == 0) goto L_0x01ab
            cu8 r1 = r1.a
            long r8 = r1.b
            int r13 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r13 != 0) goto L_0x01ab
            gs8 r13 = defpackage.gs8.t0
            r5.add(r13)
            goto L_0x01b0
        L_0x01ab:
            gs8 r13 = defpackage.gs8.s0
            r5.add(r13)
        L_0x01b0:
            q33 r13 = r12.f()
            hyc r13 = (defpackage.hyc) r13
            long r13 = r13.t()
            int r13 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r13 == 0) goto L_0x01d9
            qe5 r13 = r12.g()
            boolean r13 = defpackage.sw8.a(r2, r13, r4)
            if (r13 == 0) goto L_0x01d9
            k92 r13 = r2.b
            fm5 r13 = r13.J
            r14 = 256(0x100, float:3.59E-43)
            boolean r13 = r13.b(r14)
            if (r13 != 0) goto L_0x01d9
            gs8 r13 = defpackage.gs8.c
            r5.add(r13)
        L_0x01d9:
            gs8 r13 = defpackage.gs8.u0
            r5.add(r13)
            qe5 r13 = r12.g()
            boolean r13 = defpackage.sw8.a(r2, r13, r0)
            if (r13 == 0) goto L_0x01ed
            gs8 r13 = defpackage.gs8.Y
            r5.add(r13)
        L_0x01ed:
            boolean r12 = r12.b(r2, r15)
            if (r12 == 0) goto L_0x01f8
            gs8 r12 = defpackage.gs8.Z
            r5.add(r12)
        L_0x01f8:
            kl7 r12 = defpackage.j1e.d(r5)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ns8.c(long, kotlin.coroutines.Continuation):java.io.Serializable");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0058 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.Serializable d(long r9, kotlin.coroutines.Continuation r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.ls8
            if (r0 == 0) goto L_0x0013
            r0 = r11
            ls8 r0 = (defpackage.ls8) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.s0 = r1
            goto L_0x0018
        L_0x0013:
            ls8 r0 = new ls8
            r0.<init>(r8, r11)
        L_0x0018:
            java.lang.Object r11 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            long r9 = r0.X
            ns8 r8 = r0.o
            defpackage.od2.a0(r11)
            goto L_0x004b
        L_0x002b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0033:
            defpackage.od2.a0(r11)
            je7 r11 = r8.a
            java.lang.Object r11 = r11.getValue()
            r79 r11 = (defpackage.r79) r11
            r0.o = r8
            r0.X = r9
            r0.s0 = r3
            java.lang.Object r11 = r11.a(r9, r0)
            if (r11 != r1) goto L_0x004b
            return r1
        L_0x004b:
            cu8 r11 = (defpackage.cu8) r11
            nz4 r0 = defpackage.nz4.a
            if (r11 != 0) goto L_0x0052
            return r0
        L_0x0052:
            boolean r1 = r11.x()
            if (r1 == 0) goto L_0x0059
            return r0
        L_0x0059:
            je7 r1 = r8.b
            java.lang.Object r1 = r1.getValue()
            zu8 r1 = (defpackage.zu8) r1
            es8 r1 = defpackage.zu8.a(r1, r11)
            je7 r2 = r8.d
            java.lang.Object r2 = r2.getValue()
            iy2 r2 = (defpackage.iy2) r2
            long r4 = r11.t0
            jz2 r2 = (defpackage.jz2) r2
            w7c r2 = r2.m(r4)
            j0e r2 = r2.a
            java.lang.Object r2 = r2.getValue()
            e52 r2 = (defpackage.e52) r2
            if (r2 != 0) goto L_0x0080
            return r0
        L_0x0080:
            q33 r0 = r8.f()
            hyc r0 = (defpackage.hyc) r0
            long r4 = r0.t()
            long r6 = r11.Y
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0091
            goto L_0x0092
        L_0x0091:
            r3 = 0
        L_0x0092:
            kl7 r0 = defpackage.j1e.l()
            gs8 r4 = defpackage.gs8.b
            r0.add(r4)
            sw8 r4 = r8.h()
            boolean r4 = r4.d(r2, r1)
            if (r4 == 0) goto L_0x00aa
            gs8 r4 = defpackage.gs8.X
            r0.add(r4)
        L_0x00aa:
            sw8 r4 = r8.h()
            r4.getClass()
            cu8 r1 = r1.a
            boolean r1 = defpackage.sw8.c(r2, r1)
            if (r1 == 0) goto L_0x00be
            gs8 r1 = defpackage.gs8.a
            r0.add(r1)
        L_0x00be:
            boolean r1 = r11.v()
            if (r1 != 0) goto L_0x00e9
            boolean r1 = r2.w()
            if (r1 == 0) goto L_0x00e9
            long r4 = r11.c
            r6 = 0
            int r11 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r11 <= 0) goto L_0x00e9
            es8 r11 = r2.X
            if (r11 == 0) goto L_0x00e4
            cu8 r11 = r11.a
            long r4 = r11.b
            int r9 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r9 != 0) goto L_0x00e4
            gs8 r9 = defpackage.gs8.t0
            r0.add(r9)
            goto L_0x00e9
        L_0x00e4:
            gs8 r9 = defpackage.gs8.s0
            r0.add(r9)
        L_0x00e9:
            qe5 r8 = r8.g()
            boolean r8 = defpackage.sw8.a(r2, r8, r3)
            if (r8 == 0) goto L_0x00f8
            gs8 r8 = defpackage.gs8.Y
            r0.add(r8)
        L_0x00f8:
            kl7 r8 = defpackage.j1e.d(r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ns8.d(long, kotlin.coroutines.Continuation):java.io.Serializable");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0051 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.Serializable e(java.util.Set r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.ms8
            if (r0 == 0) goto L_0x0013
            r0 = r8
            ms8 r0 = (defpackage.ms8) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            ms8 r0 = new ms8
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            ns8 r6 = r0.o
            defpackage.od2.a0(r8)
            goto L_0x0047
        L_0x0029:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0031:
            defpackage.od2.a0(r8)
            je7 r8 = r6.a
            java.lang.Object r8 = r8.getValue()
            r79 r8 = (defpackage.r79) r8
            r0.o = r6
            r0.Z = r3
            java.lang.Object r8 = r8.b(r7, r0)
            if (r8 != r1) goto L_0x0047
            return r1
        L_0x0047:
            java.util.List r8 = (java.util.List) r8
            boolean r7 = r8.isEmpty()
            nz4 r0 = defpackage.nz4.a
            if (r7 == 0) goto L_0x0052
            return r0
        L_0x0052:
            je7 r7 = r6.d
            java.lang.Object r7 = r7.getValue()
            iy2 r7 = (defpackage.iy2) r7
            java.lang.Object r1 = defpackage.x53.g0(r8)
            cu8 r1 = (defpackage.cu8) r1
            long r1 = r1.t0
            jz2 r7 = (defpackage.jz2) r7
            w7c r7 = r7.m(r1)
            j0e r7 = r7.a
            java.lang.Object r7 = r7.getValue()
            e52 r7 = (defpackage.e52) r7
            if (r7 != 0) goto L_0x0073
            return r0
        L_0x0073:
            kl7 r0 = defpackage.j1e.l()
            gs8 r1 = defpackage.gs8.b
            r0.add(r1)
            java.util.Iterator r1 = r8.iterator()
        L_0x0080:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x009a
            java.lang.Object r2 = r1.next()
            cu8 r2 = (defpackage.cu8) r2
            sw8 r4 = r6.h()
            r4.getClass()
            boolean r2 = defpackage.sw8.c(r7, r2)
            if (r2 != 0) goto L_0x0080
            goto L_0x009f
        L_0x009a:
            gs8 r1 = defpackage.gs8.a
            r0.add(r1)
        L_0x009f:
            java.util.Iterator r8 = r8.iterator()
        L_0x00a3:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x00cd
            java.lang.Object r1 = r8.next()
            cu8 r1 = (defpackage.cu8) r1
            long r1 = r1.Y
            q33 r4 = r6.f()
            hyc r4 = (defpackage.hyc) r4
            long r4 = r4.t()
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x00c1
            r1 = r3
            goto L_0x00c2
        L_0x00c1:
            r1 = 0
        L_0x00c2:
            qe5 r2 = r6.g()
            boolean r1 = defpackage.sw8.a(r7, r2, r1)
            if (r1 != 0) goto L_0x00a3
            goto L_0x00d2
        L_0x00cd:
            gs8 r6 = defpackage.gs8.Y
            r0.add(r6)
        L_0x00d2:
            kl7 r6 = defpackage.j1e.d(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ns8.e(java.util.Set, kotlin.coroutines.Continuation):java.io.Serializable");
    }

    public final q33 f() {
        return (q33) this.e.getValue();
    }

    public final qe5 g() {
        return (qe5) this.g.getValue();
    }

    public final sw8 h() {
        return (sw8) this.c.getValue();
    }
}
