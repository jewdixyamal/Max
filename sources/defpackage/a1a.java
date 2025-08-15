package defpackage;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: a1a  reason: default package */
public final class a1a extends AtomicInteger implements zl4 {
    public final d1a a;
    public final f2a b;
    public Serializable c;
    public volatile boolean o;

    public a1a(d1a d1a, f2a f2a) {
        this.a = d1a;
        this.b = f2a;
    }

    public final void g() {
        if (!this.o) {
            this.o = true;
            this.a.a(this);
            this.c = null;
        }
    }

    public final boolean h() {
        return this.o;
    }
}
