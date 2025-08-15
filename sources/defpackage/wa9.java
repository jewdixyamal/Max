package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;
import ru.ok.tamtam.logout.a;

/* renamed from: wa9  reason: default package */
public final class wa9 implements qu2 {
    public final eca a;
    public final int b = 10;
    public final je7 c;
    public final nx3 d;
    public final nx3 e;
    public final ContextScope f;
    public final khe g;
    public vxd h;

    public wa9(eca eca, kke kke, a aVar, je7 je7, je7 je72) {
        this.a = eca;
        this.c = je7;
        w9a w9a = (w9a) kke;
        nx3 limitedParallelism = w9a.b().limitedParallelism(1, "mini-chats-io");
        this.d = limitedParallelism;
        this.e = w9a.a().limitedParallelism(1, "mini-chats-computation");
        ContextScope a2 = j1e.a(limitedParallelism);
        this.f = a2;
        this.g = new khe(new yf3(this, 20, je72));
        String name = wa9.class.getName();
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            us7 us7 = us7.X;
            ir6.d(us7, name, "instance created " + this, (Throwable) null);
        }
        j47.T(a2, (lx3) null, (vx3) null, new oa9(aVar, this, (Continuation) null), 3);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:9|26|(1:28)(1:29)|30|31|34|(1:36)(1:37)|38|(1:40)|41) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0093, code lost:
        if (r8 == r3) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b1, code lost:
        if (r8 == r3) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00f0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00f1, code lost:
        defpackage.hm9.p(r7.getClass().getName(), "fail to decode protospans", r0);
        r0 = null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(defpackage.wa9 r39, java.util.List r40, kotlin.coroutines.Continuation r41) {
        /*
            r0 = r41
            r39.getClass()
            boolean r1 = r0 instanceof defpackage.va9
            if (r1 == 0) goto L_0x001a
            r1 = r0
            va9 r1 = (defpackage.va9) r1
            int r2 = r1.v0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x001a
            int r2 = r2 - r3
            r1.v0 = r2
            r2 = r39
            goto L_0x0021
        L_0x001a:
            va9 r1 = new va9
            r2 = r39
            r1.<init>(r2, r0)
        L_0x0021:
            java.lang.Object r0 = r1.t0
            tx3 r3 = defpackage.tx3.a
            int r4 = r1.v0
            r5 = 1
            if (r4 == 0) goto L_0x004a
            if (r4 != r5) goto L_0x0042
            nl2 r2 = r1.s0
            java.util.Iterator r4 = r1.Z
            java.util.Collection r6 = r1.Y
            java.util.List r7 = r1.X
            wa9 r8 = r1.o
            defpackage.od2.a0(r0)
            r38 = r4
            r4 = r2
            r2 = r8
            r8 = r6
            r6 = r38
            goto L_0x00bc
        L_0x0042:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x004a:
            defpackage.od2.a0(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r40.iterator()
            r6 = r0
            r0 = r40
        L_0x0059:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x016d
            java.lang.Object r7 = r4.next()
            nl2 r7 = (defpackage.nl2) r7
            khe r8 = r2.g
            java.lang.Object r8 = r8.getValue()
            zc0 r8 = (defpackage.zc0) r8
            r1.o = r2
            r1.X = r0
            r1.Y = r6
            r1.Z = r4
            r1.s0 = r7
            r1.v0 = r5
            r8.getClass()
            long r9 = r7.a
            java.lang.Long r11 = new java.lang.Long
            r11.<init>(r9)
            i56 r9 = r8.b
            java.lang.Object r10 = r9.get(r11)
            kpa r10 = (defpackage.kpa) r10
            e5f r11 = defpackage.e5f.a
            if (r10 != 0) goto L_0x0097
            java.lang.Object r8 = r8.a(r7, r1)
            if (r8 != r3) goto L_0x00b4
        L_0x0095:
            r11 = r8
            goto L_0x00b4
        L_0x0097:
            java.lang.Object r10 = r10.a
            android.net.Uri r10 = (android.net.Uri) r10
            android.net.Uri r12 = r7.b
            boolean r10 = defpackage.tpa.f(r10, r12)
            if (r10 != 0) goto L_0x00b4
            java.lang.Long r10 = new java.lang.Long
            long r12 = r7.a
            r10.<init>(r12)
            r9.remove(r10)
            java.lang.Object r8 = r8.a(r7, r1)
            if (r8 != r3) goto L_0x00b4
            goto L_0x0095
        L_0x00b4:
            if (r11 != r3) goto L_0x00b8
            goto L_0x0170
        L_0x00b8:
            r8 = r6
            r6 = r4
            r4 = r7
            r7 = r0
        L_0x00bc:
            khe r0 = r2.g
            java.lang.Object r0 = r0.getValue()
            zc0 r0 = (defpackage.zc0) r0
            r0.getClass()
            long r9 = r4.a
            java.lang.CharSequence r11 = r4.X
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            i56 r0 = r0.b
            java.lang.Object r0 = r0.get(r9)
            kpa r0 = (defpackage.kpa) r0
            r9 = 0
            if (r0 == 0) goto L_0x00e1
            java.lang.Object r0 = r0.b
            byte[] r0 = (byte[]) r0
            r35 = r0
            goto L_0x00e3
        L_0x00e1:
            r35 = r9
        L_0x00e3:
            je7 r0 = r2.c     // Catch:{ all -> 0x00f0 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x00f0 }
            nob r0 = (defpackage.nob) r0     // Catch:{ all -> 0x00f0 }
            java.util.ArrayList r0 = r0.b(r11)     // Catch:{ all -> 0x00f0 }
            goto L_0x00ff
        L_0x00f0:
            r0 = move-exception
            java.lang.Class r10 = r7.getClass()
            java.lang.String r10 = r10.getName()
            java.lang.String r12 = "fail to decode protospans"
            defpackage.hm9.p(r10, r12, r0)
            r0 = r9
        L_0x00ff:
            java.lang.String r17 = r11.toString()
            if (r0 == 0) goto L_0x0111
            r10 = 0
            q07[] r10 = new defpackage.q07[r10]
            java.lang.Object[] r0 = r0.toArray(r10)
            q07[] r0 = (defpackage.q07[]) r0
            r18 = r0
            goto L_0x0113
        L_0x0111:
            r18 = r9
        L_0x0113:
            ml2 r0 = r4.w0
            int r23 = r0.ordinal()
            android.net.Uri r0 = r4.b
            if (r0 == 0) goto L_0x0121
            java.lang.String r9 = r0.toString()
        L_0x0121:
            r34 = r9
            ma9 r0 = new ma9
            r12 = r0
            java.lang.CharSequence r9 = r4.X
            r36 = r9
            boolean r9 = r4.u0
            r37 = r9
            long r13 = r4.a
            java.lang.CharSequence r15 = r4.c
            java.lang.CharSequence r9 = r4.o
            r16 = r9
            java.lang.CharSequence r9 = r4.Y
            r19 = r9
            java.lang.String r9 = r4.s0
            r20 = r9
            long r9 = r4.v0
            r21 = r9
            int r9 = r4.x0
            r24 = r9
            boolean r9 = r4.y0
            r25 = r9
            boolean r9 = r4.z0
            r26 = r9
            boolean r9 = r4.A0
            r27 = r9
            long r9 = r4.B0
            r28 = r9
            java.lang.Long r9 = r4.C0
            r30 = r9
            long r9 = r4.D0
            r31 = r9
            java.lang.CharSequence r4 = r4.E0
            r33 = r4
            r12.<init>(r13, r15, r16, r17, r18, r19, r20, r21, r23, r24, r25, r26, r27, r28, r30, r31, r33, r34, r35, r36, r37)
            r8.add(r0)
            r4 = r6
            r0 = r7
            r6 = r8
            goto L_0x0059
        L_0x016d:
            r3 = r6
            java.util.List r3 = (java.util.List) r3
        L_0x0170:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wa9.a(wa9, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
