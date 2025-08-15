package defpackage;

import android.media.ImageReader;
import android.util.LongSparseArray;
import android.util.Size;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* renamed from: i99  reason: default package */
public final class i99 implements qv6, h06 {
    public boolean X = false;
    public final qv6 Y;
    public pv6 Z;
    public final Object a = new Object();
    public final oz1 b = new oz1(1, this);
    public int c = 0;
    public final yt8 o = new yt8(6, (Object) this);
    public Executor s0;
    public final LongSparseArray t0 = new LongSparseArray();
    public final LongSparseArray u0 = new LongSparseArray();
    public int v0;
    public final ArrayList w0;
    public final ArrayList x0 = new ArrayList();

    public i99(int i, int i2, int i3, int i4) {
        td tdVar = new td(ImageReader.newInstance(i, i2, i3, i4));
        this.Y = tdVar;
        this.v0 = 0;
        this.w0 = new ArrayList(m());
    }

    public final void a(ov6 ov6) {
        synchronized (this.a) {
            b(ov6);
        }
    }

    public final void b(ov6 ov6) {
        synchronized (this.a) {
            try {
                int indexOf = this.w0.indexOf(ov6);
                if (indexOf >= 0) {
                    this.w0.remove(indexOf);
                    int i = this.v0;
                    if (indexOf <= i) {
                        this.v0 = i - 1;
                    }
                }
                this.x0.remove(ov6);
                if (this.c > 0) {
                    d(this.Y);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(ecd ecd) {
        pv6 pv6;
        Executor executor;
        synchronized (this.a) {
            try {
                if (this.w0.size() < m()) {
                    ecd.a(this);
                    this.w0.add(ecd);
                    pv6 = this.Z;
                    executor = this.s0;
                } else {
                    ecd.close();
                    pv6 = null;
                    executor = null;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (pv6 == null) {
            return;
        }
        if (executor != null) {
            executor.execute(new vs5(this, 26, pv6));
        } else {
            pv6.f(this);
        }
    }

    public final void close() {
        synchronized (this.a) {
            try {
                if (!this.X) {
                    Iterator it = new ArrayList(this.w0).iterator();
                    while (it.hasNext()) {
                        ((ov6) it.next()).close();
                    }
                    this.w0.clear();
                    this.Y.close();
                    this.X = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0041, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0051, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0009, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0026 A[SYNTHETIC, Splitter:B:16:0x0026] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(defpackage.qv6 r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.a
            monitor-enter(r0)
            boolean r1 = r6.X     // Catch:{ all -> 0x0009 }
            if (r1 == 0) goto L_0x000b
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            return
        L_0x0009:
            r6 = move-exception
            goto L_0x0050
        L_0x000b:
            android.util.LongSparseArray r1 = r6.u0     // Catch:{ all -> 0x0009 }
            int r1 = r1.size()     // Catch:{ all -> 0x0009 }
            java.util.ArrayList r2 = r6.w0     // Catch:{ all -> 0x0009 }
            int r2 = r2.size()     // Catch:{ all -> 0x0009 }
            int r1 = r1 + r2
            int r2 = r7.m()     // Catch:{ all -> 0x0009 }
            if (r1 < r2) goto L_0x0020
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            return
        L_0x0020:
            ov6 r2 = r7.o()     // Catch:{ IllegalStateException -> 0x0041, all -> 0x003f }
            if (r2 == 0) goto L_0x0042
            int r3 = r6.c     // Catch:{ all -> 0x0009 }
            int r3 = r3 + -1
            r6.c = r3     // Catch:{ all -> 0x0009 }
            int r1 = r1 + 1
            android.util.LongSparseArray r3 = r6.u0     // Catch:{ all -> 0x0009 }
            su6 r4 = r2.getImageInfo()     // Catch:{ all -> 0x0009 }
            long r4 = r4.getTimestamp()     // Catch:{ all -> 0x0009 }
            r3.put(r4, r2)     // Catch:{ all -> 0x0009 }
            r6.e()     // Catch:{ all -> 0x0009 }
            goto L_0x0042
        L_0x003f:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0009 }
        L_0x0041:
            r2 = 0
        L_0x0042:
            if (r2 == 0) goto L_0x004e
            int r2 = r6.c     // Catch:{ all -> 0x0009 }
            if (r2 <= 0) goto L_0x004e
            int r2 = r7.m()     // Catch:{ all -> 0x0009 }
            if (r1 < r2) goto L_0x0020
        L_0x004e:
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            return
        L_0x0050:
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i99.d(qv6):void");
    }

    public final void e() {
        synchronized (this.a) {
            try {
                for (int size = this.t0.size() - 1; size >= 0; size--) {
                    su6 su6 = (su6) this.t0.valueAt(size);
                    long timestamp = su6.getTimestamp();
                    ov6 ov6 = (ov6) this.u0.get(timestamp);
                    if (ov6 != null) {
                        this.u0.remove(timestamp);
                        this.t0.removeAt(size);
                        c(new ecd(ov6, (Size) null, su6));
                    }
                }
                f();
            } finally {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f() {
        /*
            r7 = this;
            java.lang.Object r0 = r7.a
            monitor-enter(r0)
            android.util.LongSparseArray r1 = r7.u0     // Catch:{ all -> 0x005b }
            int r1 = r1.size()     // Catch:{ all -> 0x005b }
            if (r1 == 0) goto L_0x007e
            android.util.LongSparseArray r1 = r7.t0     // Catch:{ all -> 0x005b }
            int r1 = r1.size()     // Catch:{ all -> 0x005b }
            if (r1 != 0) goto L_0x0014
            goto L_0x007e
        L_0x0014:
            android.util.LongSparseArray r1 = r7.u0     // Catch:{ all -> 0x005b }
            r2 = 0
            long r3 = r1.keyAt(r2)     // Catch:{ all -> 0x005b }
            java.lang.Long r1 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x005b }
            android.util.LongSparseArray r5 = r7.t0     // Catch:{ all -> 0x005b }
            long r5 = r5.keyAt(r2)     // Catch:{ all -> 0x005b }
            java.lang.Long r2 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x005b }
            boolean r1 = r2.equals(r1)     // Catch:{ all -> 0x005b }
            r1 = r1 ^ 1
            defpackage.c54.k(r1)     // Catch:{ all -> 0x005b }
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x0060
            android.util.LongSparseArray r1 = r7.u0     // Catch:{ all -> 0x005b }
            int r1 = r1.size()     // Catch:{ all -> 0x005b }
            int r1 = r1 + -1
        L_0x003e:
            if (r1 < 0) goto L_0x007c
            android.util.LongSparseArray r2 = r7.u0     // Catch:{ all -> 0x005b }
            long r2 = r2.keyAt(r1)     // Catch:{ all -> 0x005b }
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 >= 0) goto L_0x005d
            android.util.LongSparseArray r2 = r7.u0     // Catch:{ all -> 0x005b }
            java.lang.Object r2 = r2.valueAt(r1)     // Catch:{ all -> 0x005b }
            ov6 r2 = (defpackage.ov6) r2     // Catch:{ all -> 0x005b }
            r2.close()     // Catch:{ all -> 0x005b }
            android.util.LongSparseArray r2 = r7.u0     // Catch:{ all -> 0x005b }
            r2.removeAt(r1)     // Catch:{ all -> 0x005b }
            goto L_0x005d
        L_0x005b:
            r7 = move-exception
            goto L_0x0080
        L_0x005d:
            int r1 = r1 + -1
            goto L_0x003e
        L_0x0060:
            android.util.LongSparseArray r1 = r7.t0     // Catch:{ all -> 0x005b }
            int r1 = r1.size()     // Catch:{ all -> 0x005b }
            int r1 = r1 + -1
        L_0x0068:
            if (r1 < 0) goto L_0x007c
            android.util.LongSparseArray r2 = r7.t0     // Catch:{ all -> 0x005b }
            long r5 = r2.keyAt(r1)     // Catch:{ all -> 0x005b }
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x0079
            android.util.LongSparseArray r2 = r7.t0     // Catch:{ all -> 0x005b }
            r2.removeAt(r1)     // Catch:{ all -> 0x005b }
        L_0x0079:
            int r1 = r1 + -1
            goto L_0x0068
        L_0x007c:
            monitor-exit(r0)     // Catch:{ all -> 0x005b }
            return
        L_0x007e:
            monitor-exit(r0)     // Catch:{ all -> 0x005b }
            return
        L_0x0080:
            monitor-exit(r0)     // Catch:{ all -> 0x005b }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i99.f():void");
    }

    public final ov6 g() {
        synchronized (this.a) {
            try {
                if (this.w0.isEmpty()) {
                    return null;
                }
                if (this.v0 < this.w0.size()) {
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < this.w0.size() - 1; i++) {
                        if (!this.x0.contains(this.w0.get(i))) {
                            arrayList.add((ov6) this.w0.get(i));
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((ov6) it.next()).close();
                    }
                    int size = this.w0.size();
                    ArrayList arrayList2 = this.w0;
                    this.v0 = size;
                    ov6 ov6 = (ov6) arrayList2.get(size - 1);
                    this.x0.add(ov6);
                    return ov6;
                }
                throw new IllegalStateException("Maximum image number reached.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int getHeight() {
        int height;
        synchronized (this.a) {
            height = this.Y.getHeight();
        }
        return height;
    }

    public final Surface getSurface() {
        Surface surface;
        synchronized (this.a) {
            surface = this.Y.getSurface();
        }
        return surface;
    }

    public final int getWidth() {
        int width;
        synchronized (this.a) {
            width = this.Y.getWidth();
        }
        return width;
    }

    public final int j() {
        int j;
        synchronized (this.a) {
            j = this.Y.j();
        }
        return j;
    }

    public final void k() {
        synchronized (this.a) {
            this.Y.k();
            this.Z = null;
            this.s0 = null;
            this.c = 0;
        }
    }

    public final void l(pv6 pv6, Executor executor) {
        synchronized (this.a) {
            pv6.getClass();
            this.Z = pv6;
            executor.getClass();
            this.s0 = executor;
            this.Y.l(this.o, executor);
        }
    }

    public final int m() {
        int m;
        synchronized (this.a) {
            m = this.Y.m();
        }
        return m;
    }

    public final ov6 o() {
        synchronized (this.a) {
            try {
                if (this.w0.isEmpty()) {
                    return null;
                }
                if (this.v0 < this.w0.size()) {
                    ArrayList arrayList = this.w0;
                    int i = this.v0;
                    this.v0 = i + 1;
                    ov6 ov6 = (ov6) arrayList.get(i);
                    this.x0.add(ov6);
                    return ov6;
                }
                throw new IllegalStateException("Maximum image number reached.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
