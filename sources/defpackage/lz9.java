package defpackage;

import java.util.Objects;

/* renamed from: lz9  reason: default package */
public final class lz9 extends uk0 {
    public final b66 Y;
    public Object Z;
    public boolean s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lz9(f2a f2a) {
        super(f2a);
        qx7 qx7 = ft.b;
        this.Y = qx7;
    }

    public final void e(Object obj) {
        if (!this.o) {
            int i = this.X;
            f2a f2a = this.a;
            if (i != 0) {
                f2a.e(obj);
                return;
            }
            try {
                Object apply = this.Y.apply(obj);
                if (this.s0) {
                    boolean equals = Objects.equals(this.Z, apply);
                    this.Z = apply;
                    if (equals) {
                        return;
                    }
                } else {
                    this.s0 = true;
                    this.Z = apply;
                }
                f2a.e(obj);
            } catch (Throwable th) {
                c37.B(th);
                this.b.g();
                onError(th);
            }
        }
    }

    public final Object poll() {
        while (true) {
            Object poll = this.c.poll();
            if (poll == null) {
                return null;
            }
            Object apply = this.Y.apply(poll);
            if (!this.s0) {
                this.s0 = true;
                this.Z = apply;
                return poll;
            } else if (!Objects.equals(this.Z, apply)) {
                this.Z = apply;
                return poll;
            } else {
                this.Z = apply;
            }
        }
    }
}
