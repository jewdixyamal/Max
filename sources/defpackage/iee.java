package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;

/* renamed from: iee  reason: default package */
public final class iee {
    public final int a;
    public final Matrix b;
    public final boolean c;
    public final Rect d;
    public final boolean e;
    public final int f;
    public final vb0 g;
    public int h;
    public int i;
    public boolean j = false;
    public see k;
    public hee l;
    public final HashSet m = new HashSet();
    public boolean n = false;
    public final ArrayList o = new ArrayList();

    public iee(int i2, int i3, vb0 vb0, Matrix matrix, boolean z, Rect rect, int i4, int i5, boolean z2) {
        this.f = i2;
        this.a = i3;
        this.g = vb0;
        this.b = matrix;
        this.c = z;
        this.d = rect;
        this.i = i4;
        this.h = i5;
        this.e = z2;
        this.l = new hee(vb0.a, i3);
    }

    public final void a(Runnable runnable) {
        kq0.e();
        b();
        this.m.add(runnable);
    }

    public final void b() {
        c54.p("Edge is already closed.", !this.n);
    }

    public final void c() {
        kq0.e();
        this.l.a();
        this.n = true;
    }

    public final see d(ax1 ax1, boolean z) {
        kq0.e();
        b();
        vb0 vb0 = this.g;
        ax1 ax12 = ax1;
        boolean z2 = z;
        see see = new see(vb0.a, ax12, z2, vb0.b, vb0.c, new eee(this, 0));
        try {
            fw6 fw6 = see.l;
            hee hee = this.l;
            Objects.requireNonNull(hee);
            if (hee.f(fw6, new fee(hee, 0))) {
                kq0.w(hee.e).d(new wf4((xf4) fw6, 1), ju0.k());
            }
            this.k = see;
            f();
            return see;
        } catch (DeferrableSurface$SurfaceClosedException e2) {
            throw new AssertionError("Surface is somehow already closed", e2);
        } catch (RuntimeException e3) {
            see.d();
            throw e3;
        }
    }

    public final void e() {
        boolean z;
        kq0.e();
        b();
        hee hee = this.l;
        hee.getClass();
        kq0.e();
        if (hee.p == null) {
            synchronized (hee.a) {
                z = hee.c;
            }
            if (!z) {
                return;
            }
        }
        this.j = false;
        this.l.a();
        this.l = new hee(this.g.a, this.a);
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public final void f() {
        ree ree;
        Executor executor;
        kq0.e();
        cc0 cc0 = new cc0(this.d, this.i, this.h, this.c, this.b, this.e);
        see see = this.k;
        if (see != null) {
            synchronized (see.a) {
                see.m = cc0;
                ree = see.n;
                executor = see.o;
            }
            if (!(ree == null || executor == null)) {
                executor.execute(new nee(ree, cc0, 0));
            }
        }
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            ((tj3) it.next()).accept(cc0);
        }
    }
}
