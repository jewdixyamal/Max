package defpackage;

import java.util.NoSuchElementException;

/* renamed from: pz9  reason: default package */
public final class pz9 implements f2a, zl4 {
    public zl4 X;
    public long Y;
    public boolean Z;
    public final f2a a;
    public final long b;
    public final Object c;
    public final boolean o;

    public pz9(f2a f2a, long j, Object obj, boolean z) {
        this.a = f2a;
        this.b = j;
        this.c = obj;
        this.o = z;
    }

    public final void b() {
        if (!this.Z) {
            this.Z = true;
            f2a f2a = this.a;
            Object obj = this.c;
            if (obj != null || !this.o) {
                if (obj != null) {
                    f2a.e(obj);
                }
                f2a.b();
                return;
            }
            f2a.onError(new NoSuchElementException());
        }
    }

    public final void c(zl4 zl4) {
        if (dm4.f(this.X, zl4)) {
            this.X = zl4;
            this.a.c(this);
        }
    }

    public final void e(Object obj) {
        if (!this.Z) {
            long j = this.Y;
            if (j == this.b) {
                this.Z = true;
                this.X.g();
                f2a f2a = this.a;
                f2a.e(obj);
                f2a.b();
                return;
            }
            this.Y = j + 1;
        }
    }

    public final void g() {
        this.X.g();
    }

    public final boolean h() {
        return this.X.h();
    }

    public final void onError(Throwable th) {
        if (this.Z) {
            j47.Z(th);
            return;
        }
        this.Z = true;
        this.a.onError(th);
    }
}
