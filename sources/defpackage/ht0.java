package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: ht0  reason: default package */
public final class ht0 {
    public final s2b a;
    public final te b;
    public final fm5 c;
    public final gg d;
    public final int e;
    public final ConcurrentHashMap f;
    public volatile int g;
    public volatile boolean h;
    public final fm5 i;
    public int j;
    public Map k;
    public Set l;

    public ht0(s2b s2b, te teVar, fm5 fm5, gg ggVar, int i2) {
        this.a = s2b;
        this.b = teVar;
        this.c = fm5;
        this.d = ggVar;
        int d2 = (d(ggVar) * i2) / 1000;
        d2 = d2 < 1 ? 1 : d2;
        this.e = d2;
        this.f = new ConcurrentHashMap();
        this.i = new fm5(ggVar.x(), 5);
        this.j = -1;
        this.k = oz4.a;
        this.l = wz4.a;
        a(d(ggVar));
        this.g = (int) (((float) d2) * 0.5f);
    }

    public static int d(gg ggVar) {
        return (int) ote.c(TimeUnit.SECONDS.toMillis(1) / ((long) (ggVar.G() / ggVar.x())), 1);
    }

    public final void a(int i2) {
        gg ggVar = this.d;
        int G = ggVar.G();
        int g0 = ggVar.g0();
        int i3 = 1;
        if (g0 < 1) {
            g0 = 1;
        }
        int i4 = G * g0;
        int x = ggVar.x();
        int d2 = d(ggVar);
        if (i2 > d2) {
            i2 = d2;
        }
        fm5 fm5 = this.c;
        fm5.getClass();
        if (i2 >= 1) {
            i3 = i2;
        }
        int i5 = fm5.b;
        if (i3 > i5) {
            i3 = i5;
        }
        float b2 = ote.b((((float) i4) / 1000.0f) * ((float) i3), 0.0f);
        float f2 = (float) x;
        if (b2 > f2) {
            b2 = f2;
        }
        float f3 = f2 / b2;
        int i6 = 0;
        j37 Y = ote.Y(0, x);
        int Z = mz7.Z(z53.S(Y, 10));
        if (Z < 16) {
            Z = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(Z);
        Iterator it = Y.iterator();
        while (true) {
            i37 i37 = (i37) it;
            if (i37.c) {
                Object next = i37.next();
                int intValue = ((Number) next).intValue();
                if (((int) (((float) intValue) % f3)) == 0) {
                    i6 = intValue;
                }
                linkedHashMap.put(next, Integer.valueOf(i6));
            } else {
                this.k = linkedHashMap;
                this.l = x53.H0(linkedHashMap.values());
                return;
            }
        }
    }

    public final xf b(int i2) {
        xf xfVar;
        fm5 fm5 = this.i;
        Iterator it = new h37(0, fm5.b, 1).iterator();
        do {
            xfVar = null;
            if (!((i37) it).c) {
                break;
            }
            int a2 = fm5.a(i2 - ((i37) it).a());
            gt0 gt0 = (gt0) this.f.get(Integer.valueOf(a2));
            if (gt0 != null) {
                if (gt0.b || !gt0.a.m0()) {
                    gt0 = null;
                }
                if (gt0 != null) {
                    xfVar = new xf(a2, (v84) gt0.a);
                    continue;
                } else {
                    continue;
                }
            }
        } while (xfVar == null);
        return xfVar;
    }

    public final y26 c(int i2) {
        xf b2 = b(i2);
        if (b2 == null) {
            return new y26(3, (o43) null);
        }
        o43 m = b2.b.m();
        this.j = b2.a;
        return new y26(2, m);
    }

    public final void e(int i2, int i3) {
        if (!this.h) {
            this.h = true;
            ExecutorService executorService = jg.a;
            jg.a.execute(new ft0(this, i2, i3, 0));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0070, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0071, code lost:
        defpackage.v3c.i(r3, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0074, code lost:
        throw r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(int r9, defpackage.o43 r10) {
        /*
            r8 = this;
            xf r0 = r8.b(r9)
            te r8 = r8.b
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0075
            o43 r3 = r0.b
            if (r3 == 0) goto L_0x0075
            o43 r3 = r3.n()
            if (r3 == 0) goto L_0x0075
            int r0 = r0.a     // Catch:{ all -> 0x0065 }
            r4 = 0
            if (r0 >= r9) goto L_0x006b
            java.lang.Object r5 = r3.e0()     // Catch:{ all -> 0x0065 }
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5     // Catch:{ all -> 0x0065 }
            boolean r6 = r10.m0()     // Catch:{ all -> 0x0065 }
            if (r6 == 0) goto L_0x0043
            java.lang.Object r6 = r10.e0()     // Catch:{ all -> 0x0065 }
            boolean r6 = r6.equals(r5)     // Catch:{ all -> 0x0065 }
            if (r6 != 0) goto L_0x0043
            android.graphics.Canvas r6 = new android.graphics.Canvas     // Catch:{ all -> 0x0065 }
            java.lang.Object r7 = r10.e0()     // Catch:{ all -> 0x0065 }
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7     // Catch:{ all -> 0x0065 }
            r6.<init>(r7)     // Catch:{ all -> 0x0065 }
            android.graphics.PorterDuff$Mode r7 = android.graphics.PorterDuff.Mode.CLEAR     // Catch:{ all -> 0x0065 }
            r6.drawColor(r2, r7)     // Catch:{ all -> 0x0065 }
            r2 = 0
            r6.drawBitmap(r5, r2, r2, r4)     // Catch:{ all -> 0x0065 }
        L_0x0043:
            j37 r2 = new j37     // Catch:{ all -> 0x0065 }
            int r0 = r0 + r1
            r2.<init>(r0, r9, r1)     // Catch:{ all -> 0x0065 }
            java.util.Iterator r9 = r2.iterator()     // Catch:{ all -> 0x0065 }
        L_0x004d:
            r0 = r9
            i37 r0 = (defpackage.i37) r0     // Catch:{ all -> 0x0065 }
            boolean r0 = r0.c     // Catch:{ all -> 0x0065 }
            if (r0 == 0) goto L_0x0067
            r0 = r9
            i37 r0 = (defpackage.i37) r0     // Catch:{ all -> 0x0065 }
            int r0 = r0.a()     // Catch:{ all -> 0x0065 }
            java.lang.Object r1 = r10.e0()     // Catch:{ all -> 0x0065 }
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1     // Catch:{ all -> 0x0065 }
            r8.d(r1, r0)     // Catch:{ all -> 0x0065 }
            goto L_0x004d
        L_0x0065:
            r8 = move-exception
            goto L_0x006f
        L_0x0067:
            defpackage.v3c.i(r3, r4)
            return
        L_0x006b:
            defpackage.v3c.i(r3, r4)
            goto L_0x0075
        L_0x006f:
            throw r8     // Catch:{ all -> 0x0070 }
        L_0x0070:
            r9 = move-exception
            defpackage.v3c.i(r3, r8)
            throw r9
        L_0x0075:
            boolean r0 = r10.m0()
            if (r0 == 0) goto L_0x008b
            android.graphics.Canvas r0 = new android.graphics.Canvas
            java.lang.Object r3 = r10.e0()
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
            r0.<init>(r3)
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.CLEAR
            r0.drawColor(r2, r3)
        L_0x008b:
            j37 r0 = new j37
            r0.<init>(r2, r9, r1)
            java.util.Iterator r9 = r0.iterator()
        L_0x0094:
            r0 = r9
            i37 r0 = (defpackage.i37) r0
            boolean r0 = r0.c
            if (r0 == 0) goto L_0x00ac
            r0 = r9
            i37 r0 = (defpackage.i37) r0
            int r0 = r0.a()
            java.lang.Object r1 = r10.e0()
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            r8.d(r1, r0)
            goto L_0x0094
        L_0x00ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ht0.f(int, o43):void");
    }
}
