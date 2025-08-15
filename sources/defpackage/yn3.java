package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;

/* renamed from: yn3  reason: default package */
public final class yn3 implements qn3 {
    public final rta b;
    public final Context c;
    public final je7 d;
    public final je7 e;
    public final je7 f;
    public final je7 g;
    public final je7 h;
    public final je7 i;
    public final je7 j;
    public final q0e k;
    public final w7c l;
    public final je7 m;
    public final je7 n;
    public final AtomicBoolean o = new AtomicBoolean(false);

    public yn3(je7 je7, je7 je72, je7 je73, je7 je74, je7 je75, je7 je76, je7 je77, je7 je78, rta rta, Context context, tm3 tm3) {
        this.b = rta;
        this.c = context;
        this.d = je72;
        this.e = je74;
        this.f = je75;
        this.g = je73;
        this.h = je76;
        this.i = je77;
        this.j = je78;
        q0e a = r0e.a(dn3.d);
        this.k = a;
        this.l = new w7c(a);
        this.m = tu0.r(3, new z30(11, je7));
        je7 r = tu0.r(3, new md1(25, this));
        this.n = r;
        od2.L(new zn5(tm3.a(), new rn3(this, (Continuation) null), 5), (sx3) r.getValue());
        od2.L(new zn5(new cp5(new zn5(od2.E(new qn5(3, new m58(rta.b, 21))), new qta(rta, (Continuation) null)), new br((Object) rta, (Continuation) null, 12)), new sn3(this, (Continuation) null), 5), (sx3) r.getValue());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: tx3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: tx3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: tx3} */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0049, code lost:
        if (r6 == r1) goto L_0x0091;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x007e A[LOOP:0: B:15:0x0078->B:17:0x007e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.io.Serializable c(defpackage.yn3 r5, kotlin.coroutines.Continuation r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof defpackage.un3
            if (r0 == 0) goto L_0x0016
            r0 = r6
            un3 r0 = (defpackage.un3) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x001b
        L_0x0016:
            un3 r0 = new un3
            r0.<init>(r5, r6)
        L_0x001b:
            java.lang.Object r6 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            yn3 r5 = r0.o
            defpackage.od2.a0(r6)
            goto L_0x004c
        L_0x002c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0034:
            defpackage.od2.a0(r6)
            je7 r6 = r5.d
            java.lang.Object r6 = r6.getValue()
            ds3 r6 = (defpackage.ds3) r6
            r0.o = r5
            r0.Z = r3
            el3 r6 = r6.a
            java.util.List r6 = r6.k()
            if (r6 != r1) goto L_0x004c
            goto L_0x0091
        L_0x004c:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            je7 r1 = r5.h
            java.lang.Object r1 = r1.getValue()
            oq3 r1 = (defpackage.oq3) r1
            r1.getClass()
            ca3 r2 = new ca3
            r3 = 2
            r2.<init>(r3, r1)
            java.util.List r6 = defpackage.x53.x0(r6, r2)
            lx3 r0 = r0.b
            kotlinx.coroutines.internal.ContextScope r0 = defpackage.j1e.a(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = defpackage.z53.S(r6, r2)
            r1.<init>(r2)
            java.util.Iterator r6 = r6.iterator()
        L_0x0078:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x0091
            java.lang.Object r2 = r6.next()
            tn3 r3 = new tn3
            r4 = 0
            r3.<init>(r2, r4, r5)
            r2 = 3
            zf4 r2 = defpackage.j47.h(r0, r4, r3, r2)
            r1.add(r2)
            goto L_0x0078
        L_0x0091:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yn3.c(yn3, kotlin.coroutines.Continuation):java.io.Serializable");
    }

    /* JADX WARNING: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01cf A[LOOP:3: B:47:0x01c9->B:49:0x01cf, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x022e  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0252 A[LOOP:7: B:68:0x024c->B:70:0x0252, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x02b8 A[LOOP:9: B:78:0x02b2->B:80:0x02b8, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x02e3 A[LOOP:10: B:82:0x02dd->B:84:0x02e3, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x021f A[EDGE_INSN: B:96:0x021f->B:61:0x021f ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.io.Serializable d(defpackage.yn3 r21, kotlin.coroutines.Continuation r22) {
        /*
            r0 = r21
            r1 = r22
            r21.getClass()
            boolean r2 = r1 instanceof defpackage.wn3
            if (r2 == 0) goto L_0x001a
            r2 = r1
            wn3 r2 = (defpackage.wn3) r2
            int r3 = r2.s0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x001a
            int r3 = r3 - r4
            r2.s0 = r3
            goto L_0x001f
        L_0x001a:
            wn3 r2 = new wn3
            r2.<init>(r0, r1)
        L_0x001f:
            java.lang.Object r1 = r2.Y
            tx3 r3 = defpackage.tx3.a
            int r4 = r2.s0
            r5 = 1
            r6 = 2
            if (r4 == 0) goto L_0x0043
            if (r4 == r5) goto L_0x003d
            if (r4 != r6) goto L_0x0035
            java.util.List r0 = r2.X
            yn3 r3 = r2.o
            defpackage.od2.a0(r1)
            goto L_0x0093
        L_0x0035:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003d:
            yn3 r0 = r2.o
            defpackage.od2.a0(r1)
            goto L_0x006a
        L_0x0043:
            defpackage.od2.a0(r1)
            rta r1 = r0.b
            dua r1 = r1.b
            boolean r1 = r1.j()
            if (r1 != 0) goto L_0x0054
            nz4 r3 = defpackage.nz4.a
            goto L_0x02f6
        L_0x0054:
            je7 r1 = r0.d
            java.lang.Object r1 = r1.getValue()
            ds3 r1 = (defpackage.ds3) r1
            r2.o = r0
            r2.s0 = r5
            el3 r1 = r1.a
            java.util.List r1 = r1.k()
            if (r1 != r3) goto L_0x006a
            goto L_0x02f6
        L_0x006a:
            java.util.List r1 = (java.util.List) r1
            je7 r4 = r0.i
            java.lang.Object r4 = r4.getValue()
            blb r4 = (defpackage.blb) r4
            je7 r5 = r0.j
            java.lang.Object r5 = r5.getValue()
            q33 r5 = (defpackage.q33) r5
            hyc r5 = (defpackage.hyc) r5
            long r7 = r5.t()
            r2.o = r0
            r2.X = r1
            r2.s0 = r6
            java.lang.Object r4 = r4.a(r7, r2)
            if (r4 != r3) goto L_0x0090
            goto L_0x02f6
        L_0x0090:
            r3 = r0
            r0 = r1
            r1 = r4
        L_0x0093:
            oab r1 = (defpackage.oab) r1
            uj3 r1 = r1.d
            je7 r4 = r3.g
            java.lang.Object r4 = r4.getValue()
            xc4 r4 = (defpackage.xc4) r4
            r4.getClass()
            ai9 r5 = new ai9
            r7 = 6
            r5.<init>(r7)
            je7 r4 = r4.a
            java.lang.Object r4 = r4.getValue()
            wlc r4 = (defpackage.wlc) r4
            java.util.ArrayList r4 = r4.e()
            java.util.Iterator r4 = r4.iterator()
        L_0x00b8:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x0156
            java.lang.Object r7 = r4.next()
            wua r7 = (defpackage.wua) r7
            int r8 = r7.o
            java.lang.Object r8 = r5.c(r8)
            pua r8 = (defpackage.pua) r8
            long r9 = r7.Y
            java.lang.String r11 = r7.X
            if (r8 != 0) goto L_0x010a
            pua r8 = new pua
            java.lang.String r14 = r7.a()
            java.util.List r17 = java.util.Collections.singletonList(r11)
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            java.util.List r18 = java.util.Collections.singletonList(r9)
            java.lang.String r15 = r7.s0
            java.lang.String r9 = r7.t0
            int r10 = r7.o
            java.lang.String r11 = r7.u0
            java.lang.String r7 = r7.Z
            r12 = r8
            r13 = r10
            r16 = r9
            r19 = r11
            r20 = r7
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            int r7 = r5.a(r10)
            java.lang.Object[] r9 = r5.c
            r11 = r9[r7]
            int[] r12 = r5.b
            r12[r7] = r10
            r9[r7] = r8
            pua r11 = (defpackage.pua) r11
            goto L_0x00b8
        L_0x010a:
            java.util.ArrayList r7 = new java.util.ArrayList
            java.util.List r12 = r8.e
            r7.<init>(r12)
            java.util.ArrayList r15 = new java.util.ArrayList
            java.util.List r12 = r8.f
            r15.<init>(r12)
            r7.add(r11)
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r15.add(r9)
            java.lang.String r9 = r8.h
            if (r9 == 0) goto L_0x012a
            boolean r10 = defpackage.w9e.C0(r9)
        L_0x012a:
            pua r10 = new pua
            java.lang.String r11 = r8.b
            java.lang.String r14 = r8.g
            int r13 = r8.a
            r16 = 0
            r12 = r10
            r19 = r14
            r14 = r11
            r18 = r15
            r15 = r11
            r17 = r7
            r20 = r9
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            int r7 = r8.a
            int r8 = r5.a(r7)
            java.lang.Object[] r9 = r5.c
            r11 = r9[r8]
            int[] r12 = r5.b
            r12[r8] = r7
            r9[r8] = r10
            pua r11 = (defpackage.pua) r11
            goto L_0x00b8
        L_0x0156:
            int r4 = r5.e
            kl7 r7 = new kl7
            r7.<init>(r4)
            java.lang.Object[] r4 = r5.c
            long[] r5 = r5.a
            int r8 = r5.length
            int r8 = r8 - r6
            r6 = 0
            if (r8 < 0) goto L_0x01a1
            r9 = r6
        L_0x0167:
            r10 = r5[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L_0x019c
            int r12 = r9 - r8
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = r6
        L_0x0181:
            if (r14 >= r12) goto L_0x019a
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.32E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L_0x0196
            int r15 = r9 << 3
            int r15 = r15 + r14
            r15 = r4[r15]
            pua r15 = (defpackage.pua) r15
            r7.add(r15)
        L_0x0196:
            long r10 = r10 >> r13
            int r14 = r14 + 1
            goto L_0x0181
        L_0x019a:
            if (r12 != r13) goto L_0x01a1
        L_0x019c:
            if (r9 == r8) goto L_0x01a1
            int r9 = r9 + 1
            goto L_0x0167
        L_0x01a1:
            kl7 r4 = defpackage.j1e.d(r7)
            je7 r5 = r3.d
            java.lang.Object r5 = r5.getValue()
            ds3 r5 = (defpackage.ds3) r5
            r5.getClass()
            java.util.EnumSet r7 = defpackage.el3.r
            java.util.Set r8 = defpackage.el3.v
            el3 r5 = r5.a
            java.util.List r5 = r5.j(r7, r8)
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 10
            int r9 = defpackage.z53.S(r5, r8)
            r7.<init>(r9)
            java.util.Iterator r5 = r5.iterator()
        L_0x01c9:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L_0x01e2
            java.lang.Object r9 = r5.next()
            uj3 r9 = (defpackage.uj3) r9
            long r9 = r9.o()
            java.lang.Long r11 = new java.lang.Long
            r11.<init>(r9)
            r7.add(r11)
            goto L_0x01c9
        L_0x01e2:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ListIterator r4 = r4.listIterator(r6)
        L_0x01eb:
            r6 = r4
            il7 r6 = (defpackage.il7) r6
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L_0x021f
            java.lang.Object r6 = r6.next()
            r9 = r6
            pua r9 = (defpackage.pua) r9
            java.util.List r9 = r9.f
            boolean r10 = r9.isEmpty()
            if (r10 == 0) goto L_0x0204
            goto L_0x021b
        L_0x0204:
            java.util.Iterator r9 = r9.iterator()
        L_0x0208:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x021b
            java.lang.Object r10 = r9.next()
            java.lang.Long r10 = (java.lang.Long) r10
            boolean r10 = r7.contains(r10)
            if (r10 == 0) goto L_0x0208
            goto L_0x01eb
        L_0x021b:
            r5.add(r6)
            goto L_0x01eb
        L_0x021f:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0228:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x0243
            java.lang.Object r6 = r0.next()
            r7 = r6
            uj3 r7 = (defpackage.uj3) r7
            long r9 = r7.o()
            r11 = 0
            int r7 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r7 == 0) goto L_0x0228
            r4.add(r6)
            goto L_0x0228
        L_0x0243:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x024c:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0264
            java.lang.Object r6 = r4.next()
            uj3 r6 = (defpackage.uj3) r6
            long r6 = r6.o()
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r0.add(r6)
            goto L_0x024c
        L_0x0264:
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
            java.util.Iterator r6 = r5.iterator()
        L_0x026d:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0286
            java.lang.Object r7 = r6.next()
            r9 = r7
            pua r9 = (defpackage.pua) r9
            java.util.List r9 = r9.f
            boolean r9 = r0.containsAll(r9)
            if (r9 == 0) goto L_0x026d
            r4.add(r7)
            goto L_0x026d
        L_0x0286:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            at r6 = new at
            r7 = 2
            r6.<init>(r7, r5)
            ga r5 = new ga
            r7 = 9
            r5.<init>(r4, r7, r1)
            qk5 r1 = defpackage.l6d.Z(r6, r5)
            fs4 r4 = new fs4
            r5 = 18
            r4.<init>(r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            defpackage.l6d.h0(r1, r5)
            defpackage.c63.U(r5, r4)
            java.util.Iterator r1 = r5.iterator()
        L_0x02b2:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x02c2
            java.lang.Object r4 = r1.next()
            pua r4 = (defpackage.pua) r4
            r0.add(r4)
            goto L_0x02b2
        L_0x02c2:
            android.content.Context r1 = r3.c
            int r3 = defpackage.yoc.s0
            java.lang.String r1 = r1.getString(r3)
            lx3 r2 = r2.b
            kotlinx.coroutines.internal.ContextScope r2 = defpackage.j1e.a(r2)
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = defpackage.z53.S(r0, r8)
            r3.<init>(r4)
            java.util.Iterator r0 = r0.iterator()
        L_0x02dd:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x02f6
            java.lang.Object r4 = r0.next()
            vn3 r5 = new vn3
            r6 = 0
            r5.<init>(r4, r6, r1)
            r4 = 3
            zf4 r4 = defpackage.j47.h(r2, r6, r5, r4)
            r3.add(r4)
            goto L_0x02dd
        L_0x02f6:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yn3.d(yn3, kotlin.coroutines.Continuation):java.io.Serializable");
    }

    public final j0e a() {
        return this.l;
    }

    public final void b() {
        if (this.o.compareAndSet(false, true)) {
            j47.T((sx3) this.n.getValue(), (lx3) null, (vx3) null, new xn3(this, (Continuation) null), 3);
        }
    }
}
