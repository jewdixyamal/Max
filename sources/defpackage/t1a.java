package defpackage;

/* renamed from: t1a  reason: default package */
public final class t1a implements f2a, zl4 {
    public final f2a a;
    public boolean b;
    public zl4 c;
    public long o;

    public t1a(f2a f2a, long j) {
        this.a = f2a;
        this.o = j;
    }

    public final void b() {
        if (!this.b) {
            this.b = true;
            this.c.g();
            this.a.b();
        }
    }

    public final void c(zl4 zl4) {
        if (dm4.f(this.c, zl4)) {
            this.c = zl4;
            int i = (this.o > 0 ? 1 : (this.o == 0 ? 0 : -1));
            f2a f2a = this.a;
            if (i == 0) {
                this.b = true;
                zl4.g();
                iz4.a(f2a);
                return;
            }
            f2a.c(this);
        }
    }

    public final void e(Object obj) {
        if (!this.b) {
            long j = this.o;
            long j2 = j - 1;
            this.o = j2;
            if (j > 0) {
                boolean z = j2 == 0;
                this.a.e(obj);
                if (z) {
                    b();
                }
            }
        }
    }

    public final void g() {
        this.c.g();
    }

    public final boolean h() {
        return this.c.h();
    }

    public final void onError(Throwable th) {
        if (this.b) {
            j47.Z(th);
            return;
        }
        this.b = true;
        this.c.g();
        this.a.onError(th);
    }
}
