package defpackage;

import java.util.Collection;
import java.util.Objects;

/* renamed from: er5  reason: default package */
public final class er5 implements gs5, vqb {
    public int X;
    public final Collection Y;
    public final b66 Z;
    public final vae a;
    public xae b;
    public vqb c;
    public boolean o;

    public er5(vae vae, b66 b66, Collection collection) {
        this.a = vae;
        this.Z = b66;
        this.Y = collection;
    }

    public final void b() {
        if (!this.o) {
            this.o = true;
            this.Y.clear();
            this.a.b();
        }
    }

    public final void cancel() {
        this.b.cancel();
    }

    public final void clear() {
        this.Y.clear();
        this.c.clear();
    }

    public final void e(Object obj) {
        if (!this.o) {
            int i = this.X;
            vae vae = this.a;
            if (i == 0) {
                try {
                    Object apply = this.Z.apply(obj);
                    Objects.requireNonNull(apply, "The keySelector returned a null key");
                    if (this.Y.add(apply)) {
                        vae.e(obj);
                    } else {
                        this.b.j(1);
                    }
                } catch (Throwable th) {
                    c37.B(th);
                    this.b.cancel();
                    onError(th);
                }
            } else {
                vae.e((Object) null);
            }
        }
    }

    public final void f(xae xae) {
        if (zae.e(this.b, xae)) {
            this.b = xae;
            if (xae instanceof vqb) {
                this.c = (vqb) xae;
            }
            this.a.f(this);
        }
    }

    public final boolean isEmpty() {
        return this.c.isEmpty();
    }

    public final void j(long j) {
        this.b.j(j);
    }

    public final int n(int i) {
        vqb vqb = this.c;
        if (vqb == null || (i & 4) != 0) {
            return 0;
        }
        int n = vqb.n(i);
        if (n == 0) {
            return n;
        }
        this.X = n;
        return n;
    }

    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public final void onError(Throwable th) {
        if (this.o) {
            j47.Z(th);
            return;
        }
        this.o = true;
        this.Y.clear();
        this.a.onError(th);
    }

    public final Object poll() {
        Object poll;
        while (true) {
            poll = this.c.poll();
            if (poll == null) {
                break;
            }
            Object apply = this.Z.apply(poll);
            Objects.requireNonNull(apply, "The keySelector returned a null key");
            if (this.Y.add(apply)) {
                break;
            } else if (this.X == 2) {
                this.b.j(1);
            }
        }
        return poll;
    }
}
