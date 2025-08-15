package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: cad  reason: default package */
public final class cad implements dad {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final dad b;

    public cad(dad dad) {
        this.b = dad;
    }

    public final void a(fad fad) {
        if (!this.a.get()) {
            this.b.a(fad);
        }
    }

    public final void b() {
        this.a.set(true);
    }
}
