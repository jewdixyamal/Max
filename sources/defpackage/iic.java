package defpackage;

import java.util.concurrent.Executor;

/* renamed from: iic  reason: default package */
public final class iic implements dab {
    public final Executor a;
    public final y7g b;
    public final dab c;
    public final boolean d;
    public final zv6 e;

    public iic(Executor executor, y7g y7g, dab dab, boolean z, zv6 zv6) {
        executor.getClass();
        this.a = executor;
        y7g.getClass();
        this.b = y7g;
        this.c = dab;
        zv6.getClass();
        this.e = zv6;
        this.d = z;
    }

    public final void a(fi0 fi0, eab eab) {
        this.c.a(new hic(this, fi0, eab, this.d, this.e), eab);
    }
}
