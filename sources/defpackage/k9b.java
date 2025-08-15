package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: k9b  reason: default package */
public final class k9b {
    public static final k9b f = new k9b();
    public final Object a = new Object();
    public oq1 b;
    public final x3c c = new x3c();
    public ay1 d;
    public final HashMap e = new HashMap();

    public static final aw1 a(k9b k9b, px1 px1) {
        k9b.getClass();
        Iterator it = px1.a.iterator();
        while (it.hasNext()) {
            sw1 sw1 = (sw1) it.next();
            pa0 pa0 = sw1.a;
            if (!tpa.f(pa0, pa0)) {
                synchronized (y85.a) {
                    zv1 zv1 = (zv1) y85.b.get(pa0);
                }
            }
        }
        return bw1.a;
    }

    public static final void b(k9b k9b, int i) {
        ay1 ay1 = k9b.d;
        if (ay1 != null) {
            yg2 yg2 = ay1.f;
            if (yg2 != null) {
                l0f l0f = (l0f) yg2.c;
                if (i != l0f.b) {
                    Iterator it = ((ArrayList) l0f.o).iterator();
                    while (it.hasNext()) {
                        ux1 ux1 = (ux1) it.next();
                        int i2 = l0f.b;
                        synchronized (ux1.b) {
                            boolean z = true;
                            ux1.c = i == 2 ? 2 : 1;
                            boolean z2 = i2 != 2 && i == 2;
                            if (i2 != 2 || i == 2) {
                                z = false;
                            }
                            if (z2 || z) {
                                ux1.b();
                            }
                        }
                    }
                }
                if (l0f.b == 2 && i != 2) {
                    ((ArrayList) l0f.Y).clear();
                }
                l0f.b = i;
                return;
            }
            throw new IllegalStateException("CameraX not initialized yet.");
        }
    }

    public final hg7 c(eh7 eh7, px1 px1, adb adb) {
        int i;
        Trace.beginSection(c37.F("CX:bindToLifecycle-UseCaseGroup"));
        try {
            ay1 ay1 = this.d;
            if (ay1 == null) {
                i = 0;
            } else {
                yg2 yg2 = ay1.f;
                if (yg2 != null) {
                    i = ((l0f) yg2.c).b;
                } else {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
            }
            if (i != 2) {
                b(this, 1);
                l9f[] l9fArr = (l9f[]) ((List) adb.b).toArray(new l9f[0]);
                return d(eh7, px1, (uof) adb.a, (List) adb.c, (l9f[]) Arrays.copyOf(l9fArr, l9fArr.length));
            }
            throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first.");
        } finally {
            Trace.endSection();
        }
    }

    public final hg7 d(eh7 eh7, px1 px1, uof uof, List list, l9f... l9fArr) {
        hg7 hg7;
        Collection unmodifiableCollection;
        boolean contains;
        eh7 eh72 = eh7;
        px1 px12 = px1;
        l9f[] l9fArr2 = l9fArr;
        Trace.beginSection(c37.F("CX:bindToLifecycle-internal"));
        try {
            kq0.e();
            ax1 c2 = px12.c(this.d.a.w());
            c2.o(true);
            fjc e2 = e(px12);
            x3c x3c = this.c;
            x90 t = xx1.t(e2, (fjc) null);
            synchronized (x3c.b) {
                hg7 = (hg7) ((HashMap) x3c.c).get(new wa0(eh72, t));
            }
            x3c x3c2 = this.c;
            synchronized (x3c2.b) {
                unmodifiableCollection = Collections.unmodifiableCollection(((HashMap) x3c2.c).values());
            }
            Iterator it = ys.d0(l9fArr).iterator();
            while (it.hasNext()) {
                l9f l9f = (l9f) it.next();
                Iterator it2 = unmodifiableCollection.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        hg7 hg72 = (hg7) it2.next();
                        synchronized (hg72.a) {
                            contains = ((ArrayList) hg72.c.w()).contains(l9f);
                        }
                        if (contains) {
                            if (!hg72.equals(hg7)) {
                                throw new IllegalStateException(String.format("Use case %s already bound to a different lifecycle.", Arrays.copyOf(new Object[]{l9f}, 1)));
                            }
                        }
                    }
                }
                while (true) {
                }
            }
            if (hg7 == null) {
                x3c x3c3 = this.c;
                ay1 ay1 = this.d;
                yg2 yg2 = ay1.f;
                if (yg2 != null) {
                    l0f l0f = (l0f) yg2.c;
                    y7g y7g = ay1.g;
                    if (y7g != null) {
                        ev1 ev1 = ay1.h;
                        if (ev1 != null) {
                            hg7 = x3c3.d(eh72, new xx1(c2, (ax1) null, e2, (fjc) null, l0f, y7g, ev1));
                        } else {
                            throw new IllegalStateException("CameraX not initialized yet.");
                        }
                    } else {
                        throw new IllegalStateException("CameraX not initialized yet.");
                    }
                } else {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
            }
            hg7 hg73 = hg7;
            if (l9fArr2.length != 0) {
                x3c x3c4 = this.c;
                List M = y53.M(Arrays.copyOf(l9fArr2, l9fArr2.length));
                yg2 yg22 = this.d.f;
                if (yg22 != null) {
                    x3c4.b(hg73, uof, list, M, (l0f) yg22.c);
                } else {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
            }
            Trace.endSection();
            return hg73;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final fjc e(px1 px1) {
        Object obj;
        Trace.beginSection(c37.F("CX:getCameraInfo"));
        try {
            yw1 p = px1.c(this.d.a.w()).p();
            aw1 a2 = a(this, px1);
            x90 x90 = new x90(p.d(), a2.a);
            synchronized (this.a) {
                obj = this.e.get(x90);
                if (obj == null) {
                    obj = new fjc(p, a2);
                    this.e.put(x90, obj);
                }
            }
            fjc fjc = (fjc) obj;
            Trace.endSection();
            return fjc;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final void f() {
        Trace.beginSection(c37.F("CX:unbindAll"));
        try {
            kq0.e();
            b(this, 0);
            this.c.o();
        } finally {
            Trace.endSection();
        }
    }
}
