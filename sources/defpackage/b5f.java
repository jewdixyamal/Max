package defpackage;

/* renamed from: b5f  reason: default package */
public final class b5f extends wk0 {
    public final /* synthetic */ c5f a;

    public b5f(c5f c5f) {
        this.a = c5f;
    }

    public final void cancel() {
        if (!this.a.s0) {
            this.a.s0 = true;
            Runnable runnable = (Runnable) this.a.c.getAndSet((Object) null);
            if (runnable != null) {
                runnable.run();
            }
            this.a.Z.lazySet((Object) null);
            if (this.a.u0.getAndIncrement() == 0) {
                this.a.Z.lazySet((Object) null);
                c5f c5f = this.a;
                if (!c5f.w0) {
                    c5f.b.clear();
                }
            }
        }
    }

    public final void clear() {
        this.a.b.clear();
    }

    public final boolean isEmpty() {
        return this.a.b.isEmpty();
    }

    public final void j(long j) {
        if (zae.d(j)) {
            c5f c5f = this.a;
            ngg.b(c5f.v0, j);
            c5f.i();
        }
    }

    public final int n(int i) {
        this.a.w0 = true;
        return 2;
    }

    public final Object poll() {
        return this.a.b.poll();
    }
}
