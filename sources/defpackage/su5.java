package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: su5  reason: default package */
public final class su5 implements qza {
    public final x3c a;
    public final je7 b;
    public final je7 c;
    public final kld d;
    public final v7c e;
    public sx3 f;
    public boolean g;

    public su5(je7 je7, je7 je72, x3c x3c) {
        this.a = x3c;
        this.b = je7;
        this.c = je72;
        kld b2 = lld.b(0, Integer.MAX_VALUE, 0, 5);
        this.d = b2;
        this.e = new v7c(b2);
    }

    public final void a() {
        this.f = null;
    }

    public final void b(gza gza) {
        ((AtomicReference) this.a.Y).updateAndGet(new iz0(9, gza));
    }

    public final void c(sx3 sx3) {
        this.f = sx3;
    }

    public final void e(long j) {
        ((AtomicReference) this.a.Y).updateAndGet(new v79(j, 3));
    }
}
