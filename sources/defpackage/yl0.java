package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: yl0  reason: default package */
public final class yl0 implements lp8 {
    public final long a;
    public final ek2 b;
    public final kke c;
    public final je7 d;
    public final je7 e;
    public final je7 f;
    public final ContextScope g;
    public final q0e h;
    public final w7c i;
    public final q0e j;
    public final w7c k;
    public final AtomicLong l = new AtomicLong(0);
    public final AtomicBoolean m = new AtomicBoolean(false);

    public yl0(long j2, ek2 ek2, kke kke, je7 je7, je7 je72, je7 je73, je7 je74) {
        kke kke2 = kke;
        je7 je75 = je7;
        this.a = j2;
        this.b = ek2;
        this.c = kke2;
        this.d = je73;
        this.e = je72;
        this.f = je75;
        w9a w9a = (w9a) kke2;
        ContextScope a2 = j1e.a(w9a.b());
        this.g = a2;
        q0e a3 = r0e.a(nz4.a);
        this.h = a3;
        this.i = new w7c(a3);
        q0e a4 = r0e.a((Object) null);
        this.j = a4;
        q0e a5 = r0e.a((Object) null);
        this.k = new w7c(a5);
        j47.T(a2, (lx3) null, (vx3) null, new sl0(je75, this, je74, (Continuation) null), 3);
        od2.L(od2.F(new zn5(new ac(od2.x(od2.u(a4, 200)), 4, this), new vw(2, a5, ti9.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 1), 5), w9a.b()), a2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a4 A[LOOP:0: B:24:0x009e->B:26:0x00a4, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.io.Serializable f(defpackage.yl0 r15, java.lang.String r16, long r17, kotlin.coroutines.Continuation r19) {
        /*
            r0 = r15
            r1 = r19
            r15.getClass()
            boolean r2 = r1 instanceof defpackage.vl0
            if (r2 == 0) goto L_0x0019
            r2 = r1
            vl0 r2 = (defpackage.vl0) r2
            int r3 = r2.Z
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0019
            int r3 = r3 - r4
            r2.Z = r3
            goto L_0x001e
        L_0x0019:
            vl0 r2 = new vl0
            r2.<init>(r15, r1)
        L_0x001e:
            java.lang.Object r1 = r2.X
            tx3 r11 = defpackage.tx3.a
            int r3 = r2.Z
            r12 = 2
            r4 = 1
            r13 = 0
            if (r3 == 0) goto L_0x0046
            if (r3 == r4) goto L_0x003e
            if (r3 != r12) goto L_0x0036
            java.lang.Object r0 = r2.o
            fk2 r0 = (defpackage.fk2) r0
            defpackage.od2.a0(r1)
            goto L_0x00c5
        L_0x0036:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003e:
            java.lang.Object r0 = r2.o
            yl0 r0 = (defpackage.yl0) r0
            defpackage.od2.a0(r1)
            goto L_0x0085
        L_0x0046:
            defpackage.od2.a0(r1)
            je7 r1 = r0.f
            java.lang.Object r1 = r1.getValue()
            iy2 r1 = (defpackage.iy2) r1
            long r5 = r0.a
            jz2 r1 = (defpackage.jz2) r1
            w7c r1 = r1.m(r5)
            j0e r1 = r1.a
            java.lang.Object r1 = r1.getValue()
            e52 r1 = (defpackage.e52) r1
            if (r1 == 0) goto L_0x0089
            k92 r1 = r1.b
            long r5 = r1.a
            je7 r1 = r0.d
            java.lang.Object r1 = r1.getValue()
            r3 = r1
            mc6 r3 = (defpackage.mc6) r3
            r2.o = r0
            r2.Z = r4
            ek2 r1 = r0.b
            r4 = r5
            r6 = r1
            r7 = r17
            r9 = r16
            r10 = r2
            java.lang.Object r1 = r3.a(r4, r6, r7, r9, r10)
            if (r1 != r11) goto L_0x0085
            goto L_0x00f3
        L_0x0085:
            fk2 r1 = (defpackage.fk2) r1
            if (r1 != 0) goto L_0x008b
        L_0x0089:
            r11 = r13
            goto L_0x00f3
        L_0x008b:
            java.util.ArrayList r3 = r1.c
            if (r3 == 0) goto L_0x0089
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = defpackage.z53.S(r3, r5)
            r4.<init>(r5)
            java.util.Iterator r3 = r3.iterator()
        L_0x009e:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x00b7
            java.lang.Object r5 = r3.next()
            dk2 r5 = (defpackage.dk2) r5
            wm3 r5 = r5.a
            long r5 = r5.a
            java.lang.Long r7 = new java.lang.Long
            r7.<init>(r5)
            r4.add(r7)
            goto L_0x009e
        L_0x00b7:
            r2.o = r1
            r2.Z = r12
            java.lang.Object r0 = r0.g(r4, r2)
            if (r0 != r11) goto L_0x00c2
            goto L_0x00f3
        L_0x00c2:
            r14 = r1
            r1 = r0
            r0 = r14
        L_0x00c5:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x00d0:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x00e7
            java.lang.Object r3 = r1.next()
            r4 = r3
            uj3 r4 = (defpackage.uj3) r4
            boolean r4 = r4.w()
            if (r4 != 0) goto L_0x00d0
            r2.add(r3)
            goto L_0x00d0
        L_0x00e7:
            long r0 = r0.o
            java.lang.Long r3 = new java.lang.Long
            r3.<init>(r0)
            kpa r11 = new kpa
            r11.<init>(r3, r2)
        L_0x00f3:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yl0.f(yl0, java.lang.String, long, kotlin.coroutines.Continuation):java.io.Serializable");
    }

    public final void a(String str) {
        this.j.setValue(str);
    }

    public final mn5 b() {
        return this.k;
    }

    public final boolean c() {
        return this.l.get() != -1 || !this.m.get();
    }

    public final w7c d() {
        return this.i;
    }

    public final void e() {
        if (this.m.compareAndSet(false, true)) {
            j47.T(this.g, (lx3) null, (vx3) null, new wl0(this, (Continuation) null), 3).invokeOnCompletion(new l(15, this));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object g(java.util.ArrayList r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.ul0
            if (r0 == 0) goto L_0x0013
            r0 = r9
            ul0 r0 = (defpackage.ul0) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x0018
        L_0x0013:
            ul0 r0 = new ul0
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            defpackage.od2.a0(r9)
            goto L_0x0073
        L_0x0027:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x002f:
            defpackage.od2.a0(r9)
            kke r9 = r7.c
            w9a r9 = (defpackage.w9a) r9
            nx3 r9 = r9.a()
            if (r9 != 0) goto L_0x003e
            lx3 r9 = r0.b
        L_0x003e:
            kotlinx.coroutines.internal.ContextScope r9 = defpackage.j1e.a(r9)
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 10
            int r4 = defpackage.z53.S(r8, r4)
            r2.<init>(r4)
            java.util.Iterator r8 = r8.iterator()
        L_0x0051:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L_0x006a
            java.lang.Object r4 = r8.next()
            tl0 r5 = new tl0
            r6 = 0
            r5.<init>(r4, r6, r7)
            r4 = 3
            zf4 r4 = defpackage.j47.h(r9, r6, r5, r4)
            r2.add(r4)
            goto L_0x0051
        L_0x006a:
            r0.Y = r3
            java.lang.Object r9 = defpackage.pag.c(r2, r0)
            if (r9 != r1) goto L_0x0073
            return r1
        L_0x0073:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.List r7 = defpackage.x53.e0(r9)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yl0.g(java.util.ArrayList, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
