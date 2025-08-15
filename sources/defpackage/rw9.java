package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: rw9  reason: default package */
public final class rw9 implements qu7 {
    public static final /* synthetic */ int Z = 0;
    public final je7 X;
    public final ContextScope Y;
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 o;

    public rw9(je7 je7, je7 je72, je7 je73, je7 je74, je7 je75, kke kke, ox3 ox3) {
        this.a = je7;
        this.b = je72;
        this.c = je73;
        this.o = je74;
        this.X = je75;
        this.Y = j1e.a(((w9a) kke).b().limitedParallelism(1, "notifs-readmarks").plus(ox3));
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object b(defpackage.rw9 r11, defpackage.e52 r12, long r13, kotlin.coroutines.Continuation r15) {
        /*
            r11.getClass()
            boolean r0 = r15 instanceof defpackage.mw9
            if (r0 == 0) goto L_0x0016
            r0 = r15
            mw9 r0 = (defpackage.mw9) r0
            int r1 = r0.u0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.u0 = r1
            goto L_0x001b
        L_0x0016:
            mw9 r0 = new mw9
            r0.<init>(r11, r15)
        L_0x001b:
            java.lang.Object r15 = r0.s0
            tx3 r8 = defpackage.tx3.a
            int r1 = r0.u0
            r9 = 2
            r10 = 1
            if (r1 == 0) goto L_0x0043
            if (r1 == r10) goto L_0x0037
            if (r1 != r9) goto L_0x002f
            boolean r11 = r0.Z
            defpackage.od2.a0(r15)
            goto L_0x0088
        L_0x002f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0037:
            long r13 = r0.Y
            e52 r12 = r0.X
            rw9 r11 = r0.o
            defpackage.od2.a0(r15)
        L_0x0040:
            r1 = r11
            r4 = r13
            goto L_0x006d
        L_0x0043:
            defpackage.od2.a0(r15)
            je7 r15 = r11.c
            java.lang.Object r15 = r15.getValue()
            q33 r15 = (defpackage.q33) r15
            hyc r15 = (defpackage.hyc) r15
            long r5 = r15.t()
            r1 = -1
            int r15 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r15 == 0) goto L_0x0099
            r0.o = r11
            r0.X = r12
            r0.Y = r13
            r0.u0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r7 = r0
            java.lang.Object r15 = r1.d(r2, r3, r5, r7)
            if (r15 != r8) goto L_0x0040
            goto L_0x0098
        L_0x006d:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r11 = r15.booleanValue()
            k92 r12 = r12.b
            long r2 = r12.a
            r12 = 0
            r0.o = r12
            r0.X = r12
            r0.Z = r11
            r0.u0 = r9
            r6 = r0
            java.lang.Object r15 = r1.c(r2, r4, r6)
            if (r15 != r8) goto L_0x0088
            goto L_0x0098
        L_0x0088:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r12 = r15.booleanValue()
            if (r12 != 0) goto L_0x0094
            if (r11 == 0) goto L_0x0093
            goto L_0x0094
        L_0x0093:
            r10 = 0
        L_0x0094:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r10)
        L_0x0098:
            return r8
        L_0x0099:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "logged out"
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rw9.b(rw9, e52, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void a() {
        pag.e(this.Y.getCoroutineContext(), new CancellationException("logout"));
    }

    public final Object c(long j, long j2, Continuation continuation) {
        kw9 kw9 = (kw9) this.a.getValue();
        qv9 qv9 = new qv9(j, j2);
        kw9.getClass();
        return z04.e0(kw9.a, new im1(kw9, qv9), continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(defpackage.e52 r20, long r21, long r23, kotlin.coroutines.Continuation r25) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r8 = r21
            r2 = r25
            boolean r3 = r2 instanceof defpackage.nw9
            if (r3 == 0) goto L_0x001c
            r3 = r2
            nw9 r3 = (defpackage.nw9) r3
            int r4 = r3.s0
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x001c
            int r4 = r4 - r5
            r3.s0 = r4
        L_0x001a:
            r12 = r3
            goto L_0x0022
        L_0x001c:
            nw9 r3 = new nw9
            r3.<init>(r0, r2)
            goto L_0x001a
        L_0x0022:
            java.lang.Object r2 = r12.Y
            tx3 r13 = defpackage.tx3.a
            int r3 = r12.s0
            r14 = 1
            if (r3 == 0) goto L_0x0040
            if (r3 != r14) goto L_0x0038
            long r0 = r12.X
            e52 r3 = r12.o
            defpackage.od2.a0(r2)
            r17 = r0
            r1 = r3
            goto L_0x00a1
        L_0x0038:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0040:
            defpackage.od2.a0(r2)
            long r10 = r20.n()
            int r2 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r2 < 0) goto L_0x004e
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L_0x004e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "changeSelfReadMarkInChatsCache: chatId="
            r2.<init>(r3)
            long r3 = r1.a
            r2.append(r3)
            java.lang.String r3 = ", mark="
            r2.append(r3)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "rw9"
            defpackage.hm9.m(r3, r2, new java.lang.Object[0])
            je7 r0 = r0.b
            java.lang.Object r0 = r0.getValue()
            iy2 r0 = (defpackage.iy2) r0
            r12.o = r1
            r12.X = r10
            r12.s0 = r14
            hy2 r2 = defpackage.iy2.m
            r3 = r0
            jz2 r3 = (defpackage.jz2) r3
            r3.getClass()
            uy2 r0 = new uy2
            r15 = -1
            r16 = 0
            long r4 = r1.a
            r2 = r0
            r6 = r23
            r8 = r21
            r17 = r10
            r10 = r15
            r11 = r16
            r2.<init>(r3, r4, r6, r8, r10, r11)
            java.lang.Object r0 = defpackage.ema.C(r0, r12)
            if (r0 != r13) goto L_0x009c
            goto L_0x009e
        L_0x009c:
            e5f r0 = defpackage.e5f.a
        L_0x009e:
            if (r0 != r13) goto L_0x00a1
            return r13
        L_0x00a1:
            long r0 = r1.n()
            int r0 = (r17 > r0 ? 1 : (r17 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x00aa
            goto L_0x00ab
        L_0x00aa:
            r14 = 0
        L_0x00ab:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rw9.d(e52, long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void e(long j, long j2) {
        StringBuilder k = au1.k(j, "onSelfReadMarkChanged: chatId=", ", mark=");
        k.append(j2);
        hm9.m("rw9", k.toString(), new Object[0]);
        j47.T(this.Y, (lx3) null, (vx3) null, new pw9(this, j, j2, (Continuation) null), 3);
    }

    public final void f(long j, long j2) {
        StringBuilder k = au1.k(j, "onSelfReadMarkChangedByServerId: chatServerId=", ", mark=");
        k.append(j2);
        hm9.m("rw9", k.toString(), new Object[0]);
        j47.T(this.Y, (lx3) null, (vx3) null, new qw9(this, j, j2, (Continuation) null), 3);
    }
}
