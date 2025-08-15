package defpackage;

import android.graphics.Bitmap;
import java.io.Closeable;
import java.util.Iterator;

/* renamed from: o43  reason: default package */
public abstract class o43 implements Cloneable, Closeable {
    public static final hx9 X = new Object();
    public static final buc Y = new Object();
    public boolean a = false;
    public final tld b;
    public final n43 c;
    public final Throwable o;

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public o43(defpackage.tld r4, defpackage.n43 r5, java.lang.Throwable r6) {
        /*
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.a = r0
            r4.getClass()
            r3.b = r4
            monitor-enter(r4)
            monitor-enter(r4)     // Catch:{ all -> 0x001f }
            int r1 = r4.b     // Catch:{ all -> 0x0027 }
            r2 = 1
            if (r1 <= 0) goto L_0x0013
            r0 = r2
        L_0x0013:
            monitor-exit(r4)     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x0021
            int r1 = r1 + r2
            r4.b = r1     // Catch:{ all -> 0x001f }
            monitor-exit(r4)
            r3.c = r5
            r3.o = r6
            return
        L_0x001f:
            r3 = move-exception
            goto L_0x002a
        L_0x0021:
            com.facebook.common.references.SharedReference$NullReferenceException r3 = new com.facebook.common.references.SharedReference$NullReferenceException     // Catch:{ all -> 0x001f }
            r3.<init>()     // Catch:{ all -> 0x001f }
            throw r3     // Catch:{ all -> 0x001f }
        L_0x0027:
            r3 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0027 }
            throw r3     // Catch:{ all -> 0x001f }
        L_0x002a:
            monitor-exit(r4)     // Catch:{ all -> 0x001f }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o43.<init>(tld, n43, java.lang.Throwable):void");
    }

    public static void S(o43 o43) {
        if (o43 != null) {
            o43.close();
        }
    }

    public static void U(Iterable iterable) {
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                S((o43) it.next());
            }
        }
    }

    public static boolean n0(o43 o43) {
        return o43 != null && o43.m0();
    }

    public static o43 o(o43 o43) {
        if (o43 != null) {
            return o43.n();
        }
        return null;
    }

    public static v84 o0(Closeable closeable) {
        return p0(closeable, X, Y);
    }

    public static v84 p0(Object obj, pic pic, n43 n43) {
        if (obj == null) {
            return null;
        }
        n43.f();
        if (!(obj instanceof Bitmap)) {
            boolean z = obj instanceof l43;
        }
        return new o43(obj, pic, n43, (Throwable) null, true);
    }

    public void close() {
        synchronized (this) {
            try {
                if (!this.a) {
                    this.a = true;
                    this.b.a();
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public final synchronized Object e0() {
        Object b2;
        od2.p(!this.a);
        b2 = this.b.b();
        b2.getClass();
        return b2;
    }

    public abstract o43 m();

    public synchronized boolean m0() {
        return !this.a;
    }

    public synchronized o43 n() {
        if (!m0()) {
            return null;
        }
        return m();
    }

    public o43(Object obj, pic pic, n43 n43, Throwable th, boolean z) {
        this.b = new tld(obj, pic, z);
        this.c = n43;
        this.o = th;
    }
}
