package defpackage;

import java.util.Collection;
import java.util.Objects;

/* renamed from: kz9  reason: default package */
public final class kz9 extends uk0 {
    public final Collection Y;
    public final b66 Z;

    public kz9(f2a f2a, b66 b66, Collection collection) {
        super(f2a);
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

    public final void clear() {
        this.Y.clear();
        super.clear();
    }

    public final void e(Object obj) {
        if (!this.o) {
            int i = this.X;
            f2a f2a = this.a;
            if (i == 0) {
                try {
                    Object apply = this.Z.apply(obj);
                    Objects.requireNonNull(apply, "The keySelector returned a null key");
                    if (this.Y.add(apply)) {
                        f2a.e(obj);
                    }
                } catch (Throwable th) {
                    c37.B(th);
                    this.b.g();
                    onError(th);
                }
            } else {
                f2a.e((Object) null);
            }
        }
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
        Object apply;
        do {
            poll = this.c.poll();
            if (poll == null) {
                break;
            }
            apply = this.Z.apply(poll);
            Objects.requireNonNull(apply, "The keySelector returned a null key");
        } while (!this.Y.add(apply));
        return poll;
    }
}
