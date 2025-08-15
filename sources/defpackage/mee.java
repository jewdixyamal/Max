package defpackage;

import java.util.Objects;
import java.util.concurrent.Executor;

/* renamed from: mee  reason: default package */
public final class mee implements lee {
    public final lee a;
    public final Executor b;
    public final tj3 c;

    public mee(zgf zgf) {
        lee lee = zgf.e;
        Objects.requireNonNull(lee);
        this.a = lee;
        this.b = zgf.d;
        this.c = zgf.f;
    }

    public final void a(see see) {
        this.b.execute(new flc(this, 23, see));
    }

    public final bm7 b(int i, int i2) {
        return new dw6(1, new Exception("Snapshot not supported by external SurfaceProcessor"));
    }

    public final void c(kee kee) {
        this.b.execute(new flc(this, 24, kee));
    }

    public final void release() {
    }
}
