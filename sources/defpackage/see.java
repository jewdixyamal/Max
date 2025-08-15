package defpackage;

import android.util.Range;
import android.util.Size;
import android.view.Surface;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: see  reason: default package */
public final class see {
    public static final Range p = vb0.f;
    public final Object a = new Object();
    public final Size b;
    public final eu4 c;
    public final Range d;
    public final ax1 e;
    public final boolean f;
    public final oq1 g;
    public final lq1 h;
    public final oq1 i;
    public final lq1 j;
    public final lq1 k;
    public final fw6 l;
    public cc0 m;
    public ree n;
    public Executor o;

    public see(Size size, ax1 ax1, boolean z, eu4 eu4, Range range, eee eee) {
        this.b = size;
        this.e = ax1;
        this.f = z;
        this.c = eu4;
        this.d = range;
        String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        AtomicReference atomicReference = new AtomicReference((Object) null);
        oq1 g2 = f8.g(new oee(atomicReference, str, 0));
        lq1 lq1 = (lq1) atomicReference.get();
        lq1.getClass();
        this.k = lq1;
        AtomicReference atomicReference2 = new AtomicReference((Object) null);
        oq1 g3 = f8.g(new oee(atomicReference2, str, 1));
        this.i = g3;
        kq0.a(g3, new djb(lq1, g2, false, 8), ju0.k());
        lq1 lq12 = (lq1) atomicReference2.get();
        lq12.getClass();
        AtomicReference atomicReference3 = new AtomicReference((Object) null);
        oq1 g4 = f8.g(new oee(atomicReference3, str, 2));
        this.g = g4;
        lq1 lq13 = (lq1) atomicReference3.get();
        lq13.getClass();
        this.h = lq13;
        fw6 fw6 = new fw6(this, size);
        this.l = fw6;
        bm7 w = kq0.w(fw6.e);
        kq0.a(g4, new vq7(w, lq12, str), ju0.k());
        w.d(new ae4(this, 1), ju0.k());
        ok4 k2 = ju0.k();
        AtomicReference atomicReference4 = new AtomicReference((Object) null);
        kq0.a(f8.g(new ypc(this, 7, atomicReference4)), new o9g(27, (Object) eee), k2);
        lq1 lq14 = (lq1) atomicReference4.get();
        lq14.getClass();
        this.j = lq14;
    }

    public final boolean a() {
        return this.g.b.isDone();
    }

    public final void b(Surface surface, Executor executor, tj3 tj3) {
        if (!this.h.b(surface)) {
            oq1 oq1 = this.g;
            if (!oq1.isCancelled()) {
                c54.p((String) null, oq1.b.isDone());
                try {
                    oq1.get();
                    executor.execute(new pee(tj3, surface, 0));
                    return;
                } catch (InterruptedException | ExecutionException unused) {
                    executor.execute(new pee(tj3, surface, 1));
                    return;
                }
            }
        }
        kq0.a(this.i, new b9b(tj3, 8, surface), executor);
    }

    public final void c(Executor executor, ree ree) {
        cc0 cc0;
        synchronized (this.a) {
            this.n = ree;
            this.o = executor;
            cc0 = this.m;
        }
        if (cc0 != null) {
            executor.execute(new nee(ree, cc0, 1));
        }
    }

    public final void d() {
        this.h.d(new Exception("Surface request will not complete."));
    }
}
