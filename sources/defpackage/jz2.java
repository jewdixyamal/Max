package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: jz2  reason: default package */
public final class jz2 implements iy2, yu2, o82, qu7 {
    public static final /* synthetic */ int Y = 0;
    public final je7 X;
    public final kke a;
    public final ty2 b;
    public final je7 c;
    public final je7 o;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, ty2] */
    public jz2(je7 je7, je7 je72, je7 je73, je7 je74, kke kke) {
        this.a = kke;
        ? obj = new Object();
        obj.a = ty2.class.getName();
        obj.b = je7;
        obj.c = je73;
        obj.o = je74;
        obj.X = new khe(new ly2(kke, 0));
        obj.Y = new ConcurrentHashMap();
        obj.Z = new ConcurrentHashMap();
        this.b = obj;
        this.c = je74;
        this.o = je72;
        this.X = je73;
        j47.T(j1e.a(((w9a) kke).b()), (lx3) null, (vx3) null, new yy2(je73, this, (Continuation) null), 3);
    }

    public static c6d i(at atVar, tu2 tu2) {
        if (tu2 instanceof ru2) {
            return l6d.a0(atVar, new we1(29));
        }
        if (tu2 instanceof su2) {
            return atVar;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void a() {
        ty2 ty2 = this.b;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) ty2.Y;
        for (ti9 value : concurrentHashMap.values()) {
            value.setValue((Object) null);
        }
        ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) ty2.Z;
        for (ti9 value2 : concurrentHashMap2.values()) {
            value2.setValue((Object) null);
        }
        concurrentHashMap.clear();
        concurrentHashMap2.clear();
    }

    public final void b(List list) {
        this.b.b(list);
    }

    public final void c(List list) {
        this.b.c(list);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(long r8, java.util.List r10, kotlin.coroutines.Continuation r11, boolean r12) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof defpackage.zy2
            if (r0 == 0) goto L_0x0013
            r0 = r11
            zy2 r0 = (defpackage.zy2) r0
            int r1 = r0.u0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.u0 = r1
            goto L_0x0018
        L_0x0013:
            zy2 r0 = new zy2
            r0.<init>(r7, r11)
        L_0x0018:
            java.lang.Object r11 = r0.s0
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.u0
            r3 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            boolean r12 = r0.Z
            long r8 = r0.Y
            java.util.List r10 = r0.X
            jz2 r7 = r0.o
            defpackage.od2.a0(r11)
        L_0x002e:
            r1 = r8
            r5 = r10
            r6 = r12
            goto L_0x004e
        L_0x0032:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003a:
            defpackage.od2.a0(r11)
            r0.o = r7
            r0.X = r10
            r0.Y = r8
            r0.Z = r12
            r0.u0 = r3
            java.lang.Object r11 = r7.d(r8, r0)
            if (r11 != r1) goto L_0x002e
            return r1
        L_0x004e:
            e52 r11 = (defpackage.e52) r11
            p82 r7 = r7.l()
            k92 r8 = r11.b
            long r3 = r8.a
            r7.getClass()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "addChatUsers, chatId = "
            r8.<init>(r9)
            r8.append(r1)
            java.lang.String r9 = ", ids = "
            r8.append(r9)
            r8.append(r5)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "p82"
            defpackage.hm9.m(r9, r8, new java.lang.Object[0])
            r7.d(r1, r5)
            rm4 r7 = r7.p
            java.lang.Object r7 = r7.get()
            pk r7 = (defpackage.pk) r7
            r0 = r7
            k4a r0 = (defpackage.k4a) r0
            r0.d(r1, r3, r5, r6)
            e5f r7 = defpackage.e5f.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jz2.e(long, java.util.List, kotlin.coroutines.Continuation, boolean):java.lang.Object");
    }

    public final e52 f(long j, m56 m56) {
        return l().h(j, false, new wp(1, m56));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Comparable g(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.az2
            if (r0 == 0) goto L_0x0013
            r0 = r6
            az2 r0 = (defpackage.az2) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x0018
        L_0x0013:
            az2 r0 = new az2
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            defpackage.od2.a0(r6)
            goto L_0x005e
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x002f:
            defpackage.od2.a0(r6)
            p82 r6 = r5.l()
            r6.getClass()
            b82 r2 = new b82
            r4 = 2
            r2.<init>(r6, r4)
            r4 = 0
            java.lang.Object r6 = r6.e0(r4, r2)
            e52 r6 = (defpackage.e52) r6
            if (r6 != 0) goto L_0x0060
            kke r6 = r5.a
            w9a r6 = (defpackage.w9a) r6
            nx3 r6 = r6.b()
            bz2 r2 = new bz2
            r2.<init>(r5, r4)
            r0.Y = r3
            java.lang.Object r6 = defpackage.j47.t0(r6, r2, r0)
            if (r6 != r1) goto L_0x005e
            return r1
        L_0x005e:
            e52 r6 = (defpackage.e52) r6
        L_0x0060:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jz2.g(kotlin.coroutines.Continuation):java.lang.Comparable");
    }

    public final c6d h(c6d c6d, tu2 tu2) {
        if (tu2 instanceof ru2) {
            return c6d;
        }
        if (tu2 instanceof su2) {
            su2 su2 = (su2) tu2;
            return l6d.Z(c6d, new vy2(this, su2.a, su2.b, su2.e, su2.c, su2.d));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Comparable j(long r5, kotlin.coroutines.Continuation r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.cz2
            if (r0 == 0) goto L_0x0013
            r0 = r7
            cz2 r0 = (defpackage.cz2) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.s0 = r1
            goto L_0x0018
        L_0x0013:
            cz2 r0 = new cz2
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            long r5 = r0.X
            jz2 r4 = r0.o
            defpackage.od2.a0(r7)     // Catch:{ all -> 0x002b }
            goto L_0x004d
        L_0x002b:
            r7 = move-exception
            goto L_0x0050
        L_0x002d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0035:
            defpackage.od2.a0(r7)
            p82 r7 = r4.l()     // Catch:{ all -> 0x002b }
            iqd r7 = r7.y(r5)     // Catch:{ all -> 0x002b }
            r0.o = r4     // Catch:{ all -> 0x002b }
            r0.X = r5     // Catch:{ all -> 0x002b }
            r0.s0 = r3     // Catch:{ all -> 0x002b }
            java.lang.Object r7 = defpackage.s36.f(r7, r0)     // Catch:{ all -> 0x002b }
            if (r7 != r1) goto L_0x004d
            return r1
        L_0x004d:
            e52 r7 = (defpackage.e52) r7     // Catch:{ all -> 0x002b }
            goto L_0x006a
        L_0x0050:
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "failed to fetch chat for #"
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            defpackage.hm9.p(r4, r5, r7)
            r7 = 0
        L_0x006a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jz2.j(long, kotlin.coroutines.Continuation):java.lang.Comparable");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0063 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0064 A[PHI: r8 
      PHI: (r8v2 java.lang.Object) = (r8v4 java.lang.Object), (r8v1 java.lang.Object) binds: [B:18:0x0061, B:10:0x0026] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object k(long r6, kotlin.coroutines.Continuation r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.dz2
            if (r0 == 0) goto L_0x0013
            r0 = r8
            dz2 r0 = (defpackage.dz2) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.s0 = r1
            goto L_0x0018
        L_0x0013:
            dz2 r0 = new dz2
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            defpackage.od2.a0(r8)
            goto L_0x0064
        L_0x002a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0032:
            long r6 = r0.X
            jz2 r5 = r0.o
            defpackage.od2.a0(r8)
            goto L_0x0052
        L_0x003a:
            defpackage.od2.a0(r8)
            p82 r8 = r5.l()
            pa3 r8 = r8.f()
            r0.o = r5
            r0.X = r6
            r0.s0 = r4
            java.lang.Object r8 = defpackage.s36.e(r8, r0)
            if (r8 != r1) goto L_0x0052
            return r1
        L_0x0052:
            wy2 r8 = new wy2
            r2 = 1
            r8.<init>(r5, r6, r2)
            r5 = 0
            r0.o = r5
            r0.s0 = r3
            java.lang.Object r8 = defpackage.ema.C(r8, r0)
            if (r8 != r1) goto L_0x0064
            return r1
        L_0x0064:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jz2.k(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final p82 l() {
        return (p82) this.X.getValue();
    }

    public final w7c m(long j) {
        ty2 ty2 = this.b;
        return new w7c((ti9) ((ConcurrentHashMap) ty2.Y).computeIfAbsent(Long.valueOf(j), new di(5, new my2(ty2, j, 0))));
    }

    public final w7c n(long j) {
        ty2 ty2 = this.b;
        return new w7c((ti9) ((ConcurrentHashMap) ty2.Z).computeIfAbsent(Long.valueOf(j), new di(6, new my2(ty2, j, 1))));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(defpackage.gi9 r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.fz2
            if (r0 == 0) goto L_0x0013
            r0 = r6
            fz2 r0 = (defpackage.fz2) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x0018
        L_0x0013:
            fz2 r0 = new fz2
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            defpackage.od2.a0(r6)
            goto L_0x0042
        L_0x0027:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x002f:
            defpackage.od2.a0(r6)
            x2 r6 = new x2
            r2 = 28
            r6.<init>((java.lang.Object) r4, (int) r2, (java.lang.Object) r5)
            r0.Y = r3
            java.lang.Object r6 = defpackage.ema.C(r6, r0)
            if (r6 != r1) goto L_0x0042
            return r1
        L_0x0042:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jz2.o(gi9, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object p(java.util.Set r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.ez2
            if (r0 == 0) goto L_0x0013
            r0 = r6
            ez2 r0 = (defpackage.ez2) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x0018
        L_0x0013:
            ez2 r0 = new ez2
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            defpackage.od2.a0(r6)
            goto L_0x0042
        L_0x0027:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x002f:
            defpackage.od2.a0(r6)
            x2 r6 = new x2
            r2 = 27
            r6.<init>((java.lang.Object) r4, (int) r2, (java.lang.Object) r5)
            r0.Y = r3
            java.lang.Object r6 = defpackage.ema.C(r6, r0)
            if (r6 != r1) goto L_0x0042
            return r1
        L_0x0042:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jz2.p(java.util.Set, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final e52 q(long j) {
        return l().F(j);
    }

    public final Object r(tu2 tu2) {
        if (tu2 instanceof ru2) {
            List E = l().E(p82.J);
            ArrayList arrayList = new ArrayList();
            for (Object next : E) {
                if (((e52) next).N()) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        } else if (tu2 instanceof su2) {
            return nz4.a;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final List s(tu2 tu2, long j, Long l, int i) {
        c6d h = h(i(new at(2, l().E(tu2.a())), tu2), tu2);
        Iterator it = h.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            Object next = it.next();
            if (i2 >= 0) {
                e52 e52 = (e52) next;
                if (j >= e52.o()) {
                    if (l == null) {
                        break;
                    }
                    if (e52.a != l.longValue()) {
                        break;
                    }
                }
                i2++;
            } else {
                y53.R();
                throw null;
            }
        }
        if (i2 == -1) {
            return nz4.a;
        }
        int i3 = Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            i3 = i + i2 + 1;
        }
        return l6d.i0(h).subList(i2, Math.min(i3, l6d.X(h)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object t(long r5, java.util.Set r7, kotlin.coroutines.Continuation r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.gz2
            if (r0 == 0) goto L_0x0013
            r0 = r8
            gz2 r0 = (defpackage.gz2) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.s0 = r1
            goto L_0x0018
        L_0x0013:
            gz2 r0 = new gz2
            r0.<init>(r4, r8)
        L_0x0018:
            java.lang.Object r8 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.util.Set r7 = r0.X
            jz2 r4 = r0.o
            defpackage.od2.a0(r8)
            goto L_0x0043
        L_0x002b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0033:
            defpackage.od2.a0(r8)
            r0.o = r4
            r0.X = r7
            r0.s0 = r3
            java.lang.Object r8 = r4.d(r5, r0)
            if (r8 != r1) goto L_0x0043
            return r1
        L_0x0043:
            e52 r8 = (defpackage.e52) r8
            p82 r4 = r4.l()
            k92 r5 = r8.b
            r4.getClass()
            x82 r4 = defpackage.p82.I(r5, r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jz2.t(long, java.util.Set, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object u(long r6, kotlin.coroutines.Continuation r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.hz2
            if (r0 == 0) goto L_0x0013
            r0 = r8
            hz2 r0 = (defpackage.hz2) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x0018
        L_0x0013:
            hz2 r0 = new hz2
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            defpackage.od2.a0(r8)
            goto L_0x004f
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x002f:
            defpackage.od2.a0(r8)
            kke r8 = r5.a
            w9a r8 = (defpackage.w9a) r8
            nx3 r8 = r8.b()
            wy2 r2 = new wy2
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.Y = r3
            h47 r5 = new h47
            r6 = 0
            r5.<init>(r2, r6)
            java.lang.Object r8 = defpackage.j47.t0(r8, r5, r0)
            if (r8 != r1) goto L_0x004f
            return r1
        L_0x004f:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jz2.u(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object v(long r5, java.util.Set r7, int r8, kotlin.coroutines.Continuation r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof defpackage.iz2
            if (r0 == 0) goto L_0x0013
            r0 = r9
            iz2 r0 = (defpackage.iz2) r0
            int r1 = r0.u0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.u0 = r1
            goto L_0x0018
        L_0x0013:
            iz2 r0 = new iz2
            r0.<init>(r4, r9)
        L_0x0018:
            java.lang.Object r9 = r0.s0
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.u0
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            int r8 = r0.Z
            long r5 = r0.Y
            java.util.Set r7 = r0.X
            jz2 r4 = r0.o
            defpackage.od2.a0(r9)
            goto L_0x004b
        L_0x002f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0037:
            defpackage.od2.a0(r9)
            r0.o = r4
            r0.X = r7
            r0.Y = r5
            r0.Z = r8
            r0.u0 = r3
            java.lang.Object r9 = r4.t(r5, r7, r0)
            if (r9 != r1) goto L_0x004b
            return r1
        L_0x004b:
            x82 r9 = (defpackage.x82) r9
            p82 r0 = r4.l()
            ui0 r1 = new ui0
            r1.<init>((defpackage.x82) r9, (int) r8, (defpackage.jz2) r4, (java.util.Set) r7)
            r4 = 0
            r0.h(r5, r4, r1)
            e5f r4 = defpackage.e5f.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jz2.v(long, java.util.Set, int, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
