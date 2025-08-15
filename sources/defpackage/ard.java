package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: ard  reason: default package */
public abstract class ard implements qgf {
    public final xw0 X;
    public final Executor Y;
    public final boolean Z;
    public final Context a;
    public final zff b;
    public final i63 c;
    public final pgf o;
    public final long s0;
    public final b8b t0;
    public bgf u0;
    public jee v0;
    public boolean w0;
    public boolean x0;
    public volatile boolean y0;
    public int z0 = -1;

    public ard(Context context, zff zff, i63 i63, pgf pgf, xw0 xw0, Executor executor, crd crd, boolean z, b8b b8b, long j) {
        fm9.j("SingleInputVideoGraph does not use VideoCompositor, and therefore cannot apply VideoCompositorSettings", crd.u0.equals(crd));
        this.a = context;
        this.b = zff;
        this.c = i63;
        this.o = pgf;
        this.X = xw0;
        this.Y = executor;
        this.Z = z;
        this.t0 = b8b;
        this.s0 = j;
    }

    public final void a() {
    }

    public final bgf b(int i) {
        int i2 = this.z0;
        fm9.f(i2 != -1 && i2 == i);
        bgf bgf = this.u0;
        fm9.l(bgf);
        return bgf;
    }

    public final void c(int i) {
        if (this.u0 == null) {
            boolean z = this.x0;
        }
        fm9.k(this.z0 == -1);
        this.z0 = i;
        bgf a2 = this.b.a(this.a, this.X, this.c, this.Z, new g03(10, (Object) this));
        this.u0 = a2;
        jee jee = this.v0;
        if (jee != null) {
            ((rf4) a2).e(jee);
        }
    }

    public final boolean k() {
        return this.y0;
    }

    public final void m(jee jee) {
        this.v0 = jee;
        bgf bgf = this.u0;
        if (bgf != null) {
            ((rf4) bgf).e(jee);
        }
    }

    public final void release() {
        if (!this.x0) {
            bgf bgf = this.u0;
            if (bgf != null) {
                ((rf4) bgf).d();
                this.u0 = null;
            }
            this.x0 = true;
        }
    }
}
