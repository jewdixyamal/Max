package defpackage;

import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil$GlException;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: qi0  reason: default package */
public abstract class qi0 implements gd6 {
    public final er0 a;
    public ed6 b = new Object();
    public fd6 c = new Object();
    public dd6 d = new xw0(24);
    public Executor e = nk4.a;
    public int f = -1;
    public int g = -1;

    /* JADX WARNING: type inference failed for: r3v1, types: [ed6, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v2, types: [fd6, java.lang.Object] */
    public qi0(boolean z) {
        this.a = new er0(z, 1);
    }

    public final void a(hd6 hd6) {
        er0 er0 = this.a;
        if (((ArrayDeque) er0.e).contains(hd6)) {
            ArrayDeque arrayDeque = (ArrayDeque) er0.e;
            fm9.k(arrayDeque.contains(hd6));
            arrayDeque.remove(hd6);
            ((ArrayDeque) er0.d).add(hd6);
            this.b.h();
        }
    }

    public final void b() {
        this.c.q();
    }

    public abstract void c(int i, long j);

    public final void d(Executor executor, lf4 lf4) {
        this.e = executor;
        this.d = lf4;
    }

    public final void e(va8 va8, hd6 hd6, long j) {
        try {
            int i = this.f;
            int i2 = hd6.c;
            er0 er0 = this.a;
            int i3 = hd6.d;
            if (i == i2) {
                if (this.g == i3) {
                    if (!((n77) er0.g()).hasNext()) {
                    }
                    hd6 h = er0.h();
                    mr0.u(h.b, h.c, h.d);
                    od4 od4 = (od4) this;
                    if (!od4.u || !od4.t) {
                        mr0.h();
                    }
                    c(hd6.a, j);
                    this.b.s(hd6);
                    this.c.B(h, j);
                }
            }
            int i4 = hd6.c;
            this.f = i4;
            this.g = i3;
            lsd g2 = c37.g(((od4) this).i, i4, i3);
            er0.e(va8, g2.a, g2.b);
            hd6 h2 = er0.h();
            mr0.u(h2.b, h2.c, h2.d);
            od4 od42 = (od4) this;
            mr0.h();
            c(hd6.a, j);
            this.b.s(hd6);
            this.c.B(h2, j);
        } catch (VideoFrameProcessingException | GlUtil$GlException e2) {
            this.e.execute(new c(this, 12, e2));
        }
    }

    public final void f(jo7 jo7) {
        this.c = jo7;
    }

    public final void flush() {
        er0 er0 = this.a;
        ArrayDeque arrayDeque = (ArrayDeque) er0.e;
        ((ArrayDeque) er0.d).addAll(arrayDeque);
        arrayDeque.clear();
        this.b.v();
        for (int i = 0; i < er0.b; i++) {
            this.b.h();
        }
    }

    public final void g(ed6 ed6) {
        this.b = ed6;
        for (int i = 0; i < this.a.f(); i++) {
            ed6.h();
        }
    }
}
