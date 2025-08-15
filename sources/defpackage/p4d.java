package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: p4d  reason: default package */
public final class p4d {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final Set c = Collections.newSetFromMap(new ConcurrentHashMap());
    public final Set d = Collections.newSetFromMap(new ConcurrentHashMap());
    public final Set e = Collections.newSetFromMap(new ConcurrentHashMap());
    public final Set f = Collections.newSetFromMap(new ConcurrentHashMap());
    public final Set g = Collections.newSetFromMap(new ConcurrentHashMap());
    public final hp h;
    public final qe5 i;
    public final imc j;
    public CharSequence k;
    public int l;
    public final CopyOnWriteArraySet m = new CopyOnWriteArraySet();

    public p4d(hp hpVar, qe5 qe5, imc imc) {
        this.h = hpVar;
        this.i = qe5;
        this.j = imc;
        if (((jp) hpVar).g.getBoolean("app.send.media.as.collage", true)) {
            this.l = 3;
        } else {
            this.l = 1;
        }
    }

    public static boolean k(up7 up7, r4d r4d) {
        up7 up72 = r4d.a;
        if (up72 == null || up7 == null) {
            return false;
        }
        if ((up7 instanceof j00) && (up72 instanceof j00)) {
            return oag.d(((j00) up7).u0.r, ((j00) up72).u0.r);
        }
        if (up72.b == up7.b) {
            return true;
        }
        return kp.e(up7.c(), up72.c());
    }

    public final int a(up7 up7, int i2) {
        boolean j2 = j(up7);
        CopyOnWriteArraySet copyOnWriteArraySet = this.a;
        if (j2) {
            return copyOnWriteArraySet.size();
        }
        r4d h2 = h(up7);
        if (h2 != null) {
            h2.f = true;
            return g(up7);
        }
        r4d r4d = new r4d(up7);
        r4d.c = (awa) this.b.get(Long.valueOf(up7.b));
        Set<q96> set = this.e;
        if (i2 < 0 || i2 >= copyOnWriteArraySet.size()) {
            copyOnWriteArraySet.add(r4d);
            if (set != null) {
                for (q96 b2 : set) {
                    try {
                        b2.b(r4d);
                    } catch (Throwable th) {
                        throw new RuntimeException(th);
                    }
                }
            }
            n();
            return copyOnWriteArraySet.size();
        }
        ArrayList arrayList = new ArrayList(copyOnWriteArraySet);
        arrayList.add(i2, r4d);
        copyOnWriteArraySet.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            r4d r4d2 = (r4d) it.next();
            copyOnWriteArraySet.add(r4d2);
            if (set != null) {
                for (q96 b3 : set) {
                    try {
                        b3.b(r4d2);
                    } catch (Throwable th2) {
                        throw new RuntimeException(th2);
                    }
                }
            }
            n();
        }
        return i2 + 1;
    }

    public final int b() {
        return c().size();
    }

    public final List c() {
        CopyOnWriteArraySet copyOnWriteArraySet = this.a;
        if ((copyOnWriteArraySet instanceof Collection) && copyOnWriteArraySet.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                if (((r4d) next).f) {
                    arrayList.add(next);
                }
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }
        return arrayList;
    }

    public final ArrayList d() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            r4d r4d = (r4d) it.next();
            if (r4d.f) {
                up7 up7 = r4d.a;
                if ((up7 instanceof j00) && !awa.b(r4d.c, up7)) {
                    arrayList.add(new k00(up7.a, up7.a(), ((j00) up7).u0));
                } else {
                    String f2 = f(r4d);
                    if (f2 != null) {
                        int i2 = up7.a;
                        if (this.l == 2) {
                            i2 = 7;
                        }
                        arrayList.add(new aqd(i2, f2));
                    } else {
                        arrayList.add(l(r4d));
                    }
                }
            }
        }
        return arrayList;
    }

    public final awa e(up7 up7) {
        r4d h2 = h(up7);
        awa awa = h2 != null ? h2.c : null;
        return awa == null ? (awa) this.b.get(Long.valueOf(up7.b)) : awa;
    }

    public final String f(r4d r4d) {
        awa awa = r4d.c;
        Uri uri = awa != null ? awa.X : null;
        Uri uri2 = awa != null ? awa.b : null;
        Uri uri3 = awa != null ? awa.a : null;
        if (uri != null) {
            Uri a2 = awa.a(awa, r4d.a);
            try {
                imc imc = this.j;
                Bitmap Q = imc.Q(a2, true);
                Bitmap Q2 = imc.Q(uri, false);
                Canvas canvas = new Canvas(Q);
                float width = ((float) Q.getWidth()) / ((float) Q2.getWidth());
                canvas.scale(width, width);
                canvas.drawBitmap(Q2, 0.0f, 0.0f, (Paint) null);
                File a3 = ((zi5) imc.c).a("jpg");
                String absolutePath = a3.getAbsolutePath();
                ph4 ph4 = j47.X;
                j47.h0(absolutePath, Q, 100, Bitmap.CompressFormat.JPEG);
                return a3.getAbsolutePath();
            } catch (Exception e2) {
                hm9.p("p4d", "getMediasForSend: exception", e2);
                return a2.toString();
            }
        } else if (uri2 != null) {
            return uri2.getPath();
        } else {
            if (uri3 != null) {
                return uri3.getPath();
            }
            return null;
        }
    }

    public final int g(up7 up7) {
        if (!j(up7)) {
            return 0;
        }
        Iterator it = this.a.iterator();
        int i2 = 1;
        while (it.hasNext()) {
            r4d r4d = (r4d) it.next();
            if (r4d.f) {
                if (k(up7, r4d)) {
                    break;
                }
                i2++;
            }
        }
        return i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: r4d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: r4d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: r4d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: r4d} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.r4d h(defpackage.up7 r4) {
        /*
            r3 = this;
            java.util.concurrent.CopyOnWriteArraySet r3 = r3.a
            r0 = 0
            if (r3 != 0) goto L_0x0006
            goto L_0x0026
        L_0x0006:
            java.util.Iterator r3 = r3.iterator()
        L_0x000a:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0026
            java.lang.Object r1 = r3.next()
            r2 = r1
            r4d r2 = (defpackage.r4d) r2     // Catch:{ all -> 0x001f }
            boolean r2 = k(r4, r2)     // Catch:{ all -> 0x001f }
            if (r2 == 0) goto L_0x000a
            r0 = r1
            goto L_0x0026
        L_0x001f:
            r3 = move-exception
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            r4.<init>(r3)
            throw r4
        L_0x0026:
            r4d r0 = (defpackage.r4d) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p4d.h(up7):r4d");
    }

    public final r4d i(int i2) {
        List list;
        CopyOnWriteArraySet copyOnWriteArraySet = this.a;
        if (!(copyOnWriteArraySet instanceof Collection) || !copyOnWriteArraySet.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                try {
                    if (((r4d) next).f) {
                        arrayList.add(next);
                    }
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            }
            list = arrayList;
        } else {
            list = Collections.emptyList();
        }
        if (i2 < 0 || i2 >= list.size()) {
            return null;
        }
        return (r4d) list.get(i2);
    }

    public final boolean j(up7 up7) {
        CopyOnWriteArraySet copyOnWriteArraySet = this.a;
        if ((copyOnWriteArraySet instanceof Collection) && copyOnWriteArraySet.isEmpty()) {
            return false;
        }
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            try {
                r4d r4d = (r4d) it.next();
                if (r4d.f && k(up7, r4d)) {
                    return true;
                }
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }
        return false;
    }

    public final aqd l(r4d r4d) {
        int i2;
        int i3 = this.l;
        up7 up7 = r4d.a;
        if (i3 == 2 || (i2 = up7.a) != 3 || r4d.b == null) {
            int i4 = up7.a;
            String a2 = up7.a();
            if (this.l == 2) {
                i4 = 7;
            }
            return new aqd(i4, a2);
        }
        return new vgf(i2, up7.a(), r4d.b, oag.t(r4d.d) ? up7.o : r4d.d);
    }

    public final void m(r4d r4d) {
        for (m4d s1 : this.f) {
            s1.s1(r4d);
        }
    }

    public final void n() {
        for (n4d B1 : this.c) {
            B1.B1(Collections.unmodifiableSet(this.a));
        }
    }

    public final void o(up7 up7, File file) {
        a(up7, this.a.size());
        r4d h2 = h(up7);
        if (h2 != null) {
            up7 up72 = h2.a;
            if (up72 instanceof j00) {
                j00 j00 = (j00) up72;
                j00.getClass();
                String path = file.getPath();
                hm9.m("j00", "Set downloaded file " + path, new Object[0]);
                j00.x0 = file;
                String str = j00.u0.s;
                if (str == null || str.length() == 0) {
                    j10 j2 = j00.u0.j();
                    j2.m = file.getPath();
                    j00.u0 = j2.a();
                }
            }
            m(h2);
        }
    }

    public final void p(int i2) {
        if (b() > 1) {
            hp hpVar = this.h;
            if (i2 == 3) {
                ((jp) hpVar).j("app.send.media.as.collage", true);
            } else if (i2 == 1) {
                ((jp) hpVar).j("app.send.media.as.collage", false);
            }
        }
        this.l = i2;
        for (zj9 zj9 : this.d) {
            int i3 = this.l;
            up7 up7 = zj9.X;
            if (up7 != null) {
                int i4 = up7.a;
                if (i3 == 2) {
                    if (i4 == 1) {
                        zj9.d2(new mu1(7));
                    } else if (up7.b()) {
                        zj9.d2(new mu1(8));
                    }
                } else if (i4 == 1) {
                    zj9.d2(new mu1(9));
                } else if (up7.b()) {
                    zj9.d2(new mu1(10));
                }
            }
        }
    }

    public final void q(up7 up7, ref ref) {
        a(up7, this.a.size());
        r4d h2 = h(up7);
        if (h2 != null) {
            h2.b = ref;
        }
        m(h2);
    }

    public final int r(up7 up7) {
        int i2;
        r4d r4d;
        CopyOnWriteArraySet<d96> copyOnWriteArraySet = this.m;
        if (copyOnWriteArraySet != null) {
            for (d96 a2 : copyOnWriteArraySet) {
                try {
                    a2.a(o4d.a);
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            }
        }
        CopyOnWriteArraySet copyOnWriteArraySet2 = this.a;
        int size = copyOnWriteArraySet2.size();
        boolean j2 = j(up7);
        Set<q96> set = this.e;
        if (j2) {
            Iterator it = copyOnWriteArraySet2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    r4d = null;
                    break;
                }
                r4d = (r4d) it.next();
                if (k(up7, r4d)) {
                    copyOnWriteArraySet2.remove(r4d);
                    break;
                }
            }
            if (!(r4d == null || set == null)) {
                for (q96 a3 : set) {
                    try {
                        a3.a(r4d);
                    } catch (Throwable th2) {
                        throw new RuntimeException(th2);
                    }
                }
            }
            n();
            if (r4d != null && !up7.c.equals(awa.a(r4d.c, up7).toString())) {
                m(r4d);
            }
            i2 = 0;
        } else {
            r4d h2 = h(up7);
            if (h2 != null) {
                copyOnWriteArraySet2.remove(h2);
                copyOnWriteArraySet2.add(h2);
                h2.f = true;
                if (set != null) {
                    for (q96 b2 : set) {
                        try {
                            b2.b(h2);
                        } catch (Throwable th3) {
                            throw new RuntimeException(th3);
                        }
                    }
                }
                n();
                i2 = g(up7);
            } else {
                i2 = a(up7, size);
            }
        }
        if (copyOnWriteArraySet != null) {
            for (d96 a4 : copyOnWriteArraySet) {
                try {
                    a4.a(o4d.b);
                } catch (Throwable th4) {
                    throw new RuntimeException(th4);
                }
            }
        }
        return i2;
    }
}
