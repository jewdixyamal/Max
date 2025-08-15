package defpackage;

import java.util.Objects;

/* renamed from: wz9  reason: default package */
public final class wz9 extends uk0 {
    public final /* synthetic */ int Y;
    public final Object Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wz9(f2a f2a, Object obj, int i) {
        super(f2a);
        this.Y = i;
        this.Z = obj;
    }

    public final void e(Object obj) {
        switch (this.Y) {
            case 0:
                int i = this.X;
                f2a f2a = this.a;
                if (i == 0) {
                    try {
                        if (((b7b) this.Z).test(obj)) {
                            f2a.e(obj);
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        c37.B(th);
                        this.b.g();
                        onError(th);
                        return;
                    }
                } else {
                    f2a.e((Object) null);
                    return;
                }
            default:
                if (!this.o) {
                    int i2 = this.X;
                    f2a f2a2 = this.a;
                    if (i2 != 0) {
                        f2a2.e((Object) null);
                        return;
                    }
                    try {
                        Object apply = ((b66) this.Z).apply(obj);
                        Objects.requireNonNull(apply, "The mapper function returned a null value.");
                        f2a2.e(apply);
                        return;
                    } catch (Throwable th2) {
                        c37.B(th2);
                        this.b.g();
                        onError(th2);
                        return;
                    }
                } else {
                    return;
                }
        }
    }

    public final Object poll() {
        Object poll;
        switch (this.Y) {
            case 0:
                break;
            default:
                Object poll2 = this.c.poll();
                if (poll2 == null) {
                    return null;
                }
                Object apply = ((b66) this.Z).apply(poll2);
                Objects.requireNonNull(apply, "The mapper function returned a null value.");
                return apply;
        }
        do {
            poll = this.c.poll();
            if (poll == null || ((b7b) this.Z).test(poll)) {
                return poll;
            }
            poll = this.c.poll();
            return poll;
        } while (((b7b) this.Z).test(poll));
        return poll;
    }
}
