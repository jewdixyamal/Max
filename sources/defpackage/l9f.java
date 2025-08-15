package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: l9f  reason: default package */
public abstract class l9f {
    public final HashSet a = new HashSet();
    public final Object b = new Object();
    public int c = 2;
    public o9f d;
    public o9f e;
    public o9f f;
    public vb0 g;
    public o9f h;
    public Rect i;
    public Matrix j = new Matrix();
    public ax1 k;
    public ax1 l;
    public zgf m;
    public fad n = fad.a();
    public fad o = fad.a();

    public l9f(o9f o9f) {
        this.e = o9f;
        this.f = o9f;
    }

    public void A(Matrix matrix) {
        this.j = new Matrix(matrix);
    }

    public final boolean B(int i2) {
        Size size;
        int f0 = ((ev6) this.f).f0(-1);
        if (f0 != -1 && f0 == i2) {
            return false;
        }
        n9f l2 = l(this.e);
        ev6 ev6 = (ev6) l2.J();
        int f02 = ev6.f0(-1);
        if (f02 == -1 || f02 != i2) {
            ((mt6) l2).e(i2);
        }
        if (!(f02 == -1 || i2 == -1 || f02 == i2)) {
            if (Math.abs(kp.C(i2) - kp.C(f02)) % 180 == 90 && (size = (Size) ev6.f(ev6.F, (Object) null)) != null) {
                ((mt6) l2).d(new Size(size.getHeight(), size.getWidth()));
            }
        }
        this.e = l2.J();
        ax1 c2 = c();
        if (c2 == null) {
            this.f = this.e;
            return true;
        }
        this.f = o(c2.p(), this.d, this.h);
        return true;
    }

    public void C(Rect rect) {
        this.i = rect;
    }

    public final void D(ax1 ax1) {
        z();
        synchronized (this.b) {
            try {
                ax1 ax12 = this.k;
                if (ax1 == ax12) {
                    this.a.remove(ax12);
                    this.k = null;
                }
                ax1 ax13 = this.l;
                if (ax1 == ax13) {
                    this.a.remove(ax13);
                    this.l = null;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        this.g = null;
        this.i = null;
        this.f = this.e;
        this.d = null;
        this.h = null;
    }

    public final void E(List list) {
        if (!list.isEmpty()) {
            this.n = (fad) list.get(0);
            if (list.size() > 1) {
                this.o = (fad) list.get(1);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                for (xf4 xf4 : ((fad) it.next()).b()) {
                    if (xf4.j == null) {
                        xf4.j = getClass();
                    }
                }
            }
        }
    }

    public final void a(ax1 ax1, ax1 ax12, o9f o9f, o9f o9f2) {
        synchronized (this.b) {
            this.k = ax1;
            this.l = ax12;
            this.a.add(ax1);
            if (ax12 != null) {
                this.a.add(ax12);
            }
        }
        this.d = o9f;
        this.h = o9f2;
        this.f = o(ax1.p(), this.d, this.h);
        s();
    }

    public final int b() {
        return ((Integer) ((ev6) this.f).f(ev6.D, -1)).intValue();
    }

    public final ax1 c() {
        ax1 ax1;
        synchronized (this.b) {
            ax1 = this.k;
        }
        return ax1;
    }

    public final hw1 d() {
        synchronized (this.b) {
            try {
                ax1 ax1 = this.k;
                if (ax1 == null) {
                    gw1 gw1 = hw1.a;
                    return gw1;
                }
                hw1 g2 = ax1.g();
                return g2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String e() {
        ax1 c2 = c();
        c54.o(c2, "No camera attached to use case: " + this);
        return c2.p().d();
    }

    public abstract o9f f(boolean z, r9f r9f);

    public final String g() {
        o9f o9f = this.f;
        String str = (String) o9f.f(cne.d0, "<UnknownUseCase-" + hashCode() + ">");
        Objects.requireNonNull(str);
        return str;
    }

    public final int h(ax1 ax1, boolean z) {
        int l2 = ax1.p().l(k());
        return (ax1.n() || !z) ? l2 : e1f.i(-l2);
    }

    public final ax1 i() {
        ax1 ax1;
        synchronized (this.b) {
            ax1 = this.l;
        }
        return ax1;
    }

    public Set j() {
        return Collections.emptySet();
    }

    public final int k() {
        return ((ev6) this.f).f0(0);
    }

    public abstract n9f l(ce3 ce3);

    public final boolean m(int i2) {
        for (Integer intValue : j()) {
            int intValue2 = intValue.intValue();
            if ((i2 & intValue2) == intValue2) {
                return true;
            }
        }
        return false;
    }

    public final boolean n(ax1 ax1) {
        int intValue = ((Integer) ((ev6) this.f).f(ev6.E, -1)).intValue();
        if (intValue == -1 || intValue == 0) {
            return false;
        }
        if (intValue == 1) {
            return true;
        }
        if (intValue == 2) {
            return ax1.d();
        }
        throw new AssertionError(zr6.h(intValue, "Unknown mirrorMode: "));
    }

    public final o9f o(yw1 yw1, o9f o9f, o9f o9f2) {
        mi9 mi9;
        if (o9f2 != null) {
            mi9 = mi9.c(o9f2);
            mi9.a.remove(cne.d0);
        } else {
            mi9 = mi9.b();
        }
        boolean o2 = this.e.o(ev6.B);
        TreeMap treeMap = mi9.a;
        if (o2 || this.e.o(ev6.F)) {
            aa0 aa0 = ev6.J;
            if (treeMap.containsKey(aa0)) {
                treeMap.remove(aa0);
            }
        }
        o9f o9f3 = this.e;
        aa0 aa02 = ev6.J;
        if (o9f3.o(aa02)) {
            aa0 aa03 = ev6.H;
            if (treeMap.containsKey(aa03) && ((kic) this.e.h(aa02)).b != null) {
                treeMap.remove(aa03);
            }
        }
        for (aa0 H : this.e.g()) {
            ce3.H(mi9, mi9, this.e, H);
        }
        if (o9f != null) {
            for (aa0 aa04 : o9f.g()) {
                if (!aa04.a.equals(cne.d0.a)) {
                    ce3.H(mi9, mi9, o9f, aa04);
                }
            }
        }
        if (treeMap.containsKey(ev6.F)) {
            aa0 aa05 = ev6.B;
            if (treeMap.containsKey(aa05)) {
                treeMap.remove(aa05);
            }
        }
        aa0 aa06 = ev6.J;
        if (treeMap.containsKey(aa06) && ((kic) mi9.h(aa06)).c != 0) {
            mi9.j(o9f.m0, Boolean.TRUE);
        }
        return u(yw1, l(mi9));
    }

    public final void p() {
        this.c = 1;
        r();
    }

    public final void q() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((k9f) it.next()).c(this);
        }
    }

    public final void r() {
        int s = au1.s(this.c);
        HashSet hashSet = this.a;
        if (s == 0) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((k9f) it.next()).e(this);
            }
        } else if (s == 1) {
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                ((k9f) it2.next()).m(this);
            }
        }
    }

    public void s() {
    }

    public void t() {
    }

    public abstract o9f u(yw1 yw1, n9f n9f);

    public void v() {
    }

    public void w() {
    }

    public abstract vb0 x(ce3 ce3);

    public abstract vb0 y(vb0 vb0, vb0 vb02);

    public void z() {
    }
}
