package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

/* renamed from: aqf  reason: default package */
public final class aqf implements k9f {
    public final r9f X;
    public final ax1 Y;
    public final ax1 Z;
    public final Set a;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap o = new HashMap();
    public final oz1 s0 = new oz1(2, this);
    public final HashSet t0;
    public final HashMap u0;
    public final mic v0;
    public final mic w0;

    public aqf(ax1 ax1, ax1 ax12, HashSet hashSet, r9f r9f, bqc bqc) {
        this.Y = ax1;
        this.Z = ax12;
        this.X = r9f;
        this.a = hashSet;
        HashMap hashMap = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            l9f l9f = (l9f) it.next();
            hashMap.put(l9f, l9f.o(ax1.p(), (o9f) null, l9f.f(true, r9f)));
        }
        this.u0 = hashMap;
        HashSet hashSet2 = new HashSet(hashMap.values());
        this.t0 = hashSet2;
        this.v0 = new mic(ax1, hashSet2);
        if (this.Z != null) {
            this.w0 = new mic(this.Z, hashSet2);
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            l9f l9f2 = (l9f) it2.next();
            this.o.put(l9f2, Boolean.FALSE);
            this.c.put(l9f2, new zpf(ax1, this, bqc));
        }
    }

    public static void r(iee iee, xf4 xf4, fad fad) {
        iee.e();
        try {
            kq0.e();
            iee.b();
            hee hee = iee.l;
            Objects.requireNonNull(hee);
            hee.f(xf4, new fee(hee, 0));
        } catch (DeferrableSurface$SurfaceClosedException unused) {
            dad dad = fad.f;
            if (dad != null) {
                dad.a(fad);
            }
        }
    }

    public static xf4 s(l9f l9f) {
        List b2 = l9f instanceof fu6 ? l9f.n.b() : Collections.unmodifiableList(l9f.n.g.a);
        c54.p((String) null, b2.size() <= 1);
        if (b2.size() == 1) {
            return (xf4) b2.get(0);
        }
        return null;
    }

    public final void c(l9f l9f) {
        xf4 s;
        kq0.e();
        iee iee = (iee) this.b.get(l9f);
        Objects.requireNonNull(iee);
        if (t(l9f) && (s = s(l9f)) != null) {
            r(iee, s, l9f.n);
        }
    }

    public final void e(l9f l9f) {
        kq0.e();
        if (!t(l9f)) {
            this.o.put(l9f, Boolean.TRUE);
            xf4 s = s(l9f);
            if (s != null) {
                iee iee = (iee) this.b.get(l9f);
                Objects.requireNonNull(iee);
                r(iee, s, l9f.n);
            }
        }
    }

    public final void i(l9f l9f) {
        kq0.e();
        if (t(l9f)) {
            iee iee = (iee) this.b.get(l9f);
            Objects.requireNonNull(iee);
            xf4 s = s(l9f);
            if (s != null) {
                r(iee, s, l9f.n);
                return;
            }
            kq0.e();
            iee.b();
            iee.l.a();
        }
    }

    public final void m(l9f l9f) {
        kq0.e();
        if (t(l9f)) {
            this.o.put(l9f, Boolean.FALSE);
            iee iee = (iee) this.b.get(l9f);
            Objects.requireNonNull(iee);
            kq0.e();
            iee.b();
            iee.l.a();
        }
    }

    public final cb0 q(l9f l9f, mic mic, ax1 ax1, iee iee, int i, boolean z) {
        boolean z2;
        Size size;
        l9f l9f2 = l9f;
        mic mic2 = mic;
        iee iee2 = iee;
        int l = ax1.p().l(i);
        Matrix matrix = iee2.b;
        RectF rectF = e1f.a;
        float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
        matrix.mapVectors(fArr);
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = (f2 * f4) + (f * f3);
        double sqrt = Math.sqrt((double) ((f2 * f2) + (f * f))) * Math.sqrt((double) ((f4 * f4) + (f3 * f3)));
        boolean z3 = ((float) Math.toDegrees(Math.atan2(((double) ((f * f4) - (f2 * f3))) / sqrt, ((double) f5) / sqrt))) > 0.0f;
        o9f o9f = (o9f) this.u0.get(l9f2);
        Objects.requireNonNull(o9f);
        float[] fArr2 = new float[9];
        iee2.b.getValues(fArr2);
        int i2 = e1f.i((int) Math.round(Math.atan2((double) fArr2[3], (double) fArr2[0]) * 57.29577951308232d));
        mic.getClass();
        boolean c2 = e1f.c(i2);
        Rect rect = iee2.d;
        if (c2) {
            rect = new Rect(rect.top, rect.left, rect.bottom, rect.right);
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            size = e1f.e(rect);
            Iterator it = mic2.b(o9f).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Size e = e1f.e(mic.a((Size) it.next(), size));
                if (!mic.c(e, size)) {
                    size = e;
                    break;
                }
            }
        } else {
            Size e2 = e1f.e(rect);
            List b2 = mic2.b(o9f);
            Iterator it2 = b2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    Iterator it3 = b2.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            size = e2;
                            break;
                        }
                        Size size2 = (Size) it3.next();
                        if (!mic.c(size2, e2)) {
                            size = size2;
                            break;
                        }
                    }
                } else {
                    Size size3 = (Size) it2.next();
                    Rational rational = lt.a;
                    Size size4 = msd.c;
                    if (!lt.a(e2, rational, size4)) {
                        rational = lt.c;
                        if (!lt.a(e2, rational, size4)) {
                            rational = mic.g(e2);
                        }
                    }
                    if (!mic2.d(rational, size3) && !mic.c(size3, e2)) {
                        size = size3;
                        break;
                    }
                }
            }
            rect = mic.a(e2, size);
        }
        Pair pair = new Pair(rect, size);
        Rect rect2 = (Rect) pair.first;
        Size size5 = (Size) pair.second;
        if (z2) {
            Size size6 = new Size(size5.getHeight(), size5.getWidth());
            rect2 = new Rect(rect2.top, rect2.left, rect2.bottom, rect2.right);
            size5 = size6;
        }
        Pair pair2 = new Pair(rect2, size5);
        Rect rect3 = (Rect) pair2.first;
        Size size7 = (Size) pair2.second;
        int l2 = this.Y.p().l(((ev6) l9f2.f).f0(0));
        zpf zpf = (zpf) this.c.get(l9f2);
        Objects.requireNonNull(zpf);
        zpf.c.c = l2;
        int i3 = e1f.i((iee2.i + l2) - l);
        return new cb0(UUID.randomUUID(), l9f2 instanceof h8b ? 1 : l9f2 instanceof fu6 ? 4 : 2, l9f2 instanceof fu6 ? 256 : 34, rect3, e1f.g(size7, i3), i3, l9f2.n(ax1) ^ z3, false);
    }

    public final boolean t(l9f l9f) {
        Boolean bool = (Boolean) this.o.get(l9f);
        Objects.requireNonNull(bool);
        return bool.booleanValue();
    }

    public final void u(HashMap hashMap) {
        HashMap hashMap2 = this.b;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        for (Map.Entry entry : hashMap2.entrySet()) {
            l9f l9f = (l9f) entry.getKey();
            iee iee = (iee) entry.getValue();
            l9f.C(iee.d);
            l9f.A(iee.b);
            l9f.g = l9f.y(iee.g, (vb0) null);
            l9f.r();
        }
    }
}
