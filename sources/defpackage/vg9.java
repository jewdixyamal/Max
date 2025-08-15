package defpackage;

import android.util.Pair;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: vg9  reason: default package */
public final class vg9 {
    public final Object a;
    public final CopyOnWriteArraySet b = new CopyOnWriteArraySet();
    public Closeable c;
    public float d;
    public int e;
    public oj0 f;
    public f3 g;
    public final /* synthetic */ eo0 h;

    public vg9(eo0 eo0, Object obj) {
        this.h = eo0;
        this.a = obj;
    }

    public static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
        defpackage.oj0.c(r1);
        defpackage.oj0.d(r2);
        defpackage.oj0.b(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003b, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        monitor-enter(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003f, code lost:
        if (r4 == r7.c) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0041, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0043, code lost:
        if (r4 == null) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0045, code lost:
        r4 = r7.h.c(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004c, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004e, code lost:
        monitor-exit(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004f, code lost:
        if (r4 == null) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0054, code lost:
        if (r5 <= 0.0f) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r8.i(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x005a, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x005c, code lost:
        r8.g(r6, r4);
        b(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0062, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0063, code lost:
        ((defpackage.oj0) r9).a(new defpackage.xq6(r7, r0, false, 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0070, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        throw r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0074, code lost:
        throw r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(defpackage.fi0 r8, defpackage.eab r9) {
        /*
            r7 = this;
            android.util.Pair r0 = android.util.Pair.create(r8, r9)
            monitor-enter(r7)
            eo0 r1 = r7.h     // Catch:{ all -> 0x0018 }
            java.lang.Object r2 = r7.a     // Catch:{ all -> 0x0018 }
            monitor-enter(r1)     // Catch:{ all -> 0x0018 }
            java.util.HashMap r3 = r1.a     // Catch:{ all -> 0x0075 }
            java.lang.Object r2 = r3.get(r2)     // Catch:{ all -> 0x0075 }
            vg9 r2 = (defpackage.vg9) r2     // Catch:{ all -> 0x0075 }
            monitor-exit(r1)     // Catch:{ all -> 0x0018 }
            if (r2 == r7) goto L_0x001a
            monitor-exit(r7)     // Catch:{ all -> 0x0018 }
            r7 = 0
            return r7
        L_0x0018:
            r8 = move-exception
            goto L_0x0078
        L_0x001a:
            java.util.concurrent.CopyOnWriteArraySet r1 = r7.b     // Catch:{ all -> 0x0018 }
            r1.add(r0)     // Catch:{ all -> 0x0018 }
            java.util.ArrayList r1 = r7.k()     // Catch:{ all -> 0x0018 }
            java.util.ArrayList r2 = r7.l()     // Catch:{ all -> 0x0018 }
            java.util.ArrayList r3 = r7.j()     // Catch:{ all -> 0x0018 }
            java.io.Closeable r4 = r7.c     // Catch:{ all -> 0x0018 }
            float r5 = r7.d     // Catch:{ all -> 0x0018 }
            int r6 = r7.e     // Catch:{ all -> 0x0018 }
            monitor-exit(r7)     // Catch:{ all -> 0x0018 }
            defpackage.oj0.c(r1)
            defpackage.oj0.d(r2)
            defpackage.oj0.b(r3)
            monitor-enter(r0)
            monitor-enter(r7)     // Catch:{ all -> 0x005a }
            java.io.Closeable r1 = r7.c     // Catch:{ all -> 0x004c }
            if (r4 == r1) goto L_0x0043
            r4 = 0
            goto L_0x004e
        L_0x0043:
            if (r4 == 0) goto L_0x004e
            eo0 r1 = r7.h     // Catch:{ all -> 0x004c }
            java.io.Closeable r4 = r1.c(r4)     // Catch:{ all -> 0x004c }
            goto L_0x004e
        L_0x004c:
            r8 = move-exception
            goto L_0x0071
        L_0x004e:
            monitor-exit(r7)     // Catch:{ all -> 0x004c }
            if (r4 == 0) goto L_0x0062
            r1 = 0
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x005c
            r8.i(r5)     // Catch:{ all -> 0x005a }
            goto L_0x005c
        L_0x005a:
            r7 = move-exception
            goto L_0x0073
        L_0x005c:
            r8.g(r6, r4)     // Catch:{ all -> 0x005a }
            b(r4)     // Catch:{ all -> 0x005a }
        L_0x0062:
            monitor-exit(r0)     // Catch:{ all -> 0x005a }
            xq6 r8 = new xq6
            r1 = 1
            r2 = 0
            r8.<init>(r7, r0, r2, r1)
            oj0 r9 = (defpackage.oj0) r9
            r9.a(r8)
            r7 = 1
            return r7
        L_0x0071:
            monitor-exit(r7)     // Catch:{ all -> 0x004c }
            throw r8     // Catch:{ all -> 0x005a }
        L_0x0073:
            monitor-exit(r0)     // Catch:{ all -> 0x005a }
            throw r7
        L_0x0075:
            r8 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0075 }
            throw r8     // Catch:{ all -> 0x0018 }
        L_0x0078:
            monitor-exit(r7)     // Catch:{ all -> 0x0018 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vg9.a(fi0, eab):boolean");
    }

    public final synchronized boolean c() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            if (((oj0) ((eab) ((Pair) it.next()).second)).f()) {
                return true;
            }
        }
        return false;
    }

    public final synchronized boolean d() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            if (!((oj0) ((eab) ((Pair) it.next()).second)).g()) {
                return false;
            }
        }
        return true;
    }

    public final synchronized a9b e() {
        a9b a9b;
        a9b a9b2;
        a9b = a9b.a;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            oj0 oj0 = (oj0) ((eab) ((Pair) it.next()).second);
            synchronized (oj0) {
                a9b2 = oj0.s0;
            }
            if (a9b.ordinal() <= a9b2.ordinal()) {
                a9b = a9b2;
            }
        }
        return a9b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        if (r6.hasNext() == false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        r1 = (android.util.Pair) r6.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0030, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r2 = r1.second;
        ((defpackage.oj0) ((defpackage.eab) r2)).c.d((defpackage.eab) r2, r5.h.d, r7, (java.util.Map) null);
        r2 = r5.f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0045, code lost:
        if (r2 == null) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0047, code lost:
        ((defpackage.oj0) ((defpackage.eab) r1.second)).putExtras(r2.Y);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0053, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0055, code lost:
        ((defpackage.fi0) r1.first).e(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005c, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005f, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0060, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(defpackage.f3 r6, java.lang.Throwable r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            f3 r0 = r5.g     // Catch:{ all -> 0x0007 }
            if (r0 == r6) goto L_0x0009
            monitor-exit(r5)     // Catch:{ all -> 0x0007 }
            return
        L_0x0007:
            r6 = move-exception
            goto L_0x0061
        L_0x0009:
            java.util.concurrent.CopyOnWriteArraySet r6 = r5.b     // Catch:{ all -> 0x0007 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0007 }
            java.util.concurrent.CopyOnWriteArraySet r0 = r5.b     // Catch:{ all -> 0x0007 }
            r0.clear()     // Catch:{ all -> 0x0007 }
            eo0 r0 = r5.h     // Catch:{ all -> 0x0007 }
            java.lang.Object r1 = r5.a     // Catch:{ all -> 0x0007 }
            r0.e(r1, r5)     // Catch:{ all -> 0x0007 }
            java.io.Closeable r0 = r5.c     // Catch:{ all -> 0x0007 }
            b(r0)     // Catch:{ all -> 0x0007 }
            r0 = 0
            r5.c = r0     // Catch:{ all -> 0x0007 }
            monitor-exit(r5)     // Catch:{ all -> 0x0007 }
        L_0x0024:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x0060
            java.lang.Object r1 = r6.next()
            android.util.Pair r1 = (android.util.Pair) r1
            monitor-enter(r1)
            java.lang.Object r2 = r1.second     // Catch:{ all -> 0x0053 }
            r3 = r2
            eab r3 = (defpackage.eab) r3     // Catch:{ all -> 0x0053 }
            oj0 r3 = (defpackage.oj0) r3     // Catch:{ all -> 0x0053 }
            hab r3 = r3.c     // Catch:{ all -> 0x0053 }
            eab r2 = (defpackage.eab) r2     // Catch:{ all -> 0x0053 }
            eo0 r4 = r5.h     // Catch:{ all -> 0x0053 }
            java.lang.String r4 = r4.d     // Catch:{ all -> 0x0053 }
            r3.d(r2, r4, r7, r0)     // Catch:{ all -> 0x0053 }
            oj0 r2 = r5.f     // Catch:{ all -> 0x0053 }
            if (r2 == 0) goto L_0x0055
            java.lang.Object r3 = r1.second     // Catch:{ all -> 0x0053 }
            eab r3 = (defpackage.eab) r3     // Catch:{ all -> 0x0053 }
            java.util.HashMap r2 = r2.Y     // Catch:{ all -> 0x0053 }
            oj0 r3 = (defpackage.oj0) r3     // Catch:{ all -> 0x0053 }
            r3.putExtras(r2)     // Catch:{ all -> 0x0053 }
            goto L_0x0055
        L_0x0053:
            r5 = move-exception
            goto L_0x005e
        L_0x0055:
            java.lang.Object r2 = r1.first     // Catch:{ all -> 0x0053 }
            fi0 r2 = (defpackage.fi0) r2     // Catch:{ all -> 0x0053 }
            r2.e(r7)     // Catch:{ all -> 0x0053 }
            monitor-exit(r1)     // Catch:{ all -> 0x0053 }
            goto L_0x0024
        L_0x005e:
            monitor-exit(r1)     // Catch:{ all -> 0x0053 }
            throw r5
        L_0x0060:
            return
        L_0x0061:
            monitor-exit(r5)     // Catch:{ all -> 0x0007 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vg9.f(f3, java.lang.Throwable):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        if (r0.hasNext() == false) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0042, code lost:
        r2 = (android.util.Pair) r0.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0048, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004d, code lost:
        if (defpackage.fi0.a(r9) == false) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004f, code lost:
        r3 = r2.second;
        ((defpackage.oj0) ((defpackage.eab) r3)).c.a((defpackage.eab) r3, r6.h.d, (java.util.Map) null);
        r3 = r6.f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0063, code lost:
        if (r3 == null) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0065, code lost:
        ((defpackage.oj0) ((defpackage.eab) r2.second)).putExtras(r3.Y);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0071, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0073, code lost:
        ((defpackage.oj0) ((defpackage.eab) r2.second)).putExtra(r6.h.e, java.lang.Integer.valueOf(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0084, code lost:
        ((defpackage.fi0) r2.first).g(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008b, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008e, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(defpackage.f3 r7, java.io.Closeable r8, int r9) {
        /*
            r6 = this;
            monitor-enter(r6)
            f3 r0 = r6.g     // Catch:{ all -> 0x0007 }
            if (r0 == r7) goto L_0x000a
            monitor-exit(r6)     // Catch:{ all -> 0x0007 }
            return
        L_0x0007:
            r7 = move-exception
            goto L_0x0090
        L_0x000a:
            java.io.Closeable r7 = r6.c     // Catch:{ all -> 0x0007 }
            b(r7)     // Catch:{ all -> 0x0007 }
            r7 = 0
            r6.c = r7     // Catch:{ all -> 0x0007 }
            java.util.concurrent.CopyOnWriteArraySet r0 = r6.b     // Catch:{ all -> 0x0007 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0007 }
            java.util.concurrent.CopyOnWriteArraySet r1 = r6.b     // Catch:{ all -> 0x0007 }
            int r1 = r1.size()     // Catch:{ all -> 0x0007 }
            boolean r2 = defpackage.fi0.b(r9)     // Catch:{ all -> 0x0007 }
            if (r2 == 0) goto L_0x002f
            eo0 r2 = r6.h     // Catch:{ all -> 0x0007 }
            java.io.Closeable r2 = r2.c(r8)     // Catch:{ all -> 0x0007 }
            r6.c = r2     // Catch:{ all -> 0x0007 }
            r6.e = r9     // Catch:{ all -> 0x0007 }
            goto L_0x003b
        L_0x002f:
            java.util.concurrent.CopyOnWriteArraySet r2 = r6.b     // Catch:{ all -> 0x0007 }
            r2.clear()     // Catch:{ all -> 0x0007 }
            eo0 r2 = r6.h     // Catch:{ all -> 0x0007 }
            java.lang.Object r3 = r6.a     // Catch:{ all -> 0x0007 }
            r2.e(r3, r6)     // Catch:{ all -> 0x0007 }
        L_0x003b:
            monitor-exit(r6)     // Catch:{ all -> 0x0007 }
        L_0x003c:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x008f
            java.lang.Object r2 = r0.next()
            android.util.Pair r2 = (android.util.Pair) r2
            monitor-enter(r2)
            boolean r3 = defpackage.fi0.a(r9)     // Catch:{ all -> 0x0071 }
            if (r3 == 0) goto L_0x0084
            java.lang.Object r3 = r2.second     // Catch:{ all -> 0x0071 }
            r4 = r3
            eab r4 = (defpackage.eab) r4     // Catch:{ all -> 0x0071 }
            oj0 r4 = (defpackage.oj0) r4     // Catch:{ all -> 0x0071 }
            hab r4 = r4.c     // Catch:{ all -> 0x0071 }
            eab r3 = (defpackage.eab) r3     // Catch:{ all -> 0x0071 }
            eo0 r5 = r6.h     // Catch:{ all -> 0x0071 }
            java.lang.String r5 = r5.d     // Catch:{ all -> 0x0071 }
            r4.a(r3, r5, r7)     // Catch:{ all -> 0x0071 }
            oj0 r3 = r6.f     // Catch:{ all -> 0x0071 }
            if (r3 == 0) goto L_0x0073
            java.lang.Object r4 = r2.second     // Catch:{ all -> 0x0071 }
            eab r4 = (defpackage.eab) r4     // Catch:{ all -> 0x0071 }
            java.util.HashMap r3 = r3.Y     // Catch:{ all -> 0x0071 }
            oj0 r4 = (defpackage.oj0) r4     // Catch:{ all -> 0x0071 }
            r4.putExtras(r3)     // Catch:{ all -> 0x0071 }
            goto L_0x0073
        L_0x0071:
            r6 = move-exception
            goto L_0x008d
        L_0x0073:
            java.lang.Object r3 = r2.second     // Catch:{ all -> 0x0071 }
            eab r3 = (defpackage.eab) r3     // Catch:{ all -> 0x0071 }
            eo0 r4 = r6.h     // Catch:{ all -> 0x0071 }
            java.lang.String r4 = r4.e     // Catch:{ all -> 0x0071 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0071 }
            oj0 r3 = (defpackage.oj0) r3     // Catch:{ all -> 0x0071 }
            r3.putExtra(r4, r5)     // Catch:{ all -> 0x0071 }
        L_0x0084:
            java.lang.Object r3 = r2.first     // Catch:{ all -> 0x0071 }
            fi0 r3 = (defpackage.fi0) r3     // Catch:{ all -> 0x0071 }
            r3.g(r9, r8)     // Catch:{ all -> 0x0071 }
            monitor-exit(r2)     // Catch:{ all -> 0x0071 }
            goto L_0x003c
        L_0x008d:
            monitor-exit(r2)     // Catch:{ all -> 0x0071 }
            throw r6
        L_0x008f:
            return
        L_0x0090:
            monitor-exit(r6)     // Catch:{ all -> 0x0007 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vg9.g(f3, java.io.Closeable, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
        if (r2.hasNext() == false) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        r1 = (android.util.Pair) r2.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001e, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        ((defpackage.fi0) r1.first).i(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0026, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(defpackage.f3 r2, float r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            f3 r0 = r1.g     // Catch:{ all -> 0x0007 }
            if (r0 == r2) goto L_0x0009
            monitor-exit(r1)     // Catch:{ all -> 0x0007 }
            return
        L_0x0007:
            r2 = move-exception
            goto L_0x002c
        L_0x0009:
            r1.d = r3     // Catch:{ all -> 0x0007 }
            java.util.concurrent.CopyOnWriteArraySet r2 = r1.b     // Catch:{ all -> 0x0007 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0007 }
            monitor-exit(r1)     // Catch:{ all -> 0x0007 }
        L_0x0012:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x002b
            java.lang.Object r1 = r2.next()
            android.util.Pair r1 = (android.util.Pair) r1
            monitor-enter(r1)
            java.lang.Object r0 = r1.first     // Catch:{ all -> 0x0028 }
            fi0 r0 = (defpackage.fi0) r0     // Catch:{ all -> 0x0028 }
            r0.i(r3)     // Catch:{ all -> 0x0028 }
            monitor-exit(r1)     // Catch:{ all -> 0x0028 }
            goto L_0x0012
        L_0x0028:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0028 }
            throw r2
        L_0x002b:
            return
        L_0x002c:
            monitor-exit(r1)     // Catch:{ all -> 0x0007 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vg9.h(f3, float):void");
    }

    public final void i(int i) {
        boolean z;
        int i2 = i;
        synchronized (this) {
            try {
                if (this.f == null) {
                    if (!(this.g == null)) {
                        throw new IllegalArgumentException();
                    } else if (this.b.isEmpty()) {
                        this.h.e(this.a, this);
                    } else {
                        eab eab = (eab) ((Pair) this.b.iterator().next()).second;
                        oj0 oj0 = r6;
                        oj0 oj02 = new oj0(((oj0) eab).a, ((oj0) eab).b, (String) null, (b47) ((oj0) eab).c, ((oj0) eab).o, ((oj0) eab).X, d(), c(), e(), ((oj0) eab).w0);
                        this.f = oj0;
                        oj0.putExtras(((oj0) eab).Y);
                        if (i2 != 0) {
                            if (i2 != 3) {
                                oj0 oj03 = this.f;
                                int s = au1.s(i);
                                if (s == 0) {
                                    z = true;
                                } else if (s == 1) {
                                    z = false;
                                } else if (s != 2) {
                                    throw new IllegalStateException("Unrecognized TriState value: ".concat(i2 != 1 ? i2 != 2 ? i2 != 3 ? "null" : "UNSET" : "NO" : "YES"));
                                } else {
                                    throw new IllegalStateException("No boolean equivalent for UNSET");
                                }
                                oj03.putExtra("started_as_prefetch", Boolean.valueOf(z));
                            }
                            f3 f3Var = new f3(1, this);
                            this.g = f3Var;
                            oj0 oj04 = this.f;
                            this.h.b.a(f3Var, oj04);
                            return;
                        }
                        throw null;
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x001e, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.ArrayList j() {
        /*
            r4 = this;
            monitor-enter(r4)
            oj0 r0 = r4.f     // Catch:{ all -> 0x0022 }
            r1 = 0
            if (r0 != 0) goto L_0x0008
            monitor-exit(r4)
            return r1
        L_0x0008:
            boolean r2 = r4.c()     // Catch:{ all -> 0x0022 }
            monitor-enter(r0)     // Catch:{ all -> 0x0022 }
            boolean r3 = r0.t0     // Catch:{ all -> 0x001f }
            if (r2 != r3) goto L_0x0013
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            goto L_0x001d
        L_0x0013:
            r0.t0 = r2     // Catch:{ all -> 0x001f }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x001f }
            java.util.ArrayList r2 = r0.v0     // Catch:{ all -> 0x001f }
            r1.<init>(r2)     // Catch:{ all -> 0x001f }
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
        L_0x001d:
            monitor-exit(r4)
            return r1
        L_0x001f:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            throw r1     // Catch:{ all -> 0x0022 }
        L_0x0022:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0022 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vg9.j():java.util.ArrayList");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x001e, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.ArrayList k() {
        /*
            r4 = this;
            monitor-enter(r4)
            oj0 r0 = r4.f     // Catch:{ all -> 0x0022 }
            r1 = 0
            if (r0 != 0) goto L_0x0008
            monitor-exit(r4)
            return r1
        L_0x0008:
            boolean r2 = r4.d()     // Catch:{ all -> 0x0022 }
            monitor-enter(r0)     // Catch:{ all -> 0x0022 }
            boolean r3 = r0.Z     // Catch:{ all -> 0x001f }
            if (r2 != r3) goto L_0x0013
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            goto L_0x001d
        L_0x0013:
            r0.Z = r2     // Catch:{ all -> 0x001f }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x001f }
            java.util.ArrayList r2 = r0.v0     // Catch:{ all -> 0x001f }
            r1.<init>(r2)     // Catch:{ all -> 0x001f }
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
        L_0x001d:
            monitor-exit(r4)
            return r1
        L_0x001f:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            throw r1     // Catch:{ all -> 0x0022 }
        L_0x0022:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0022 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vg9.k():java.util.ArrayList");
    }

    public final synchronized ArrayList l() {
        oj0 oj0 = this.f;
        if (oj0 == null) {
            return null;
        }
        return oj0.i(e());
    }
}
