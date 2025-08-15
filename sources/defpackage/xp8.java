package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: xp8  reason: default package */
public final class xp8 implements mp8, kq8 {
    public final ds3 a;
    public final iy2 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;
    public final ContextScope f;
    public final AtomicBoolean g = new AtomicBoolean(false);
    public final q0e h;
    public final q0e i;
    public final q0e j;
    public final w7c k;
    public final kld l;

    public xp8(ds3 ds3, iy2 iy2, eo8 eo8, kke kke, je7 je7, je7 je72, khe khe) {
        this.a = ds3;
        this.b = iy2;
        this.c = je7;
        this.d = je72;
        this.e = khe;
        ContextScope a2 = j1e.a(((w9a) kke).b());
        this.f = a2;
        nz4 nz4 = nz4.a;
        this.h = r0e.a(nz4);
        this.i = r0e.a(nz4);
        q0e a3 = r0e.a(nz4);
        this.j = a3;
        this.k = new w7c(a3);
        this.l = lld.b(0, 0, 0, 7);
        od2.L(new zn5(eo8.c, new op8(this, (Continuation) null), 5), a2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(defpackage.xp8 r5, kotlin.coroutines.Continuation r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof defpackage.tp8
            if (r0 == 0) goto L_0x0016
            r0 = r6
            tp8 r0 = (defpackage.tp8) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.s0 = r1
            goto L_0x001b
        L_0x0016:
            tp8 r0 = new tp8
            r0.<init>(r5, r6)
        L_0x001b:
            java.lang.Object r6 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 == r4) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r5 = r0.X
            xp8 r1 = r0.o
            defpackage.od2.a0(r6)
            goto L_0x0066
        L_0x0031:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0039:
            xp8 r5 = r0.o
            defpackage.od2.a0(r6)
            goto L_0x0051
        L_0x003f:
            defpackage.od2.a0(r6)
            r0.o = r5
            r0.s0 = r4
            ds3 r6 = r5.a
            el3 r6 = r6.a
            java.util.List r6 = r6.k()
            if (r6 != r1) goto L_0x0051
            goto L_0x0092
        L_0x0051:
            r2 = r6
            java.util.List r2 = (java.util.List) r2
            q0e r4 = r5.h
            r0.o = r5
            r0.X = r6
            r0.s0 = r3
            r4.setValue(r2)
            e5f r2 = defpackage.e5f.a
            if (r2 != r1) goto L_0x0064
            goto L_0x0092
        L_0x0064:
            r1 = r5
            r5 = r6
        L_0x0066:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            at r6 = new at
            r2 = 2
            r6.<init>(r2, r5)
            g27 r5 = new g27
            r2 = 14
            r5.<init>(r2)
            qk5 r5 = defpackage.l6d.a0(r6, r5)
            je7 r6 = r1.e
            java.lang.Object r6 = r6.getValue()
            tya r6 = (defpackage.tya) r6
            lx3 r0 = r0.b
            kotlinx.coroutines.internal.ContextScope r1 = defpackage.j1e.a(r0)
            mb r2 = new mb
            r3 = 1
            r2.<init>(r1, r0, r6, r3)
            r1f r1 = new r1f
            r1.<init>(r5, r2)
        L_0x0092:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xp8.a(xp8, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008e A[LOOP:0: B:20:0x0088->B:22:0x008e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.io.Serializable b(defpackage.xp8 r5, kotlin.coroutines.Continuation r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof defpackage.vp8
            if (r0 == 0) goto L_0x0016
            r0 = r6
            vp8 r0 = (defpackage.vp8) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.s0 = r1
            goto L_0x001b
        L_0x0016:
            vp8 r0 = new vp8
            r0.<init>(r5, r6)
        L_0x001b:
            java.lang.Object r6 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 == r4) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r5 = r0.X
            xp8 r1 = r0.o
            defpackage.od2.a0(r6)
            goto L_0x0071
        L_0x0031:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0039:
            xp8 r5 = r0.o
            defpackage.od2.a0(r6)
            goto L_0x005c
        L_0x003f:
            defpackage.od2.a0(r6)
            r0.o = r5
            r0.s0 = r4
            iy2 r6 = r5.b
            jz2 r6 = (defpackage.jz2) r6
            p82 r6 = r6.l()
            un0 r2 = new un0
            r4 = 22
            r2.<init>(r4)
            java.util.ArrayList r6 = r6.x(r2)
            if (r6 != r1) goto L_0x005c
            goto L_0x00a2
        L_0x005c:
            r2 = r6
            java.util.List r2 = (java.util.List) r2
            q0e r4 = r5.i
            r0.o = r5
            r0.X = r6
            r0.s0 = r3
            r4.setValue(r2)
            e5f r2 = defpackage.e5f.a
            if (r2 != r1) goto L_0x006f
            goto L_0x00a2
        L_0x006f:
            r1 = r5
            r5 = r6
        L_0x0071:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            lx3 r6 = r0.b
            kotlinx.coroutines.internal.ContextScope r6 = defpackage.j1e.a(r6)
            java.util.ArrayList r0 = new java.util.ArrayList
            r2 = 10
            int r2 = defpackage.z53.S(r5, r2)
            r0.<init>(r2)
            java.util.Iterator r5 = r5.iterator()
        L_0x0088:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x00a1
            java.lang.Object r2 = r5.next()
            up8 r3 = new up8
            r4 = 0
            r3.<init>(r2, r4, r1)
            r2 = 3
            zf4 r2 = defpackage.j47.h(r6, r4, r3, r2)
            r0.add(r2)
            goto L_0x0088
        L_0x00a1:
            r1 = r0
        L_0x00a2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xp8.b(xp8, kotlin.coroutines.Continuation):java.io.Serializable");
    }

    public static final ArrayList c(xp8 xp8, List list, String str) {
        xp8.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            uj3 uj3 = (uj3) next;
            if (!eae.o0(String.valueOf(uj3.o()), str, false)) {
                je7 je7 = xp8.d;
                if (!((b0d) je7.getValue()).h(String.valueOf(uj3.d()), str)) {
                    String b2 = bre.b(uj3.g());
                    if (b2 != null) {
                        if (!((b0d) je7.getValue()).h(b2, str)) {
                        }
                    }
                }
            }
            arrayList.add(next);
        }
        return arrayList;
    }
}
