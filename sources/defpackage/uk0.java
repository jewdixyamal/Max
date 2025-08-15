package defpackage;

/* renamed from: uk0  reason: default package */
public abstract class uk0 implements f2a, tqb {
    public int X;
    public final f2a a;
    public zl4 b;
    public tqb c;
    public boolean o;

    public uk0(f2a f2a) {
        this.a = f2a;
    }

    public final int a(int i) {
        tqb tqb = this.c;
        if (tqb == null || (i & 4) != 0) {
            return 0;
        }
        int n = tqb.n(i);
        if (n != 0) {
            this.X = n;
        }
        return n;
    }

    public void b() {
        if (!this.o) {
            this.o = true;
            this.a.b();
        }
    }

    public final void c(zl4 zl4) {
        if (dm4.f(this.b, zl4)) {
            this.b = zl4;
            if (zl4 instanceof tqb) {
                this.c = (tqb) zl4;
            }
            this.a.c(this);
        }
    }

    public void clear() {
        this.c.clear();
    }

    public final void g() {
        this.b.g();
    }

    public final boolean h() {
        return this.b.h();
    }

    public final boolean isEmpty() {
        return this.c.isEmpty();
    }

    public int n(int i) {
        return a(i);
    }

    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public void onError(Throwable th) {
        if (this.o) {
            j47.Z(th);
            return;
        }
        this.o = true;
        this.a.onError(th);
    }
}
