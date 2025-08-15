package defpackage;

import java.util.NoSuchElementException;

/* renamed from: rz9  reason: default package */
public final class rz9 implements f2a, zl4 {
    public boolean X;
    public final Object Y;
    public final /* synthetic */ int a;
    public final long b;
    public zl4 c;
    public long o;

    public /* synthetic */ rz9(Object obj, long j, int i) {
        this.a = i;
        this.Y = obj;
        this.b = j;
    }

    public final void b() {
        switch (this.a) {
            case 0:
                if (!this.X) {
                    this.X = true;
                    ((b38) this.Y).b();
                    return;
                }
                return;
            default:
                if (!this.X) {
                    this.X = true;
                    ((erd) this.Y).onError(new NoSuchElementException());
                    return;
                }
                return;
        }
    }

    public final void c(zl4 zl4) {
        switch (this.a) {
            case 0:
                if (dm4.f(this.c, zl4)) {
                    this.c = zl4;
                    ((b38) this.Y).c(this);
                    return;
                }
                return;
            default:
                if (dm4.f(this.c, zl4)) {
                    this.c = zl4;
                    ((erd) this.Y).c(this);
                    return;
                }
                return;
        }
    }

    public final void e(Object obj) {
        switch (this.a) {
            case 0:
                if (!this.X) {
                    long j = this.o;
                    if (j == this.b) {
                        this.X = true;
                        this.c.g();
                        ((b38) this.Y).a(obj);
                        return;
                    }
                    this.o = j + 1;
                    return;
                }
                return;
            default:
                if (!this.X) {
                    long j2 = this.o;
                    if (j2 == this.b) {
                        this.X = true;
                        this.c.g();
                        ((erd) this.Y).a(obj);
                        return;
                    }
                    this.o = j2 + 1;
                    return;
                }
                return;
        }
    }

    public final void g() {
        switch (this.a) {
            case 0:
                this.c.g();
                return;
            default:
                this.c.g();
                return;
        }
    }

    public final boolean h() {
        switch (this.a) {
            case 0:
                return this.c.h();
            default:
                return this.c.h();
        }
    }

    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                if (this.X) {
                    j47.Z(th);
                    return;
                }
                this.X = true;
                ((b38) this.Y).onError(th);
                return;
            default:
                if (this.X) {
                    j47.Z(th);
                    return;
                }
                this.X = true;
                ((erd) this.Y).onError(th);
                return;
        }
    }
}
